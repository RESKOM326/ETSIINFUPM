package aed.ExamenParcial1;

import es.upm.aedlib.positionlist.*;
import aed.ExamenParcial1.Examen;

public class MainPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositionList<Character> l=new NodePositionList<Character>();
		l.addLast('a');
		l.addLast('b');
		l.addLast('c');
		l.addLast('d');
		l.addLast('e');
		l.addLast('f');
		l.addLast('g');
		l.addLast('h');
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		PositionList<Integer> l21=new NodePositionList<Integer>();
		l21.addLast(1);
		l21.addLast(2);
		l21.addLast(null);
		l21.addLast(4);
		PositionList<Integer> l22=new NodePositionList<Integer>();
		l22.addLast(1);
		l22.addLast(2);
		l22.addLast(null);
		l22.addLast(4);
		PositionList<Integer> l23=new NodePositionList<Integer>();
		l23.addLast(1);
		l23.addLast(2);
		l23.addLast(null);
		l23.addLast(4);
		l23.addLast(5);
		PositionList<Integer> l24=new NodePositionList<Integer>();
		l24.addLast(1);
		l24.addLast(2);
		l24.addLast(null);
		l24.addLast(4);
		l24.addLast(null);
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		PositionList<Integer> l31=new NodePositionList<Integer>();
		l31.addLast(1);
		l31.addLast(2);
		l31.addLast(3);
		PositionList<Integer> l32=new NodePositionList<Integer>();
		l32.addLast(5);
		l32.addLast(2);
		PositionList<Integer> l33=new NodePositionList<Integer>();
		l33.addLast(5);
		l33.addLast(4);
		l33.addLast(8);
		l33.addLast(2);
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		System.out.println(l.toString());
		System.out.println(Examen.copyElemsNbyN(l, 2).toString());
		System.out.println("");
		
		System.out.println(Examen.iguales(l21, l22));
		System.out.println(Examen.iguales(l22, l23));
		System.out.println(Examen.iguales(l22, l24));
		System.out.println(Examen.iguales(l23, l24));
		System.out.println("");
		
		System.out.println(Examen.average(l31));
		System.out.println(Examen.average(l32));
		System.out.println(Examen.average(l33));
		System.out.println("");
		
		Examen.complejidad();
	}

}
