package models;

import java.util.Date;

public class Torn_Equipo {

	private String nombreTorneo;
	private int idEquipo;
	private Date fechaTorneo;
	
	public Torn_Equipo(String nombreTorneo, int idEquipo, Date fechaTorneo) {
		super();
		this.nombreTorneo = nombreTorneo;
		this.idEquipo = idEquipo;
		this.fechaTorneo = fechaTorneo;
	}

	public String getNombreTorneo() {
		return nombreTorneo;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public Date getFechaTorneo() {
		return fechaTorneo;
	}
}