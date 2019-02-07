package modelo.dao;

import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Usuario;

public class UsuarioModelo extends Conector {

	// ArrayList<Usuario> selectTodos = new ArrayList<Usuario>();

	UsuarioModelo() {
		super();
		// TODO Auto-generated constructor stub
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
		//INSERT INTO `usuario`(`idUsuario`, `username`(Rellenado), `contraseña`(Rellenado), `Email`(Rellenado), `activo`, `idRol`, `id_persona`) VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6],[value-7])
		return false;

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
