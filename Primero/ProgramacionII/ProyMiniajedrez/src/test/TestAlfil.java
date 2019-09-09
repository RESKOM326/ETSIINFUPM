package test;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestAlfil extends TestPiezas {
	//Prueba asociadas al talbero TestAlfil1.txt
	private final String partidaAlfil1 = "TestAlfil1.txt";
	
	//Pruebas alfil blanco
	private final String alfilBlanco1 = "1c";
	private final String alfilBlanco2 = "1f,2e,3d,4c,5b,6a,2g,3h";
	
	//Pruebas alfil negro
	private final String alfilNegro1 = "8c,7d,6e,5f,4g";
	private final String alfilNegro2 = "8f";
	//Fin pruebas TestAlfil1.txt

	
	//Prueba asociadas al talbero TestAlfil2.txt
	private final String partidaAlfil2 = "TestAlfil2.txt";
	
	//Pruebas alfil blanco
	private final String alfilBlanco3 = "4c,5b,5d,3b,3d";
	private final String alfilBlanco4 = "1c,2d";
	
	//Pruebas alfil negro
	private final String alfilNegro3 = "5e,6d,6f,4f,4d,3c,2b,3g";
	private final String alfilNegro4 = "8c,7b,6a,7d,6e";
	//Fin pruebas TestAlfil2.txt

	
	/**
	 * Este test prueba el escenario en el que tenemos un alfil blanco en la casilla (1,c)
	 * las casillas circundantes están ocupadas por piezas blancas
	 * 
	 */
	@Test
	public void testMovimientoAlfilBlanco1 () {
	 
		this.cargarPartidaTest(partidaAlfil1);
		DatosPrueba prueba = new DatosPrueba(alfilBlanco1,
				"Error al comprobar movimienos del alfil blanco en la posicion (1,c) rodeado de piezas blancas");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos un alfil blanco en la casilla (1,f) y despejadas la diagonal superior izquierda
	 * y la diagonal superior derecha
	 * 
	 * 
	 */
	@Test
	public void testMovimientoAlfilBlanco2 () {
	 
		this.cargarPartidaTest(partidaAlfil1);
		DatosPrueba prueba = new DatosPrueba(alfilBlanco2,
				"Error al comprobar movimienos del alfil blanco en la posicion (1,c) rodeado de piezas blancas");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos un alfil blanco en la casilla (4,c) y con piezas negras en todas las diagonales
	 * 
	 * 
	 */
	@Test
	public void testMovimientoAlfilBlanco3 () {
	 
		this.cargarPartidaTest(partidaAlfil2);
		DatosPrueba prueba = new DatosPrueba(alfilBlanco3,
				"Error al comprobar movimienos del alfil blanco en la posicion (4,c) con piezas negras en todas las diagonales");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos un alfil blanco en la casilla (1,c) y con piezas blanca en 2b, la caislla 2d está vacía
	 * y hay un peon blanco en 3e
	 * 
	 * 
	 */
	@Test
	public void testMovimientoAlfilBlanco4 () {
	 
		this.cargarPartidaTest(partidaAlfil2);
		DatosPrueba prueba = new DatosPrueba(alfilBlanco4,
				"Error al comprobar movimienos del alfil blanco en la posicion (4,c) con piezas negras en todas las diagonales");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}

	
	/**
	 * Este test prueba el escenario en el que tenemos un alfil blanco en la casilla (8,c) y la diagonal infeiror izquierda
	 * está bloqueda por una pieza negra en (7,b) y la diagonal inferiro derecna está bloqueda por una pieza blanca en (4,g)
	 * 
	 * 
	 */
	@Test
	public void testMovimientoAlfilNegro1 () {
	 
		this.cargarPartidaTest(partidaAlfil1);
		DatosPrueba prueba = new DatosPrueba(alfilNegro1,
				"Error al comprobar movimienos del alfil negro en la posicion (8,c) con la diagonal infeiror izquierda "
				+ "bloqueda por una pieza negra en (7,b) y la diagonal inferiro derecna está bloqueda por una pieza blanca en (4,g)");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos un alfil negro en la casilla (8,f) y la diagonal inferior izquierda
	 * y la diagonal inferior derecha bloquedas por piezas negras en (7,e) y (7,g)
	 * 
	 * 
	 */
	@Test
	public void testMovimientoAlfilNegro2 () {
		this.cargarPartidaTest(partidaAlfil1);
		DatosPrueba prueba = new DatosPrueba(alfilNegro2,
				"Error al comprobar movimienos del alfil negro en la posicion (8,f) con la diagonal infeiror izquierda "
				+ "bloqueda por una pieza negra en (7,e) y la diagonal inferiro derecna está bloqueda por una pieza negra en (7,g)");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos un alfil negro en la casilla (5,e) y obstáculos pieza negra en (7,c),
	 * pieza negra en (7,g), pieza blanca en (2,b) y pieza blanca en (3,g) 
	 * 
	 * 
	 */
	@Test
	public void testMovimientoAlfilNegro3 () {
		this.cargarPartidaTest(partidaAlfil2);
		DatosPrueba prueba = new DatosPrueba(alfilNegro3,
				"Error al comprobar movimienos del alfil negro en la posicion (5,e) y obstáculos pieza negra en (7,c), "
				+ "pieza negra en (7,g), pieza blanca en (2,b) y pieza blanca en (3,g)" );
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos un alfil negro en la casilla (8,c) y obstáculo pieza negra en (5,f)
	 * 
	 * 
	 */
	@Test
	public void testMovimientoAlfilNegro4 () {
		this.cargarPartidaTest(partidaAlfil2);
		DatosPrueba prueba = new DatosPrueba(alfilNegro4,
				"Error al comprobar movimienos del alfil negro en la posicion (8,c) y obstáculo pieza negra en (5,f)");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	}
}
