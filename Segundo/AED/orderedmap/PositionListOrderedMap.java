package aed.orderedmap;

import java.util.Comparator;
import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;

public class PositionListOrderedMap<K,V> implements OrderedMap<K,V> {
    private Comparator<K> cmp;
    private PositionList<Entry<K,V>> elements;
  
    public PositionListOrderedMap(Comparator<K> cmp) {
    	this.cmp = cmp;
    	this.elements=new NodePositionList<Entry<K,V>>();
    }

    /* Ejemplo de un posible método auxiliar: */
  
    private Position<Entry<K,V>> keyPosition(K key) {
    	Position<Entry<K,V>> pos=null;
		boolean isOnMap=false;
		Position<Entry<K,V>> cursor=elements.first();
		while(cursor!=null&&!isOnMap) {
			if(cursor.element().getKey().equals(key)) {
				isOnMap=true;
				pos=cursor;
			}
			else {
				cursor=elements.next(cursor);
			}
		}
		return pos;
    }
    
    /* If key is in the map, return the position of the corresponding
     * entry.  Otherwise, return the position of the entry which
     * should follow that of key.  If that entry is not in the map,
     * return null.  Examples: assume key = 2, and l is the list of
     * keys in the map.  For l = [], return null; for l = [1], return
     * null; for l = [2], return a ref. to '2'; for l = [3], return a
     * reference to [3]; for l = [0,1], return null; for l = [2,3],
     * return a reference to '2'; for l = [1,3], return a reference to
     * '3'. */
    
    /**
    private Position<Entry<K,V>> findKeyPlace(K key) throws InvalidKeyException {
    	Position<Entry<K,V>> pos=null;
    	if(this.containsKey(key)) {
    		pos=this.keyPosition(key);
    	}
    	else {
    		for(Position<Entry<K,V>> cursor=elements.first(); cursor!=null; cursor=elements.next(cursor)) {
    			if((cmp.compare(cursor.element().getKey(), key)<0)
    					&&(cmp.compare(elements.next(cursor).element().getKey(), key)>0)) {
    	    		pos=elements.next(cursor);
    	    	}
    		}
    	}
    	return pos;
    	
    }
    */
  
    public boolean containsKey(K key) throws InvalidKeyException {
    	if(key!=null) {
    		boolean contenido=false;
    		if(this.keyPosition(key)!=null) {
    			contenido=true;
    		}
    		return contenido;
    	}
    	else {
    		throw new InvalidKeyException();
    	}
    }
  
    //-------------------------------------------------------------------------------:
    
    public V get(K key) throws InvalidKeyException {
    	if(key!=null) {
    		V valor=null;
    		if(this.containsKey(key)) {
    			valor=this.keyPosition(key).element().getValue();
    		}
    		return valor;
    	}
    	else {
    		throw new InvalidKeyException();
    	}
    }
    
  //-------------------------------------------------------------------------------:
    
    public V put(K key, V value) throws InvalidKeyException {
    	if(key!=null) {
    		Position<Entry<K,V>> cursor=elements.first();
    		Entry<K,V> nuevo=new EntryImpl<K,V>(key,value);
    		while(cursor!=null) {
    			if(cmp.compare(cursor.element().getKey(), key)>0) {
    				elements.addBefore(cursor, nuevo);
    				return null;
    			}
    			else if(cursor.element().getKey().equals(key)) {
    				Entry<K,V> aux=null;
    				aux=elements.set(cursor, nuevo);
    				return aux.getValue();
    		    }
    			else {
    				cursor=elements.next(cursor);
    			}
    		}
    		elements.addLast(nuevo);
			return null;
    	}
    	else {
    		throw new InvalidKeyException();
    	}	
    }
    
  //-------------------------------------------------------------------------------:
    
    public V remove(K key) throws InvalidKeyException {
    	if(key!=null) {
    		V res=null;
    		Entry<K,V> val=null;
    		boolean rem=false;
    		Position<Entry<K,V>> cursor=elements.first();
    		while(cursor!=null&&!rem) {
    			if(cursor.element().getKey().equals(key)) {
    				val=elements.remove(cursor);
    				res=val.getValue();
    				rem=true;
    			    
    			}
    		  
    			else {
    				cursor=elements.next(cursor);
    			}
    			
    		}
    		return res;
    	}
    	else {
    		throw new InvalidKeyException();
    	}
    	
    }
    
  //-------------------------------------------------------------------------------:
    
    public int size() {
    	return elements.size();
    }
    
  //-------------------------------------------------------------------------------:
    
    public boolean isEmpty() {
    	return elements.isEmpty();
    }
    
  //-------------------------------------------------------------------------------:
    
    public Entry<K,V> floorEntry(K key) throws InvalidKeyException {
    	if(key!=null) {
    		Entry<K,V> entrada=null;
    		for(Position<Entry<K,V>> cursor=elements.last(); cursor!=null; cursor=elements.prev(cursor)) {
    			if(cmp.compare(elements.first().element().getKey(), key)>0) {
    				return null;
    			}
    			else if(cmp.compare(elements.last().element().getKey(), key)<0) {
    				entrada=elements.last().element();
    			}
    			if(cursor.element().getKey().equals(key)) {
    				entrada=cursor.element();
    			}
    			else if((cmp.compare(cursor.element().getKey(), key)>0)
    					&&(cmp.compare(elements.prev(cursor).element().getKey(), key)<0)) {
    				entrada=elements.prev(cursor).element();
    			}
    		}
    		return entrada;
    	}
    	else {
    		throw new InvalidKeyException();
    	}	
    }
    
  //-------------------------------------------------------------------------------:
    
    public Entry<K,V> ceilingEntry(K key) throws InvalidKeyException {
    	if(key!=null) {
    		Entry<K,V> entrada=null;
    		for(Position<Entry<K,V>> cursor=elements.first(); cursor!=null; cursor=elements.next(cursor)) {
    			if(cmp.compare(elements.first().element().getKey(), key)>0) {
    				entrada=elements.first().element();
    			}
    			else if(cmp.compare(elements.last().element().getKey(), key)<0) {
    				entrada=null;
    			}
    			else if(cursor.element().getKey().equals(key)) {
    				entrada=cursor.element();
    			}
    			else if((cmp.compare(cursor.element().getKey(), key)<0)
    					&&(cmp.compare(elements.next(cursor).element().getKey(), key)>0)) {
    				entrada=elements.next(cursor).element();
    			}
    		}
    		return entrada;
    	}
    	else {
    		throw new InvalidKeyException();
    	}
    }
    
  //-------------------------------------------------------------------------------:
    
    public Iterable<K> keys() {
    	PositionList<K> claves=new NodePositionList<K>();
    	Iterator<Entry<K,V>> it=elements.iterator();
    	Entry<K,V> aux;
    	while(it.hasNext()) {
    		aux=it.next();
    		claves.addLast(aux.getKey());
    	}
    	return claves;
    }
    
  //-------------------------------------------------------------------------------:
    
    public String toString() {
    	return elements.toString();
    }
 
}
