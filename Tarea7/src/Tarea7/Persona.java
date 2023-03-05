package Tarea7;
//clase padre de vendedor
public class Persona {
	// atributos
	private String Nombre;
	private String apellido;
	private String direccion;
	private int movil;
	private String correo;

	// constructor
	public Persona(String Nombre, String apellido, String direccion, int movil, String correo) {
		this.setNombre(Nombre);
		this.setApellido(apellido);
		this.setDireccion(direccion);
		this.setMovil(movil);
		this.setCorreo(correo);
	}
	
	//accesadores y mutadores

	/**
	 * @return de nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre de nombre a set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return de apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido de apellido a set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return de direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion de direccion a set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return de movil
	 */
	public int getMovil() {
		return movil;
	}

	/**
	 * @param movil de movil a set
	 */
	public void setMovil(int movil) {
		this.movil = movil;
	}

	/**
	 * @return de correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo de correo a set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
