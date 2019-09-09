package gestionpedidos.mapa;

import java.util.HashMap;
import list.ArrayList;
import anotacion.Programacion2; ; 

@Programacion2 (
		nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es"
	)

public class Mapa {
	
	private HashMap<String, PosicionXY> objetos;
	
	// restaurantes y clientes
	private ArrayList<String> objetosEstaticos;
	// transportes
	private ArrayList<String> objetosDinamicos;

	private int maxCoordY;

	private int maxCoordX;
	
	public Mapa(int maxCoordX, int maxCoordY){
		this.maxCoordX = maxCoordX;
		this.maxCoordY = maxCoordY;
		this.objetos = new HashMap<>();
		this.objetosDinamicos = new ArrayList<>();
		this.objetosEstaticos = new ArrayList<>();		
	}
	
	private void validar(PosicionXY pos) {
		if (!(pos.getX() >= 0 && pos.getX() <= maxCoordX) || !(pos.getY() >= 0 && pos.getY() <= maxCoordY))
			throw new IllegalArgumentException("Posición dada fuera del mapa:" + pos.getX() + ", " + pos.getY());		
	}
	
	public int getMaxCoordY() {
		return maxCoordY;
	}
	
	public int getMaxCoordX() {
		return maxCoordX;
	}
	
	public void addObjetoEstatico(String cod, PosicionXY pos){
		validar(pos);
		int i;
		for(i=0; i<objetosEstaticos.size() && !objetos.get(objetosEstaticos.get(i)).equals(pos); i++);
		
		if(i < objetosEstaticos.size()){			
			throw new IllegalArgumentException("Ya hay en el mapa un objeto estático en la posición:" + 
					pos.getX() + " " + pos.getY());
		}
			
		objetos.put(cod, pos);
		objetosEstaticos.add(0, cod);
	}
	
	public void addObjetoDinamico(String cod, PosicionXY pos){
		validar(pos);
		objetos.put(cod, pos);
		objetosDinamicos.add(0, cod);
	}
	
	public double distancia (String cod1, String cod2){
		return objetos.get(cod1).distancia(objetos.get(cod2));
	}
	
	public String getMapaLocalidad(PosicionXY esqSupIzq, PosicionXY esqInfDr){
		int tamx = Math.abs(esqSupIzq.getX() - esqInfDr.getX()) + 1;
		int tamy = Math.abs(esqSupIzq.getY() - esqInfDr.getY()) + 1;
		String[][] vista = new String[tamy][tamx];
		String salida="";
		
		for(int i=0; i<vista.length; i++)
			for(int j=0; j<vista[0].length; j++)
				vista[i][j] = "..";		
		
		addCapaObjetos(vista, objetosEstaticos, esqSupIzq, esqInfDr);
		
		addCapaObjetos(vista, objetosDinamicos, esqSupIzq, esqInfDr);
		
		for(int i=0; i<vista.length; i++){
			for(int j=0; j<vista[0].length; j++)
				salida += vista[i][j] + " ";
			salida += System.lineSeparator();
		}
		
		return salida;
					
	}
	
	private void addCapaObjetos(String[][] vista, ArrayList<String> objetos, 
			PosicionXY esqSupIzq, PosicionXY esqInfDr){
		for(int i=0; i<objetos.size(); i++){
			String cod = objetos.get(i);
			PosicionXY pos = this.objetos.get(cod);
			int x = pos.getX();
			int y = pos.getY();
			if (estaDentro(esqSupIzq, esqInfDr, x, y))
				vista[y - esqSupIzq.getY()][x - esqSupIzq.getX()] = cod;
		}
	}
	
	private boolean estaDentro(PosicionXY esqSupIzq, PosicionXY esqInfDr, int x, int y){
		return (esqSupIzq.getX() <= x && x <= esqInfDr.getX()) &&
				(esqSupIzq.getY() <= y && y <= esqInfDr.getY());
	}

	public PosicionXY getPosicion(String codigo) {
		return objetos.get(codigo);
	}

	public void setPosicion(String codigo, PosicionXY posicion) {
		validar(posicion);
		objetos.put(codigo, posicion);		
	}
	
	
}
