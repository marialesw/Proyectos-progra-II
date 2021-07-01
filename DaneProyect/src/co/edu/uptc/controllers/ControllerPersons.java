package co.edu.uptc.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import co.edu.uptc.models.Gender;
import co.edu.uptc.models.NivelEducational;
import co.edu.uptc.models.Person;
import co.edu.uptc.models.Profession;
import co.edu.uptc.models.TypeDocument;
import co.edu.uptc.views.JDialogAddPerson;
import co.edu.uptc.views.MainWindow;

public class ControllerPersons {

	private List<Person> listPerson;
	private Person person;
	
	
	public ControllerPersons(MainWindow mainWindow) {
		listPerson = new ArrayList<>();
	}
	
	public void agregarPersona(JDialogAddPerson jDialogAddPerson, String name, String lastName,TypeDocument typeDocument, 
			String numberDocument, Calendar dateOfBirth, NivelEducational nivelEducational,
			Profession profession, Gender gender) {
		person = new Person(name, lastName, typeDocument, numberDocument, dateOfBirth, nivelEducational, profession, gender);
		listPerson.add(person);
	}	
	
	@SuppressWarnings("unlikely-arg-type")
	public void deletePerson(int id) {
		listPerson.remove(id - 100);
	}
	
	public void imprimir() {
		for (int i = 0; i < listPerson.size(); i++) {
			System.out.println(listPerson.get(i));
		}
	}
	
	public List<Person> getListPersons() {
		return listPerson;
	}
	
	public void deleteList(){
		for (int i = 0; i < listPerson.size() + 1; i++) {
			listPerson.remove(i);
		}
	}

	public void setListPersons(List<Person> listPersons) {
		this.listPerson = listPersons;
	}

	public Person getProduct() {
		return person;
	}

	public void setProduct(Person person) {
		this.person = person;
	}

	public void editPerson(int i,String name, String lastName,TypeDocument typeDocument, 
			String numberDocument, Calendar dateOfBirth, NivelEducational nivelEducational,
			Profession profession, Gender gender){
		for (int j = 0; j < listPerson.size(); j++) {
			if (i == j) {
				listPerson.get(i).setName(name);;
				listPerson.get(i).setLastName(lastName);
				listPerson.get(i).setTypeDocument(typeDocument);
				listPerson.get(i).setNumberDocument(numberDocument);
				listPerson.get(i).setDateOfBirth(dateOfBirth);
				listPerson.get(i).setNivelEducational(nivelEducational);		
				listPerson.get(i).setProfession(profession);		
				listPerson.get(i).setGender(gender);	

			}
		}
	}

	public void createNewList() {
		this.listPerson = new ArrayList<>();		
	}
}
