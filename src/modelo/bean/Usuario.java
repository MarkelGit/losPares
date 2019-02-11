package modelo.bean;

public class Usuario extends Persona{
	private int idusuario;
	private String nombreUsuario;
	private String email;
	private String contrasena;
	private boolean activo;
	
	//----------------------------CONSTRUCTORES----------------------------
	
	public Usuario(String nombre, String apellido, int idPersona) {
		super(nombre, apellido, idPersona);
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nombre, String apellido, int idPersona, int idusuario, String nombreUsuario, String email,
			String contrasena, boolean activo) {
		super(nombre, apellido, idPersona);
		this.idusuario = idusuario;
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.contrasena = contrasena;
		this.activo = activo;
	}

	//----------------------------GETTERS & SETTERS----------------------------
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	//----------------------------FUNCIONES----------------------------
	
	/**
	 * Esta función recibirá el nombre y apellido de la persona
	 * y le asignara el nombre de usuario y contraseña que la
	 * persona introduzca.
	 * @param nombre
	 * @param apellido
	 */
	@Override
	public void registrarse(String nombre, String apellido) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Esta función recibirá el nombre de usuario y la contraseña
	 * y logueará al usuario si los datos están en la BBDD.
	 * @param nombreUsuario
	 * @param contraseña
	 */
	public void logIn(String nombreUsuario, String contrasena) {
		
	}

}
