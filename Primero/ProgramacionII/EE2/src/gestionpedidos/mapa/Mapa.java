package gestionpedidos.mapa;

import java.util.HashMap;
import list.ArrayList;

public class Mapa {
	
	//ATRIBUTOS
	private HashMap<String, PosicionXY> objetos;
	private ArrayList<String> objetosEstaticos;
	private ArrayList<String> objetosDinamicos;
	private int maxCoordY;
	private int maxCoordX;
	
	//CONSTRUCTOR
	public Mapa(int maxCoordX, int maxCoordY){
		this.maxCoordX = maxCoordX;
		this.maxCoordY = maxCoordY;
		this.objetos = new HashMap<>();
		this.objetosDinamicos = new ArrayList<>();
		this.objetosEstaticos = new ArrayList<>();		
	}
	
	//VALIDAR
	private void validar(PosicionXY pos) {
		if (!(pos.getX() >= 0 && pos.getX() <= maxCoordX) || !(pos.getY() >= 0 && pos.getY() <= maxCoordY))
			throw new IllegalArgumentException("Posición dada fuera del mapa:" + pos.getX() + ", " + pos.getY());		
	}
	
	//AÑADIR OBJETO ESTATICO
	public void addObjetoEstatico(String cod, PosicionXY pos){
		validar(pos);
		int i;
		for(i=0; i<objetosEstaticos.size() && !objetos.get(objetosEstaticos.get(i)).equals(pos); i++);
		
		if(i < objetosEstaticos.size())
			throw new IllegalArgumentException("Ya hay en el mapa un objeto estático en la posición:" + 
					pos.getX() + " " + pos.getY());
			
		objetos.put(cod, pos);
		objetosEstaticos.add(0, cod);
	}
	
	//AÑADIR OBJETO DINAMICO
	public void addObjetoDinamico(String cod, PosicionXY pos){
		validar(pos);
		objetos.put(cod, pos);
		objetosDinamicos.add(0, cod);
	}
	
	//DISTANCIA
	public double distancia (String codSitioOrg, String codSitioDest){
		PosicionXY origen = objetos.get(codSitioOrg);
		PosicionXY destino = objetos.get(codSitioDest);
		if (origen == null)
			throw new NullPointerException("El origen: "+codSitioOrg+" no existe y por eso se accedería a un puntero nulo");
		if (destino == null)
			throw new NullPointerException("El destino: "+codSitioDest+" no existe y por eso se accedería a un puntero nulo");
		return origen.distancia(destino);
	}	
}
