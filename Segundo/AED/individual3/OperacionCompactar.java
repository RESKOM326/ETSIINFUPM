package aed.individual3;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

public class OperacionCompactar {
	
	/**
	 * Metodo que reduce los elementos iguales consecutivos de una lista a una 
	 * unica repeticion
	 * @param lista Lista de entrada
	 * @return Lista nueva compactada sin elementos iguales consecutivos
	 */
	
	
	public <E> PositionList<E> compactar (PositionList<E> lista) {
		//Creamos nueva lista
		PositionList<E> l=new NodePositionList<E>();
		//Si la lista no es nula realiza operaciones
		if(lista!=null) {
			//Lista vacia (NO nula), se le asigna una lista vacía a 'l'
			if(lista.isEmpty()) {
				l=new NodePositionList<E>();
			}
			//Tamaño de 1. Se añade a 'l' el unico elemento de la lista
			else if(lista.size()==1) {
				l.addFirst(lista.first().element());
			}
			//Si la lista tiene mas de un elemento se distinguen varios casos
			else if(lista.size()>1) {
				//El primer elemento siempre esta en la lista nueva 'l'
				l.addFirst(lista.first().element());
				//Empieza el recorrido en el segundo elemento, hasta el ultimo (ultimo incluido)
				for(Position<E> cursor=lista.next(lista.first()); cursor!=null; cursor=lista.next(cursor)) {
					//Se comparan un elemento con su anterior, siempre que ambos no sean nulos, y se añade el elemento si
					//NO es igual al elemento previo a el
					if(cursor.element()!=null&&lista.prev(cursor).element()!=null) {
						if(!(cursor.element().equals(lista.prev(cursor).element()))) {
							l.addLast(cursor.element());
						}
					}
					//Si alguno de los elementos a comparar es nulo y otro no, se añadira uno de ellos (en este caso al que apunta el cursor
					else if(cursor.element()!=null || lista.prev(cursor).element()!=null) {
						l.addLast(cursor.element());
					}
					//Si ambos elementos son nulos, no se realizan cambios en 'l' dado que son iguales
				}
			}
			return l;
		}
		//Excepcion en caso de que la lista sea nula
		else {
			throw new IllegalArgumentException("La lista recibida no puede ser nula");
		}
				
	}
}

