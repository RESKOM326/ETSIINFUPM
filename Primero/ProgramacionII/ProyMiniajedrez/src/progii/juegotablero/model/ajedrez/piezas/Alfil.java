package progii.juegotablero.model.ajedrez.piezas;

import list.ArrayList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;
import anotacion.Programacion2;

@Programacion2 (
		nombreAutor1 = "Angelika",
		apellidoAutor1 = "Krolikowska",
		emailUPMAutor1 = "a.krolikowska@alumnos.upm.es",
		nombreAutor2 = "Mark",
		apellidoAutor2 = "Dervishaj Memi", 
		emailUPMAutor2 = "mark.dervishaj.memi@alumnos.upm.es"
	)

public class Alfil extends PiezaAjedrez {
	public Alfil(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.ALFIL, fila, columna);
	}

	@Override
	public ArrayList<Casilla> movimientosValidos() {
		
		ArrayList<Casilla> resultado = new ArrayList<>();
		
		//Vertical arriba derecha
		casillasVisitables (resultado, -1, 1);
		
		//Vertical arriba izquierda
		casillasVisitables (resultado, -1, -1);
		
		//Vertical abajo derecha
		casillasVisitables (resultado, 1, 1);
		
		//Vertical abajo izquierda
		casillasVisitables (resultado, 1, -1);
		
		return resultado;
	}

}
