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

public class Rey extends PiezaAjedrez {
	public Rey(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.REY, fila, columna);

		
	}

	@Override
	public ArrayList<Casilla> movimientosValidos() {
		
		ArrayList<Casilla> resultado = new ArrayList<>();
		//Vertical arriba
		casillaVisitable (resultado, this.getFila()-1, this.getColumna()+0);
		
		//Vertical abajo
		casillaVisitable (resultado, this.getFila()+1, this.getColumna()+0);
		
		//Vertical arriba derecha
		casillaVisitable (resultado, this.getFila()-1, this.getColumna()+1);
		
		//Vertical arriba izquierda
		casillaVisitable (resultado, this.getFila()-1, this.getColumna()-1);
		
		//Vertical abajo derecha
		casillaVisitable (resultado, this.getFila()+1, this.getColumna()+1);
		
		//Vertical abajo izquierda
		casillaVisitable (resultado, this.getFila()+1, this.getColumna()-1);
		
		//Horizontal izquierda
		casillaVisitable (resultado, this.getFila()+0, this.getColumna()-1);
		
		//Horizontal derecha
		casillaVisitable (resultado, this.getFila()+0, this.getColumna()+1);
		
		return resultado;
	}

}
