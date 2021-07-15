package models;

public class Estadio {

	private int idEstadio;
	private int idLugar;
	private String nombreEstadio;
	private float capacidad;
	
	public Estadio(int idEstadio, int idLugar, String nombreEstadio, float capacidad) {
		super();
		this.idEstadio = idEstadio;
		this.idLugar = idLugar;
		this.nombreEstadio = nombreEstadio;
		this.capacidad = capacidad;
	}

	public int getIdEstadio() {
		return idEstadio;
	}

	public int getIdLugar() {
		return idLugar;
	}

	public String getNombreEstadio() {
		return nombreEstadio;
	}

	public float getCapacidad() {
		return capacidad;
	}
}
