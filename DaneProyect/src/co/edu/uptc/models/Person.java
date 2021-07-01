package co.edu.uptc.models;


import java.util.Calendar;

public class Person {

	private String name;
	private String lastName;
	private TypeDocument typeDocument;
	private String numberDocument;
	private Calendar dateOfBirth;
	private NivelEducational nivelEducational;
	private Profession profession;
	private Gender gender;
	
	public Person(String name, String lastName, TypeDocument typeDocument, String numberDocument, Calendar dateOfBirth,
			NivelEducational nivelEducational, Profession profession, Gender gender) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.typeDocument = typeDocument;
		this.numberDocument = numberDocument;
		this.dateOfBirth = dateOfBirth;
		this.nivelEducational = nivelEducational;
		this.profession = profession;
		this.gender = gender;
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

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public NivelEducational getNivelEducational() {
		return nivelEducational;
	}

	public void setNivelEducational(NivelEducational nivelEducational) {
		this.nivelEducational = nivelEducational;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}	
	
	public int calcularEdad() {
		Calendar today = Calendar.getInstance();
		
		int diff_year = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
		int diff_month =  today.get(Calendar.MONTH) - dateOfBirth.get(Calendar.MONTH);
		int diff_day =  today.get(Calendar.DAY_OF_MONTH) - dateOfBirth.get(Calendar.DAY_OF_MONTH);
		
		if (diff_month < 0 || (diff_month == 0 && diff_day < 0)) {
			diff_year = diff_year - 1;
		}
		return diff_year;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nombres: ");
		builder.append(name);
		builder.append(", ");
		builder.append("Apellidos: ");
		builder.append(lastName);
		builder.append(", ");
		builder.append("Género: ");
		builder.append(gender);
		builder.append("\n");
		
		return builder.toString();
	}
}

