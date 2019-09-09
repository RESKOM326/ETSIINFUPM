package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.Programacion2; 

@Programacion2 (
		nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es"
	)

//Es una clase abstracta debido a que contiene al final un método abstracto.
public abstract class Transporte {
	
	//ATRIBUTOS
	private String codigo;
	private Mapa mapa;
	
	//CONSTRUCTOR
	public Transporte(String codigo, Mapa mapa){
		this.codigo=codigo;
		this.mapa=mapa;
	}
	
	//GETTERS-SETTERS
	public String getCodigo() {
		return codigo;
	}
	
	public Mapa getMapa(){
		return mapa;
	}

	//Este método recurre al abstracto que ha sido implementado en las subclases.
	public double coste(String codPosDestino){
		return coste(codigo,codPosDestino);
	}
	
	//Método abstracto a implementar por las subclases.
	abstract public double coste(String codPosOrigen, String codPosDestino);
	
}


