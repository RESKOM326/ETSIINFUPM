package gestionpedidos.pedido;

import gestionpedidos.transportes.Transporte;
import anotacion.Programacion2;  

@Programacion2 (
		nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es"
	)

public class Pedido {
	// C�DIGO DE APOYO
	private Cliente cliente;
	@SuppressWarnings("unused")
	private PlatoComida[] comidas;
	private Restaurante restaurante;
	private double importe;	
	private Transporte transporte;
	private double peso;
	
	public Pedido(Cliente cliente, PlatoComida[] comidas, Restaurante restaurante) {		
		this.cliente=cliente;
		this.comidas=comidas;
		this.restaurante=restaurante;
		//El importe es la suma de los precios de cada plato de comidas.
		for(int i=0;i<comidas.length;i++){
			importe=importe+comidas[i].getPrecio();
		}
		transporte=null;
		//El peso es la suma del peso de cada plato de comida.
		for(int i=0;i<comidas.length;i++){
			peso=peso+comidas[i].getPeso();
		}
	}

	
	public double getPeso(){
		return peso;
	}
	
	//Coste del transporte ir hasta el restaurante, de ahí al cliente y además el precio de la comida.
	public double coste(Transporte transporte){
		return transporte.coste(transporte.getCodigo(), restaurante.getCodigo())+transporte.coste(restaurante.getCodigo(), cliente.getCodigo())+importe;
	}
	
	// C�DIGO DE APOYO
	public double getImporte(){
		return importe;
	}	

	// C�DIGO DE APOYO
	public Transporte getTransporte() {
		return transporte;
	}

	// C�DIGO DE APOYO
	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}
	
	// C�DIGO DE APOYO
	public Cliente getCliente(){
		return cliente;
	}
	
	// C�DIGO DE APOYO
	public Restaurante getRestaurante(){
		return restaurante;
	}
}
