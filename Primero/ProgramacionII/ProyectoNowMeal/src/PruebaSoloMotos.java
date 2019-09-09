import gestionpedidos.GestionReparto;
import gestionpedidos.mapa.Mapa;
import gestionpedidos.mapa.PosicionXY;
import gestionpedidos.pedido.Cliente;
import gestionpedidos.pedido.PlatoComida;
import gestionpedidos.pedido.Pedido;
import gestionpedidos.pedido.Restaurante;
import gestionpedidos.transportes.Moto;
import simulacion.Simulador;
import anotacion.Programacion2; 

@Programacion2 (
		nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es",
		nombreAutor2 = "David",
		apellidoAutor2 = "Labrado Hernández", 
		emailUPMAutor2 = "david.labrado.hernandez@alumnos.upm.es"
	)

public class PruebaSoloMotos {

	private static Cliente cliente1, cliente2, cliente3;
	private static PlatoComida comida1, comida2;
	private static Restaurante restaurante1, restaurante2;
	private static Moto moto1, moto2;
	
	private static Mapa mapa;
	private static GestionReparto gestor;
	private static Simulador simulador;
	
	// crea los objetos y los añade al mapa
	// crea el gestor y el simulador
	private static void init(){
		mapa = new Mapa(20, 20);
		
		cliente1 = new Cliente("C1");
		cliente2 = new Cliente("C2");
		cliente3 = new Cliente("C3");
		comida1 = new PlatoComida("CO1", 1, 1);
		comida2 = new PlatoComida("CO2", 2, 2);
		restaurante1 = new Restaurante("R1");
		restaurante2 = new Restaurante("R2");
		moto1 = new Moto("M1", mapa);		
		moto2 = new Moto("M2", mapa);
		
		//moto2.setEurosPKm(4); // el doble de cara que moto1
		
		mapa.addObjetoEstatico("C1", new PosicionXY(0,0));
		mapa.addObjetoEstatico("C2", new PosicionXY(3,4));
		mapa.addObjetoEstatico("C3", new PosicionXY(7,1));
		mapa.addObjetoEstatico("R1", new PosicionXY(1,7));
		mapa.addObjetoEstatico("R2", new PosicionXY(5,5));
		
		mapa.addObjetoDinamico("M1", new PosicionXY(8,4));
		mapa.addObjetoDinamico("M2", new PosicionXY(7,7));		
		
		gestor = new GestionReparto(mapa);
		gestor.addTransporteLocalidad(moto1);
		gestor.addTransporteLocalidad(moto2);
		
		simulador = new Simulador(gestor, mapa);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		String s = simulador.getMapa(new PosicionXY(0,0));
		System.out.println(s);
		
		PlatoComida[] comidasSolicitadas = {comida1, comida2};
		Pedido pedido, pedido1;
		
		pedido = simulador.solicitarPedido(cliente1, comidasSolicitadas, restaurante1);		
		simulador.notificarEntrega(pedido);
		
		pedido = simulador.solicitarPedido(cliente2, comidasSolicitadas, restaurante2);		
		
		
		pedido1 = simulador.solicitarPedido(cliente2, comidasSolicitadas, restaurante1);	
		simulador.solicitarPedido(cliente1, comidasSolicitadas, restaurante1);
		simulador.solicitarPedido(cliente3, comidasSolicitadas, restaurante2);
		
		simulador.notificarEntrega(pedido1);
		
	}

}
