package capaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	// Conexión a base de datos
	private static Connection conectarA(String ruta) {
		try {
			// Cargamos el driver de SQLITE
			Class.forName("org.sqlite.JDBC");
		}
		catch (ClassNotFoundException e){
			// Si se produce un error con el driver de la BD
			e.printStackTrace();
		}
		
		// Declaramos la conexión
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:sqlite:" + ruta);
			// Escribimos mensaje en la consola para saber si
			// la conexión se realizó y donde está el archivo
			System.out.println("Conexión Ok - Ruta: " + ruta);						
		}
		catch (SQLException e) {
			// Se ha producido un error en la BD
			e.printStackTrace();
		}
		
		//Devolvemos la conexión
		return conn;
	}
	
	public static void main(String[] args) {
		// Pasamos una ruta a la que nos vamos a conectar
		Connection conn = conectarA("DatabaseProtectora/DatabaseProtectora.db");
		
		// Cerramos la conexión
		try {
			conn.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
