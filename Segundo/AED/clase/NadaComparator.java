package aed.clase;

import java.util.Comparator;
import es.upm.aedlib.Position;

public class NadaComparator implements Comparator<Ninguno>{
	
	public int compare(Position<Ninguno> n1, Position<Ninguno> n2) {
		return ((Ninguno) n1).getNada() - ((Ninguno) n2).getNada();
	}

	@Override
	public int compare(Ninguno arg0, Ninguno arg1) {
		// TODO Auto-generated method stub
		
		return arg0.getNada() - arg1.getNada();	
	}

}
