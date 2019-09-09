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
import gestionpedidos.transportes.Transporte; 

public class MotoJUnitTest {

	@Rule //Se establece un time out general para todos los tests. Se debe comentar esta linea y la de abajo para depurar
    public TestRule  globalTimeout = new DisableOnDebug(Timeout.millis(100)); // 100 milisegundos maximos por test	
	
	private static final double MI_COSTE_KM = 20;
	private static final double DELTA_PRECISSION = 0.001;

	/**
	 * Test del constructor de la clase Moto
	 * 
	 * <p>Utiliza el metodo modificador setEurosPKm()</p>
	 */
	@Test
	public void testMoto() {
		String motoId0001 = "0001";
		Transporte moto1 = new Moto(motoId0001, new Mapa(10, 10));
		Moto moto = (Moto) moto1;
		
		assertEquals("El código de la moto no coincide ("+motoId0001+")", motoId0001, moto.getCodigo());
		
		assertEquals("El coste eurosPKm por defecto de la Moto no es 2", 2.0, moto.getEurosPKm(),DELTA_PRECISSION);
		
		moto.setEurosPKm(MI_COSTE_KM);
		assertEquals("El coste eurosPKm modificado de la moto no coincide", MI_COSTE_KM, moto.getEurosPKm(),DELTA_PRECISSION);
	
	}
	
	
	/**
	 * Test para coste(String)
	 * 
	 * <p>Utiliza el constructor de Moto y getEurosPKm()</p>
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

	/**
	 * Test para el método coste(String, String)
	 * 
	 * <p>Utiliza el constructor de Moto y getEurosPKm()</p>
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
