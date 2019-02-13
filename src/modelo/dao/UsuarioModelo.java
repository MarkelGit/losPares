package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Usuario;

public class UsuarioModelo extends Conector {

	// ArrayList<Usuario> selectTodos = new ArrayList<Usuario>();

	public UsuarioModelo() {
		super();
	}

	/**
	 * seleccionar todos los usuarios y devolver un ArrayList
	 * 
	 * @return ArrayList<Usuario>
	 */
	public ArrayList<Usuario> selectTodos() {
		return null; 
	}

	/**
	 * añadir usuarios
	 * 
	 * @return boolean si se ha añadido o no
	 */

	public boolean insert(Usuario usuario) {
		//INSERT INTO `usuario`(`idUsuario`, `username`(Rellenado), `contrasena`(Rellenado), `Email`(Rellenado), `activo`, `idRol`, `id_persona`) VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6],[value-7])
		//TODO poner nombres de campos en minuscula. Quitar de todo el proyecto caracteres raros.
		String insert="INSERT INTO usuario( username, contrasena, Email) VALUES (?,?,?)";
		try {
			PreparedStatement pst = this.conexion.prepareStatement(insert);
			pst.setString(1, usuario.getNombreUsuario());
			pst.setString(2, usuario.getContrasena());
			pst.setString(3, usuario.getEmail());
			
			boolean ok = pst.execute();
			
			return ok;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * borrar un usuario
	 * 
	 * @return si se ha añadido o no
	 */
	public boolean delete(Usuario usuario) {

		return false;
	}
}
