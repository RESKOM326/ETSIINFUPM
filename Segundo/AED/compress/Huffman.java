package aed.compress;

import es.upm.aedlib.Position;
import es.upm.aedlib.Entry;
import es.upm.aedlib.tree.*;
import es.upm.aedlib.priorityqueue.*;


@SuppressWarnings("unused")
public class Huffman {
  private BinaryTree<Character> huffmanTree;
  

  public Huffman(String text) {
    this.huffmanTree = constructHuffmanTree(text);
  }
  
  private BinaryTree<Character> constructHuffmanTree(String text) {
	  PriorityQueue<Integer, BinaryTree<Character>> pq=new SortedListPriorityQueue<Integer, BinaryTree<Character>>();
	  int [] charCode=countChars(text);
	  for(int i=0; i<charCode.length; i++) {
		  if(charCode[i]>0) {
			  BinaryTree<Character> tree=new LinkedBinaryTree<Character>();
			  tree.addRoot((char) i);
			  pq.enqueue(charCode[i], tree);
		  }
	  }
	  while(pq.size()>1) {
		  Entry<Integer, BinaryTree<Character>> left=pq.dequeue();
		  Entry<Integer, BinaryTree<Character>> right=pq.dequeue();
		  AttachableBinaryTree<Character> tree=new AttachableLinkedBinaryTree<Character>();
		  tree.addRoot(' ');
		  tree.attach(tree.root(), left.getValue(), right.getValue());
		  pq.enqueue(left.getKey()+right.getKey(), tree);
	  }
	  return pq.first().getValue();
  }

  public static int[] countChars(String text) {
	  //Crea nuevo array de tamaño 256 (los códigos ASCII)
	  int[] arr=new int[256];
	  //Recorre el String 'texto' completamente
	  for(int i=0; i<text.length(); i++) {
		  //Aumenta en 1 la frecuencia correspondiente al código ASCII de ese carácter
		  arr[(int) text.charAt(i)]++;
	  }
	  return arr;
  }
}



