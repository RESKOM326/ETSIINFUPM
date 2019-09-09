package test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;


public class TestIntegridadPiezas {

	private static ArrayList<Metodo> constructores = new ArrayList<>(); 
	private static ArrayList<Metodo> metodos = new ArrayList<>(); 

	
	private static final String PKG = "progii.juegotablero.model.ajedrez.piezas.";
	private static final String PEON = "Peon";
	private static final String CABALLO = "Caballo";
	private static final String ALFIL = "Alfil";
	private static final String REY = "Rey";
	private static final String REINA = "Reina";
	

	@Rule //Se establece un time out general para todos los tests. Se debe comentar esta línea y la de abajo para depurar
	public TestRule  globalTimeout = new DisableOnDebug(Timeout.millis(100)); // 100 milisegundos máximos por test

	@BeforeClass
	public static void setup () {
		constructores.add(new Metodo (null,null, new String [] {"progii.juegotablero.model.Jugador", "int", "char"}));
		metodos.add(new Metodo ("movimientosValidos", "list.ArrayList", new String [] {})); 
	}

	@Test
	public void testClasePeon () {
		testClase(PKG + PEON);
	}

	@Test
	public void testClaseCaballo () {
		testClase(PKG + CABALLO);
	}

	@Test
	public void testClaseAlfil () {
		testClase(PKG + ALFIL);
	}

	@Test
	public void testClaseRey () {
		testClase(PKG + REY);
	}
	
	@Test
	public void testClaseReina () {
		testClase(PKG + REINA);
	}

	@Test
	public void testClasePiezaAjedrez () {
		testClase("progii.juegotablero.model.ajedrez.PiezaAjedrez");
	}
	
	@Test
	public void testPeon () {
		Class<?> clazz = testClase(PKG + PEON);
		testMetodos(clazz);
		testConstructores(clazz);
	}

	@Test
	public void testCaballo () {
		Class<?> clazz = testClase(PKG + CABALLO);
		testMetodos(clazz);
		testConstructores(clazz);
	}

	@Test
	public void testAlfil () {
		Class<?> clazz = testClase(PKG + ALFIL);
		testMetodos(clazz);
		testConstructores(clazz);
	}

	@Test
	public void testRey () {
		Class<?> clazz = testClase(PKG + REY);
		testMetodos(clazz);
		testConstructores(clazz);
	}
	
	@Test
	public void testReina () {
		Class<?> clazz = testClase(PKG + REINA);
		testMetodos(clazz);
		testConstructores(clazz);
	}

	@Test
	public void testPiezaAjedrez () {
		Class<?> clazz = testClase("progii.juegotablero.model.ajedrez.PiezaAjedrez");
		Metodo m = new Metodo ("toString","java.lang.String", new String [] {});
		testMetodo (m, clazz); 
		m = new Metodo ("movimientosValidos", "list.ArrayList", new String [] {});
		testMetodo (m, clazz); 
	}
	
	private Class<?> testClase (String clazzName) {
		try {
			return Class.forName(clazzName); 
		} catch (ClassNotFoundException e) {
			fail("No se ha encontrado la clase '" + clazzName + "': No se continúa con el resto de tests.");
			return null; 
		} 
		
	}
	
	private void testConstructores (Class<?> clazz) {
		for (int i = 0; i<constructores.size(); i++){
			testConstructor(constructores.get(i), clazz); 
		}

	}

	private void testMetodos (Class<?> clazz) {
		for (int i = 0; i<metodos.size(); i++){
			testMetodo(metodos.get(i), clazz); 
		}

	}


	private void testConstructor(Metodo constructor, Class<?> clazz) {
		try {
			clazz.getDeclaredConstructor(constructor.getParametrosReflect());
			
		} catch (IllegalArgumentException | SecurityException | NoSuchMethodException  e) {
			fail("No se ha podido acceder al constructor " + constructor + " en la clase " + clazz);
		}
	}
	
	
	private void testMetodo (Metodo metodo, Class<?> clazz) {
		Method method =null;
		assertTrue("Se ha pasado una clase nula", clazz != null);
		try {
			method = clazz.getDeclaredMethod(metodo.getNombre(),metodo.getParametrosReflect());
			assertTrue("No se ha encontrado el método: "+ metodo.getNombre()+" con parámetros "+metodo.getParametrosReflect(),
			method != null);
			assertTrue("Se ha encontrado el metodo " + metodo.getNombre() + " pero no coincide el tipo devuelto esperado (" + metodo.getTipoDevuelto()+")" + method.getReturnType().getName(),
					metodo.getTipoDevueltoConvertido().equals(method.getReturnType().getName())); 
				
		} catch (IllegalArgumentException | SecurityException | NoSuchMethodException  e) {
			fail("No se ha podido acceder al método " + metodo + " en la clase " + clazz);
		}
	}

	static class Miembro {
		private String nombre;
		
		public Miembro (String nombre) {
			this.nombre= nombre; 
		}
		
		public String getNombre () {
			return nombre; 
		}
	}
	
	static class Atributo extends Miembro {
		
		private String tipo;

		public Atributo(String nombre, String tipo) {
			super(nombre);
			this.tipo = tipo;
		}
		
		public String getTipo () {
			return tipo; 
		}
		
		public String getTipoConvertido() {
			return convertirTipo(this.tipo);
		} 

		@Override
		public String toString() {
			return "<" + tipo + " " + getNombre() + ">";   
		}
	}


	private static String convertirTipo (String tipo) {
		if (tipo.endsWith("[]")){
			return "[" + getTipo(tipo.substring(0,tipo.length()-2)); 
		}
		else {
			return tipo;
		}
	}
	
	private static String getTipo (String tipo) {
		if (tipo.equals("int")) return "I"; 
		else if (tipo.equals("long")) return "J"; 
		else if (tipo.equals("float")) return "F"; 
		else if (tipo.equals("double")) return "D"; 
		else if (tipo.equals("char")) return "C"; 
		else if (tipo.equals("byte")) return "B"; 
		else if (tipo.equals("boolean")) return "Z"; 
		else if (tipo.equals("void")) return "V";
		else return "L" + tipo + ";"; 
		
	}
	

	
	static class Metodo extends Miembro {//Metodo
		private String tipoDevuelto; 
		private String [] parametros;
		private String [] parametrosConvertidos;
		
		
		public Metodo(String nombre, String tipoDevuelto, String[] parametros) {
			super(nombre);
			this.tipoDevuelto = tipoDevuelto;
			this.parametros = parametros;
			parametrosConvertidos = new String [parametros.length]; 
			for (int i = 0; i < parametros.length; i ++){
				parametrosConvertidos [i] = convertirTipo(parametros[i]); 
			}
		}

		public String getTipoDevueltoConvertido() {
			return convertirTipo(tipoDevuelto);
		}

		public String getTipoDevuelto() {
			return tipoDevuelto;
		}

		public Class<?>[] getParametrosReflect() {
			Class<?> [] params = new Class[parametros.length]; 
			
			for (int i = 0; i < parametros.length; i++){
				try {
					params[i] = getClazz(parametros[i]); 
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} 
			}
			
			return params;
			
		} 

		public String[] getParametros() {
			return parametros;
		} 
		
		@Override
		public String toString() {
			StringBuilder res = new StringBuilder("--" + tipoDevuelto + " " + getNombre() + "(");
			for (int i = 0; i < parametros.length-1; i++)  {
				res.append(parametros[i] + ",");
			}
			if (parametros.length > 0) {
				res.append(parametros[parametros.length-1] + ")--");
			}
			return res.toString();
		}
		
		private static Class<?> getClazz (String tipo) throws ClassNotFoundException {
			if (tipo.equals("int")) return Integer.TYPE; 
			else if (tipo.equals("float")) return Float.TYPE; 
			else if (tipo.equals("double")) return Double.TYPE; 
			else if (tipo.equals("long")) return Long.TYPE; 
			else if (tipo.equals("char")) return Character.TYPE; 
			else if (tipo.equals("byte")) return Byte.TYPE; 
			else if (tipo.equals("boolean")) return Boolean.TYPE; 
			else if (tipo.endsWith("[]")) return Class.forName("["+getTipo(tipo.substring(0, tipo.length()-2))); 
			
			else return Class.forName(tipo);
		}
		
	}//Metodo
	
	
}

