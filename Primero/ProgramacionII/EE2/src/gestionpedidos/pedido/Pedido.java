package gestionpedidos.pedido;

import gestionpedidos.transportes.Moto;
import anotacion.*; 

@Programacion2 (
		nombreAutor1 = "David",                 
		apellidoAutor1 = "Labrado Hern�ndez",  
		emailUPMAutor1 = "david.labrado.hernandez@alumnos.upm.es",  
		nombreAutor2 = "Mark",                 
		apellidoAutor2 = "Dervishaj Memi",  
		emailUPMAutor2 = "mark.dervishaj.memi@alumnos.upm.es"   
)

public class Pedido {
	
	//ATRIBUTOS
	private Cliente cliente;
	@SuppressWarnings("unused")
	private PlatoComida[] comidas;
	private Restaurante restaurante;
	private double importe;	
	private Moto transporte;
	
	//CONSTRUCTOR
	public Pedido(Cliente cliente, PlatoComida[] comidas, Restaurante restaurante) {		
		this.cliente=cliente;
		this.comidas=comidas;
		this.restaurante=restaurante;
		for(int i=0;i<comidas.length;i++){
			importe=importe+comidas[i].getPrecio();
		}
	}
		
	//COSTE
	public double coste(Moto moto){
		double cost=moto.coste(moto.getCodigo(),restaurante.getCodigo())+moto.coste(restaurante.getCodigo(),cliente.getCodigo())+getImporte();
		return cost;
	}
	
	//GETTERS - SETTERS
	public double getImporte(){
		return importe;
	}
	
	public Moto getTransporte() {
		return transporte;
	}

	public void setTransporte(Moto transporte) {
		this.transporte = transporte;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public Restaurante getRestaurante(){
		return restaurante;
	}
}
