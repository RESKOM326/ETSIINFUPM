package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.Programacion2; 

@Programacion2 (
		nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es"
	)

//Moto hereda de la superclase Transporte (que incluye Moto y ambos tipos de Furgoneta).
public class Moto extends Transporte {
	
	//ATRIBUTOS
	private double eurosPKm;
	
	//CONSTRUCTOR
	public Moto(String codigo, Mapa mapa){
		super(codigo,mapa);
		this.eurosPKm=2;
	}
	
	//GETTERS-SETTERS
	public double getEurosPKm(){
		return eurosPKm;
	}
	
	public void setEurosPKm(double eurosPKm){
		this.eurosPKm=eurosPKm;
	}
	
	//Implementación del método abstracto de la superclase Transporte.
	public double coste(String codPosOrigen, String codPosDestino){
		return getMapa().distancia(codPosOrigen, codPosDestino)*eurosPKm;
	}

}
