package test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import gestionpedidos.mapa.Mapa;
import gestionpedidos.mapa.PosicionXY;
import gestionpedidos.pedido.Cliente;
import gestionpedidos.pedido.Pedido;
import gestionpedidos.pedido.PlatoComida;
import gestionpedidos.pedido.Restaurante;
import gestionpedidos.transportes.Moto; 

public class PedidoJUnitTest {

	@Rule //Se establece un time out general para todos los tests. Se debe comentar esta linea y la de abajo para depurar
    public TestRule  globalTimeout = new DisableOnDebug(Timeout.millis(100)); // 100 milisegundos maximos por test	
	private static final double DELTA_PRECISSION = 0.001;
		
	/**
	 * Test del constructor de Pedido
	 * 
	 * <p>Comprueba la inicialización de atributos
	 *  y el cálculo del importe y el peso</p>
	 */
	@Test
	public void testPedido() {
		Cliente cliente = new Cliente("C1");
		Restaurante restaurante = new Restaurante("R1");
		PlatoComida comida1 = new PlatoComida("CO1", 1, 1);
		PlatoComida comida2 = new PlatoComida("CO2", 2, 2);
		PlatoComida[] comidasSolicitadas = {comida1, comida2};
		double importe = 0, peso=0;
		for(PlatoComida comida: comidasSolicitadas) {
			importe += comida.getPrecio();
			peso += comida.getPeso();
		}

		Pedido p = new Pedido(cliente, comidasSolicitadas, restaurante);
		
		assertEquals("Cliente se ha inicializado incorrectamente", 
				cliente, p.getCliente());
		assertEquals("Restaurante se ha inicializado incorrectamente", 
				restaurante, p.getRestaurante());
		assertEquals("Transporte se ha inicializado incorrectamente", 
				null, p.getTransporte());
		assertEquals("Importe (" + p.getImporte() + ") se ha calculado incorrectamente", 
				importe, p.getImporte(), DELTA_PRECISSION);
		assertEquals("Peso (" + p.getPeso() + ") se ha calculado incorrectamente", 
				peso, p.getPeso(), DELTA_PRECISSION);

	}

	/**
	 * Test del método coste
	 * 
	 * <p>Utiliza el constructor de pedido y el constructor de moto</p>
	 * 
	 * <p>Presupone que el método coste de Moto funciona bien</p>
	 */
	@Test
	public void testCoste() {
			
		Cliente cliente = new Cliente("C1");
		Restaurante restaurante = new Restaurante("R1");
		PlatoComida comida1 = new PlatoComida("CO1", 1, 1);
		PlatoComida comida2 = new PlatoComida("CO2", 2, 2);
		PlatoComida[] comidasSolicitadas = {comida1, comida2};
	
		Mapa mapa = new Mapa(20, 20);
		Moto moto = new Moto("M1", mapa);
		mapa.addObjetoEstatico("C1", new PosicionXY(3,4));
		mapa.addObjetoEstatico("R1", new PosicionXY(4,3));
		mapa.addObjetoDinamico("M1", new PosicionXY(7,4));

		Pedido pedido = new Pedido(cliente, comidasSolicitadas, restaurante);		
				
		// Test
		assertEquals("Coste (" + pedido.coste(moto) + ") se ha calculado incorrectamente", 
				15.0, pedido.coste(moto), DELTA_PRECISSION);	

	}

}
