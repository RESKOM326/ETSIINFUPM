package aed.ExamenParcial1;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import java.util.Iterator;

/**
 * Primer Parcial de Algoritmos y Estructura de Datos
 * @author RESKOM326
 *
 */
public class Examen {
	
	/**
	 * Equals, pero funciona con elementos null
	 * @param o1
	 * @param o2
	 * @return equals? (null incluido)
	 */
	private static boolean eqNull(Object o1, Object o2) {
		return (o1==o2)||(o1!=null && o1.equals(o2));
	}
	
	/**
	 * Copia en una nueva lista los elementos con un salto de 'n' en 'n'
	 * @param list
	 * @param n
	 * @return nueva lista parcialmente copiada
	 */
	static <E> PositionList<E> copyElemsNbyN(PositionList<E> list, int n) {
		if(n<=0) {
			throw new IllegalArgumentException();
		}
		PositionList<E> res=new NodePositionList<E>();
		res.addFirst(list.first().element());
		Position<E> cursor=list.first();
		int salto=n;
		while(cursor!=null) {
			if(salto==0) {
				res.addLast(cursor.element());
				salto=n;
			}
			else {
				cursor=list.next(cursor);
				salto--;
			}
		}
		return res;
	}
	
	/**
	 * Comprueba que los dos iterables son iguales (mismo tamaño y mismos elementos en la misma posicion)
	 * @param iterable1
	 * @param iterable2
	 * @return true si iguales, false en caso contrario
	 */
	public static <E> boolean iguales(Iterable<E> iterable1, Iterable<E> iterable2) {
		Iterator<E> it1=iterable1.iterator();
		Iterator<E> it2=iterable2.iterator();
		while(it1.hasNext()) {
			if(!(eqNull(it1.next(), it2.next())) || (((!it1.hasNext() && it2.hasNext()) || (it1.hasNext() && !it2.hasNext())))){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Devuelve la media de un conjunto de valores usando recursion
	 * @param list
	 * @return llamada al metodo recursivo que implementa la especificacion de "average"
	 */
	static double average(PositionList<Integer> list) {
		if(list==null || list.isEmpty()) {
			throw new IllegalArgumentException();
		}
		return averageRec(0, list, list.first());
	}
	private static double averageRec(double r, PositionList<Integer> list, Position<Integer> cursor) {
		return (cursor==null) ? r/list.size() : averageRec(r+cursor.element(), list, list.next(cursor));
	}
	
	/**
	 * Imprime la solucion al ejercicio de complejidad (Ej. 4)
	 */
	public static void complejidad() {
		System.out.print("O(n), O(n^2)"); 
	}

}
