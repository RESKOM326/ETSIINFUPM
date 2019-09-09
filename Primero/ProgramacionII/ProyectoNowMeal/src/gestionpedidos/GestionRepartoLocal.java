package gestionpedidos;

import gestionpedidos.pedido.Pedido;
import gestionpedidos.transportes.Furgoneta;
import gestionpedidos.transportes.Moto;
import gestionpedidos.transportes.Transporte;
import list.ArrayList;
import anotacion.Programacion2; 


@Programacion2 (
		nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es"
	)

public class GestionRepartoLocal {	
	// C�DIGO DE APOYO
	private ArrayList<Moto> motosDisponibles;
	private ArrayList<Furgoneta> furgonetasDisponibles;

	private ArrayList<Pedido> pedidosEsperandoMoto;
	private ArrayList<Pedido> pedidosEsperandoFurgoneta;
	
	// C�DIGO DE APOYO
	private static ArrayList<String> getCodList(ArrayList<?> disponibles) {
		ArrayList<String> salida = new ArrayList<>();
		for(int i=0; i<disponibles.size(); i++)
			salida.add(salida.size(),((Transporte) disponibles.get(i)).getCodigo());
		return salida;
	}
	
	// C�DIGO DE APOYO
	private static ArrayList<String[]> getClienteRestauranteList(ArrayList<?> disponibles){
		 ArrayList<String[]> salida = new  ArrayList<>();
		for(int i=0; i<disponibles.size(); i++)
			salida.add(salida.size(),new String[]{((Pedido) disponibles.get(i)).getCliente().getCodigo() ,
					((Pedido) disponibles.get(i)).getRestaurante().getCodigo()});
		return salida;
	}
	
	// C�DIGO DE APOYO
	private static String myArrayListToString (ArrayList<?> list){
		String salida = "";
		for(int i=0; i<list.size(); i++){
			salida += " " ;
			if (list.get(i) instanceof String[]){
				String[] item = (String[])list.get(i);
				for(int j=0; j<item.length; j++){
					salida += item[j] ;
				}	
			}else if (list.get(i) instanceof String){
				salida += (String)list.get(i);
			}
		}
			
		return salida;
	}
	
	// C�DIGO DE APOYO
	public String getDisponibles(){
		return "Motos Disponibles:" + myArrayListToString(getCodList(motosDisponibles)) + System.lineSeparator() +
			"Furgonetas Disponibles:" + myArrayListToString(getCodList(furgonetasDisponibles)) + System.lineSeparator();
			
	}
	
	// C�DIGO DE APOYO
	public String getEsperando(){
		return "Pedidos esperando moto:" + myArrayListToString(getClienteRestauranteList(pedidosEsperandoMoto)) + System.lineSeparator() +
				"Pedidos esperando furgoneta:" + myArrayListToString(getClienteRestauranteList(pedidosEsperandoFurgoneta)) + System.lineSeparator();
	}
	
	// C�DIGO DE APOYO
	public ArrayList<String> getCodMotosDisponibles(){
		return getCodList(motosDisponibles);
	}	
	
	// C�DIGO DE APOYO
	public ArrayList<String> getCodFurgoDisponibles(){
		return getCodList(furgonetasDisponibles);
			
	}
	
	// C�DIGO DE APOYO
	public ArrayList<String[]> getCodEsperandoMoto(){
		return getClienteRestauranteList(pedidosEsperandoMoto);
	}
	
	public ArrayList<String[]> getCodEsperandoFurgo(){
		return getClienteRestauranteList(pedidosEsperandoFurgoneta);
	}

	private static final double PESOMAXMOTO = 20;

	// C�DIGO DE APOYO
	public GestionRepartoLocal(){		
		
		this.motosDisponibles = new ArrayList<>();
		this.furgonetasDisponibles = new ArrayList<>();

		this.pedidosEsperandoFurgoneta = new ArrayList<>();
		this.pedidosEsperandoMoto = new ArrayList<>();
	}
	
	//Se usará instanceof a lo largo de la clase para saber concretamente si el transporte es de tipo Moto o de tipo Furgoneta.
	public void add(Transporte transporte){
		if(transporte instanceof Moto){
			motosDisponibles.add(motosDisponibles.size(), (Moto) transporte);
		}
		else if(transporte instanceof Furgoneta){
			furgonetasDisponibles.add(furgonetasDisponibles.size(), (Furgoneta) transporte);
		}
	}
			
	public void asignarPedido(Pedido pedido){
		if(pedido.getPeso()<=PESOMAXMOTO){
			if(motosDisponibles.size()>0){
				int aux=0;
				double mincost=pedido.coste(motosDisponibles.get(0));
				for(int i=1;i<motosDisponibles.size();i++){
					if(pedido.coste(motosDisponibles.get(i))<mincost){
						mincost=pedido.coste(motosDisponibles.get(i));
						aux=i;
					}
				}
				pedido.setTransporte(motosDisponibles.get(aux));
				motosDisponibles.remove(motosDisponibles.get(aux));
			}
			else{
				pedidosEsperandoMoto.add(pedidosEsperandoMoto.size(), pedido);
			}
		}
		else{
			if(furgonetasDisponibles.size()>0){
				int aux=0;
				double mincost=pedido.coste(furgonetasDisponibles.get(0));
				for(int i=1;i<furgonetasDisponibles.size();i++){
					if(pedido.coste(furgonetasDisponibles.get(i))<mincost){
						mincost=pedido.coste(furgonetasDisponibles.get(i));
						aux=i;
					}
				}
				pedido.setTransporte(furgonetasDisponibles.get(aux));
				furgonetasDisponibles.remove(furgonetasDisponibles.get(aux));
			}
			else{
				pedidosEsperandoFurgoneta.add(pedidosEsperandoFurgoneta.size(), pedido);
			}
		}
	}
	
	
	public void notificarEntregaPedido(Pedido pedido) {	
		if(pedido.getTransporte() instanceof Moto){
			if(pedidosEsperandoMoto.size()!=0){
				pedidosEsperandoMoto.get(0).setTransporte(pedido.getTransporte());
				pedidosEsperandoMoto.remove(pedidosEsperandoMoto.get(0));
			}
			else{
				motosDisponibles.add(motosDisponibles.size(), (Moto) pedido.getTransporte());
			}
		}
		else if(pedido.getTransporte() instanceof Furgoneta){
			if(pedidosEsperandoFurgoneta.size()!=0){
				pedidosEsperandoFurgoneta.get(0).setTransporte(pedido.getTransporte());
				pedidosEsperandoFurgoneta.remove(pedidosEsperandoFurgoneta.get(0));
			}
			else{
				furgonetasDisponibles.add(furgonetasDisponibles.size(), (Furgoneta) pedido.getTransporte());
			}
		}
	}
}