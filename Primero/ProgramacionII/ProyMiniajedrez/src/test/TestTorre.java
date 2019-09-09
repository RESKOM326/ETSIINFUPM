package test;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestTorre extends TestPiezas {

	//Tablaro en el estado incial
		private final String torreBlanca0 = "1a";
		private final String torreBlanca0a = "1h";
		private final String torreNegra0 = "8a";
		private final String torreNegra0a = "8h";
		
		//Fin tablero en estado inicial
		//Prueba asociadas al talbero TestReina1.txt
		private final String partidaTorre1 = "TestTorre1.txt";
		
		//Pruebas reina blanco
		private final String torreBlanca1 = "1a,2a,3a";
		private final String torreBlanca2 = "1h,2h,3h,4h,5h,6h,7h,8h";
		private final String torreBlanca3 = "5f,4f,3f,5e,5d,5c,5b,5a,7f,6f,5h,5g";
		
		
		//Pruebas reinas negro
		private final String torreNegra1 = "8a,7a,6a,5a,4a";
		private final String torreNegra2 = "8a,7a,6a,5a,4a";
		private final String torreNegra3 = "4d,2d,3d,4a,4b,4c,4e,4f,4g,5d,6d";
		
		/**
		 * Este test prueba el escenario en el que tenemos la torre blanca al inicio de la partida
		 * 
		 */
		@Test
		public void testMovimientoTorreBlanca0() {
		 
			DatosPrueba prueba = new DatosPrueba(torreBlanca0,
					"Error al comprobar los movimientos de la torre blanca en el inicio de una aprtida en la posición 1a. ");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		/**
		 * Este test prueba el escenario en el que tenemos la torre blanca al inicio de la partida
		 * 
		 */
		@Test
		public void testMovimientoTorreBlanca0a() {
		 
			DatosPrueba prueba = new DatosPrueba(torreBlanca0a,
					"Error al comprobar los movimientos de la torre blanca en el inicio de una aprtida en la posición 1h. ");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		/**
		 * Este test prueba el escenario en el que tenemos la torre blanca en la posición 1a y un peon negro en 3a
		 * 
		 */
		@Test
		public void testMovimientoTorreBlanca1() {
			this.cargarPartidaTest(partidaTorre1);
			DatosPrueba prueba = new DatosPrueba(torreBlanca1,
					"Error al comprobar los movimientos de la torre blanca en la posición 1a y un peon negro en 3a");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		/**
		 * Este test prueba el escenario en el que tenemos la torre blanca en la posición 1h y una pieza negra en 8h 
		 */
		@Test
		public void testMovimientoTorreBlanca2() {
			this.cargarPartidaTest(partidaTorre1);
			DatosPrueba prueba = new DatosPrueba(torreBlanca2,
					"Error al comprobar los movimientos de la torre blanca en la posición 1h y una pieza negra 8a");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		/**
		 * Este test prueba el escenario en el que tenemos la torre blanca en la posición 5f y una pieza negra en 7f y pieza blanca en 2f 
		 */
		@Test
		public void testMovimientoTorreBlanca3() {
			this.cargarPartidaTest(partidaTorre1);
			DatosPrueba prueba = new DatosPrueba(torreBlanca3,
					"Error al comprobar los movimientos de la torre blanca en la posición 5f y una pieza negra en 7f y pieza blanca en 2f");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		/**
		 * Este test prueba el escenario en el que tenemos la torre negra al inicio de la partida 8a
		 * 
		 */
		@Test
		public void testMovimientoTorreNegra0() {
		 
			DatosPrueba prueba = new DatosPrueba(torreNegra0,
					"Error al comprobar los movimientos del rey negro en el inicio de una aprtida en la posición 8a. ");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
	
		/**
		 * Este test prueba el escenario en el que tenemos la torre negra al inicio de la partida 8a
		 * 
		 */
		@Test
		public void testMovimientoTorreNegra0a() {
		 
			DatosPrueba prueba = new DatosPrueba(torreNegra0a,
					"Error al comprobar los movimientos del rey negro en el inicio de una aprtida en la posición 8h. ");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		/**
		 * Este test prueba el escenario en el que tenemos la torre negra en la posición 8a y una pieza negra en 3a
		 * 
		 */
		@Test
		public void testMovimientoTorreNegra1() {
			this.cargarPartidaTest(partidaTorre1);
			DatosPrueba prueba = new DatosPrueba(torreNegra1,
					"Error al comprobar los movimientos de la torre negra en la posición 8a y una pieza negra en 3a");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		/**
		 * Este test prueba el escenario en el que tenemos la torre negra en la posición 8h y una pieza blanca en 1h
		 * 
		 */
		@Test
		public void testMovimientoTorreNegra2() {
			this.cargarPartidaTest(partidaTorre1);
			DatosPrueba prueba = new DatosPrueba(torreNegra2,
					"Error al comprobar los movimientos de la torre negra en la posición 8h y una pieza blanca en 1a");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		/**
		 * Este test prueba el escenario en el que tenemos la torre negra en la posición 8h y una pieza blanca en 1h
		 * 
		 */
		@Test
		public void testMovimientoTorreNegra3() {
			this.cargarPartidaTest(partidaTorre1);
			DatosPrueba prueba = new DatosPrueba(torreNegra3,
					"Error al comprobar los movimientos de la torre negra en la posición 8h y una pieza blanca en 1a");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
}
