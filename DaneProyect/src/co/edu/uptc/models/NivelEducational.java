package co.edu.uptc.models;

public enum NivelEducational {

	PRIMARIA(1, "Primaria"),
	SECUNDARIA(2, "Secundaria"),
	TECNICO(3, "Tecnico"),
	TECNOLOGO(4, "Tecnologo"),
	PROFESIONAL(5, "Profesional"),
	MAESTRIA(6, "Maestria"),
	DOCTORADO(7, "Doctorado");

	private NivelEducational(int id, String name) {
		this.id = id;
		this.name = name;
	}
	private int id;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
