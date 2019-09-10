package aed.actasnotas;

/**
 * Exception raised by when attempting to add a new calificacion
 * with a matricula, and there already exists another calificacion with
 * that matricula in the database.
 */
public class CalificacionAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}

