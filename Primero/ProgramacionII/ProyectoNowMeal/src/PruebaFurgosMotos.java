import gestionpedidos.GestionReparto;
import gestionpedidos.mapa.Mapa;
import gestionpedidos.mapa.PosicionXY;
import gestionpedidos.pedido.Cliente;
import gestionpedidos.pedido.PlatoComida;
import gestionpedidos.pedido.Pedido;
import gestionpedidos.pedido.Restaurante;
import gestionpedidos.transportes.FurgonetaPropia;
import gestionpedidos.transportes.FurgonetaSubcontratada;
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

public class PruebaFurgosMotos {

	private static Cliente cliente1, cliente2, cliente3, cliente4;
	private static PlatoComida comida1, comida2, comida3;
	private static Restaurante restaurante1, restaurante2;
	private static Moto moto1, moto2;
	private static FurgonetaSubcontratada furgo1, furgo2;
	private static FurgonetaPropia furgo3;
	
	private static Mapa mapa;
	private static GestionReparto gestor;
	private static Simulador simulador;
	
	// crea los objetos y los a�ade al mapa
	// crea el gestor y el simulador
	private static void init(){
		mapa = new Mapa(19, 19);
		
		cliente1 = new Cliente("C1");
		cliente2 = new Cliente("C2");
		cliente3 = new Cliente("C3");
		cliente4 = new Cliente("C4");
		
		comida1 = new PlatoComida("CO1", 1, 1);
		comida2 = new PlatoComida("CO2", 2, 2);
		comida3 = new PlatoComida("CO2", 2, 30); // no cabe en una moto
		
		restaurante1 = new Restaurante("R1");
		restaurante2 = new Restaurante("R2");
		moto1 = new Moto("M1", mapa);		
		moto2 = new Moto("M2", mapa);
		
		//moto2.setEurosPKm(4); // el doble de cara que moto1
		
		furgo1 = new FurgonetaSubcontratada("F1", mapa, 900);		
		furgo2 = new FurgonetaSubcontratada("F2", mapa, 900);
		
		furgo3 = new FurgonetaPropia("F3", mapa, 900);
		
		/*
		// todos en la zona cero
		mapa.addObjetoEstatico("C1", new PosicionXY(0,0));
		mapa.addObjetoEstatico("C2", new PosicionXY(3,4));
		mapa.addObjetoEstatico("C3", new PosicionXY(7,1));
		mapa.addObjetoEstatico("C4", new PosicionXY(9,9));
		mapa.addObjetoEstatico("R1", new PosicionXY(1,7));
		mapa.addObjetoEstatico("R2", new PosicionXY(5,5));
		
		mapa.addObjetoDinamico("M1", new PosicionXY(8,4));
		mapa.addObjetoDinamico("M2", new PosicionXY(7,7));	
		mapa.addObjetoDinamico("F1", new PosicionXY(5,2));
		mapa.addObjetoDinamico("F2", new PosicionXY(5,7));	
		mapa.addObjetoDinamico("F3", new PosicionXY(6,7));
		*/
		
		// todos en la zona 1
		mapa.addObjetoEstatico("C1", new PosicionXY(10,0));
		mapa.addObjetoEstatico("C2", new PosicionXY(13,4));
		mapa.addObjetoEstatico("C3", new PosicionXY(17,1));
		mapa.addObjetoEstatico("C4", new PosicionXY(19,9));
		mapa.addObjetoEstatico("R1", new PosicionXY(11,7));
		mapa.addObjetoEstatico("R2", new PosicionXY(15,5));
		
		mapa.addObjetoDinamico("M1", new PosicionXY(18,4));
		mapa.addObjetoDinamico("M2", new PosicionXY(17,7));	
		mapa.addObjetoDinamico("F1", new PosicionXY(15,2));
		mapa.addObjetoDinamico("F2", new PosicionXY(15,7));	
		mapa.addObjetoDinamico("F3", new PosicionXY(16,7));
		
		gestor = new GestionReparto(mapa);
		gestor.addTransporteLocalidad(moto1);
		gestor.addTransporteLocalidad(moto2);
		gestor.addTransporteLocalidad(furgo1);
		gestor.addTransporteLocalidad(furgo2);
		gestor.addTransporteLocalidad(furgo3);
		
		simulador = new Simulador(gestor, mapa);
	}
	
	public static void main(String[] args) {
		
		init();
		String s = simulador.getMapa(new PosicionXY(10,0));
		System.out.println(s);
		
		PlatoComida[] comidasSolicitadasMoto = {comida1, comida2};
		PlatoComida[] comidasSolicitadasFurgo = {comida1, comida2, comida3};
		Pedido pedido, pedido1;
		
		pedido = simulador.solicitarPedido(cliente1, comidasSolicitadasMoto, restaurante1);		
		simulador.notificarEntrega(pedido);
		
		pedido = simulador.solicitarPedido(cliente2, comidasSolicitadasFurgo, restaurante2);		
		simulador.notificarEntrega(pedido);
		
		pedido1 = simulador.solicitarPedido(cliente2, comidasSolicitadasFurgo, restaurante1);	
		simulador.solicitarPedido(cliente1, comidasSolicitadasFurgo, restaurante1);
		simulador.solicitarPedido(cliente3, comidasSolicitadasFurgo, restaurante2);
		simulador.solicitarPedido(cliente4, comidasSolicitadasFurgo, restaurante2);
				
		simulador.notificarEntrega(pedido1);
		
	}

}
