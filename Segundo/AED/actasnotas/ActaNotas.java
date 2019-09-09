package aed.actasnotas;

import java.util.Comparator;
import es.upm.aedlib.indexedlist.IndexedList;


/**
 * This interface provides method for interacting with a database of
 * calificaciones (i.e., where a calificacion has a name, a matricula
 * and a nota). Nota that there should never be two calificaciones with
 * the same matricula in the database; this property should be guaranteed
 * by the interface methods.
 */
public interface ActaNotas {

	/**
	 * Adds a new calificacion to the database.
	 * @throws CalificacionAlreadyExistsException
	 * if a calificacion with the same matricula already existed
	 * in the database.
	 */
	public void addCalificacion(String nombre, String matricula, int nota)
			throws CalificacionAlreadyExistsException;

	/**
	 * Modifies the nota for a calificacion with the given matricula
	 * (there can never be more than calificacion for a given matricula).
	 * @throws InvalidMatriculaExcepcion if there is no calificacion for
	 * the specified matricula.
	 */
	public void updateNota(String matricula, int nota)
			throws InvalidMatriculaException;

	/**
	 * Deletes the calificacion for the student with the given matricula.
	 * @throws InvalidMatriculaExcepcion if there is no calificacion for
	 * the specified matricula.
	 */
	public void deleteCalificacion(String matricula)
			throws InvalidMatriculaException;

	/**
	 * Returns the calificacion for the student with the given matricula.
	 * @return the calificacion for the student with the given matricula.
	 * @throws InvalidMatriculaExcepcion if there is no calificacion for
	 * the specified matricula.
	 */
	public Calificacion getCalificacion(String matricula)
			throws InvalidMatriculaException;

	/**
	 * Returns a SORTED indexed list with the calificaciones in the
	 * database, where the
	 * sorting order is given by the Comparator cmp. Note that calificaciones
	 * should be sorted from smaller to bigger values (using cmp).
	 * @return a sorted list of the calificacions in the database.
	 */
	public IndexedList<Calificacion> getCalificaciones(Comparator<Calificacion> cmp);

	/**
	 * Returns a list with the calificacions that have a nota greater
	 * or equal to the notaMinima argument.
	 * Note that there is no requirement that the returned
	 * list has to be sorted. This method should NOT remove calificaciones
	 * from the database.
	 */
	public IndexedList<Calificacion> getAprobados(int notaMinima);
}
