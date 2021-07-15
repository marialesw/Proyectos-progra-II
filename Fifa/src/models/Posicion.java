package models;

public class Posicion {
	
	private int idPosicion;
	private String nombrePosicion;
	
	public Posicion(int idPosicion, String nombrePosicion) {
		super();
		this.idPosicion = idPosicion;
		this.nombrePosicion = nombrePosicion;
	}

	public int getIdPosicion() {
		return idPosicion;
	}
	
	public String getNombrePosicion() {
		return nombrePosicion;
	}
}
