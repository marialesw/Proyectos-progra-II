package models;

import java.sql.Time;
import java.util.Date;

public class Partido {

	private int idPartido;
	private int idEquipoVisitante;
	private int idEquipoLocal;
	private int idJornada;
	private int idEstadio;
	private Date fechaPartido;
	private Time horaPartido;
	private int golesVisitante;
	private int golesLocal;
	
	public Partido(int idPartido, int idEquipoVisitante, int idEquipoLocal, int idJornada, int idEstadio,
			Date fechaPartido, Time horaPartido, int golesVisitante, int golesLocal) {
		super();
		this.idPartido = idPartido;
		this.idEquipoVisitante = idEquipoVisitante;
		this.idEquipoLocal = idEquipoLocal;
		this.idJornada = idJornada;
		this.idEstadio = idEstadio;
		this.fechaPartido = fechaPartido;
		this.horaPartido = horaPartido;
		this.golesVisitante = golesVisitante;
		this.golesLocal = golesLocal;
	}

	public int getIdPartido() {
		return idPartido;
	}

	public int getIdEquipoVisitante() {
		return idEquipoVisitante;
	}

	public int getIdEquipoLocal() {
		return idEquipoLocal;
	}

	public int getIdJornada() {
		return idJornada;
	}

	public int getIdEstadio() {
		return idEstadio;
	}

	public Date getFechaPartido() {
		return fechaPartido;
	}

	public Time getHoraPartido() {
		return horaPartido;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}
}
