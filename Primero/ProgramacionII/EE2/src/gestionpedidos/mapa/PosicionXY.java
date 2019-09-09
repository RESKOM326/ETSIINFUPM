package gestionpedidos.mapa;

public class PosicionXY {
	
	//AATRIBUTOS
	private int x;
	private int y;	
	
	//CONSTRUCTOR
	public PosicionXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//DISTANCIA
	public double distancia(PosicionXY posDestino) {		
		return Math.abs(x - posDestino.x) + Math.abs(y - posDestino.y);		
	}
	
	//GETTERS - SETTERS
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
