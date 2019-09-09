package progii.juegotablero.model.ajedrez.piezas;

import list.ArrayList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.ControlJugadoresAjedrez;
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

public class Peon extends PiezaAjedrez {
	
	public Peon(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.PEON, fila, columna);
	}

	@Override
	public ArrayList<Casilla> movimientosValidos() {
		ArrayList<Casilla> resultado = new ArrayList<>();
		//MOVIMIENTOS PARA PEONES NEGROS
		if(this.getJugador().getId()==ControlJugadoresAjedrez.NEGRO){
			//ESTA EN POSICION INICIAL
			if(this.getFila()==1){
				//DOS CASILLAS POR DEBAJO LIBRES
				if(queHay(2, this.getColumna())==null&&queHay(3, this.getColumna())==null){
					casillaVisitable (resultado, this.getFila()+1, this.getColumna()+0);
					casillaVisitable (resultado, this.getFila()+2, this.getColumna()+0);
				}
				//UNA CASILLA POR DEBAJO LIBRE
				if(queHay(2, this.getColumna())==null&&queHay(3, this.getColumna())!=null){
					casillaVisitable (resultado, this.getFila()+1, this.getColumna()+0);
				}
			}
			//NO ESTA EN POSICION INICIAL
			if(this.getFila()>1){
				//UNA CASILLA POR DEBAJO LIBRE
				if(queHay(this.getFila()+1, this.getColumna())==null){
					casillaVisitable (resultado, this.getFila()+1, this.getColumna()+0);
				}
			}
			//COMER DIAGONAL DERECHA
			if(queHay(this.getFila()+1, this.getColumna()+1)!=null){
				casillaVisitable (resultado, this.getFila()+1, this.getColumna()+1);
			}
			//COMER DIAGONAL IZQUIERDA
			if(queHay(this.getFila()+1, this.getColumna()-1)!=null){
				casillaVisitable (resultado, this.getFila()+1, this.getColumna()-1);
			}
		}
		//MOVIMIENTOS PARA PEONES BLANCOS
		else if(this.getJugador().getId()==ControlJugadoresAjedrez.BLANCO){
			//ESTA EN POSICION INICIAL
			if(this.getFila()==6){
				//DOS CASILLAS POR ENCIMA LIBRES
				if(queHay(5, this.getColumna())==null&&queHay(4, this.getColumna())==null){
					casillaVisitable (resultado, this.getFila()-1, this.getColumna()+0);
					casillaVisitable (resultado, this.getFila()-2, this.getColumna()+0);
				}
				//UNA CASILLA POR ENCIMA LIBRE
				if(queHay(5, this.getColumna())==null&&queHay(4, this.getColumna())!=null){
					casillaVisitable (resultado, this.getFila()+1, this.getColumna()+0);
				}
			}
			//NO ESTA EN POSICION INICIAL
			if(this.getFila()<6){
				//UNA CASILLA POR ENCIMA LIBRE
				if(queHay(this.getFila()-1, this.getColumna())==null){
					casillaVisitable (resultado, this.getFila()-1, this.getColumna()+0);
				}
			}
			//COMER DIAGONAL DERECHA
			if(queHay(this.getFila()-1, this.getColumna()+1)!=null){
				casillaVisitable (resultado, this.getFila()-1, this.getColumna()+1);
			}
			//COMER DIAGONAL IZQUIERDA
			if(queHay(this.getFila()-1, this.getColumna()-1)!=null){
				casillaVisitable (resultado, this.getFila()-1, this.getColumna()-1);
			}
		}
		return resultado;
	}
}
