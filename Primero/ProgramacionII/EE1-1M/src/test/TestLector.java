/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ee1.Lector;
import ee1.Libro;
import fecha.Fecha;

/**
 * @author agonzalez
 *
 */
public class TestLector {
	Libro libro1;
	Libro libro2;
	Lector lector;
	Lector lector2;
		
	/**
	 * Construye las instancias que se van a usar durante las pruebas
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		libro1 = new Libro("El quijote", 
				"Miguel de Cervantes", new Fecha("16/01/1605"));
		libro2 = new Libro("El quijote 2ª edición", 
				"Miguel de Cervantes", new Fecha("16/01/1625"));
		lector = new Lector(300,"Pepe White");
		lector2 = new Lector(300,"Pepe Black");
	}

	/**
	 * Test method for {@link ee1.Lector#esIgual(ee1.Lector)}.
	 * Se comprueba la igualdad cuando los históricos están vacíos. Dos lectores son iguales
	 * si y sólo si cuando coincide el número de socio y los libros leídos que hay en el
	 * histórico son los mismos y están en el mismo orden
	 */
	@Test
	public void testEsIgual() {
		assertTrue ("Igualdad cuando el histórico está vacio. Dos lectores son iguales si tienen el mismo número de socio y han leido los mismos libros y en el mismo orden."
				+ " Verifique que en esIgual no se use el nombre",
				lector.esIgual(lector2));
	}
	
	/**
	 * Test method for {@link ee1.Lector#esIgual(ee1.Lector)}.
	 * Se comprueba la igualdad cuando un lector ha leido un libro más que el otro y el resto son iguales. Dos lectores son iguales
	 * si y sólo si cuando coincide el número de socio y los libros leídos que hay en el
	 * histórico son los mismos y están en el mismo orden
	 */
	@Test
	public void testEsIgual1(){
		Libro []librosLeidos = {libro2,libro2,libro1,libro1,libro1,libro1,libro1,libro1,libro1,libro2};
		//Vamos a llenar el histórico de lectura del lector 2
		//Este lector tiene en este punto dos veces leido el libro1
		for (int i=0; i<librosLeidos.length-1;i++){
				lector2.leerLibro(librosLeidos[i]);
				lector.leerLibro(librosLeidos[i]);
			}
		lector.leerLibro(libro1);
		
		assertFalse ("Dos lectores son iguales si tienen el mismo número de socio y han leído los mismos libros y en el mismo orden. "
				+ "Verifique que se están comprobando correctamente los historiales de lectura",
				lector.esIgual(lector2));
	}
	
	/**
	 * Test method for {@link ee1.Lector#esIgual(ee1.Lector)}.
	 * Se comprueba la igualdad cuando los dos lectores han leído el mismo número de libros, pero difieren en el último libro leído. Dos lectores son iguales
	 * si y sólo si cuando coincide el número de socio y los libros leídos que hay en el
	 * histórico son los mismos y están en el mismo orden
	 */
	@Test
	public void testEsIgual2(){
		Libro []librosLeidos = {libro2,libro2,libro1,libro1,libro1,libro1,libro1,libro1,libro1,libro2};
		//Vamos a llenar el histórico de lectura del lector 2
		//Este lector tiene en este punto dos veces leido el libro1
		for (int i=0; i<librosLeidos.length-3;i++){
				lector2.leerLibro(librosLeidos[i]);
				lector.leerLibro(librosLeidos[i]);
			}
		lector.leerLibro(libro1);
		lector2.leerLibro(libro2);
		
		assertFalse ("Dos lectores son iguales si tienen el mismo número de socio y han leído los mismos libros y en el mismo orden. "
				+ "Verifique que se están comprobando correctamente los historiales de lectura",
				lector.esIgual(lector2));
		assertFalse ("Dos lectores son iguales si tienen el mismo número de socio y han leído los mismos libros y en el mismo orden. "
				+ "Verifique que se están comprobando correctamente los historiales de lectura",
				lector2.esIgual(lector));
		
	}
	
	

	/**
	 * Test method for {@link ee1.Lector#leerLibro(ee1.Libro)}.
	 */
	@Test
	public void testLeerLibro() {
		lector.leerLibro(libro1);
		assertTrue("Después de que el lector lee un libro se debe incrementar en una unidad las veces que ha sido prestado el libro. "
				+ "Primero verifique que libor ha pasado todas las pruebas de TestLibro, si los pasa, "
				+ "verifique que el método leerLibro le pide a libro que actualice el número de veces que ha sido prestado.",
				libro1.getNVecesPrestado() == 1);
		//Ahora se comprueba que el primer libro del histórico sea el libro dado
		Libro libro = lector.getLibroLeido(1);
		assertTrue ("El primer libro que se lee debe estar en la primera posición del histórico hasta que el histórico se llene",
				libro.equals(libro1));

	}

	
	/**
	 * Test method for {@link ee1.Lector#getLibroLeido(int)}.
	 */
	@Test
	public void testGetLibroLeido0() {
		//Se va a probar que se retorne null cuando se pide un libro fuera del rango
		Libro leido = lector.getLibroLeido(1); //Ahora está vacío
		assertTrue ("Si no se ha leído libro alguno se debe retornar null", leido == null);
		lector.leerLibro(libro1);
		lector.leerLibro(libro2);
		leido = lector.getLibroLeido(3); //Ahora está vacío
		assertTrue ("Si sólo se han leido dos libros y se pide el tercero, se debe retornar null", leido == null);
		leido = lector.getLibroLeido(11); //Ahora está vacío
		assertTrue ("Si se pide un valor fuera de rango se debe retornar null", leido == null);
	}
	
	/**
	 * Test method for {@link ee1.Lector#getLibroLeido(int)}.
	 */
	@Test
	public void testGetLibroLeido() {
		lector.leerLibro(libro2);
		lector.leerLibro(libro1);
		Libro leido1 = lector.getLibroLeido(1);
		Libro leido2 = lector.getLibroLeido(2);
		assertTrue ("getLibroLeido sólo retorna null cuando el número de libros leidos en el historial es menor al que se pide",
				leido1 !=null && leido2 !=null);
		assertTrue("Tras leer dos libros estos deberían aparecer en el histórico en el orden en que se han leido", 
				leido1.esIgual(libro2) && leido2.esIgual(libro1));
	}
	
	/**
	 * Test method for {@link ee1.Lector#GetLibroLiedo(int)}.
	 * Este test prueba a llenar la capacidad del histórico
	 */
	@Test
	public void testGetLibroLeido2() {
		Libro []librosLeidos = {libro2,libro2,libro1,libro1,libro1,libro1,libro1,libro1,libro1,libro2};
		//Vamos a llenar el histórico de lectura del lector 2
		//Este lector tiene en este punto dos veces leido el libro1
		for (int i=0; i<librosLeidos.length;i++){
			lector2.leerLibro(librosLeidos[i]);
		}
		
		//Recorremos el historial y verificamos
		for (int i =1; i <= librosLeidos.length;i++){
			Libro leido = lector2.getLibroLeido(i);
			assertTrue ("El libro de la posición del historial "+i+" no es el que debiera ser", 
					leido != null && leido.esIgual(librosLeidos[i-1]));
		}
	}

	/**
	 * Test method for {@link ee1.Lector#GetLibroLiedo(int)}.
	 * Este test prueba a llenar la capacidad del histórico e introducir dos libros más obligando a olvidar los dos primeros
	 */
	@Test
	public void testGetLibroLeido3() {
		Libro []librosLeidos = {libro2,libro2,libro1,libro1,libro1,libro1,libro1,libro1,libro1,libro2,libro1,libro2};
		//Vamos a llenar el histórico de lectura del lector 2
		//Este lector tiene en este punto dos veces leido el libro1
		for (int i=0; i<librosLeidos.length;i++){
			lector2.leerLibro(librosLeidos[i]);
		}
		
		//Recorremos el historial y verificamos
		for (int i =3; i <= librosLeidos.length;i++){
			Libro leido = lector2.getLibroLeido(i-2);
			assertTrue ("El libro de la posición del historial "+(i-2)+" no es el que debiera ser", 
					leido != null && leido.esIgual(librosLeidos[i-1]));
		}
	}
	
	/**
	 * Test method for {@link ee1.Lector#getNSocio()}.
	 */
	@Test
	public void testGetnSocio() {
		assertTrue ("getNSocio no retorna el número de socio esperado, verifique el constructor y getNSocio", lector.getNSocio() == 300);
	}

	/**
	 * Test method for {@link ee1.Lector#getNombre()}.
	 */
	@Test
	public void testGetNombre() {
		assertEquals("getNombre no retorna el nombre que se pasó en el constructor revise el constructor y getNombre",
				lector.getNombre(),"Pepe White");
	}

}
