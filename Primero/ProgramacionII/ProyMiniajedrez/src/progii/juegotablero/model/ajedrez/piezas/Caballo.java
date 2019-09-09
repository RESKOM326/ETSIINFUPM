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

public class Caballo extends PiezaAjedrez {
	public Caballo(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.CABALLO, fila, columna);	
	}

	@Override
	public ArrayList<Casilla> movimientosValidos() {
		
		ArrayList<Casilla> resultado = new ArrayList<>();
		
		//Uno vertical arriba, dos derecha
		casillaVisitable (resultado, this.getFila()-1, this.getColumna()+2);
		
		//Uno vertical arriba, dos izquierda
		casillaVisitable (resultado, this.getFila()-1, this.getColumna()-2);
		
		//Uno vertical abajo, dos derecha
		casillaVisitable (resultado, this.getFila()+1, this.getColumna()+2);
		
		//Uno vertical abajo, dos izquierda
		casillaVisitable (resultado, this.getFila()+1, this.getColumna()-2);
		
		//Dos vertical arriba, uno derecha
		casillaVisitable (resultado, this.getFila()-2, this.getColumna()+1);
		
		//Dos vertical arriba, uno izquierda
		casillaVisitable (resultado, this.getFila()-2, this.getColumna()-1);
		
		//Dos vertical abajo, uno derecha
		casillaVisitable (resultado, this.getFila()+2, this.getColumna()+1);
		
		//Dos vertical abajo, uno izquierda
		casillaVisitable (resultado, this.getFila()+2, this.getColumna()-1);
		
		return resultado;
	}

}
