package aed.compress;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.*;


public class AttachableLinkedBinaryTree<E> extends LinkedBinaryTree<E> implements AttachableBinaryTree<E> {

  public void attach(Position<E> pos, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
	  //Inserta las raíces de los subárboles izquierdo y derecho como hijos de "pos"
	  this.insertLeft(pos, leftTree.root().element());
	  this.insertRight(pos, rightTree.root().element());
	  //Añade el subárbol izquierdo (a partir de su raíz, un cursor para el subárbol y otro para el árbol) de manera recursiva.
	  attachRec(this.left(pos), leftTree.root(), leftTree);
	  //Lo mismo, pero hace la llamada con el subárbol derecho y sus correspondientes parámetros
	  attachRec(this.right(pos), rightTree.root(), rightTree);
  }
  private void attachRec(Position<E> pos, Position<E> cur, BinaryTree<E> toAttach) {
	  if(toAttach.hasLeft(cur)) {
		  //Si el subárbol tiene hijo izquierdo, ese hijo se insertará como hijo izquierdo en relación al cursor 'pos' del árbol (this)
		  E leftE=toAttach.left(cur).element();
		  this.insertLeft(pos, leftE);
		  //Llamada recursiva con los cursores avanzando por la izquierda
		  attachRec(this.left(pos), toAttach.left(cur), toAttach);
	  }
	  if(toAttach.hasRight(cur)) {
		  //Si el subárbol tiene hijo derecho, ese hijo se insertará como hijo derecho en relación al cursor 'pos' del árbol (this)
		  E rightE=toAttach.right(cur).element();
		  this.insertRight(pos, rightE);
		  //Llamada recursiva con los cursores avanzando por la derecha
		  attachRec(this.right(pos), toAttach.right(cur), toAttach);
	  }
  }

}
