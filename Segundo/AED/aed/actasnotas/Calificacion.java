package aed.actasnotas;

import java.lang.Comparable;


/**
 * Provides constructors and methods for constructing calificacions,
 * as composed by a nombre, a matricula and a nota,
 * and setters and getters for accessing the parts of a calificacion.
 */
@SuppressWarnings("unused")
public class Calificacion {
	String nombre;
	String matricula;
	int nota;

    /**
     * Constructs a calificacion composed of a nombre, a matricula
     * and a nota.
     */
    public Calificacion(String nombre, String matricula, int nota) {
	this.nombre = nombre;
	this.matricula = matricula;
	this.nota = nota;
    }

    /**
     * Returns the nombre.
     * @return the nombre.
     */
    public String getNombre() {
	return nombre;
    }

    /**
     * Returns the matricula.
     * @return the matricula.
     */
    public String getMatricula() {
	return matricula;
    }

    /**
     * Returns the nota.
     * @return the nota.
     */
    public int getNota() {
	return nota;
    }

    /**
     * Changes the name in the calificacion.
     */
    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    /**
     * Changes the matricula in the calificacion.
     */
    public void setMatricula(String matricula) {
	this.matricula = matricula;
    }

    /**
     * Changes the nota in the calificacion.
     */
    public void setNota(int nota) {
	this.nota = nota;
    }

    public String toString() {
	return "Calificacion("+
	    "\""+getNombre()+
	    "\",\""+getMatricula()+
	    "\","+getNota()+
	    ")";
    }

    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (!(obj instanceof Calificacion)) return false;

	Calificacion other = (Calificacion) obj;

	String m1 = getMatricula();
	String m2 = other.getMatricula();
	if (m1 == null) return m2 == null;
	if (!m1.equals(m2)) return false;

	String n1 = getNombre();
	String n2 = other.getNombre();
	if (n1 == null) return n2 == null;
	if (!n1.equals(n2)) return false;

	return getNota() == other.getNota();
    }

    public int hashCode() {
	String m = getMatricula();
	int code = m==null ? 0 : m.hashCode();
	String n = getNombre();
	code += n==null ? 0 : n.hashCode();
	code += getNota();
	return code;
    }
}
