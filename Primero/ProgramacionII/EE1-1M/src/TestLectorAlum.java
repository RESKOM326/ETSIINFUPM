import ee1.Lector;
import ee1.Libro;
import fecha.Fecha;
import fecha.excepciones.FechaIncorrecta;

/**
 * 
 */

/**
 * @author agonzalez
 *
 */
public class TestLectorAlum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Las siguiente líneas van encaminadas a comprobar que se han definido
		//las cabeceras de los métodos correctamente. 
		//Si el código no compila es que están mal definida alguna cabecera
		//Si compila se ejecuta este main, si una prueba da KO no se puede asegurar que
		//el resto de pruebas den un resultado fiable. Se debería corregir el error y
		//volver a probar
		try {
			Libro libro1 = new Libro("El quijote", 
					"Miguel de Cervantes", new Fecha("16/01/1605"));
			Libro libro2 = new Libro("El quijote 2ª edición", 
					"Miguel de Cervantes", new Fecha("16/01/1625"));
			Lector lector = new Lector(300,"Pepe White");
			Lector lector2 = new Lector(300,"Pepe Black");
			
			if (lector.getNombre().equals("Pepe White")){
				System.out.println("getNombre OK");
			}
			else
			{
				System.err.println("getNombre KO, no retorna el nombre correcto.\n"
						+"Revise el constructor y getNombre");
			}
			
			if (lector.getNSocio()==300){
				System.out.println("getnSocio OK");
			}
			else
			{
				System.err.println("getnSocio KO, no retorna el número de socio correcto.\n"
						+"Revise el constructor y getnSocio");
			}
			
			//Se comprueba la igualdad. Dos lectores. Dos lectores son iguales
			//si y sólo si cuando coincide el número de socio y los libros leídos que hay en el
			//histórico son los mismos y están en el mismo orden
			if (lector.esIgual(lector2)){
				System.out.println("esIgual OK");
			}
			else
			{
				System.err.println("esIgual KO, no retorna valor correcto.\n"
						+"Revise el método esIgual y el método leerLibro");
			}			
			
			lector.leerLibro(libro2);
			lector.leerLibro(libro1);
			lector2.leerLibro(libro2);
			//Son lectores distintos por que han leido disintos libros
			if (!lector.esIgual(lector2)){
				System.out.println("esIgual OK");
			}
			else
			{
				System.err.println("esIgual KO, no retorna valor correcto.\n"
						+"Revise el método esIgual y el método leerLibro");
			}
			
		
			//Se va a comprobar la cadena retornada por histótico, se quitan los espacios en blanco 
			//y saltos de línea
			Libro leido1 = lector.getLibroLeido(1);
			Libro leido2 = lector.getLibroLeido(2);
			if (leido1.esIgual(libro2) && leido2.esIgual(libro1)){
				System.out.println("Historico OK");
			}
			else
			{
				System.err.println("Historico KO, no retorna valor correcto.\n"
						+"Revise el método leerLibro y el método listarHistorico");
			}
			
			
		} catch (FechaIncorrecta e) {
			e.printStackTrace();
		}
		
		

	}

}
