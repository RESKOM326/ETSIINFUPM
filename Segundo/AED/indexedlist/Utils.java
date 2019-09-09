package aed.indexedlist;
import es.upm.aedlib.indexedlist.*;

public class Utils {
  public static <E> IndexedList<E> deleteRepeated(IndexedList<E> l) {
	  IndexedList<E> lista = new ArrayIndexedList<E>();
	  boolean aux=false;
	  int i=0;
	  while(i<l.size()){
		  int j=0;
		  while(j<lista.size()&&(aux==false)){
			  if(lista.get(j).equals(l.get(i))){
				  aux=true;
			  }
			  j++;
		  }
		  if(!aux){
			  lista.add(lista.size(), l.get(i));
		  }
		  aux=false;
		  i++;
	  }
	  return lista;
  }
}
