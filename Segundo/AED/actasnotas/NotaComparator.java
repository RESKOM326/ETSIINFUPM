package aed.actasnotas;

import java.util.Comparator;

public class NotaComparator implements Comparator<Calificacion> {
    public int compare(Calificacion c1, Calificacion c2) {
	return c1.getNota() - c2.getNota();
    }
}
