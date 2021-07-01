package co.edu.uptc.models;

public enum Category {

	CELULARES(1, "Celulares y Tablets"),
	AUDIOVISUALES(2, "Audiovisuales"),
	COMPUTACION(3, "Computacion"),
	VIDEOJUEGOS(4, "VideoJuegos");
	
	 
	private Category(int id, String name) {
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
