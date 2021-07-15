package models;

public class Lugar {

	private int idLugar;
	private int ubicacion;
	private String nombreLugar;
	private TipoLugar tipoLugar;
	private String nacionalidad;
	
	public Lugar(int idLugar, int ubicacion, String nombreLugar, TipoLugar tipoLugar, String nacionalidad) {
		super();
		this.idLugar = idLugar;
		this.ubicacion = ubicacion;
		this.nombreLugar = nombreLugar;
		this.tipoLugar = tipoLugar;
		this.nacionalidad = nacionalidad;
	}

	public int getIdLugar() {
		return idLugar;
	}

	public int getUbicacion() {
		return ubicacion;
	}

	public String getNombreLugar() {
		return nombreLugar;
	}

	public TipoLugar getTipoLugar() {
		return tipoLugar;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}
}
