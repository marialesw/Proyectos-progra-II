package models;

public class Equipo {

	private int idEquipo;
	private int idLugar;
	private String nombreEquipo;
	private int a�oFundacion;
	private char nivelEstrellas;
	
	public Equipo(int idEquipo, int idLugar, String nombreEquipo, int a�oFundacion, char nivelEstrellas) {
		super();
		this.idEquipo = idEquipo;
		this.idLugar = idLugar;
		this.nombreEquipo = nombreEquipo;
		this.a�oFundacion = a�oFundacion;
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

	public int getA�oFundacion() {
		return a�oFundacion;
	}

	public char getNivelEstrellas() {
		return nivelEstrellas;
	}
}
