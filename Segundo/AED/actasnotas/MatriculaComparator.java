package aed.actasnotas;

import java.util.Comparator;

public class MatriculaComparator implements Comparator<Calificacion> {
    public int compare(Calificacion c1, Calificacion c2) {
	return c1.getMatricula().compareTo(c2.getMatricula());
    }
}
