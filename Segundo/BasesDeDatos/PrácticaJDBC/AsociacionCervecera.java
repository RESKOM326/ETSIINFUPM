import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Mark Dervishaj Memi, Angelika Krolikowska, Paula Calvo Gallego, Ignacio Lopez Carboneras
 *
 */

public class AsociacionCervecera {
	
	public static void main(String[] args) {
		AsociacionCervecera ac = new AsociacionCervecera();
		
		ac.mainMenu();
		
		// Se llama a DBclose tras ejecutar mainMenu, de esta forma la conexion se cierra
		// cuando se pulsa la opcion 0 del menu y se ha finalizado el programa
		ac.DBclose();
		
	}
	
	Connection conn=null;
	
	
	public boolean DBconnect() {
		try{
			// Si ya existe una conexion, no se abre otra y se devuelve false
			
			// Esta implementacion permite llamar a DBconnect en cada metodo, para que se inicie la conexion
			// con la primera operacion contra la BD, pero no volvir a abrir mas la conexion si ya ha sido abierta
			if(!conn.isClosed()) {
				return false;
			}
			String drv="com.mysql.jdbc.Driver";
			Class.forName(drv);
			String serverAddress="localhost:3306";
			String db="AsociacionCervecera";
			String user="bd";
			String pass="bdupm";
			String url="jdbc:mysql://"+serverAddress+"/"+db;
			conn=DriverManager.getConnection(url,user,pass);
			return true;
		}
		catch(ClassNotFoundException ec) {
			System.err.println("No se encuentra el driver");
			return false;
		}
		catch(SQLException es){
			System.err.println("Mensaje de error: "+es.getMessage());
			System.err.println("Codigo de error: "+es.getErrorCode());
			System.err.println("Estado SQL: "+es.getSQLState());
			return false;
		}
		catch(Exception e) {
			System.err.println("Error inesperado");
			return false;
		}
		
	}
	
	public boolean DBclose() {
		try{
			// Si NO existe una conexion, entonces no se intenta cerrar y se devuelve false
			if(conn.isClosed()) {
				return false;
				
			}
			conn.close();
			return true;
		}
		catch(SQLException es){
			System.err.println("Mensaje de error: "+es.getMessage());
			System.err.println("Codigo de error: "+es.getErrorCode());
			System.err.println("Estado SQL: "+es.getSQLState());
			return false;
		}
		catch(Exception e) {
			System.err.println("Error inesperado");
			return false;
		}
	}
	
	public boolean createTableEmpleado() {
		Statement st=null;
		try{
			DBconnect();
			st=conn.createStatement();
			String SQL = "CREATE TABLE empleado(ID_empleado INT NOT NULL, nombre VARCHAR(50) NOT NULL, " + 
			"direccion VARCHAR(100) NOT NULL, telefono VARCHAR(15) UNIQUE, salario FLOAT NOT NULL, ID_bar INT NOT NULL, " + 
			"PRIMARY KEY(ID_empleado), FOREIGN KEY(ID_bar) REFERENCES Bar(ID_bar) ON DELETE CASCADE ON UPDATE CASCADE);";
			
			st.executeUpdate(SQL);
			st.close();
			return true;
		}
		catch(SQLException es){
			System.err.println("Mensaje de error: "+es.getMessage());
			System.err.println("Codigo de error: "+es.getErrorCode());
			System.err.println("Estado SQL: "+es.getSQLState());
			return false;
		}
		catch(Exception e) {
			System.err.println("Error inesperado");
			return false;
		}
		finally {
			try {
				// Si no se han podido cerrar los recursos debido a la excepcion en una sentencia anterior, se intenta cerrarlos 
				if(st!=null) st.close();
			}
			catch(SQLException es){
				System.err.println("Mensaje de error: "+es.getMessage());
				System.err.println("Codigo de error: "+es.getErrorCode());
				System.err.println("Estado SQL: "+es.getSQLState());
			}
		}
	}
	
	public boolean createTableGusta() {
		Statement st=null;
		try{
			DBconnect();
			st=conn.createStatement();
			String SQL = "CREATE TABLE gusta(ID_socio INT NOT NULL, ID_cerveza INT NOT NULL, ID_bar INT NOT NULL, " + 
			"PRIMARY KEY(ID_socio, ID_cerveza, ID_bar), FOREIGN KEY(ID_socio) REFERENCES Socio(ID_socio) ON DELETE CASCADE ON UPDATE CASCADE, " + 
			"FOREIGN KEY(ID_bar) REFERENCES Bar(ID_bar) ON DELETE CASCADE ON UPDATE CASCADE, " + 
			"FOREIGN KEY(ID_cerveza) REFERENCES Cerveza(ID_cerveza) ON DELETE CASCADE ON UPDATE CASCADE);";
			
			st.executeUpdate(SQL);
			st.close();
			return true;
		}
		catch(SQLException es){
			System.err.println("Mensaje de error: "+es.getMessage());
			System.err.println("Codigo de error: "+es.getErrorCode());
			System.err.println("Estado SQL: "+es.getSQLState());
			return false;
		}
		catch(Exception e) {
			System.err.println("Error inesperado");
			return false;
		}
		finally {
			try {
				// Si no se han podido cerrar los recursos debido a la excepcion en una sentencia anterior, se intenta cerrarlos 
				if(st!=null) st.close();
			}
			catch(SQLException es){
				System.err.println("Mensaje de error: "+es.getMessage());
				System.err.println("Codigo de error: "+es.getErrorCode());
				System.err.println("Estado SQL: "+es.getSQLState());
			}
		}
	}
	
	public boolean loadEmpleados() {
		PreparedStatement pst=null;
		// Se crean arrays de cada columna, donde el indice representa la fila. Se usan como parametros del PreparedStatement
		int id[]= {1,2,3,4,5,6,7,8,9};
		String nom[]={"Carmen Mart�n","Ana Ruiz","Mario Moreno","Laura Romero","Luis Ruiz","Benito Gil","Dolores Molina","Julio Garrido","Pilar Romero"};
		String dir[]={"C/ Sol, 1","C/ Luna, 2","C/ Estrella, 3","C/ Mercurio, 4","C/ Venus, 5","C/ Marte, 6","C/ J�piter, 7","C/ J�piter, 7","C/ Saturno, 8"};
		String tfno[]={"699999999","699999988","699999977","699999966","699999955","699999944","699999933","699999922","699999911"};
		float sal[]={1600.00f,1300.00f,1200.00f,1450.00f,1350.00f,1500.00f,1350.00f,1350.00f,1650.00f};
		int idb[]={1,2,2,3,3,3,4,4,5};
		try{
			DBconnect();
			pst=conn.prepareStatement("INSERT INTO empleado (ID_empleado,nombre,direccion,telefono,salario,ID_bar) VALUES (?,?,?,?,?,?);");
			for(int i=0; i<id.length; i++) {
				pst.setInt(1, id[i]);
				pst.setString(2, nom[i]);
				pst.setString(3, dir[i]);
				pst.setString(4, tfno[i]);
				pst.setFloat(5, sal[i]);
				pst.setInt(6, idb[i]);
				pst.executeUpdate();
			}
			pst.close();
			return true;
		}
		catch(SQLException es){
			System.err.println("Mensaje de error: "+es.getMessage());
			System.err.println("Codigo de error: "+es.getErrorCode());
			System.err.println("Estado SQL: "+es.getSQLState());
			return false;
		}
		catch(Exception e) {
			System.err.println("Error inesperado");
			return false;
		}
		finally {
			try {
				// Si no se han podido cerrar los recursos debido a la excepcion en una sentencia anterior, se intenta cerrarlos 
				if(pst!=null) pst.close();
			}
			catch(SQLException es){
				System.err.println("Mensaje de error: "+es.getMessage());
				System.err.println("Codigo de error: "+es.getErrorCode());
				System.err.println("Estado SQL: "+es.getSQLState());
			}
		}
	}
	
	public boolean loadGustos(String fileName) {
		PreparedStatement pst=null;
		try{
			DBconnect();
			ArrayList<Gusto> ar=readData(fileName);
			pst=conn.prepareStatement("INSERT INTO gusta (ID_socio,ID_cerveza,ID_bar) VALUES (?,?,?);");
			// Se realizaran las inserciones en una unica transaccion
			conn.setAutoCommit(false);
			for(Gusto g : ar){
				pst.setInt(1, g.getIdSocio());
				pst.setInt(2, g.getIdCerveza());
				pst.setInt(3, g.getIdBar());
				pst.executeUpdate();
			}
			// Aplicar cambios. Hacer efectivas todas las inserciones
			conn.commit();
			conn.setAutoCommit(true);
			pst.close();
			return true;
		}
		catch(SQLException es){
			try{
				System.err.println("Mensaje de error: "+es.getMessage());
				System.err.println("Codigo de error: "+es.getErrorCode());
				System.err.println("Estado SQL: "+es.getSQLState());
				// Si ha fallado una insercion, se deshacen los cambios y se vuelve al estado anterior con rollback
				conn.rollback();
				conn.setAutoCommit(true);
				return false;
			}
			catch(SQLException ex){
				System.err.println("Mensaje de error: "+es.getMessage());
				System.err.println("Codigo de error: "+es.getErrorCode());
				System.err.println("Estado SQL: "+es.getSQLState());
				return false;
			}
		}
		catch(Exception e) {
			System.err.println("Error inesperado");
			return false;
		}
		finally {
			try {
				// Si no se han podido cerrar los recursos debido a la excepcion en una sentencia anterior, se intenta cerrarlos 
				if(pst!=null) pst.close();
			}
			catch(SQLException es){
				System.err.println("Mensaje de error: "+es.getMessage());
				System.err.println("Codigo de error: "+es.getErrorCode());
				System.err.println("Estado SQL: "+es.getSQLState());
			}
		}
	}
	
	public ArrayList<Bar> getBarData() {
		ArrayList<Bar> data=new ArrayList<Bar>();
		Statement st=null;
		ResultSet rs=null;
		try{
			DBconnect();
			st=conn.createStatement();
			rs=st.executeQuery("SELECT * FROM bar;");
			// Si rs esta vacio, no hay bares. Se devuelve arraylist vacio
			if(!rs.next()) {
				return data;
			}
			// El puntero de rs vuelve al comienzo
			rs.beforeFirst();
			while(rs.next()){
				int id=rs.getInt("ID_bar");
				String nom=rs.getString("nombre");
				String dir=rs.getString("direccion");
				Bar x=new Bar(id,nom,dir);
				data.add(x);
			}
			rs.close();
			st.close();
			return data;
		}
		catch(SQLException es){
			System.err.println("Mensaje de error: "+es.getMessage());
			System.err.println("Codigo de error: "+es.getErrorCode());
			System.err.println("Estado SQL: "+es.getSQLState());
			return null;
		}
		catch(Exception e) {
			System.err.println("Error inesperado");
			return null;
		}
		finally {
			try {
				// Si no se han podido cerrar los recursos debido a la excepcion en una sentencia anterior, se intenta cerrarlos 
				if(rs!=null) rs.close();
				if(st!=null) st.close();
			}
			catch(SQLException es){
				System.err.println("Mensaje de error: "+es.getMessage());
				System.err.println("Codigo de error: "+es.getErrorCode());
				System.err.println("Estado SQL: "+es.getSQLState());
			}
		}
	}
	
	
	public ArrayList<Cerveza> getCervezasFabricante() {
		// Se guarda el par Nombre, ID_fabricante (ningun nombre es igual por tanto sera la clave)
		Map<String,Integer> fab=new HashMap<String,Integer>(); 
		ArrayList<Cerveza> cerv=new ArrayList<Cerveza>(); 
		Statement st=null;
		ResultSet rs=null;
		PreparedStatement pst=null;
		try {
			DBconnect();
			st=conn.createStatement();
			rs=st.executeQuery("SELECT * FROM fabricante;");
			// Si rs esta vacio, no hay bares. Se devuelve arraylist vacio
			if(!rs.next()) { 
				return cerv;
			}
			// El puntero de rs vuelve al comienzo
			rs.beforeFirst();
			while(rs.next()) {
				Integer idfa=rs.getInt("ID_fabricante");
				String nom=rs.getString("nombre");
				fab.put(nom,idfa);
			}
			// Se extrae la lista de nombres, se meten en un array y se imprimen junto a un indice
			Set<String> nombres=fab.keySet();
			String[] nmb=new String[fab.size()];
			int j=0;
			for(String n : nombres){
				nmb[j]=n;
				j++;
			}
			int index=0;
			for(int i=0; i<nmb.length; i++){
				index++;
				System.out.println(index+" - "+nmb[i]);
			}
			// Scanner no debe cerrarse, salta una excepcion (puede estar relacionado con que se usa en MainMenu, y al cerrarlo de alguna forma
			// conlleva a cerrar bruscamente el menu
			Scanner sc=new Scanner(System.in);
			int elegido=0;
			boolean correcto=false;
			while(!correcto) {
				System.out.println("Introduzca el indice del fabricante");
				elegido=sc.nextInt();
				if(elegido>0 && elegido<=nmb.length){
					correcto=true;
				}
				else {
					System.out.println("El fabricante no existe, vuelva a introducirlo");
				}
			}
			pst=conn.prepareStatement("SELECT * FROM cerveza WHERE ID_fabricante=?");
			// Se accede al ID_fabricante asignado al nombre elegido usando el map
			int id_f=fab.get(nmb[elegido-1]);
			rs.close();
			pst.setInt(1, id_f);
			rs=pst.executeQuery();
			// Si rs esta vacio, no hay bares. Se devuelve arraylist vacio
			if(!rs.next()) { 
				return cerv;
			}
			// El puntero de rs vuelve al comienzo
			rs.beforeFirst();
			while(rs.next()) {
				int id_cerveza=rs.getInt("ID_cerveza");
				String nombre=rs.getString("nombre");
				String caracteristicas=rs.getString("caracteristicas");
				int id_fabricante=rs.getInt("ID_fabricante");
				Cerveza cz=new Cerveza(id_cerveza,nombre,caracteristicas,id_fabricante);
				cerv.add(cz);
			}
			rs.close();
			st.close();
			return cerv;
		}
		catch(SQLException es){
			System.err.println("Mensaje de error: "+es.getMessage());
			System.err.println("Codigo de error: "+es.getErrorCode());
			System.err.println("Estado SQL: "+es.getSQLState());
			return null;
		}
		catch(Exception e) {
			System.err.println("Error inesperado");
			return null;
		}
		finally {
			try {
				// Si no se han podido cerrar los recursos debido a la excepcion en una sentencia anterior, se intenta cerrarlos
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(pst!=null) pst.close();
			}
			catch(SQLException es){
				System.err.println("Mensaje de error: "+es.getMessage());
				System.err.println("Codigo de error: "+es.getErrorCode());
				System.err.println("Estado SQL: "+es.getSQLState());
			}
		}
	}
	
	
	public ArrayList<Cerveza> getCervezasPopulares() {
		ArrayList<Cerveza> popus=new ArrayList<Cerveza>();
		Statement st=null;
		ResultSet rs=null;
		PreparedStatement pst=null;
		try {
			DBconnect();
			st=conn.createStatement();
			rs=st.executeQuery("SELECT COUNT(*) AS ncerv FROM (SELECT ID_cerveza FROM cerveza) AS cervs;");
			rs.next();
			int count=rs.getInt("ncerv");
			// Si hay 0 cervezas se devuelve arraylist vacio
			if(count==0) {
				return popus;
			}
			// Se aplica el 10%, usar el tipo "int" automaticamente trunca
			int limite=count/10;
			// Si el 10% al truncar es 0, se devuelve el arraylist vacio
			if(limite==0){
				return popus;
			}
			String SQL = "SELECT * FROM cerveza AS tab1 JOIN " + 
			"(SELECT ID_cerveza FROM (SELECT DISTINCT * FROM " + 
			"(SELECT ID_socio, ID_cerveza FROM gusta AS sinbar) AS res) AS finalsol " + 
			"GROUP BY ID_cerveza ORDER BY COUNT(*) DESC) AS tab2 ON tab1.ID_cerveza=tab2.ID_cerveza LIMIT ?;";
			
			pst=conn.prepareStatement(SQL);
			pst.setInt(1, limite);
			rs.close();
			rs=pst.executeQuery();
			while(rs.next()) {
				int idc=rs.getInt("ID_cerveza");
				String nom=rs.getString("nombre");
				String car=rs.getString("caracteristicas");
				int idf=rs.getInt("ID_fabricante");
				Cerveza cz=new Cerveza(idc,nom,car,idf);
				popus.add(cz);
			}
			rs.close();
			st.close();
			pst.close();
			return popus;
		}
		catch(SQLException es){
			System.err.println("Mensaje de error: "+es.getMessage());
			System.err.println("Codigo de error: "+es.getErrorCode());
			System.err.println("Estado SQL: "+es.getSQLState());
			return null;
		}
		catch(Exception e) {
			System.err.println("Error inesperado");
			return null;
		}
		finally {
			try {
				// Si no se han podido cerrar los recursos debido a la excepcion en una sentencia anterior, se intenta cerrarlos
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(pst!=null) pst.close();
			}
			catch(SQLException es){
				System.err.println("Mensaje de error: "+es.getMessage());
				System.err.println("Codigo de error: "+es.getErrorCode());
				System.err.println("Estado SQL: "+es.getSQLState());
			}
		}
	}
	
	public boolean addFotoColumn() {
		Statement st=null;
		try{
			DBconnect();
			st=conn.createStatement();
			st.executeUpdate("ALTER TABLE empleado ADD COLUMN foto LONGBLOB NULL AFTER ID_bar;");
			st.close();
			return true;
		}
		catch(SQLException es){
			System.err.println("Mensaje de error: "+es.getMessage());
			System.err.println("Codigo de error: "+es.getErrorCode());
			System.err.println("Estado SQL: "+es.getSQLState());
			return false;
		}
		catch(Exception e) {
			System.err.println("Error inesperado");
			return false;
		}
		finally {
			try {
				// Si no se han podido cerrar los recursos debido a la excepcion en una sentencia anterior, se intenta cerrarlos
				if(st!=null) st.close();
			}
			catch(SQLException es){
				System.err.println("Mensaje de error: "+es.getMessage());
				System.err.println("Codigo de error: "+es.getErrorCode());
				System.err.println("Estado SQL: "+es.getSQLState());
			}
		}
	}
	
	public boolean addEmpleadoFoto() {
		PreparedStatement pst=null;
		try{
			DBconnect();
			pst=conn.prepareStatement("INSERT INTO empleado (ID_empleado,nombre,direccion,telefono,salario,ID_bar,foto) VALUES (?,?,?,?,?,?,?)");
			File homer=new File("HomerSimpson.jpg");
			FileInputStream f=new FileInputStream(homer);
			pst.setInt(1, 10);
			pst.setString(2, "Homer Simpson");
			pst.setString(3, "742 Evergreen Terrace");
			pst.setString(4, null);
			pst.setFloat(5, 1500.00f);
			pst.setInt(6, 1);
			pst.setBinaryStream(7, f, (int)homer.length());
			pst.executeUpdate();
			pst.close();
			return true;
		}
		catch(SQLException es){
			System.err.println("Mensaje de error: "+es.getMessage());
			System.err.println("Codigo de error: "+es.getErrorCode());
			System.err.println("Estado SQL: "+es.getSQLState());
			return false;
		}
		catch(FileNotFoundException ef){
			System.err.println("No se encuentra 'HomerSimpson.jpg'");
			return false;
		}
		catch(Exception e) {
			System.err.println("Error inesperado");
			return false;
		}
		finally {
			try {
				// Si no se han podido cerrar los recursos debido a la excepcion en una sentencia anterior, se intenta cerrarlos
				if(pst!=null) pst.close();
			}
			catch(SQLException es){
				System.err.println("Mensaje de error: "+es.getMessage());
				System.err.println("Codigo de error: "+es.getErrorCode());
				System.err.println("Estado SQL: "+es.getSQLState());
			}
		}
	}
	
	
	
	
	/*
	 *  The private section of the code starts here. It is convenient to take
	 *  a glance to the code, but it is STRICTLY FORBIDDEN to modify any
	 *  part of the code bellow these lines.
	 *  
	 *  Aqu� comienza la parte "privada" del c�digo. Es conviniente echar
	 *  un vistazo al c�digo, pero est� ESTR�CTICAMENTE PROHIBIDO modificar
	 *  cualquier parte del c�digo bajo estas l�neas.
	 */
	
	private void mainMenu() {
		Scanner sc = new Scanner(System.in);
		char menuOption = 'a';
		
		// Main menu loop
		do {
			System.out.println("Escoja una opci�n: ");
			System.out.println("  1) Crear las tablas \"empleado\" y \"gusta\".");
			System.out.println("  2) Cargar datos de los empleados y los gustos.");
			System.out.println("  3) Listar los bares almacenados.");
			System.out.println("  4) Listar las cervezas de un fabricante.");
			System.out.println("  5) Listar las cervezas m�s populares.");
			System.out.println("  6) A�adir columna de foto a la tabla \"empleado\".");
			System.out.println("  7) A�adir un nuevo empleado con foto.");
			System.out.println("  0) Salir de la aplicaci�n.");
			
			// Read user's option and check that it is a valid option
			menuOption = 'a';
			do {
				String line = sc.nextLine();
				if (line.length()==1) {
					menuOption = line.charAt(0);
				}
				if (menuOption<'0' || menuOption>'7') {
					System.out.println("Opci�n incorrecta.");
				}
			} while (menuOption<'0' || menuOption>'7');
			
			ArrayList<Cerveza> cervezas;
			Cerveza c = new Cerveza();
			ArrayList<Bar> bars = getBarData();
			Bar b = new Bar();
			
			// Call a specific method depending on the option
			switch (menuOption) {
				case '1':
					System.out.println("Creando tabla \"empleado\"...");
					createTableEmpleado();
					System.out.println("Creando tabla \"gusta\"...");
					createTableGusta();
					break;
				case '2':
					System.out.println("Cargando datos de la tabla \"empleado\"...");
					loadEmpleados();
					System.out.println("Cargando datos de la tabla \"gusta\"...");
					loadGustos("gustos.csv");
					break;
				case '3':
					bars = getBarData();
					System.out.println(b.barsToString(bars)+'\n');
					break;
				case '4':
					cervezas = getCervezasFabricante();
					System.out.println(c.cervezasToString(cervezas)+'\n');
					break;
				case '5':
					cervezas = getCervezasPopulares();
					System.out.println(c.cervezasToString(cervezas)+'\n');
					break;
				case '6':
					System.out.println("A�adiendo columa \"foto\" en la tabla \"empleado\"...");
					addFotoColumn();
					break;
				case '7':
					System.out.println("A�adiendo un nuevo empleado con foto...");
					addEmpleadoFoto();
					break;
			}
			
			if (menuOption!='0')
				System.out.println("�Qu� m�s desea hacer?");
			else
				System.out.println("�Hasta pronto!");
		} while (menuOption!='0');
		
		sc.close();
	}
	
	private ArrayList<Gusto> readData(String fileName) {
		File f = new File(fileName);
		ArrayList<Gusto> result =  new ArrayList<Gusto>();
		
		try {
			Scanner sc_file = new Scanner(f);
			
			while(sc_file.hasNextLine()) {
				String[] fields = sc_file.nextLine().split(";");
				Gusto row = new Gusto(Integer.valueOf(fields[0]), Integer.valueOf(fields[1]), Integer.valueOf(fields[2]));
				result.add(row);
			}
			
			sc_file.close();
		} catch (Exception e) {
			System.err.println("Error al leer el fichero.");
		}
		
		return result;
	}
	
	
	static private class Bar {
		private int idBar;
		private String nombre;
		private String direccion;
		
		public Bar () {
			setIdBar(0);
			setNombre("");
			setDireccion("");
		}
		
		public Bar (int idBar, String nombre, String direccion) {
			setIdBar(idBar);
			setNombre(nombre);
			setDireccion(direccion);
		}

		public int getIdBar() {
			return idBar;
		}

		public void setIdBar(int idBar) {
			this.idBar = idBar;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		public String barsToString(ArrayList<Bar> bars) {
			String result = "Listado de bares: \n";
			if (bars != null)
				for (Bar bar: bars) {
					result = result + "  " + bar.idBar + " - " + bar.nombre + " - " + bar.direccion + "\n";
				}
			return result;
		}
	}
	
	static private class Cerveza {
		private int idCerveza;
		private String nombre;
		private String caracteristicas;
		private int idFabricante;
		
		public Cerveza() {
			setIdCerveza(0);
			setNombre("");
			setCaracteristicas("");
			setIdFabricante(0);
		}
		
		public Cerveza(int id, String n, String c, int idFabricante) {
			setIdCerveza(id);
			setNombre(n);
			setCaracteristicas(c);
			setIdFabricante(idFabricante);
		}

		public int getIdCerveza() {
			return idCerveza;
		}

		public void setIdCerveza(int idCerveza) {
			this.idCerveza = idCerveza;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCaracteristicas() {
			return caracteristicas;
		}

		public void setCaracteristicas(String caracteristicas) {
			this.caracteristicas = caracteristicas;
		}

		public int getIdFabricante() {
			return idFabricante;
		}

		public void setIdFabricante(int idFabricante) {
			this.idFabricante = idFabricante;
		}
		
		public String cervezasToString(ArrayList<Cerveza> cervezas) {
			String result = "Listado de cervezas: \n";
			if (cervezas != null)
				for (Cerveza c: cervezas) {
					result = result + "  " + c.idCerveza + " - " + c.nombre + " - " + c.caracteristicas + " - " + c.idFabricante + "\n";
				}
			return result;
		}
	}
	
	static private class Gusto {
		private int idSocio;
		private int idCerveza;
		private int idBar;
		
		public Gusto() {
			setIdSocio(0);
			setIdCerveza(0);
			setIdBar(0);
		}
		
		public Gusto(int socio, int cerveza, int bar) {
			setIdSocio(socio);
			setIdCerveza(cerveza);
			setIdBar(bar);
		}

		public int getIdSocio() {
			return idSocio;
		}

		public void setIdSocio(int socio) {
			idSocio = socio;
		}

		public int getIdCerveza() {
			return idCerveza;
		}

		public void setIdCerveza(int cerveza) {
			idCerveza = cerveza;
		}

		public int getIdBar() {
			return idBar;
		}

		public void setIdBar(int bar) {
			idBar = bar;
		}
	}

}
