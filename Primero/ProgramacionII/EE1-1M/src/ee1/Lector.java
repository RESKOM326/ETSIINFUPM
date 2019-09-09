package ee1;

import java.util.Arrays;
import anotacion.Programacion2;

@Programacion2 (
        nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es"
)

public class Lector {
  
	//ATRIBUTOS
	private int nSocio;
	private String nombre;
	private Libro historicoLectura[];
	private int nLibroLeido;
	
	//CONSTRUCTOR
	public Lector(int nSocio, String nombre){
		this.nSocio=nSocio;
		this.nombre=nombre;
		this.historicoLectura=new Libro[10];
		this.nLibroLeido=0;
	}

	//GETTERS
	public int getNSocio() {
		return nSocio;
	}

	public String getNombre() {
		return nombre;
	}

	//GETLIBROLEIDO
	public Libro getLibroLeido(int pos){
		if(pos>0&&pos<=nLibroLeido){
			return historicoLectura[pos-1];
		}
		else{
			return null;
		}
	}
	
	//LEERLIBRO
	public void leerLibro(Libro libro1){
		if(nLibroLeido<historicoLectura.length){
			historicoLectura[nLibroLeido]=libro1;
			nLibroLeido++;
		}
		else{
			for(int i=0;i<historicoLectura.length-1;i++){
				historicoLectura[i]=historicoLectura[i+1];
				historicoLectura[historicoLectura.length-1]=libro1;
			}
		}
		libro1.prestado();
	}
	
	//ESIGUAL
	public boolean esIgual(Lector lector2){
		boolean res=false;
		if(Arrays.equals(this.historicoLectura,lector2.historicoLectura)&&this.nSocio==lector2.nSocio){
			res=true;
		}
		return res;
	}
}
