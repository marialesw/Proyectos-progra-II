package models;

public class Equipo {

	private int idEquipo;
	private int idLugar;
	private String nombreEquipo;
	private int aņoFundacion;
	private char nivelEstrellas;
	
	public Equipo(int idEquipo, int idLugar, String nombreEquipo, int aņoFundacion, char nivelEstrellas) {
		super();
		this.idEquipo = idEquipo;
		this.idLugar = idLugar;
		this.nombreEquipo = nombreEquipo;
		this.aņoFundacion = aņoFundacion;
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

	public int getAņoFundacion() {
		return aņoFundacion;
	}

	public char getNivelEstrellas() {
		return nivelEstrellas;
	}
}
