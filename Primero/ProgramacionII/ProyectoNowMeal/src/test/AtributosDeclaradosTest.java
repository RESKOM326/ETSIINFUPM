package test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.junit.Test;

import gestionpedidos.GestionReparto;
import gestionpedidos.GestionRepartoLocal;
import gestionpedidos.mapa.Mapa;
import gestionpedidos.pedido.Cliente;
import gestionpedidos.pedido.Pedido;
import gestionpedidos.pedido.PlatoComida;
import gestionpedidos.pedido.Restaurante;
import gestionpedidos.transportes.Furgoneta;
import gestionpedidos.transportes.FurgonetaPropia;
import gestionpedidos.transportes.FurgonetaSubcontratada;
import gestionpedidos.transportes.Moto;
import gestionpedidos.transportes.Transporte; 

public class AtributosDeclaradosTest {
	
	@Test	
	public void testAtributosTransporte() {
		Class<?> className = Transporte.class;
		String[] attrNames = {"codigo", "mapa"};
		Type[] attrTypes = {String.class, Mapa.class};
		Type[] attrSpecialization = {null, null};
		boolean[] debeSerPrivado = {true, true};
		boolean[] debeSerEstatico = {false, false}; 
		boolean[] debeSerFinal = {false, false}; 
		boolean[] debeSerPublico = {false, false};
		
		
		checkAttributes(className, attrNames, attrTypes, attrSpecialization,
				debeSerPrivado, debeSerEstatico, debeSerFinal, debeSerPublico);
	}
	
	@Test	
	public void testAtributosMoto() {
		Class<?> className = Moto.class;
		String[] attrNames = {"eurosPKm"};
		Type[] attrTypes = {double.class};
		Type[] attrSpecialization = {null};
		boolean[] debeSerPrivado = {true};
		boolean[] debeSerEstatico = {false}; 
		boolean[] debeSerFinal = {false}; 
		boolean[] debeSerPublico = {false};
		
		
		checkAttributes(className, attrNames, attrTypes, attrSpecialization,
				debeSerPrivado, debeSerEstatico, debeSerFinal, debeSerPublico);
	}
	
	@Test	
	public void testAtributosFurgoneta() {
		Class<?> className = Furgoneta.class;
		String[] attrNames = {"tara"};
		Type[] attrTypes = {double.class};
		Type[] attrSpecialization = {null};
		boolean[] debeSerPrivado = {true};
		boolean[] debeSerEstatico = {false}; 
		boolean[] debeSerFinal = {false}; 
		boolean[] debeSerPublico = {false};
		
		
		checkAttributes(className, attrNames, attrTypes, attrSpecialization,
				debeSerPrivado, debeSerEstatico, debeSerFinal, debeSerPublico);
	}
	
	@Test	
	public void testAtributosFurgonetaPropia() {
		Class<?> className = FurgonetaPropia.class;
		String[] attrNames = {"velocidadMedia", "EUROSPHORA"};
		Type[] attrTypes = {double.class, double.class};
		Type[] attrSpecialization = {null, null};
		boolean[] debeSerPrivado = {true, true};
		boolean[] debeSerEstatico = {false, true}; 
		boolean[] debeSerFinal = {false, true}; 
		boolean[] debeSerPublico = {false, false};
		
		
		checkAttributes(className, attrNames, attrTypes, attrSpecialization,
				debeSerPrivado, debeSerEstatico, debeSerFinal, debeSerPublico);
	}
	
	@Test	
	public void testAtributosFurgonetaSubcontratada() {
		Class<?> className = FurgonetaSubcontratada.class;
		String[] attrNames = {"eurosPKm"};
		Type[] attrTypes = {double.class};
		Type[] attrSpecialization = {null};
		boolean[] debeSerPrivado = {true};
		boolean[] debeSerEstatico = {false}; 
		boolean[] debeSerFinal = {false}; 
		boolean[] debeSerPublico = {false};
		
		
		checkAttributes(className, attrNames, attrTypes, attrSpecialization,
				debeSerPrivado, debeSerEstatico, debeSerFinal, debeSerPublico);
	}

	@Test	
	public void testAtributosPedido() {
		Class<?> className = Pedido.class;
		String[] attrNames = {"cliente", "comidas", "restaurante", "importe", "transporte"};
		Type[] attrTypes = {Cliente.class, PlatoComida[].class, Restaurante.class, double.class, Transporte.class};
		Type[] attrSpecialization = {null, null, null, null, null};
		boolean[] debeSerPrivado = {true, true, true, true, true};
		boolean[] debeSerEstatico = {false, false, false, false, false}; 
		boolean[] debeSerFinal = {false, false, false, false, false}; 
		boolean[] debeSerPublico = {false, false, false, false, false};
		
		
		checkAttributes(className, attrNames, attrTypes, attrSpecialization,
				debeSerPrivado, debeSerEstatico, debeSerFinal, debeSerPublico);	
	}
	
	@Test	
	public void testAtributosGestionReparto() {
		Class<?> className = GestionReparto.class;
		String[] attrNames = {"gestoresLocales", "mapa"};
		Type[] attrTypes = {GestionRepartoLocal[].class, Mapa.class};
		Type[] attrSpecialization = {null, null};
		boolean[] debeSerPrivado = {true, true};
		boolean[] debeSerEstatico = {false, false}; 
		boolean[] debeSerFinal = {false, false}; 
		boolean[] debeSerPublico = {false, false};
		
		
		checkAttributes(className, attrNames, attrTypes, attrSpecialization,
				debeSerPrivado, debeSerEstatico, debeSerFinal, debeSerPublico);
	}
	
	@Test
	public void testAtributosGestionRepartoLocal() {
		Class<?> className = GestionRepartoLocal.class;
		String[] attrNames = {"motosDisponibles", "furgonetasDisponibles", "pedidosEsperandoMoto", "pedidosEsperandoFurgoneta"};
		Type[] attrTypes = {list.ArrayList.class, list.ArrayList.class, list.ArrayList.class, list.ArrayList.class};
		Type[] attrSpecialization = {Moto.class, 
								Furgoneta.class, 
								Pedido.class, 
								Pedido.class};
		boolean[] debeSerPrivado = {true, true, true, true};
		boolean[] debeSerEstatico = {false, false, false, false}; 
		boolean[] debeSerFinal = {false, false, false, false}; 
		boolean[] debeSerPublico = {false, false, false, false};
		
		
		checkAttributes(className, attrNames, attrTypes, attrSpecialization,
				debeSerPrivado, debeSerEstatico, debeSerFinal, debeSerPublico);
	}
	
	
	

	private void checkAttributes(Class<?> className, String[] attrNames,
			Type[] attrTypes, Type[] attrSpecialization, boolean[] debeSerPrivado,
			boolean[] debeSerEstatico, boolean[] debeSerFinal, boolean[] debeSerPublico){
		Field atributo=null;
		for (int i=0;i<attrNames.length;i++){
			try {
				atributo = className.getDeclaredField(attrNames[i]);
				assertNotEquals("Debe declarar el atributo "+attrNames[i]+" en la clase "+className, null, atributo );
				
				assertEquals("Debe declarar el atributo "+attrNames[i]+" como "+(debeSerPrivado[i]?"":"NO")+" PRIVADO en la clase "+className, debeSerPrivado[i],Modifier.isPrivate(atributo.getModifiers()) );
				assertEquals("Debe declarar el atributo "+attrNames[i]+" como "+(debeSerEstatico[i]?"":"NO")+" DE CLASE en la clase "+className, debeSerEstatico[i],Modifier.isStatic(atributo.getModifiers()) );
				assertEquals("Debe declarar el atributo "+attrNames[i]+" como "+(debeSerFinal[i]?"":"NO")+" CONSTANTE (final) en la clase "+className, debeSerFinal[i],Modifier.isFinal(atributo.getModifiers()) );
				assertEquals("Debe declarar el atributo "+attrNames[i]+" como "+(debeSerPublico[i]?"":"NO")+" PUBLICO en la clase "+className, debeSerPublico[i],Modifier.isPublic(atributo.getModifiers()) );
				
				assertEquals("Debe declarar el atributo "+attrNames[i]+" de tipo "+attrTypes[i]+" en la clase "+className, attrTypes[i].getTypeName(),atributo.getType().getTypeName());
				if (attrSpecialization[i]!=null){
					if (((ParameterizedType)atributo.getGenericType()).getActualTypeArguments()==null ||
							((ParameterizedType)atributo.getGenericType()).getActualTypeArguments().length==0){
						fail("Debe declarar el atributo "+attrNames[i]+" de tipo "+attrTypes[i]+" y su tipo de parámetro debe ser "+attrSpecialization[i]+" en la clase "+className);
					}
					assertEquals("Debe declarar el atributo "+attrNames[i]+" de tipo "+attrTypes[i]+" y su tipo de parámetro debe ser "+attrSpecialization[i]+" en la clase "+className, attrSpecialization[i].getTypeName(), ((ParameterizedType)atributo.getGenericType()).getActualTypeArguments()[0].getTypeName() );
				}
				
			} catch (NoSuchFieldException e) {
				fail(e.getMessage()+"\nDebe declarar el atributo "+attrNames[i]+" en la clase "+className);
			} 
		}
	}
}
