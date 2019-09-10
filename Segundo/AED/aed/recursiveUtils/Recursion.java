package aed.recursiveUtils;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;


public class Recursion {
	
	/**
	 * 
	 * @param l
	 * @param pos
	 * @return La posición del elemento "pos" si existe en la lista o la posición null si no existe.
	 */
	private static <E> Position<E> buscar(PositionList<E> l, Position<E> pos) {
		return buscarRec(null, l, pos, l.first());
	 }
	
	private static <E> Position<E> buscarRec(Position<E> r, PositionList<E> l, Position<E> pos, Position<E> cursor){
		if(cursor==null) {
			return r;
		}
		else if(cursor.element().equals(pos.element())) {
			return cursor;
		}
		return buscarRec(r, l, pos, l.next(cursor));
	}
	
	//----------------------------------------------------------------------------------------------------------------------
	
  public static <E> Position<E> getPosition(PositionList<E> l, Position<E> pos, int n) {
	  Position<E> aux=buscar(l, pos);
	  if(aux==null) {
		  return null;
	  }
	  return getPositionRec(aux, l, n);
  }
  
  private static <E> Position<E> getPositionRec(Position<E> r, PositionList<E> l, int n) {
	  if(n==0) {
		  return r;
	  }
	  else if(n>0) {
		  return getPositionRec(l.next(r), l, n-1);
	  }
	  return getPositionRec(l.prev(r), l, n+1);	  
  }
  
  	//----------------------------------------------------------------------------------------------------------------------
  
  public static PositionList<Character> decrypt(PositionList<Character> alphabet, PositionList<Integer> encodedText) {
	  PositionList<Character> res=new NodePositionList<Character>();
	  Position<Character> alcursor=alphabet.first();
	  Position<Integer> encursor=encodedText.first();
	  return decryptRec(res, alphabet, encodedText, alcursor, encursor);
  }
  
  private static PositionList<Character> decryptRec(PositionList<Character> res, PositionList<Character> alphabet, PositionList<Integer> encodedText,
		  		 Position<Character> alcursor, Position<Integer> encursor) {
	  if(encursor==null) {
		  return res;
	  }
	  Position<Character> aux=getPosition(alphabet, alcursor, encursor.element());
	  res.addLast(aux.element());
	  return decryptRec(res, alphabet, encodedText, aux, encodedText.next(encursor));
  }
  
  	//----------------------------------------------------------------------------------------------------------------------
  
  private static boolean opens(char c) {
	  if(c=='(' || c=='{' || c=='[') {
		  return true;
	  }
	  return false;
  }
  private static boolean closes(char c) {
	  if(c==')' || c=='}' || c==']') {
		  return true;
	  }
	  return false;
  }
  private static boolean matches(char c1, char c2) {
	  if((c1=='(' && c2==')') || (c1=='{' && c2=='}') || (c1=='[' && c2==']')) {
		  return true;
	  }
	  return false;
  }
  
  public static boolean isBalanced(String s) {
    return isBalancedRec(s, "");
  }
  
  private static boolean isBalancedRec(String in, String out) {
	  if(in.isEmpty()) {
		  return out.isEmpty();
	  }
	  else {
		  if(opens(in.charAt(0))) {
			  return isBalancedRec(in.substring(1), in.charAt(0) + out);
		  }
		  else {
			 if(closes(in.charAt(0))) {
				 return !out.isEmpty() && matches(out.charAt(0), in.charAt(0)) && isBalancedRec(in.substring(1), out.substring(1));
			 }
			 else {
				 return isBalancedRec(in.substring(1), out);
			 }
		  }
	  }
  }
  
}
