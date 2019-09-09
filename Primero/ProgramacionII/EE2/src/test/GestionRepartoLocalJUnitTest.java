package test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import gestionpedidos.GestionRepartoLocal;
import gestionpedidos.mapa.Mapa;
import gestionpedidos.mapa.PosicionXY;
import gestionpedidos.pedido.Cliente;
import gestionpedidos.pedido.Pedido;
import gestionpedidos.pedido.PlatoComida;
import gestionpedidos.pedido.Restaurante;
import gestionpedidos.transportes.Moto;

public class GestionRepartoLocalJUnitTest {

	@Rule //Se establece un time out general para todos los tests. Se debe comentar esta línea y la de abajo para depurar
    public TestRule  globalTimeout = new DisableOnDebug(Timeout.millis(100)); // 100 milisegundos máximos por test	
	
	
	/*
	 * Comprueba que no se asigna una moto a un pedido
	 * si no hay motos disponibles
	 */
	@Test
	public void testAsignarPedidoSinMotos() {
		GestionRepartoLocal gestor = new GestionRepartoLocal();
		Cliente cliente = new Cliente("C1");
		Restaurante restaurante = new Restaurante("R1");
		Mapa mapa = new Mapa(20, 20);
		Pedido pedido = null;
		Moto moto = null;
		PlatoComida comida1 = new PlatoComida("CO1", 1, 1);
		PlatoComida comida2 = new PlatoComida("CO2", 2, 2);
		PlatoComida[] comidasSolicitadas = {comida1, comida2};
		mapa.addObjetoEstatico("C1", new PosicionXY(3,4));
		mapa.addObjetoEstatico("R1", new PosicionXY(4,3));

		// Instanciar pedido
		pedido = new Pedido(cliente, comidasSolicitadas, restaurante);		
		gestor.asignarPedido(pedido);      // Asignar transporte para pedido
		moto = pedido.getTransporte();  // Obtener el transporte, supuestamente null
		// Test1: transporte debe ser null porque no hay motos disponibles
		assertEquals("Transporte asignado incorrectamente (no hay motos)", null, moto);
	}

	/*
	 * Comprueba que se asigna la única moto disponible y que después
	 * de asignarla, ya no quedan motos disponibles
	 */
	@Test
	public void testAsignarPedidoSoloUnaMoto() {
		GestionRepartoLocal gestor = new GestionRepartoLocal();
		Cliente cliente = new Cliente("C1");
		Restaurante restaurante = new Restaurante("R1");
		Mapa mapa = new Mapa(20, 20);
		Pedido pedido = null;
		Moto moto1 = null, moto2 = null;
		PlatoComida comida1 = new PlatoComida("CO1", 1, 1);
		PlatoComida comida2 = new PlatoComida("CO2", 2, 2);
		PlatoComida[] comidasSolicitadas = {comida1, comida2};
		mapa.addObjetoEstatico("C1", new PosicionXY(3,4));
		mapa.addObjetoEstatico("R1", new PosicionXY(4,3));

		// Instanciar pedido
		pedido = new Pedido(cliente, comidasSolicitadas, restaurante);

		// Preparar transporte. Instanciar una única moto
		moto1 = new Moto("M1", mapa);
		mapa.addObjetoDinamico("M1", new PosicionXY(7,4));
		gestor.add(moto1);                // Añadir transporte
		gestor.asignarPedido(pedido);      // Asignar transporte para pedido
		moto2 = pedido.getTransporte();  // Obtener el transporte, supuestamente moto1
		// Test2: transporte no debe ser null porque hay una moto (M1) disponible
		assertEquals("Transporte erróneamente asignado", moto1.getCodigo(), moto2.getCodigo());	
		
		// Instanciar pedido
		Pedido pedido2 = new Pedido(cliente, comidasSolicitadas, restaurante);		
		// Test3: transporte debe ser null pues ya no quedan motos disponibles
		gestor.asignarPedido(pedido2);      // Asignar transporte => consumir moto
		moto1 = pedido2.getTransporte();  // Obtener el transporte, supuestamente null
		assertEquals("Transporte asignado incorrectamente (no quedan motos)", null, moto1);		
	}

	/*
	 * Comprueba que se asigna la moto de menor coste a un pedido
	 */
	@Test
	public void testAsignarPedidoVariasMotos() {
		GestionRepartoLocal gestor = new GestionRepartoLocal();
		Cliente cliente = new Cliente("C1");
		Restaurante restaurante = new Restaurante("R1");
		Mapa mapa = new Mapa(20, 20);
		Pedido pedido = null;
		Moto moto1 = null, moto2 = null, moto3 = null, moto4 = null;
		PlatoComida comida1 = new PlatoComida("CO1", 1, 1);
		PlatoComida comida2 = new PlatoComida("CO2", 2, 2);
		PlatoComida[] comidasSolicitadas = {comida1, comida2};
		mapa.addObjetoEstatico("C1", new PosicionXY(3,4));
		mapa.addObjetoEstatico("R1", new PosicionXY(4,3));

		// Instanciar pedido
		pedido = new Pedido(cliente, comidasSolicitadas, restaurante);

		// Test4: Asignar transporte coste mínimo. Hay dos motos disponibles
		moto2 = new Moto("M2", mapa);
		mapa.addObjetoDinamico("M2", new PosicionXY(1,3));
		moto3 = new Moto("M3", mapa);
		mapa.addObjetoDinamico("M3", new PosicionXY(8,7));
		moto4 = new Moto("M4", mapa);
		mapa.addObjetoDinamico("M4", new PosicionXY(10,15));
		
		gestor.add(moto4);                // Añadir transporte
		gestor.add(moto3);                // Añadir transporte
		gestor.add(moto2);                // Añadir transporte		
		
		gestor.asignarPedido(pedido);      // Asignar transporte para pedido
		moto1 = pedido.getTransporte();  // Obtener el transporte, supuestamente M2
		// Test4: transporte debe ser M2 por coste
		// Previamente pongo este assert para que si no asigna nada se dé información específica
		assertNotEquals("Transporte no asignado (es null) cuando hay motos disponibles", moto1, null);
		assertEquals("El transporte asignado no es el de mínimo coste", moto2.getCodigo(), moto1.getCodigo());
		assertTrue("El transporte asignado sigue disponible", !gestor.getDisponibles().contains("M2"));	
		assertTrue("El transporte no asignado no sigue disponible", gestor.getDisponibles().contains("M3"));		
	}

	/*
	 * Comprueba la notificación de la entrega de un pedido
	 */
	@Test
	public void testNotificarEntregaPedido() {
		GestionRepartoLocal gestor = new GestionRepartoLocal();
		Cliente cliente = new Cliente("C1");
		Restaurante restaurante = new Restaurante("R1");
		Mapa mapa = new Mapa(20, 20);
		Pedido pedido = null;
		Moto moto1 = null;
		String m1Disp;
		PlatoComida comida1 = new PlatoComida("CO1", 1, 1);
		PlatoComida comida2 = new PlatoComida("CO2", 2, 2);
		PlatoComida[] comidasSolicitadas = {comida1, comida2};
		mapa.addObjetoEstatico("C1", new PosicionXY(3,4));
		mapa.addObjetoEstatico("R1", new PosicionXY(4,3));

		// Instanciar pedido
		pedido = new Pedido(cliente, comidasSolicitadas, restaurante);

		// Preparar transporte. Instanciar una única moto
		moto1 = new Moto("M1", mapa);
		mapa.addObjetoDinamico("M1", new PosicionXY(7,4));
		gestor.add(moto1);                // Añadir transporte
		gestor.asignarPedido(pedido);      // Asignar transporte para pedido
		
		// Test: queda una moto (M1) disponible
		gestor.notificarEntregaPedido(pedido);
		m1Disp = gestor.getDisponibles();
		assertEquals("Las motos disponibles (" + m1Disp + ") no son correctas", "M1",
				m1Disp.substring(19, 21));

	}

}
