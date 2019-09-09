package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReina extends TestPiezas {

	//Tablaro en el estado incial
	private final String reinaBlanco0 = "1d";
	private final String reinaNegro0 = "8d";
	
	//Fin tablero en estado inicial
	//Prueba asociadas al talbero TestReina1.txt
	private final String partidaReina1 = "TestReina1.txt";
	
	//Pruebas reina blanco
	private final String reinaBlanco1 = "1d,4a,3b,2c,2d,3d,4d,2e,3f";
	
	
	//Pruebas reinas negro
	private final String reinaNegro1 = "8d,7c,6b,5a,7d,7e,6f,5g,4h";
	
	//Fin pruebas TestReina1.txt

	//Prueba asociadas al talbero TestReina2.txt
		private final String partidaReina2 = "TestReina2.txt";
		//Pruebas reina blanca
		private final String reinaBlanco2 = "5d,4d,3d,4c,3b,5c,5b,5a,6c,6d,7d,7b,7f,6e,5e,5f,5g,5h,4e,3f";
	//Fin pruebas TestReina2.txt
		
	//Prueba asociadas al talbero TestReina3.txt
		private final String partidaReina3 = "TestReina3.txt";
		//Pruebas reina blanca
		private final String reinaNegro2 = "5d,4d,3d,2d,4c,3b,2a,5c,5b,5a,6c,6d,6e,5e,5f,5g,5h,4e,3f,2g";
	//Fin pruebas TestReina3.txt

		
	/**
	 * Este test prueba el escenario en el que tenemos la reina blanca al inicio de la partida
	 * 
	 */
	@Test
	public void testMovimientoReinaBlanco0() {
	 
		DatosPrueba prueba = new DatosPrueba(reinaBlanco0,
				"Error al comprobar los movimientos de la reina blanca en el inicio de una aprtida");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	
	/**
	 * Este test prueba el escenario en el que tenemos la reina blanca en la posición 1d, con pieza engra en 4d y pieza blanca en 4g, 1c y 1e
	 * 
	 */
	@Test
	public void testMovimientoReinaBlanco1 () {
	 
		this.cargarPartidaTest(partidaReina1);
		DatosPrueba prueba = new DatosPrueba(reinaBlanco1,
				"Error al comprobar el movimiento de la reina blanca situada en 1d, y con una pieza negra en 4d y blancas en 4g, 1c y 1e");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	

	/**
	 * Este test prueba el escenario en el que tenemos la reina blanca en la posición 5d, y el resto de piezas en su posición inicial
	 * 
	 */
	@Test
	public void testMovimientoReinaBlanco2() {
	 
		this.cargarPartidaTest(partidaReina2);
		DatosPrueba prueba = new DatosPrueba(reinaBlanco2,
				"Error al comprobar el movimiento de la reina blanca situada en 5d, y el resto de piezas están en la posición inicial");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}


	/**
	 * Este test prueba el escenario en el que tenemos la reina negra al inicio de la partida
	 * 
	 */
	@Test
	public void testMovimientoReinaNegra0() {
	 
		DatosPrueba prueba = new DatosPrueba(reinaNegro0,
				"Error al comprobar los movimientos de la reina negra en el inicio de una aprtida");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	
	
	/**
	 * Este test prueba el escenario en el que tenemos la reina negra en la posición 8d, con piezas nengras en 6d, 8c y 8e
	 * 
	 */
	@Test
	public void testMovimientoReinaNegro1 () {
	 
		this.cargarPartidaTest(partidaReina1);
		DatosPrueba prueba = new DatosPrueba(reinaNegro1,
				"Error al comprobar el movimiento de la reina negra situada en 8d, y con piezas negras en 6d, 8c y 8e");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}

	/**
	 * Este test prueba el escenario en el que tenemos la reina negra en la posición 5d, y el resto de piezas en su posición inicial
	 * 
	 */
	@Test
	public void testMovimientoReinaNegro2() {
	 
		this.cargarPartidaTest(partidaReina3);
		DatosPrueba prueba = new DatosPrueba(reinaNegro2,
				"Error al comprobar el movimiento de la reina negra situada en 5d, y el resto de piezas están en la posición inicial");
		boolean res = this.testMovimientos(prueba); 
		assertTrue(prueba.getMensaje(), res);
	 
	}
	
}
