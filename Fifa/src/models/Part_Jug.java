package models;

import java.sql.Time;

public class Part_Jug {

	private int idPersona;
	private int idPartido;
	private int idPosicion;
	private Time tiempoEntrada;
	private Time tiempoSalida;
	private Infraccion infraccion;
	
	public Part_Jug(int idPersona, int idPartido, int idPosicion, Time tiempoEntrada, Time tiempoSalida,
			Infraccion infraccion) {
		super();
		this.idPersona = idPersona;
		this.idPartido = idPartido;
		this.idPosicion = idPosicion;
		this.tiempoEntrada = tiempoEntrada;
		this.tiempoSalida = tiempoSalida;
		this.infraccion = infraccion;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public int getIdPartido() {
		return idPartido;
	}

	public int getIdPosicion() {
		return idPosicion;
	}

	public Time getTiempoEntrada() {
		return tiempoEntrada;
	}

	public Time getTiempoSalida() {
		return tiempoSalida;
	}

	public Infraccion getInfraccion() {
		return infraccion;
	}
}
