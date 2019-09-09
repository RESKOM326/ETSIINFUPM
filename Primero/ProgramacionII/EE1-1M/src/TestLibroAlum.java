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
public class TestLibroAlum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			//Las siguiente líneas van encaminadas a comprobar que se han definido
			//las cabeceras de los métodos correctamente
			//Si el código no compila es que están mal definida alguna cabecera
			//Si compila se ejecuta este main, si una prueba da KO no se puede asegurar que
			//el resto de pruebas den un resultado fiable. Se debería corregir el error y
			//volver a probar
			Libro libro1 = new Libro("El quijote", 
					"Miguel de Cervantes", new Fecha("16/01/1605"));
			Libro libro2 = new Libro("El quijote", 
					"Miguel de Cervantes", new Fecha("16/01/1605"));
			
			if (libro1.getAutor().equals("Miguel de Cervantes")){
				System.out.println("getAutor OK");
			}
			else
			{
				System.err.println("getAutor KO, no retorna el nombre correcto.\n"
						+"Revise el constructor y getAutor");
			}
			
			if (libro1.getTitulo().equals("El quijote")){
				System.out.println("getTitulo OK");
			}
			else
			{
				System.err.println("getTitulo KO, no retorna el nombre correcto.\n"
						+"Revise el constructor y getTitulo");
			}
			
			libro1.prestado();//Se incrementa en uno las veces que ha sido prestado
			libro1.prestado();//Se incrementa en uno las veces que ha sido prestado
			if (libro1.getNVecesPrestado()==2){
				System.out.println("getnVecesPrestado OK");
			}
			else
			{
				System.err.println("getnVecesPrestado KO, no retorna valor correcto.\n"
						+"Revise el método getnVecesPrestado");
			}
			
			//Se comprueba la igualdad. Dos libros son iguales si coincide autor, título y fecha de publicación
			if (libro1.esIgual(libro2)){
				System.out.println("esIgual OK");
			}
			else
			{
				System.err.println("esIgual KO, no retorna valor correcto.\n"
						+"Revise el método esIgual");
			}			
			
		} catch (FechaIncorrecta e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
