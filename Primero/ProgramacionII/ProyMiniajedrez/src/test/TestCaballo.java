package test;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestCaballo extends TestPiezas {

	   //Prueba asociadas al talbero TestCaballo1.txt
		private final String partidaCaballo1 = "TestCaballo1.txt";
		
		//Pruebas caballo blanco
		private final String caballoBlanco1 = "1b,3c,3a";
		private final String caballoBlanco2 = "1g,3h";
		
		//Pruebas caballo negro
		private final String caballoNegro1 = "8b,6a";
		private final String caballoNegro2 = "8g,6f,6h";
		//Fin pruebas TestCAballo1.txt

		//Prueba asociadas al talbero TestCaballo2.txt
		private final String partidaCaballo2 = "TestCaballo2.txt";
		
		//Pruebas caballo blanco
		private final String caballoBlanco3 = "5d,3c,4b,6b,7c,7e,6f,4f,3e";
		private final String caballoBlanco4 = "3f,4d,5e,5g,4h,1g";
		private final String caballoBlanco5 = "3a,5b,4c,1b";
		//Pruebas caballo negro
		private final String caballoNegro3 = "6f,8g,5h,4g,4e,5d";
		private final String caballoNegro4 = "6a,8b,5c,4b";
		private final String caballoNegro5 = "3d,1c,2b,4b,5c,5e,4f,2f,1e";
		//Fin pruebas TestCAballo2.txt
		
		/**
		 * Se prueba el escenario en el que se tiene un caballo blanco en 1b las casillas de la fila 2 están ocupadas
		 * y las casillas de la fila 3 libres
		 */
		@Test
		public void testMovimientoCaballoBlanco1 () {
		 
			this.cargarPartidaTest(partidaCaballo1);
			DatosPrueba prueba = new DatosPrueba(caballoBlanco1,
					"Erreor al comprobar el movimeinto del caballo blanco en la posición 1b");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		

		/**
		 * Se prueba el escenario en el que se tiene un caballo blanco en 1g la casillas 2f está libre, 
		 * la 3f está ocupada por un peon blanco y la 3h está vacía
		 */
		@Test
		public void testMovimientoCaballoBlanco2 () {
		 
			this.cargarPartidaTest(partidaCaballo1);
			DatosPrueba prueba = new DatosPrueba(caballoBlanco2,
					"Error al comprobar el movimeinto del caballo blnaco en la posición 1g, con la casilla "
					+ "3f ocupada por un peon blanco y las casillas 2f y 3h libres");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		/**
		 * Se prueba el escenario en el que se tiene un caballo blanco en 5d todas las 
		 * casillas alcanzables por el caballo o están libres o tienen una pieza negra
		 */
		@Test
		public void testMovimientoCaballoBlanco3 () {
		 
			this.cargarPartidaTest(partidaCaballo2);
			DatosPrueba prueba = new DatosPrueba(caballoBlanco3,
					"Error al comprobar el movimeinto del caballo blnaco en la posición 5d,"
					+ "todas las casillas alcanzables por el caballo o están libres o tienen una pieza negra");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		}
		
		/**
		 * Se prueba el escenario en el que se tiene un caballo blanco en 5f todas las 
		 * casillas alcanzables por el caballo están libres 
		 */
		@Test
		public void testMovimientoCaballoBlanco4() {
		 
			this.cargarPartidaTest(partidaCaballo2);
			DatosPrueba prueba = new DatosPrueba(caballoBlanco4,
					"Error al comprobar el movimeinto del caballo blnaco en la posición 5f,"
					+ "todas las casillas alcanzables por el caballo  están libres o tienen una pieza negra");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		}
		
		/**
		 * Se prueba el escenario en el que se tiene un caballo blanco en 3a el
		 * resto del tablero está en su situación original
		 */
		@Test
		public void testMovimientoCaballoBlanco5() {
		 
			this.cargarPartidaTest(partidaCaballo2);
			DatosPrueba prueba = new DatosPrueba(caballoBlanco5,
					"Error al comprobar el movimeinto del caballo blnaco en la posición 5f,"
					+ "todas las casillas alcanzables por el caballo  están libres o tienen una pieza negra");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		}
		
		/**
		 * Se prueba el escenario en el que se tiene un caballo negro en la posición 8b
		 * y hay un peón negro en 6c
		 */
		@Test
		public void testMovimientoCaballoNegro1 () {
		 
			this.cargarPartidaTest(partidaCaballo1);
			DatosPrueba prueba = new DatosPrueba(caballoNegro1,
					"Error al comprobar el movimiento del caballo negro en la posición 8b"
					+ " y hay un peón negro en 6c");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		/**
		 * Se prueba el escenario en el que se tiene un caballo negro en la posición 8g
		 * y el resto está en la posición original
		 */
		@Test
		public void testMovimientoCaballoNegro2 () {
		 
			this.cargarPartidaTest(partidaCaballo1);
			DatosPrueba prueba = new DatosPrueba(caballoNegro2,
					"Error al comprobar el movimiento del caballo negro en la posición 8g y el resto está en la posición original");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		/**
		 * Se prueba el escenario en el que la ficha seleccioanda es el caballo negro en la posición 6f, hay una pieza blanca en la posición 5d y el
		 * resto de piezas negras están en su posición original
		 */
		@Test
		public void testMovimientoCaballoNegro3 () {
		 
			this.cargarPartidaTest(partidaCaballo2);
			DatosPrueba prueba = new DatosPrueba(caballoNegro3,
					"Error al comprobar el movimiento del  caballo negro en la posición 6f, hay una pieza blanca en la posición 5d y"
					+ " el resto de piezas negras están en su posición original");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		/**
		 * Se prueba el escenario en el que la ficha seleccioanda es el caballo negro en la posición 6a y el
		 * resto de piezas negras están en su posición original
		 */
		@Test
		public void testMovimientoCaballoNegro4 () {
		 
			this.cargarPartidaTest(partidaCaballo2);
			DatosPrueba prueba = new DatosPrueba(caballoNegro4,
					"Error al comprobar el movimiento del  caballo negro en la posición 6a, y"
					+ " el resto de piezas negras están en su posición original");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		/**
		 * Se prueba el escenario en el que la ficha seleccioanda es el caballo negro en la posición 3d y el
		 * resto de piezas negras y blancas están en su posición original, exceptuando un caballo blanco en  5d
		 */
		@Test
		public void testMovimientoCaballoNegro5 () {
		 
			this.cargarPartidaTest(partidaCaballo2);
			DatosPrueba prueba = new DatosPrueba(caballoNegro5,
					"Error al comprobar el movimiento del caballo negro en la posición 3d y "
					+ "el resto de piezas negras y blancas están en su posición original, exceptuando un caballo blanco en 5d");
			boolean res = this.testMovimientos(prueba); 
			assertTrue(prueba.getMensaje(), res);
		 
		}
		
		
}
