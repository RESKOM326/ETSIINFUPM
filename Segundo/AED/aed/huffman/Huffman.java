package aed.huffman;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.*;

//Angelika Krolikowska - Mark Dervishaj

/**
 * Defines metodos for Huffman encoding of text strings.
 */
public class Huffman {
    private LinkedBinaryTree<Character> huffmanTree;
    
    public Huffman(LinkedBinaryTree<Character> huffmanTree) {
      this.huffmanTree = huffmanTree;
    }

    /**
     * Creates a Huffman tree (and stores it in the attribute huffmanTree).
     * The shape of the (binary) tree is
     * defined by the array of char-codes.
     */
    
    /**
     * Recorre la codificación para cada elemento de paths y construye un árbol binario en base a paths. Partiendo de la raíz, si ya existe un nodo hijo,
     * avanza a él, si no, crea un nuevo nodo según '1' o '0' y avanza a él. Cuando se está en el último dígito de la codificación, inserta un nodo externo
     * con el carácter dado por el vector paths
     * @param paths
     */
    public Huffman(CharCode[] paths) {
    	this.huffmanTree = new LinkedBinaryTree<Character>();
    	huffmanTree.addRoot(' ');
    	Position<Character> cursor=huffmanTree.root();
    	for(int i=0; i<paths.length; i++) {
    		for(int j=0; j<paths[i].getCode().length(); j++) {
    			if(paths[i].getCode().charAt(j)=='1') {
    				if(huffmanTree.hasRight(cursor)) {
    					cursor=huffmanTree.right(cursor);
    				}
    				else {
    					if(j==paths[i].getCode().length()-1) {
    						huffmanTree.insertRight(cursor, paths[i].getCh());
    						cursor=huffmanTree.right(cursor);
    					}
    					else {
    						huffmanTree.insertRight(cursor, ' ');
    						cursor=huffmanTree.right(cursor);
    					}	
    				}
    			}
    			else {
    				if(huffmanTree.hasLeft(cursor)) {
    					cursor=huffmanTree.left(cursor);
    				}
    				else {
    					if(j==paths[i].getCode().length()-1) {
    						huffmanTree.insertLeft(cursor, paths[i].getCh());
    						cursor=huffmanTree.left(cursor);
    					}
    					else {
    						huffmanTree.insertLeft(cursor, ' ');
    						cursor=huffmanTree.left(cursor);
    					}
    				}
    			}
    		}
    		cursor=huffmanTree.root();
    	}
    }

    /**
     * Devuelve la codificación para un texto dado. Usa un método auxiliar que extrae el camino para cada carácter del texto y suma todos los caminos.
     * @param text
     * @return Codificación del texto "text"
     */
    public String encode(String text) {
    	String code="";
    	for(int i=0; i<text.length(); i++) {
    		code+=findCharacterCode(text.charAt(i), huffmanTree, huffmanTree.root(), "");
    	}
    	return code;
    }
    
    /**
     * Método auxiliar recursivo que consigue el camino de un carácter. Recorre el árbol hasta llegar a un nodo externo sumando su path. Si el elemento de ese
     * nodo externo es igual al carácter dado, entonces devuelve el path. En caso contrario se "reinicia" path (null) y se sigue recorriendo el árbol.
     * @param ch
     * @param tree
     * @param pos
     * @param path
     * @return String que representa el camino a un carácter.
     */
    private String findCharacterCode(Character ch, BinaryTree<Character> tree, Position<Character> pos, String path) {
    	String res="";
        if (tree.isInternal(pos)) {
        	res=findCharacterCode(ch, tree, tree.left(pos), path +'0');
            if (res==null) {
                res=findCharacterCode(ch, tree, tree.right(pos), path +'1');
            }
        }
        else {
        	if(pos.element().equals(ch)) {
        		res=path;
        	}
        	else res=null;
        }
        return res;
    }
    
    /**
     * Desde la raíz avanza por el árbol según la codificación. Si llega a un nodo externo, encuentra un carácter y la búsqueda vuelve a avanzar
     * desde la raíz, continuando la iteración de encodedText.
     * @param encodedText
     * @return String con el texto correspondiente a una codificación.
     */
    public String decode(String encodedText) {
    	Position<Character> cursor=huffmanTree.root();
    	String res="";
    	for(int i=0;i<encodedText.length();i++) {
    		if(encodedText.charAt(i)=='1') {
    			cursor=huffmanTree.right(cursor);
    			if(huffmanTree.isExternal(cursor)) {
    				res=res+cursor.element();
    				cursor=huffmanTree.root();
    			}
    		}
    		else {
    			cursor=huffmanTree.left(cursor);
    			if(huffmanTree.isExternal(cursor)) {
    				res=res+cursor.element();
    				cursor=huffmanTree.root();
    			}
    		}
    			
    	}
    	return res;
    }
}



