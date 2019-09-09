package test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import gestionpedidos.mapa.Mapa;
import gestionpedidos.mapa.PosicionXY;
import gestionpedidos.transportes.Moto;


public class MotoJUnitTest {

	@Rule //Se establece un time out general para todos los tests. Se debe comentar esta línea y la de abajo para depurar
    public TestRule  globalTimeout = new DisableOnDebug(Timeout.millis(100)); // 100 milisegundos máximos por test	
	private static final double DELTA_PRECISSION = 0.001;
	
		
	/*
	 * Comprobar el cálculo correcto para coste(String), no sea que devuelvan
	 * un valor cualquiera o no multipliquen por EurosPKm
	 */
	@Test
	public void testCoste1() {
		double coste;
		Mapa mapa = new Mapa(20, 20);
		Moto moto = new Moto("M1", mapa);
		mapa.addObjetoEstatico("C1", new PosicionXY(3,4));
		mapa.addObjetoDinamico("M1", new PosicionXY(7,4));
		
		// Test
		coste = moto.coste("C1");	
		assertEquals("Valor calculado de coste (" + coste + ") incorrecto",
				mapa.distancia("M1", "C1")*moto.getEurosPKm(), coste, DELTA_PRECISSION);
		

	}

	/*
	 * Comprobar el cálculo correcto para coste(String, String), no sea que devuelvan
	 * un valor cualquiera o no multipliquen por EurosPKm
	 */
	@Test
	public void testCoste2() {
		double coste;
		Mapa mapa = new Mapa(20, 20);
		Moto moto = new Moto("M1", mapa);
		mapa.addObjetoEstatico("C1", new PosicionXY(3,4));
		mapa.addObjetoDinamico("M1", new PosicionXY(7,4));
		
		// Test
		coste = moto.coste("M1", "C1");	
		assertEquals("Valor calculado de coste (" + coste + ") incorrecto",
				mapa.distancia("M1", "C1")*moto.getEurosPKm(), coste, DELTA_PRECISSION);

	}
	

}
