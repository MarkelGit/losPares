package modelo.bean;

public class Usuario extends Persona{
	private int idusuario;
	private String nombreUsuario;
	private String email;
	private String contrase�a;
	private boolean activo;
	
	//----------------------------CONSTRUCTORES----------------------------
	
	public Usuario(String nombre, String apellido, int idPersona) {
		super(nombre, apellido, idPersona);
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nombre, String apellido, int idPersona, int idusuario, String nombreUsuario, String email,
			String contrase�a, boolean activo) {
		super(nombre, apellido, idPersona);
		this.idusuario = idusuario;
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.contrase�a = contrase�a;
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	//----------------------------FUNCIONES----------------------------
	
	/**
	 * Esta funci�n recibir� el nombre y apellido de la persona
	 * y le asignara el nombre de usuario y contrase�a que la
	 * persona introduzca.
	 * @param nombre
	 * @param apellido
	 */
	@Override
	public void registrarse(String nombre, String apellido) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Esta funci�n recibir� el nombre de usuario y la contrase�a
	 * y loguear� al usuario si los datos est�n en la BBDD.
	 * @param nombreUsuario
	 * @param contrase�a
	 */
	public void logIn(String nombreUsuario, String contrase�a) {
		
	}

}
