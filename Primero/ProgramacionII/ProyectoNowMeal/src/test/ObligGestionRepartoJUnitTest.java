package test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import gestionpedidos.GestionReparto;
import gestionpedidos.mapa.Mapa;
import gestionpedidos.mapa.PosicionXY;
import gestionpedidos.pedido.Cliente;
import gestionpedidos.pedido.Pedido;
import gestionpedidos.pedido.PlatoComida;
import gestionpedidos.pedido.Restaurante;
import gestionpedidos.transportes.Moto;

public class ObligGestionRepartoJUnitTest {

	@Rule //Se establece un time out general para todos los tests. Se debe comentar esta línea y la de abajo para depurar
	public TestRule  globalTimeout = new DisableOnDebug(Timeout.millis(100)); // 100 milisegundos máximos por test	


	private GestionReparto gestor;
	private String construirRespuestaEstadoGestor(int motosDisp, int furgosDisp, int pedMotoEsp, int pedFurgoEsp){
		return motosDisp+ ";" +furgosDisp +";"+ pedMotoEsp + ";" + pedFurgoEsp ;
	}

	/**
	 * Test del constructor de GestionReparto (solo zona 0)
	 *  
	 * <p>Comprueba la inicialización de los atributos</p>
	 *  
	 * <p>Presupone que el constructor de GestionLocalReparto funciona bien</p>
	 */
	@Test
	public void testGestionReparto() {
		Mapa mapa = new Mapa(100, 100);
		gestor = new GestionReparto(mapa);
		
		assertEquals("El atributo mapa no se inicializó correctamente", mapa, gestor.getMapa());

		assertEquals("El gestor 0 (superior-izquierda) no se inicializó correctamente.", 
				construirRespuestaEstadoGestor(0,0,0,0), gestor.getEstadoGestorLocalNum(0));
	}

	/**
	 * Test de addTransporteLocalidad para zona 0 de GestionReparto
	 * 
	 * <p>Utiliza el constructor de GestionReparto y el constructor de Moto</p>
	 * 
	 * <p>Presupone que el método add de GestionLocalReparto funciona bien</p>
	 * 
	 * <p>Se crean transportes y se asignan a distintas localidades controlando a qué
	 * localidad se han asignado</p>
	 */
	@Test
	public void testAddTransporteLocalidad() {
		Mapa mapa = new Mapa(200, 200);
		gestor = new GestionReparto(mapa);

		final int NUM_IT = 50;

		Moto[][] motos = new Moto[NUM_IT][];

		for (int i=0;i<NUM_IT;i++){
			motos[i] = new Moto[4];
			int j=0;
			motos[i][j] = new Moto("MOTO_"+i+"_"+j,mapa);
			mapa.addObjetoDinamico("MOTO_"+i+"_"+j, new PosicionXY((i%10)+10*(j%2), 
					((int)(i%10))+10*(j<2?0:1)));

			assertEquals("El gestor "+j+" no se actualizó correctamente.", 
					construirRespuestaEstadoGestor(i,0,0,0), gestor.getEstadoGestorLocalNum(j));
			gestor.addTransporteLocalidad(motos[i][j]);

			assertEquals("El gestor "+j+" no se actualizó correctamente.", 
					construirRespuestaEstadoGestor(i+1,0,0,0), gestor.getEstadoGestorLocalNum(j));

		}		
	}

	/**
	 * Test de asignar pedido para moto en zona 0 de GestionReparto
	 * 
	 * <p>Utiliza el constructor de Pedido, 
	 * y los métodos de GestorReparto:
	 * constructor, addTransporteLocalidad</p>
	 * 
	 * <p>Presupone que el método asignarPedido de GestionRepartoLocal funciona bien</p>
	 *  
	 * <p>Se crean transportes y se asignan a la zona 0. 
	 * Se asignan pedidos para moto en la zona 0, 
	 * controlando el número de transportes disponibles y el de pedidos en espera</p>
	 */
	@Test
	public void testAsignarPedido() {
		Mapa mapa = new Mapa(200, 200);
		gestor = new GestionReparto(mapa);
		final int NUM_IT = 50;
		Restaurante[] restaurantes = new Restaurante[NUM_IT];
		Cliente[] clientes = new Cliente[NUM_IT];
		Moto[] motos = new Moto[NUM_IT];

		int j=0;
		restaurantes[j] = new Restaurante("R_"+j);
		clientes[j] = new Cliente("C_"+j);
		mapa.addObjetoEstatico("R_"+j, new PosicionXY(10*(j%2), 10*(j<2?0:1)));
		mapa.addObjetoEstatico("C_"+j, new PosicionXY(10*(j%2)+1, 10*(j<2?0:1)+1));
		motos[j] = new Moto("MOTO_"+j,mapa);

		mapa.addObjetoDinamico("MOTO_"+j, new PosicionXY(((int)(j/3.0*9))+10*(j%2), 
				((int)(j/3.0*9))+10*(j<2?0:1)));

		gestor.addTransporteLocalidad(motos[j]);


		assertEquals("El gestor "+j+" no se actualizó correctamente.", 
				construirRespuestaEstadoGestor(1,0,0,0), gestor.getEstadoGestorLocalNum(j));


		Pedido[][] pedidosPequenos = new Pedido[NUM_IT][4];


		for (int i=0;i<NUM_IT;i++){

			PlatoComida comidaPequena = new PlatoComida("COMIDA_P_"+i, Math.random()*100, Math.random()*10);

			pedidosPequenos[i][j] = new Pedido(clientes[j], new PlatoComida[]{comidaPequena}, restaurantes[j]);

			assertEquals("[Iteracion "+i+"] El gestor "+j+" no se actualizó correctamente.", construirRespuestaEstadoGestor(i>0?0:1,0,i<1?0:i-1,0), gestor.getEstadoGestorLocalNum(j));

			gestor.asignarPedido(pedidosPequenos[i][j]);

			assertEquals("[Iteracion "+i+"] El gestor "+j+" no se actualizó correctamente.", construirRespuestaEstadoGestor(0,0,i,0), gestor.getEstadoGestorLocalNum(j));

		}
	}

	/**
	 * Test de notificar entrega de pedido para moto en zona 0 de GestionReparto
	 * 
	 * <p>Utiliza los constructores de Moto, y Pedido,
	 * y los métodos de GestorReparto:
	 * constructor, addTransporteLocalidad, asignarPedido</p>
	 * 
	 * <p>Presupone que el método notificarEntregaPedido de GestorRepartoLocal funciona bien</p>
	 * 
	 * <p>Se crean transportes y se asignan a la zona 0. 
	 * Se asignan pedidos para moto en la zona 0
	 * Y se notifica la entrega de dichos pedidos
	 * controlando el número de transportes disponibles y el de 
	 * pedidos en espera al asignar y notificar la entrega</p>
	 */
	@Test
	public void testNotificarEntregaPedido() {
		Mapa mapa = new Mapa(200, 200);
		gestor = new GestionReparto(mapa);

		final int NUM_IT = 50;
		Restaurante[] restaurantes = new Restaurante[NUM_IT];
		Cliente[] clientes = new Cliente[NUM_IT];
		Moto[] motos = new Moto[NUM_IT];
		int j=0;
		restaurantes[j] = new Restaurante("R_"+j);
		clientes[j] = new Cliente("C_"+j);
		mapa.addObjetoEstatico("R_"+j, new PosicionXY(10*(j%2), 10*(j<2?0:1)));
		mapa.addObjetoEstatico("C_"+j, new PosicionXY(10*(j%2)+1, 10*(j<2?0:1)+1));
		motos[j] = new Moto("MOTO_"+j,mapa);
		mapa.addObjetoDinamico("MOTO_"+j, new PosicionXY(((int)(j/3.0*9))+10*(j%2), 
				((int)(j/3.0*9))+10*(j<2?0:1)));

		gestor.addTransporteLocalidad(motos[j]);


		assertEquals("El gestor "+j+" no se actualizó correctamente.", 
				construirRespuestaEstadoGestor(1,0,0,0), gestor.getEstadoGestorLocalNum(j));


		Pedido[][] pedidosPequenos = new Pedido[NUM_IT][4];

		for (int i=0;i<NUM_IT;i++){

			PlatoComida comidaPequena = new PlatoComida("COMIDA_P_"+i, 
					Math.random()*100, Math.random()*10);

			pedidosPequenos[i][j] = new Pedido(clientes[j], new PlatoComida[]{comidaPequena}, 
					restaurantes[j]);

			assertEquals("[Iteracion "+i+"] El gestor "+j+" no se actualizó correctamente.", 
					construirRespuestaEstadoGestor(i>0?0:1,0,i<1?0:i-1,0), gestor.getEstadoGestorLocalNum(j));

			gestor.asignarPedido(pedidosPequenos[i][j]);

			assertEquals("[Iteracion "+i+"] El gestor "+j+" no se actualizó correctamente.", 
					construirRespuestaEstadoGestor(0,0,i,0), gestor.getEstadoGestorLocalNum(j));

		}

		for (int i=0;i<NUM_IT-1;i++){


			assertEquals("[Iteracion "+i+"] El gestor "+j+" no se actualizó correctamente.", 
					construirRespuestaEstadoGestor(0,0,NUM_IT-1-i, 0), gestor.getEstadoGestorLocalNum(j));

			gestor.notificarEntregaPedido(pedidosPequenos[i][j]);

			assertEquals("[Iteracion "+i+"] El gestor "+j+" no se actualizó correctamente.", construirRespuestaEstadoGestor(0,0,NUM_IT-2-i,0), gestor.getEstadoGestorLocalNum(j));

		}


		assertEquals("[Iteracion "+(NUM_IT-1)+"] El gestor "+j+" no se actualizó correctamente.", construirRespuestaEstadoGestor(0,0,0,0), gestor.getEstadoGestorLocalNum(j));

		gestor.notificarEntregaPedido(pedidosPequenos[NUM_IT-1][j]);

		assertEquals("[Iteracion "+(NUM_IT-1)+"] El gestor "+j+" no se actualizó correctamente.", construirRespuestaEstadoGestor(1,0,0,0), gestor.getEstadoGestorLocalNum(j));

	}


}
