package Tarea7;

public class Galleta {
	private String TipoGalleta;
	private float precio;
	
	public Galleta(String TipoGalleta, float precio) {
		this.setPrecio(precio);
		this.setTipoGalleta(TipoGalleta);
	}

	/**
	 * @return the tipoGalleta
	 */
	public String getTipoGalleta() {
		return TipoGalleta;
	}

	/**
	 * @param tipoGalleta the tipoGalleta to set
	 */
	public void setTipoGalleta(String tipoGalleta) {
		TipoGalleta = tipoGalleta;
	}

	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
