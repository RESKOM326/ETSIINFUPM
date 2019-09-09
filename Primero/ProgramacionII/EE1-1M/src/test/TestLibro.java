/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

import ee1.Libro;
import fecha.Fecha;
import fecha.excepciones.FechaIncorrecta;

/**
 * @author agonzalez
 *
 */
public class TestLibro {
	private Libro libro1;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		try {
			libro1 = new Libro("El quijote", "Miguel de Cervantes", new Fecha("16/01/1605"));
		} catch (FechaIncorrecta e) {
			Logger.getGlobal().log(Level.WARNING, "Este error no debería haber pasado ", e);
			fail("Error al llamar al constructor con una fecha válida, esto no debería pasar");
		}
	}

	@Test
	public void testGets() {
		assertEquals("Error en el constructor o en getAutor. No se obtiene el autor correcto con getAutor",
				libro1.getAutor(), "Miguel de Cervantes");
		assertEquals("Error en el constructor o en getTitulo. No se obtiene el título correcto con getTitulo",
				libro1.getTitulo(), "El quijote");
		assertTrue ("El número de veces prestado incialmente es 0", libro1.getNVecesPrestado() == 0);
	}
	
	@Test
	public void testPrestado(){
		libro1.prestado();
		assertTrue ("El libro se ha pedido una vez prestado y el resultado debería ser 1", libro1.getNVecesPrestado() == 1);
		libro1.prestado();
		assertTrue ("El libro se ha pedido una segunda vez prestado y el resultado debería ser 2", libro1.getNVecesPrestado() == 2);
	}
	
	@Test
	public void testEsIgual(){
		try {
			Libro libro2 = new Libro("El quijote", 
					"Miguel de Cervantes", new Fecha("16/01/1605"));
			Libro libro3 = new Libro("El quijote", 
					"Miguel de Cervantes", new Fecha("16/01/1625"));
			Libro libro4 = new Libro("El quijote 2ª edición", 
					"Miguel de Cervantes", new Fecha("16/01/1625"));
			//Se comprueba la igualdad. Dos libros son iguales si coincide autor, título y fecha de publicación
			libro1.prestado();
			libro1.prestado();
			assertTrue("Dos libros son iguales si coincide título, autor y fecha de publicación",libro1.esIgual(libro2));
			assertFalse("Dos libros son distintos si hay diferencia en el título, autor o fecha de publicación, verifique la comprobación de fechas", libro1.esIgual(libro3));
			assertFalse("Dos libros son distintos si hay diferencia en el título, autor o fecha de publicación, verifique la comprobación de títulos", libro4.esIgual(libro3));
		} catch (FechaIncorrecta e) {
			Logger.getGlobal().log(Level.WARNING, "Este error no debería haber pasado ", e);
			fail("Error al llamar al constructor con una fecha válida, esto no debería pasar");
		}
	
		
	}
	
	
	
	
}
