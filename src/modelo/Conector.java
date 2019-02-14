package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import modelo.Config;
/**
 * Clase Conector realiza y contiene la conexion con la BBDD
 * @author Enaut Agirre
 *
 */
public class Conector {
	
	protected Connection conexion;

	protected Conector() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				this.conexion = DriverManager.getConnection("jdbc:mysql://" + Config.HOST + "/" + Config.BBDD + "?zeroDateTimeBehavior=convertToNull", Config.USERNAME, Config.PASSWORD );
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
}