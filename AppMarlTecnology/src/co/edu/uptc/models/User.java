package co.edu.uptc.models;

public class User {

	private String nameUser;
	private String pasword;
	private String name;
	private String lastName;
	private TypeDocument typeDocument;
	private String numberDocument;
	private int id;
	
	public User(String nameUser, String pasword, String name, String lastName, TypeDocument typeDocument,
			String numberDocument) {
		super();
		this.nameUser = nameUser;
		this.pasword = pasword;
		this.name = name;
		this.lastName = lastName;
		this.typeDocument = typeDocument;
		this.numberDocument = numberDocument;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public TypeDocument getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(TypeDocument typeDocument) {
		this.typeDocument = typeDocument;
	}

	public String getNumberDocument() {
		return numberDocument;
	}

	public void setNumberDocument(String numberDocument) {
		this.numberDocument = numberDocument;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
