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
		PositionList<E> l=new NodePositionList<E>();
		if(lista!=null) {
			if(lista.isEmpty()) {
				l=new NodePositionList<E>();
			}
			else if(lista.size()==1) {
				l.addFirst(lista.first().element());
			}
			else if(lista.size()>1) {
				l.addFirst(lista.first().element());
				for(Position<E> cursor=lista.next(lista.first()); cursor!=lista.next(lista.last()); cursor=lista.next(cursor)) {
					if(cursor.element()!=null&&lista.prev(cursor).element()!=null) {
						if(!(cursor.element().equals(lista.prev(cursor).element()))) {
							l.addLast(cursor.element());
						}
					}
					else if((cursor.element()==null&&lista.prev(cursor).element()!=null) || (cursor.element()!=null&&lista.prev(cursor).element()==null)) {
						l.addLast(cursor.element());
					}
				}
			}
			return l;
		}
		else {
			throw new IllegalArgumentException("La lista recibida no puede ser nula");
		}
		
	}
	
}
