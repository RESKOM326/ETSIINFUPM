package aed.cache;

import es.upm.aedlib.Position;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;


public class Cache<Key,Value> {
  private int maxCacheSize;
  private Storage<Key,Value> mainMemory;
  private Map<Key,CacheCell<Key,Value>> cacheContents;
  private PositionList<Key> keyListLRU;
  
  public Cache(int maxCacheSize, Storage<Key,Value> mainMemory) {
    this.mainMemory = mainMemory;
    this.cacheContents = new HashTableMap<Key,CacheCell<Key,Value>>();
    this.keyListLRU = new NodePositionList<Key>();
    this.maxCacheSize = maxCacheSize;
  }

  /**
   * Angelika Krolikowska z170042
   * Mark Dervishaj Memi z170296
   * AED - Lab6
   */
  
  	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  
  	/**
  	 * Devuelve el valor que corresponde a una clave "Key"
  	 * @param key
  	 * @return Valor asociado a "Key"
  	 */
  	public Value get(Key key) {
	    if (cacheContents.containsKey(key)) {
	        Position<Key> aux=cacheContents.get(key).getPos();
	        keyListLRU.addFirst(key);
	        cacheContents.get(key).setPos(keyListLRU.first());
	        keyListLRU.remove(aux);   
	    } 
	    else {
	        keyListLRU.addFirst(key);
	        CacheCell<Key, Value> celda=new CacheCell<Key, Value>(mainMemory.read(key), false, keyListLRU.first());
	        cacheContents.put(key, celda);
	        
	        if (this.maxCacheSize<cacheContents.size()) {
	        	
	            Value valor=cacheContents.get(keyListLRU.last().element()).getValue();
	            
	            if (cacheContents.get(keyListLRU.last().element()).getDirty()) {
	                mainMemory.write(keyListLRU.last().element(), valor);
	            }
	            
	            cacheContents.remove(keyListLRU.last().element());
	            keyListLRU.remove(keyListLRU.last());
	        }
	    }
	    return cacheContents.get(key).getValue();
	}

  	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

  	/**
  	 * Establece un valor nuevo para la clave en la memoria cache
  	 * @param key
  	 * @param value
  	 */
	public void put(Key key, Value value) {
	    if (cacheContents.containsKey(key)) {
	    	Position<Key> aux=cacheContents.get(key).getPos();
	        keyListLRU.addFirst(key);
	        cacheContents.get(key).setPos(keyListLRU.first());
	        keyListLRU.remove(aux); 
	    } 
	    else {
	        keyListLRU.addFirst(key);
	        CacheCell<Key, Value> celda=new CacheCell<Key, Value>(value, false, keyListLRU.first());
	        cacheContents.put(key, celda);
	        
	        if (this.maxCacheSize<cacheContents.size()) {
	        	
	            Value valor=cacheContents.get(keyListLRU.last().element()).getValue();
	            
	            if (cacheContents.get(keyListLRU.last().element()).getDirty()) {
	                mainMemory.write(keyListLRU.last().element(), valor);
	            }
	            
	            cacheContents.remove(keyListLRU.last().element());
	            keyListLRU.remove(keyListLRU.last());
	        }
	    }
	    cacheContents.get(key).setDirty(true);
	    cacheContents.get(key).setValue(value);    
	}
  	
}
