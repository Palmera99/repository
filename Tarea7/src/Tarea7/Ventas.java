package Tarea7;

//clase
public class Ventas {
	private Vendedor rut;
	private int cantidad;
	private Galleta precio;

	public Ventas(Vendedor rut, int cantidad, Galleta precio) {
		this.setRut(rut);
		this.setCantidad(cantidad);
		this.setPrecio(precio);
	}

	public float total(Galleta galleta) {
		int var1 = cantidad;
		float resultado = galleta.getPrecio() * var1;
		return resultado;
	}

	/**
	 * @return the rut
	 */
	public Vendedor getRut() {
		return rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(Vendedor rut) {
		this.rut = rut;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the precio
	 */
	public Galleta getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Galleta precio) {
		this.precio = precio;
	}

}
