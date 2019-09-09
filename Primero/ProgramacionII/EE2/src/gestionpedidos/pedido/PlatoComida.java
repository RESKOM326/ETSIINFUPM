package gestionpedidos.pedido;

public class PlatoComida {
	
	//ATRIBUTOS
	private String codigo;
	private double precio;
	private double peso;
	
	//CONSTRUCTOR
	public PlatoComida(String codigo, double precio, double peso) {		
		this.codigo = codigo;
		this.precio = precio;
		this.peso = peso;
	}
	
	//GETTERS - SETTERS
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
