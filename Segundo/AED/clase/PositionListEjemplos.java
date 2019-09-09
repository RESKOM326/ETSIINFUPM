package aed.clase;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import java.util.Comparator;

@SuppressWarnings("unused")
public class PositionListEjemplos {
	
	/**
	public static boolean sorted(PositionList<Ninguno> l, Comparator<Ninguno> ord) throws NullListException {
		if(l!=null) {
			boolean ordenado=true;
			if(l.isEmpty()|| l.size()==1) {
				return ordenado;
			}
			else if(l.size()>1) {
				Position<Ninguno> cursor= l.first();
				while(cursor!=null) {
					if(ord.compare(cursor, l.next(cursor))>0) {
						ordenado=false;
					}
					else {
						cursor=l.next(cursor);
					}
				
				}
				return ordenado;
			}
			
		}
		else {
			throw new NullListException();
		}
		
	}
	
	
	public static <E> PositionList<T> mapPL(PositionList<E> l, Map<E,T> ap) {
		
		 //Interface Map<A,B>
		 //B map(A x); (operacion)
		 
		PositionList<T> resultado=new Node ();
		for(Position<E> cursor=l.first();cursor!=null;cursor=l.next(cursor)) {
			resultado.addlast(ap.map(cursor.element()));
		}
		return resultado;
	}
	*/
	
}
	
