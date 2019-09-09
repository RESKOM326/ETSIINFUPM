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
  
  public Value get(Key key) {
    return null;
  }
  
  public void put(Key key, Value value) {
	 
  }
}

