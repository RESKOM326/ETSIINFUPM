package progii.juegotablero.model.ajedrez;

import java.util.function.BiFunction;
import list.ArrayList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.Pieza;
import anotacion.Programacion2;

@Programacion2 (
		nombreAutor1 = "Angelika",
		apellidoAutor1 = "Krolikowska",
		emailUPMAutor1 = "a.krolikowska@alumnos.upm.es",
		nombreAutor2 = "Mark",
		apellidoAutor2 = "Dervishaj Memi", 
		emailUPMAutor2 = "mark.dervishaj.memi@alumnos.upm.es"
	)

public abstract class PiezaAjedrez extends Pieza {
	
	//ATRIBUTOS
	private TipoPiezaAjedrez tipoPieza; 
	private static BiFunction<Integer,Character,PiezaAjedrez> queHay = null;
	
	//CONSTRUCTOR
	public PiezaAjedrez (Jugador jugador, TipoPiezaAjedrez tipoPieza, int fila, char columna) {
		super(jugador, 8-fila, ((int)columna) - ((int)'a')); 
		this.tipoPieza = tipoPieza;
	}
	
	//GETTERS - SETTERS
	public TipoPiezaAjedrez getTipoPieza() {
		return tipoPieza;
	}

	//MOVIMIENTO DENTRO LIMITES
	public boolean movimientoDentroLimites (int toFila, int toColumna) {
		//CRITERIO DE MATRIZ
		boolean dentroLimite=false;
		if(toFila>=0&&toFila<8&&toColumna>=0&&toColumna<8){
			dentroLimite=true;
		}
		return dentroLimite;
	}
	
	//PUEDE MOVER
	public boolean puedeMover (int toFila, char toColumna){
		//CRITERIO DE TABLERO DE AJEDREZ
		boolean posible=false;
		if(toFila>0&&toFila<9&&toColumna>='a'&&toColumna<='h'){
			posible=true;
		}
		return posible;
	}
	
	//TO STRING
	public String toString() {
		return getTipoPieza() + "_" + this.getJugador().getNombre();
	}
	
	//GETTERS - SETTERS
	public int getFilaAjedrez(){
		return 8-super.getFila();
	}
	
	//GETTERS - SETTERS
	public char getColumnaAjedrez(){
		return (char)(super.getColumna() + 'a');
	}	
	
	//QUE HAY
	public static void setQueHay(BiFunction<Integer,Character,PiezaAjedrez> func){
		PiezaAjedrez.queHay = func;
	}
	
	//QUE HAY AJEDREZ MATRIZ
	protected static PiezaAjedrez queHay (Integer fila, Character columna){
		boolean bFilaOK = (fila >= 1 && fila <= 8);
		boolean bColumnaOK = (columna >= 'a' && columna <= 'h');
		if (queHay!=null && bFilaOK && bColumnaOK){
			return queHay.apply(fila, columna);
		}
		return null;
	}
	
	//QUE HAY AJEDREZ TABLERO
	protected static PiezaAjedrez queHay (int fila, int columna){
		return queHay (Integer.valueOf(8-fila), Character.valueOf((char)('a'+columna)));
	}

	//METODO ABSTRACTO
	public abstract ArrayList<Casilla> movimientosValidos();
	
	//CASILLAS VISITABLES
	protected void casillasVisitables (ArrayList<Casilla> resultado,int incFila, int incColumna){
		int fila;
		int columna;
		//RECORRE LAS CASILLAS
		for(fila=this.getFila()+incFila, columna=this.getColumna()+incColumna; movimientoDentroLimites(fila, columna)&&queHay(fila, columna)==null; fila+=incFila, columna+=incColumna){
			//AÑADE A RESULTADO
			resultado.add(resultado.size(), new Casilla(fila, columna));
		}
		//ESTUDIA CADA CASILLA
		casillaVisitable(resultado, fila, columna);
	}

	//CASILLA VISITABLE
	protected void casillaVisitable(ArrayList<Casilla> resultado, int filaEst, int columnaEst) {

		PiezaAjedrez pieza = queHay(filaEst, columnaEst);
		if (movimientoDentroLimites(filaEst, columnaEst)
				&& (pieza == null || pieza.getJugador().getId() != this.getJugador().getId())) {
			resultado.add(resultado.size(), new Casilla(filaEst, columnaEst));
		}
	}
}
