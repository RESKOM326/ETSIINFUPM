package progii.juegotablero.model.ajedrez.piezas;

import list.ArrayList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

/**
 * Clase que representa a la Torre
 * @author groman
 *
 */

public class Torre extends PiezaAjedrez  {

	/**
	 * Crea una torre pertenenciente a jugador en la posición (x,y) del tablero
	 * @param jugador El jugador al que pertenece la pieza
	 * @param fila Fila que ocupa 
	 * @param columna Columna que ocupa
	 */
	public Torre(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.TORRE, fila, columna);

		
	}


	@Override
	public ArrayList<Casilla> movimientosValidos() {
		ArrayList<Casilla> resultado = new ArrayList<>();

		casillasVisitables (resultado, 1, 0);

		casillasVisitables (resultado, -1, 0);
		
		casillasVisitables (resultado, 0, -1);
		
		casillasVisitables (resultado, 0, 1);
		
		return resultado;
	}

}

