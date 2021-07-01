package co.edu.uptc.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import co.edu.uptc.models.Familia;
import co.edu.uptc.models.Gender;
import co.edu.uptc.models.NivelEducational;
import co.edu.uptc.models.Person;
import co.edu.uptc.models.Profession;
import co.edu.uptc.models.TypeDocument;
import co.edu.uptc.views.JDialogAddPerson;
import co.edu.uptc.views.MainWindow;

public class ControllerFamily {

	private List<Familia> listFamilys;
	private Familia familia;
	
	
	public ControllerFamily(MainWindow mainWindow) {
		listFamilys = new ArrayList<>();
	}
	
	public void agregarFamily(List<Person> listMembers, int number) {
		familia = new Familia(listMembers, number);
		listFamilys.add(familia);
	}	
	
	@SuppressWarnings("unlikely-arg-type")
	public void deleteFamily(int id) {
		listFamilys.remove(id);
	}
	
	public void imprimir() {
		for (int i = 0; i < listFamilys.size(); i++) {
			System.out.println(listFamilys.get(i));
		}
	}
	
	public List<Familia> getListFamilias() {
		return listFamilys;
	}

	public void setListProduct(List<Familia> listPersons) {
		this.listFamilys = listPersons;
	}

	public Familia getProduct() {
		return familia;
	}

	public void setProduct(Familia person) {
		this.familia = person;
	}

	public void editFamily(List<Person> listMembers, int i){
		for (int j = 0; j < listFamilys.size(); j++) {
			if (i == j) {
				listFamilys.get(i).setListMembers(listMembers);
			}
		}
	}
}
