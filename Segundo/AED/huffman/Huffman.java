package aed.huffman;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.*;


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

    //////////////////////////////////////////////////////////////////////

    public String encode(String text) {
    	String code="";
    	for(int i=0; i<text.length(); i++) {
    		code+=findCharacterCode(text.charAt(i), huffmanTree, huffmanTree.root(), "");
    	}
    	return code;
    }

    private String findCharacterCode(Character ch, BinaryTree<Character> tree, Position<Character> pos, String path) {
    	String res;
        if (!tree.isExternal(pos)) {
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
    
    //////////////////////////////////////////////////////////////////////

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



