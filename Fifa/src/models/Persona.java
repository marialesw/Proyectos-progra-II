package models;

import java.util.Date;

public class Persona {

	private int idPersona;
	private int idEquipo;
	private int idLugar;
	private int idPosicion;
	private String nombrePersona;
	private TipoPersona tipoPersona;
	private Date fechaNacimiento;
	private String imagen;
	
	public Persona(int idPersona, int idEquipo, int idLugar, int idPosicion, String nombrePersona,
			TipoPersona tipoPersona, Date fechaNacimiento, String imagen) {
		super();
		this.idPersona = idPersona;
		this.idEquipo = idEquipo;
		this.idLugar = idLugar;
		this.idPosicion = idPosicion;
		this.nombrePersona = nombrePersona;
		this.tipoPersona = tipoPersona;
		this.fechaNacimiento = fechaNacimiento;
		this.imagen = imagen;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public int getIdLugar() {
		return idLugar;
	}

	public int getIdPosicion() {
		return idPosicion;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public TipoPersona getTipoPersona() {
		return tipoPersona;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getImagen() {
		return imagen;
	}
}
