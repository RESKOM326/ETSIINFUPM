package aed.individual5;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.indexedlist.IndexedList;


public class Recursion {
	
  //-----------------------------------------------------------------------------------------
	
  public static double babylonRoot(double n) {
	  return (n<0) ? -1 : babylonRootRec(n,1);
  }
  
  private static double babylonRootRec(double n, double xn) {
	  double xns=(xn+(n/xn))/2;
	  return (xns-xn<0.25 && xns-xn>-0.25) ? xns : babylonRootRec(n,xns);
  }

  //-----------------------------------------------------------------------------------------
  
  public static int sumEven(IndexedList<Integer> l) {
	  return (l==null || l.isEmpty()) ? 0 : sumEvenRec(0,l,0);
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
	  return (l==null) ? false : allEvenRec(true, l, l.first());
  }
  
  private static boolean allEvenRec(boolean r, PositionList<Integer> l, Position<Integer> cursor) {
	  if(cursor==null) {
		  return r;
	  }
	  else if(cursor.element()!=null && cursor.element()%2!=0) {
		  return false;
	  }
	  else {
		  return allEvenRec(r, l, l.next(cursor));
	  }
  }
  
}
