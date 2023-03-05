package Tarea7;

// Clase heredada de Persona
public class Vendedor extends Persona {

	public Vendedor(int rut, String Nombre, String apellido, String direccion, int movil, String correo) {
		super(Nombre, apellido, direccion, movil, correo);
		// TODO Auto-generated constructor stub
		this.rut = rut;
		this.SueldoBase = 400000;
	}

	// atributos de Vendedor
	private int rut;
	private float SueldoBase = 400000;

	// accesores y mutadores
	/**
	 * @return de rut
	 */
	public int getRut() {
		return rut;
	}

	/**
	 * @param rut de rut a set
	 */
	public void setRut(int rut) {
		this.rut = rut;
	}

	/**
	 * @return de sueldoBase
	 */
	public float getSueldoBase() {
		return SueldoBase;
	}

	/**
	 * @param sueldoBase de sueldoBase a set
	 */
	public void setSueldoBase(float sueldoBase) {
		SueldoBase = sueldoBase;
	}

}
