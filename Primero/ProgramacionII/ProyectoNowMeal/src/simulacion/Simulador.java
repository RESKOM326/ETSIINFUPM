package simulacion;

import gestionpedidos.GestionReparto;
import gestionpedidos.mapa.Mapa;
import gestionpedidos.mapa.PosicionXY;
import gestionpedidos.pedido.Cliente;
import gestionpedidos.pedido.PlatoComida;
import gestionpedidos.pedido.Pedido;
import gestionpedidos.pedido.Restaurante;
import list.ArrayList;
import anotacion.Programacion2;  

@Programacion2 (
		nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es",
		nombreAutor2 = "David",
		apellidoAutor2 = "Labrado Hernández", 
		emailUPMAutor2 = "david.labrado.hernandez@alumnos.upm.es"
	)

public class Simulador {
	private GestionReparto gestor;
	private Mapa mapa;
	private ArrayList<Pedido> pedidosPendientes;

	public Simulador(GestionReparto gestor, Mapa mapa){
		this.gestor = gestor;
		this.mapa = mapa;
		this.pedidosPendientes = new ArrayList<>();
	}

	// 0 1
	// 2 3
	public String getMapa(PosicionXY pos){
		if (pos.getX() <= mapa.getMaxCoordX() / 2)  {
			if (pos.getY() <= mapa.getMaxCoordY() / 2)
				return mapa.getMapaLocalidad(new PosicionXY(0,0), 
						new PosicionXY(mapa.getMaxCoordX() / 2 - 1,mapa.getMaxCoordY() / 2 - 1)) + 
						gestor.getEstadoGestorLocal(0);
			else
				return mapa.getMapaLocalidad(new PosicionXY(0,mapa.getMaxCoordY() / 2 - 1), 
						new PosicionXY(mapa.getMaxCoordX() / 2 - 1,mapa.getMaxCoordY())) + 
						gestor.getEstadoGestorLocal(2);
		} else {
			if (pos.getY() <= mapa.getMaxCoordY() / 2)
				return mapa.getMapaLocalidad(new PosicionXY(mapa.getMaxCoordX() / 2 + 1, 0), 
						new PosicionXY(mapa.getMaxCoordX(), mapa.getMaxCoordY() / 2 ))+ 
						gestor.getEstadoGestorLocal(1);
			else
				return mapa.getMapaLocalidad(new PosicionXY(mapa.getMaxCoordX() / 2, 
						mapa.getMaxCoordY() / 2), 
						new PosicionXY(mapa.getMaxCoordX(), mapa.getMaxCoordY())) + 
						gestor.getEstadoGestorLocal(3);
		}		
	}

	public Pedido solicitarPedido(Cliente cliente, PlatoComida[] comidas, Restaurante restaurante){
		Pedido pedido = new Pedido(cliente, comidas, restaurante);
		gestor.asignarPedido(pedido);

		if (pedido.getTransporte() != null) {
			// colocamos el transporte en la pos del restaurante
			mapa.setPosicion(pedido.getTransporte().getCodigo(), 
					mapa.getPosicion(pedido.getRestaurante().getCodigo()));
			
			System.out.println("Pedido de cliente " + pedido.getCliente().getCodigo() + 
					" para restaurante " + pedido.getRestaurante().getCodigo() +
					" se asigna a " + pedido.getTransporte().getCodigo());
		} else {
			System.out.println("Pedido de cliente " + pedido.getCliente().getCodigo() + 
					" para restaurante " + pedido.getRestaurante().getCodigo() +
					" queda pendiente de asignaci�n") ;
			pedidosPendientes.add(pedidosPendientes.size(), pedido);
		}
			

		System.out.println(getMapa(mapa.getPosicion(cliente.getCodigo())));
		return pedido;
	}

	public void notificarEntrega(Pedido pedido){
		if (pedido.getTransporte() !=null) {
			gestor.notificarEntregaPedido(pedido);			
						
			String cod = pedido.getTransporte().getCodigo();
			
			// colocamos el transporte en la pos del cliente
			mapa.setPosicion(cod, mapa.getPosicion(pedido.getCliente().getCodigo()));
			
			System.out.println("Pedido de cliente " + pedido.getCliente().getCodigo() + 
					" es entregado por " + cod);	
			int i;
			for(i=0; i<pedidosPendientes.size() && 
					!cod.equals(pedidosPendientes.get(i).getTransporte().getCodigo()); i++);
			
			if (i<pedidosPendientes.size())	{
				System.out.println("Pedido pendiente de cliente " + 
						pedidosPendientes.get(i).getCliente().getCodigo() + 
						" para restaurante " + pedidosPendientes.get(i).getRestaurante().getCodigo() + 
							" ha sido asignado a " + 
						pedidosPendientes.get(i).getTransporte().getCodigo());
				
				// colocamos el transporte para el pedido pendiente en la pos restaurante
				mapa.setPosicion(pedidosPendientes.get(i).getTransporte().getCodigo(), 
						mapa.getPosicion(pedidosPendientes.get(i).getRestaurante().getCodigo()));
			}
			
			System.out.println(getMapa(mapa.getPosicion(pedido.getCliente().getCodigo())));	
		} else {
			throw new IllegalArgumentException
				("ERROR: Se notifica la entrega de un pedido no asignado");
		}
	}
}
