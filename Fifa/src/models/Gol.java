package models;

import java.sql.Time;

public class Gol {

	private int idPartido;
	private int idPersona;
	private Time tiempoGol;
	
	public Gol(int idPartido, int idPersona, Time tiempoGol) {
		super();
		this.idPartido = idPartido;
		this.idPersona = idPersona;
		this.tiempoGol = tiempoGol;
	}

	public int getIdPartido() {
		return idPartido;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public Time getTiempoGol() {
		return tiempoGol;
	}
}
