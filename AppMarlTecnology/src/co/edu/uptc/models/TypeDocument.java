package co.edu.uptc.models;

public enum TypeDocument {

	CEDULA(1, "Cedula de ciudadania"),
	CONTRASENA(2, "Contrase�a"),
	TARGETA_IDENTIDAD(3, "Targeta de Identidad"),
	TARGETA_EXTRANGERIA(4, "Targeta de Extranger�a");
	
	 
	private TypeDocument(int id, String name) {
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
