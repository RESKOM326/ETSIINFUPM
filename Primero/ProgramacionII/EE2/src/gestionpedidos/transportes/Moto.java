package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.*; 

@Programacion2 (
	nombreAutor1 = "David",                 
	apellidoAutor1 = "Labrado Hern�ndez",  
	emailUPMAutor1 = "david.labrado.hernandez@alumnos.upm.es",  	
	nombreAutor2 = "Mark",                 
	apellidoAutor2 = "Dervishaj Memi",  
	emailUPMAutor2 = "mark.dervishaj.memi@alumnos.upm.es"   
)

public class Moto {
	
	//ATRIBUTOS
	private String codigo;
	private double eurosPKm = 2;	
	private Mapa mapa;
	
	//CONSTRUCTOR
	public Moto(String codigo, Mapa mapa){
		this.codigo = codigo;
		this.mapa = mapa;
	}		
	
	//COSTE
	public double coste(String codOrigen, String codDestino){
		double dist=mapa.distancia(codOrigen,codDestino);
		double cost=dist*this.eurosPKm;
		return cost;
	}
	
	//COSTE 2
	public double coste(String codDestino){
		double cost=mapa.distancia(this.codigo, codDestino)*2;
		return cost;
	}	
	
	//GETTERS - SETTERS
	public String getCodigo() {
		return codigo;
	}
	
	public double getEurosPKm() {
		return eurosPKm;
	}

	public void setEurosPKm(double eurospkm) {
		this.eurosPKm = eurospkm;
	}
	

}
