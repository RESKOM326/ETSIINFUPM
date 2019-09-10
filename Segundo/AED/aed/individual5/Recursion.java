package aed.individual5;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.indexedlist.IndexedList;


public class Recursion {
	
  //-----------------------------------------------------------------------------------------
	
  public static double babylonRoot(double n) {
    if(n<0) {
    	throw new IllegalArgumentException("El número no puede ser negativo");
    }
    return babylonRootRec(n, 1);
  }
  
  private static double babylonRootRec(double n, double xn) {
	  double xns=(xn+(n/xn))/2;
	  if(xns-xn<0.25 && xns-xn>-0.25) {
		  return xns;
	  }
	  return babylonRootRec(n, xns);
  }

  //-----------------------------------------------------------------------------------------
  
  public static int sumEven(IndexedList<Integer> l) {
    if(l==null || l.isEmpty()) {
    	return 0;
    }
    return sumEvenRec(0, l, 0);
  }
  
  private static int sumEvenRec(int r, IndexedList<Integer> l, int i) {
	  if(i>=l.size()) {
		  return r;
	  }
	  else if(l.get(i)==null || l.get(i)%2!=0) {
		 return sumEvenRec(r, l, i+1);
	  }
	  else {
		  return sumEvenRec(r+l.get(i), l, i+1);
	  }
  }

  //-----------------------------------------------------------------------------------------
  
  public static boolean allEven(PositionList<Integer> l) {
    if(l==null) {
    	return false;
    }
    return allEvenRec(true, l, l.first());
  }
  
  private static boolean allEvenRec(boolean r, PositionList<Integer> l, Position<Integer> cursor) {
	  if(cursor==null) {
		  return r;
	  }
	  else if(cursor.element()!=null && cursor.element()%2!=0) {
		  return allEvenRec(false, l, l.next(cursor));
	  }
	  else {
		  return allEvenRec(r, l, l.next(cursor));
	  }
  }
  
}
