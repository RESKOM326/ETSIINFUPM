package gestionpedidos.pedido;

import anotacion.Programacion2; 

@Programacion2 (
		nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es"
	)

public class PlatoComida {
	private String codigo;
	private double precio;
	private double peso;

	public PlatoComida(String codigo, double precio, double peso) {		
		this.codigo = codigo;
		this.precio = precio;
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}
	
	public String getCodigo(){
		return codigo;
	}

	public double getPeso() {
		return peso;
	}
	
	

}
