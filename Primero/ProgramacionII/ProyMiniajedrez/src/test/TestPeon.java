package test;

import static org.junit.Assert.*;

import org.junit.Test;

import list.ArrayList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.ControlJugadoresAjedrez;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.piezas.Peon;

public class TestPeon extends TestPiezas {
	private static final String BLANCO = "BLANCO";
	private static final String NEGRO = "NEGRO";
	//Prueba asociadas al talbero TestPeon1.txt
	private final String partidaPeon = "TestPeon1.txt";
	/**
	 * La codificación de la prueba es la siguiente.
	 * Se usa un string por cada prueba, el string está formado por pares de dígito y letra 
	 * (entre 1 y 8) y letra (entre a y h) separados por comas.
	 * El primer par indica la posición incial, el siguiente conjutno de pares los movimeintos
	 * posibles que podría hacer el peón  8a es la esquina superior izquierda y 1h la inferior derecha
	 */
	//Peon blanco
	private final String peonBlanco1 ="2b,3b,4b,3c";
	private final String peonBlanco2="6a,7b";
	private final String peonBlanco3="2c";
	private final String peonBlanco4="4d,5d,5e";
	//Peon negro
	private final String peonNegro1="1h";
	private final String peonNegro2="7d";
	private final String peonNegro3="3c,2b";
	private final String peonNegro4="3e,2f";
	private final String peonNegro5="3g,2h,2f";
	//Fin prueba asociadas al talbero TestPeon1.txt
	/**
	 * Esta prueba comprueba que no se retornen movimientos cuando un peón blanco se encuentre en el extremo superior o un peon negro en el extremo inferior del tablero
	 */
	@Test
	public void testSalirTableroPeon () {
		PiezaAjedrez.setQueHay((fila,columna) -> super.nucnaHayPieza(fila, columna)); 
		//SE coloca el peon blanco en la esquina superiro derecha
		PiezaAjedrez peonBlanco= new Peon(new Jugador (BLANCO, ControlJugadoresAjedrez.BLANCO), 8,'a');
		//Un peón blanco sólo puede mover adelante por lo que debería dar como movimientos posibles un array con cero elementos
		ArrayList<Casilla> res = peonBlanco.movimientosValidos();
		assertTrue("Se tenía que haber retornado un ArrayList al llamar a movimientos válidos y se ha retornado null", res !=null);
		assertTrue("Tenía que haber retornado cero movimientos al mover el peón blanco colocado en la esquina superior izquierda y se han retornado "+res.size(), res.size() ==0);
		//Se colcoa el peon negro en la esquila inferior izquierda
		PiezaAjedrez peonNegro = new Peon(new Jugador (NEGRO, ControlJugadoresAjedrez.NEGRO), 1,'a');
		res = peonNegro.movimientosValidos();
		assertTrue("Se tenía que haber retornado un ArrayList al llamar a movimientos válidos y se ha retornado null", res !=null);
		assertTrue("Tenía que haber retornado cero movimientos al mover el peón negro colocado en la esquina inferior izquierda y se han retornado "+res.size(), res.size() ==0);
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos un peon blanco en su casilla inicial, las casillas que hay enfrente están libres
	 * y la casilla que está en la diagonal superior derecha tiene una pieza que puede ser comida
	 */
	@Test
	public void testMovimientoPeonBlanco1 () {
	 
		this.cargarPartidaTest(partidaPeon);
		DatosPrueba prueba = new DatosPrueba(peonBlanco1,
				"Error al comprobar movimienos del peon blanco en la posicion (2,b) con un peon negro en posuición (3,c).");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos un peon blanco en la posición (6,a), las casillas que hay enfrente
	 * tiene una pìeza  y la casilla que está en la diagonal superior derecha tiene una pieza que puede ser comida
	 */
	@Test
	public void testMovimientoPeonBlanco2 () {
	 
		this.cargarPartidaTest(partidaPeon);
		DatosPrueba prueba = new DatosPrueba(peonBlanco2, 
				"Error al comprobar movimienos del peon blanco en la posicion (6,a) con un peones negros en posuiciónes (7,a) y (7,b).");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos un peon blanco en la posición (2,c), las casillas que hay enfrente
	 * tiene una pìeza  y las casilla que están están vacías
	 */
	@Test
	public void testMovimientoPeonBlanco3 () {
		this.cargarPartidaTest(partidaPeon);
		DatosPrueba prueba = new DatosPrueba(peonBlanco3, 
				"Error al comprobar movimienos del peon blanco en la posicion (2,c) con una pieza en (3,c) y nada en diagonal ni detrás");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}

	/**
	 * Este test prueba el escenario en el que tenemos un peon blanco en la posición (4,d), las casillas que hay enfrente
	 * tiene vacía  y una pieza contraria en la caislla diagonal superior dericha y diagonal inferior izquierda
	 */
	@Test
	public void testMovimientoPeonBlanco4 () {
		this.cargarPartidaTest(partidaPeon);
		DatosPrueba prueba = new DatosPrueba(peonBlanco4, 
				"Error al comprobar movimienos del peon blanco en la posicion (4,d) con una pieza en (3,c) y otra en (5,e)");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}

	//Probando peon negro
	/**
	 * Este test prueba el escenario en el que tenemos un peon negro en la posición (1,h), rodeado de piezas blancas
	 */
	@Test
	public void testMovimientoPeonNegro1 () {
		this.cargarPartidaTest(partidaPeon);
		DatosPrueba prueba = new DatosPrueba(peonNegro1, 
				"Error al comprobar movimienos del peon negro en la posicion (1,h) rodeado de piezas blancas");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	

	/**
	 * Este test prueba el escenario en el que tenemos un peon negro en la posición (7,d), rodeado de piezas negras
	 */
	@Test
	public void testMovimientoPeonNegro2 () {
		this.cargarPartidaTest(partidaPeon);
		DatosPrueba prueba = new DatosPrueba(peonNegro2, 
				"Error al comprobar movimienos del peon negro en la posicion (7,d) rodeado de piezas negras");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	}
	

	/**
	 * Este test prueba el escenario en el que tenemos un peon negro en la posición (3,c), con peones blanco en casilla 
	 * diagonal inferior izquierda y con peon blanco en casilla diagonal superior derecha
	 * */
	@Test
	public void testMovimientoPeonNegro3 () {
		this.cargarPartidaTest(partidaPeon);
		DatosPrueba prueba = new DatosPrueba(peonNegro3, 
				"Error al comprobar movimienos del peon negro en la posicion (3,c) con peones blanco en casilla"
				+ " diagonal inferior izquierda y en casilla diagonal superior derecha");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos un peon negro en la posición (3,e), con peones blanco en casilla 
	 * diagonal superior izquierda y con peon blanco en casilla diagonal inferior derecha
	 * */
	@Test
	public void testMovimientoPeonNegro4 () {
		this.cargarPartidaTest(partidaPeon);
		DatosPrueba prueba = new DatosPrueba(peonNegro4, 
				"Error al comprobar movimienos del peon negro en la posicion (3,e) con peones blanco en casilla"
				+ " diagonal inferior izquierda y en casilla diagonal superior derecha");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos un peon negro en la posición (3,g), con peones blanco en casilla 
	 * diagonal inferiorizquierda y con peon blanco en casilla diagonal inferior derecha
	 * */
	@Test
	public void testMovimientoPeonNegro5 () {
		this.cargarPartidaTest(partidaPeon);
		DatosPrueba prueba = new DatosPrueba(peonNegro5, 
				"Error al comprobar movimienos del peon negro en la posicion (3,g) con peones blanco en casilla"
				+ " diagonal inferior izquierda y en casilla diagonal inferior derecha");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	}
	
}
