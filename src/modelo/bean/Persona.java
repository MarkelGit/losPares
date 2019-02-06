package modelo.bean;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected int idPersona;
	
	//----------------------------CONSTRUCTORES----------------------------
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String nombre, String apellido, int idPersona) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.idPersona = idPersona;
	}
	
	//----------------------------GETTERS & SETTERS----------------------------
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	//----------------------------FUNCIONES----------------------------
	
	/**
	 * Se implementa en la clase Usuario
	 * Esta funci�n recibir� el nombre y apellido de la persona
	 * y le asignara el nombre de usuario y contrase�a que la
	 * persona introduzca.
	 * @param nombre
	 * @param apellido
	 */
	public abstract void registrarse(String nombre, String apellido);
	
}
