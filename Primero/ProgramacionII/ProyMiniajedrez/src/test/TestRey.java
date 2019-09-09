package test;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestRey extends TestPiezas {
	//Tablaro en el estado incial
	private final String reyBlanco0 = "1e";
	private final String reyNegro0 = "8e";
	
	//Fin tablero en estado inicial
	//Prueba asociadas al talbero TestRey1.txt
	private final String partidaRey1 = "TestRey1.txt";
	
	//Pruebas reina blanco
	private final String reyBlanco1 = "2e,2d,3d,3e,3f,2f,1f,1e,1d";
	
	
	//Pruebas reinas negro
	private final String reyNegro1 = "8e,8d,7d,7e,7f";
	
	//Fin pruebas TestRey1.txt

	
	//Prueba asociadas al talbero TestRey2.txt
	private final String partidaRey2 = "TestRey2.txt";
	
	//Pruebas reina blanco
	private final String reyBlanco2 = "3e,3d,4d,4e,4f,3f,2f,2e,2d";
	
	
	//Pruebas reinas negro
	private final String reyNegro2 = "6e,5d,6d,7d,7e,7f,6f,5f,5e";
	
	//Fin pruebas TestRey2.txt
	
	/**
	 * Este test prueba el escenario en el que tenemos la rey blanco al inicio de la partida
	 * 
	 */
	@Test
	public void testMovimientoReyBlanco0() {
	 
		DatosPrueba prueba = new DatosPrueba(reyBlanco0,
				"Error al comprobar los movimientos de la rey blanco en el inicio de una aprtida");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos la rey blanco en la posición 2e y no hay piezas al rededor
	 * 
	 */
	@Test
	public void testMovimientoReyBlanco1() {
		this.cargarPartidaTest(partidaRey1);
		DatosPrueba prueba = new DatosPrueba(reyBlanco1,
				"Error al comprobar los movimientos del rey blanco en la posición 2e y no hay piezas al rededor");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos la rey blanco en la posición 3e y peones negros en 4d,4e y 4f
	 */
	@Test
	public void testMovimientoReyBlanco3() {
		this.cargarPartidaTest(partidaRey2);
		DatosPrueba prueba = new DatosPrueba(reyBlanco2,
				"Error al comprobar los movimientos del rey blanco en la posición 3e y peones negros en 4d,4e y 4f");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}

	/**
	 * Este test prueba el escenario en el que tenemos el rey negro al inicio de la partida
	 * 
	 */
	@Test
	public void testMovimientoReyaNegra0() {
	 
		DatosPrueba prueba = new DatosPrueba(reyNegro0,
				"Error al comprobar los movimientos del rey negro en el inicio de una aprtida. ");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	
	
	/**
	 * Este test prueba el escenario en el que tenemos la rey negro en la posición 8e y no hay piezas al rededor a excepción de una pieza negra en 8f
	 * 
	 */
	@Test
	public void testMovimientoReyNegro1() {
		this.cargarPartidaTest(partidaRey1);
		DatosPrueba prueba = new DatosPrueba(reyNegro1,
				"Error al obtener los movimientos posibles del rey negro en la casilla 8e, y no hay piezas al rededor a excepción de una pieza negra en 8f");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}

	/**
	 * Este test prueba el escenario en el que tenemos la rey negro en la posición 6e y no hay piezas al rededor a excepción peanos blancos en 5d,5e y 5f
	 * 
	 */
	@Test
	public void testMovimientoReyNegro2() {
		this.cargarPartidaTest(partidaRey2);
		DatosPrueba prueba = new DatosPrueba(reyNegro2,
				"Error al obtener los movimientos posibles del rey negro en la casilla 8e, y no hay piezas al rededor a excepción de una pieza negra en 8f");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	
}
