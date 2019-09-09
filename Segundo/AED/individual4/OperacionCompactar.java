package aed.individual4;

import java.util.Iterator;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

@SuppressWarnings("unused")
public class OperacionCompactar {
	
	/**
	 * Metodo que reduce los elementos iguales consecutivos de una lista a una 
	 * unica repeticion
	 * @param lista Lista de entrada
	 * @return Lista nueva compactada sin elementos iguales consecutivos
	 */
	public <E> PositionList<E> compactar (Iterable<E> lista) {
		PositionList<E> l=new NodePositionList<E>();
		if(lista!=null) {
			Iterator<E> list=lista.iterator();
			if(!list.hasNext()) {
				l=new NodePositionList<E>();
			}
			else {
				E ls=list.next();
				l.addLast(ls);
				E aux=null;
				while(list.hasNext()) {
					aux=list.next();
					if(ls!=null && aux!=null) {
						if(!ls.equals(aux)) {
							l.addLast(aux);
							ls=aux;
						}
					}
					else if((ls==null && aux!=null) || (ls!=null && aux==null)) {
						l.addLast(aux);
						ls=aux;
					}
				}
			}
			return l;
		}
		
		else {
			throw new IllegalArgumentException();
		}
	}
	
}
