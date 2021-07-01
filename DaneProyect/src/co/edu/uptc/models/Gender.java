package co.edu.uptc.models;

public enum Gender {
	
	MALE(1, "Masculino"),
	FEMALE(2, "Femenino"),
	OTHER(3, "Otro");
	
	 
	private Gender(int id, String name) {
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
