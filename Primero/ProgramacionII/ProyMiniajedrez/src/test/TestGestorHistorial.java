package test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import list.ArrayList;

import stacks.exceptions.EmptyStackException;
import stacks.Stack;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import progii.juegotablero.exceptions.MovimientoException;
import progii.juegotablero.model.GestorHistorial;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.Movimiento;
import progii.juegotablero.model.ajedrez.piezas.Alfil;
import progii.juegotablero.model.ajedrez.piezas.Peon;
import progii.juegotablero.model.ajedrez.piezas.Rey;
import progii.juegotablero.model.ajedrez.piezas.Torre;

public class TestGestorHistorial {

	@Rule //Se establece un time out general para todos los tests. Se debe comentar esta línea y la de abajo para depurar
	public TestRule  globalTimeout = new DisableOnDebug(Timeout.millis(100)); // 100 milisegundos máximos por test

	@Test
	public void testConstructor() {
		GestorHistorialTrace gestor = new GestorHistorialTrace (); 

		Stack<Movimiento> pilaDeshacer = gestor.getPilaDeshacer();  
		Stack<Movimiento> pilaRehacer = gestor.getPilaRehacer();

		assertTrue("La pilaDeshacer no debe ser null al construir el objeto", 
				pilaDeshacer != null);
		assertTrue("La pilaRehacer no debe ser null al construir el objeto", 
				pilaRehacer != null);

		assertTrue("La pilaDeshacer debe estar vacía al construir el objeto", 
				size(pilaDeshacer) == 0);
		assertTrue("La pilaRehacer debe estar vacía al construir el objeto", 
				size(pilaRehacer) == 0);
	}

	@Test
	public void testGuardarMovimiento() {
		GestorHistorialTrace gestor = new GestorHistorialTrace (); 
		Stack<Movimiento> pilaDeshacer = gestor.getPila("pilaDeshacer");  
		Stack<Movimiento> pilaRehacer = gestor.getPila("pilaRehacer");

		Stack<Movimiento> copiaPila = new Stack<> ();  

		assertTrue(gestor + "La pilaDeshacer debe estar vacía al construir el objeto. ", 
				size(pilaDeshacer) == 0);
		Movimiento [] movs = TestGestorHistorial.getMovimientos(); 

		for (int i = 0; i < movs.length; i ++) {
			gestor.guardarMovimiento(movs[i]);
			copiaPila.push(movs[i]); 
			assertTrue(gestor + "La pila deshacer es incorrecta. Debería ser " + toString(copiaPila), iguales (copiaPila,pilaDeshacer));
		}

		assertTrue(gestor + "La pilaRehacer debe estar vacía después de las operaciones. ", 
				size(pilaRehacer) == 0);

	}


	@Test
	public void testVaciadoRehacer() {
		GestorHistorialTrace gestor = new GestorHistorialTrace (); 

		Movimiento [] movs = getMovimientos(); 

		gestor.guardarMovimiento(movs[0]);

		try {
			gestor.deshacer();
		} catch (MovimientoException e) {
			fail(gestor + "No debería lanzar la excepcion MovimientoException al deshacer un movimiento. " );
		}

		gestor.guardarMovimiento(movs[1]);

		Stack<Movimiento> pilaRehacer = gestor.getPilaRehacer();

		assertTrue(gestor + "La pila de rehacer debe estar vacía después de guardar un movimiento. " , size(pilaRehacer) == 0); 
		try {
			gestor.rehacer();
			fail (gestor + "Debería haber lanzado una excepción al intentar rehacer con la pila vacía. " ); 
		} catch (MovimientoException e) {
			// correcto!
		} 
	}


	@Test
	public void testDeshacer() {
		GestorHistorialTrace gestor = new GestorHistorialTrace (); 
		Stack<Movimiento> pilaDeshacer = gestor.getPilaDeshacer();  
		Stack<Movimiento> pilaRehacer = gestor.getPilaRehacer();

		Stack<Movimiento> copiaDeshacer = new Stack<>(); 
		Stack<Movimiento> copiaRehacer = new Stack<>(); 

		Movimiento [] movs = getMovimientos(); 

		for (int i = 0; i < movs.length; i ++) {
			gestor.guardarMovimiento(movs[i]); 
			copiaDeshacer.push(movs[i]); 
		}

		for (int i = 0; i < movs.length; i ++) {//for
			try {
				Movimiento mov = gestor.deshacer();
				assertEquals(movs[movs.length-1-i], mov);
				copiaRehacer.push(copiaDeshacer.pop());
				assertTrue(gestor + "La pila de deshacer es incorrecta. Debería ser " + toString(copiaDeshacer), iguales(copiaDeshacer,pilaDeshacer));
		    	assertTrue(gestor + "La pila de rehacer es incorrecta. Debería ser " + toString(copiaRehacer), iguales(copiaRehacer, pilaRehacer));
			} catch (EmptyStackException | MovimientoException e) {
				fail(gestor + "No debería haber saltado la excepción MovimientoException"); 
			} 
		}//for

	}

	@Test
	public void testExcepciones() {
		GestorHistorialTrace gestor = new GestorHistorialTrace (); 

		try {
			gestor.deshacer();
			fail (gestor + "Debería haber saltado la excepción MovimientoException al deshacer porque no debería haber movimientos. " );
		} catch (MovimientoException e) {
			// correcto!
		} catch (Exception e) {
			fail (gestor + "Debería haber saltado la excepción MovimientoException y ha saltado la excepcion " + e.getClass() + ". " );
		}
		
		try {
			gestor.rehacer();
			fail (gestor + "Debería haber saltado la excepción MovimientoException al rehacer porque no debería haber movimientos. " ); 
		} catch (MovimientoException e) {
			// correcto!
		} catch (Exception e) {
			fail (gestor + "Debería haber saltado la excepción MovimientoException y ha saltado la excepcion " + e.getClass() + ". " );
		}
	}


	@Test
	public void testRehacer() {
		GestorHistorialTrace gestor = new GestorHistorialTrace (); 
		Stack<Movimiento> pilaDeshacer = gestor.getPilaDeshacer();  
		Stack<Movimiento> pilaRehacer = gestor.getPilaRehacer();

		Stack<Movimiento> copiaDeshacer = new Stack<>(); 
		Stack<Movimiento> copiaRehacer = new Stack<>(); 

		Movimiento [] movs = getMovimientos(); 

		for (int i = 0; i < movs.length; i ++) {
			gestor.guardarMovimiento(movs[i]); 
			copiaDeshacer.push(movs[i]); 
		}

		for (int i = 0; i < movs.length; i ++) {//for 
				try {
					gestor.deshacer();
					copiaRehacer.push(copiaDeshacer.pop());
			} catch (EmptyStackException | MovimientoException e1) {
				fail(gestor + "No debería saltar la excepción al deshacer el movimiento. " ); 
			} 
		}//for	

		for (int i = 0; i < movs.length; i ++) {//for
			try {
				gestor.rehacer(); 
				copiaDeshacer.push(copiaRehacer.pop());
				assertTrue(gestor + "La pila de deshacer es incorrecta. Debería ser " + toString(copiaDeshacer), iguales(copiaDeshacer, pilaDeshacer));
				assertTrue(gestor + "La pila de rehacer es incorrecta. Debería ser " + toString(copiaRehacer), iguales(copiaRehacer, pilaRehacer));
			} catch (EmptyStackException | MovimientoException e1) {
				fail(gestor + "No debería saltar la excepción al deshacer el movimiento. " ); 
			} 
		}//for
	}

	

	private static Movimiento [] getMovimientos () {
		return new Movimiento []  {	
			new Movimiento(0, 0, 1, 1, new Peon (new Jugador("BLANCO", 10),8,'a')),
			new Movimiento(2, 2, 3, 3, new Torre (new Jugador("NEGRO", 10),8,'a')),
			new Movimiento(4, 4, 5, 5, new Alfil (new Jugador("BLANCO", 10),8,'a')),
			new Movimiento(6, 6, 7, 7, new Rey (new Jugador("NEGRO", 10),8,'a'))
}; 
	}

	static class GestorHistorialTrace extends GestorHistorial {

		private ArrayList<String> trace = new ArrayList<>(); 
		
		@Override
		public void guardarMovimiento(Movimiento movimiento) {
			trace.add(trace.size(),"guardarMovimiento(" + movimiento + ")"); 
			super.guardarMovimiento(movimiento);
		}

		@Override
		public Movimiento deshacer() throws MovimientoException {
			trace.add(trace.size(),"deshacer()"); 
			return super.deshacer();
		}

		@Override
		public Movimiento rehacer() throws MovimientoException {
			trace.add(trace.size(),"rehacer()"); 
			return super.rehacer();
		}
		
		private Stack<Movimiento> getPilaDeshacer () {
			return this.getPila("pilaDeshacer"); 
		}
		
		private Stack<Movimiento> getPilaRehacer () {
			return this.getPila("pilaRehacer"); 
		}

		@SuppressWarnings("unchecked")
		private Stack<Movimiento> getPila (String nombre) {
			Field atributo=null;
			Stack<Movimiento> salida = null; 
			try {
				atributo = GestorHistorial.class.getDeclaredField(nombre);
				atributo.setAccessible(true);
				Object res = atributo.get(this);
				salida = (Stack<Movimiento>) res; 
				atributo.setAccessible(false);

			} catch (IllegalArgumentException | NoSuchFieldException | SecurityException | IllegalAccessException e) {
				e.printStackTrace();
			} 
			return salida;
		}


		@Override
		public String toString() {
			StringBuilder res = new StringBuilder("\n");
			res.append("La secuencia de operaciones sobre el gestor es: "); 
			for (int i = 0; i < trace.size(); i ++) {
				res.append(trace.get(i) + "; "); 
			}
			res.append("\nY el estado de las pilas del gestor es: ");  
			res.append("\n  pilaDeshacer: " + TestGestorHistorial.toString(this.getPila("pilaDeshacer"))); 
			res.append("\n  pilaRehacer: " + TestGestorHistorial.toString(this.getPila("pilaRehacer")) + "\nMsg: "); 
			return res.toString(); 
		}
	}
	
	static int size (Stack<Movimiento> s) {
		int size = 0; 
		if (s==null)
			return 0;
		ArrayList<Movimiento> movs = new ArrayList<>(); 
		while (!s.isEmpty()) {
			try {
				movs.add(0,s.pop());
			} catch (EmptyStackException e) {
				fail( "No debería saltar la excepción al manipular las pilas" );
			}
			size ++; 
		}
		
		for (int i = 0; i < movs.size(); i++) {
			s.push(movs.get(i));
		}
		
		return size; 
		
	}

	static String toString (Stack<Movimiento> s) {
		if (s == null)
			return "";
		
		StringBuilder res = new StringBuilder("["); 
		ArrayList<Movimiento> movs = new ArrayList<>(); 
		while (!s.isEmpty()) {
			try {
				res.append(s.peek() + ","); 
				movs.add(0,s.pop());
			} catch (EmptyStackException e) {
				fail( "No debería saltar la excepción al manipular las pilas" );
			}
		}
		if (res.length()>1) { 
			res.deleteCharAt(res.length()-1);// Quitamos la ultima coma
		}
		
		res.append("]"); 
		for (int i = 0; i < movs.size(); i++) {
			s.push(movs.get(i));
		}
		
		
		return res.toString(); 
		
	}

	
	static boolean iguales (Stack<Movimiento> s1, Stack<Movimiento> s2) {
		boolean iguales = true;
		if ((s1 == null && s2!= null) || (s1 != null && s2 == null))
			return false;
		
		if (s1 == s2) //Ambs son null
			return true; 
		
		ArrayList<Movimiento> movs1 = new ArrayList<>(); 
		ArrayList<Movimiento> movs2 = new ArrayList<>();
		while (!s1.isEmpty() && !s2.isEmpty() && iguales) {
			try {
				Movimiento m1 = s1.pop(); 
				Movimiento m2 = s2.pop(); 
				iguales = m1.equals(m2); 
				movs1.add(0,m1);
				movs2.add(0,m2);
			} catch (EmptyStackException e) {
				fail( "No debería saltar la excepción al manipular las pilas" );
			}
		}
		
		if (s1.isEmpty() != s2.isEmpty()) {
			iguales = false; 
		}
				
		for (int i = 0; i < movs1.size(); i++ ) {
			s1.push(movs1.get(i));
			s2.push(movs2.get(i));
		}
		
		return iguales; 
		
	}
	
	
}
