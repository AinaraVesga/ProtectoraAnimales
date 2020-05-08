package capaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DatosUsuarios {
	
	private Connection conn;
	
	public DatosUsuarios() {
		this.conn = Conexion.conectar();
	}
	
	public ResultSet CmdComprobarUsuario(String usuario, String pw) {
		ResultSet resUsuario = null;
		try {
			Statement enunciado = conn.createStatement();
						
			resUsuario = enunciado.executeQuery("SELECT *"
					+ "FROM USUARIOS"
					+ "WHERE NOMBRE = " + usuario + "AND"
							+ "PW = " + pw);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return resUsuario;		
	}

}
