package models;

import java.util.Date;

public class Jornada {

	private int idJornada;
	private String nombreTorneo;
	private Date fechaJornada;
	
	public Jornada(int idJornada, String nombreTorneo, Date fechaJornada) {
		super();
		this.idJornada = idJornada;
		this.nombreTorneo = nombreTorneo;
		this.fechaJornada = fechaJornada;
	}

	public int getIdJornada() {
		return idJornada;
	}

	public String getNombreTorneo() {
		return nombreTorneo;
	}

	public Date getFechaJornada() {
		return fechaJornada;
	}
}
