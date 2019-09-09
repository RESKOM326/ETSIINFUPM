package gestionpedidos;

import gestionpedidos.pedido.Pedido;
import gestionpedidos.transportes.Moto;
import list.ArrayList;
import anotacion.*; 

@Programacion2 (
		nombreAutor1 = "David",                 
		apellidoAutor1 = "Labrado Hern�ndez",  
		emailUPMAutor1 = "david.labrado.hernandez@alumnos.upm.es",   	
		nombreAutor2 = "Mark",                 
		apellidoAutor2 = "Dervishaj Memi",  
		emailUPMAutor2 = "mark.dervishaj.memi@alumnos.upm.es"    
)

public class GestionRepartoLocal {	
	
	//ATRIBUTOS(S)
	private ArrayList<Moto> motosDisponibles;
	
	//GET COD. LIST.
	private String getCodList(ArrayList<?> disponibles) {
		String salida = "";
		for(int i=0; i<disponibles.size(); i++)
			salida += " " + ((Moto) disponibles.get(i)).getCodigo();
		return salida;
	}
	
	//GETTERS - SETTERS
	public String getDisponibles(){
		return "Motos Disponibles:" + getCodList(motosDisponibles) + System.lineSeparator();		
	}
	
	//CONSTRUCTOR
	public GestionRepartoLocal(){
		this.motosDisponibles = new ArrayList<>();
	}
	
	//AÑADIR MOTO
	public void add(Moto moto){
		this.motosDisponibles.add(this.motosDisponibles.size(), moto);
	}	
	
	//ASIGNAR PEDIDO
	public void asignarPedido(Pedido pedido){
		if(motosDisponibles.size()==0){
			pedido.setTransporte(null);
		}
		else{
			double coste=pedido.coste(motosDisponibles.get(0));
			for(int i=0;i<motosDisponibles.size();i++){
				if(pedido.coste(this.motosDisponibles.get(i))<coste){
					coste=pedido.coste(motosDisponibles.get(i));
				}
				pedido.setTransporte(this.motosDisponibles.get(i));
				motosDisponibles.remove(motosDisponibles.get(i));
			}
		}
	}
	
	//NOTIFICAR PEDIDO
	public void notificarEntregaPedido(Pedido pedido) {
		motosDisponibles.add(motosDisponibles.size(), pedido.getTransporte());
	}
}
