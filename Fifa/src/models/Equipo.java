package models;

public class Equipo {

	private int idEquipo;
	private int idLugar;
	private String nombreEquipo;
	private int añoFundacion;
	private char nivelEstrellas;
	
	public Equipo(int idEquipo, int idLugar, String nombreEquipo, int añoFundacion, char nivelEstrellas) {
		super();
		this.idEquipo = idEquipo;
		this.idLugar = idLugar;
		this.nombreEquipo = nombreEquipo;
		this.añoFundacion = añoFundacion;
		this.nivelEstrellas = nivelEstrellas;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public int getIdLugar() {
		return idLugar;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public int getAñoFundacion() {
		return añoFundacion;
	}

	public char getNivelEstrellas() {
		return nivelEstrellas;
	}
}
