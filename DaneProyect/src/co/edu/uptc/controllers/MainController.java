package co.edu.uptc.controllers;

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

public class MainController {

	private ControllerPersons controllerPersons;
	private MainWindow mainWindow;
	private List<Person> listPersons;
	private List<Familia> listFamily;
	private int number;
	private ControllerFamily controllerFamily;
	
	public MainController(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		number = 1;
		controllerPersons = new ControllerPersons(mainWindow);
		controllerFamily = new ControllerFamily(mainWindow);
	}
	
	public void createPerson(JDialogAddPerson jDialogAddPerson, String name, String lastName,TypeDocument typeDocument, 
			String numberDocument, Calendar dateOfBirth, NivelEducational nivelEducational,
			Profession profession, Gender gender){
		controllerPersons.agregarPersona(jDialogAddPerson, name, lastName, typeDocument, numberDocument, dateOfBirth, 
				nivelEducational, profession, gender);
		listPersons = controllerPersons.getListPersons();
		mainWindow.getjPanelRegister().getjPanelListaPersons().actualizarLista(listPersons);
	}
	
	public void createFamily(){
		int n = asignNumberFamily();
		listPersons = controllerPersons.getListPersons();
		controllerFamily.agregarFamily(listPersons, n);
		listFamily = controllerFamily.getListFamilias();
		mainWindow.getJpanelInit().getjPanelListFamilys().actualizarLista(listFamily);
		controllerPersons.createNewList();
		numberPopulation();
	}
	
	public int numberPersonsNivelEducativo(NivelEducational nivelEducational){
		int number = 0;
		for (int i = 0; i < listFamily.size(); i++) {
			List<Person> lista = listFamily.get(i).getListMembers();
			for (int j = 0; j < lista.size(); j++) {
				if (lista.get(j).getNivelEducational() == nivelEducational) {
					number ++;
				}
			}
		}
		return number;
	}
	
	public int numberPersonsRangosEdad(int n){
		int number = 0;
		for (int i = 0; i < listFamily.size(); i++) {
			List<Person> lista = listFamily.get(i).getListMembers();
			for (int j = 0; j < lista.size(); j++) {
				if (n == 1) {
					if (lista.get(j).calcularEdad() < 10 ) {
						number ++;
					}
				}else if (n == 2) {
					if (lista.get(j).calcularEdad() >= 10 && lista.get(j).calcularEdad() < 20) {
						number ++;
					}
				}else if (n == 3) {
					if (lista.get(j).calcularEdad() >= 20 && lista.get(j).calcularEdad() < 30) {
						number ++;
					}
				}else if (n == 4) {
					if (lista.get(j).calcularEdad() >= 30 && lista.get(j).calcularEdad() < 40) {
						number ++;
					}
				}else if (n == 5) {
					if (lista.get(j).calcularEdad() >= 40) {
						number ++;
					}
				}
			}
		}
		return number;
	}
	
	public int numberPersonsGender(Gender gender){
		int number = 0;
		for (int i = 0; i < listFamily.size(); i++) {
			List<Person> lista = listFamily.get(i).getListMembers();
			for (int j = 0; j < lista.size(); j++) {
				if (lista.get(j).getGender() == gender) {
					number ++;
				}
			}
		}
		return number;
	}
	
	public int numberPopulation(){
		int number = 0;
		for (int i = 0; i < listFamily.size(); i++) {
			List<Person> lista = listFamily.get(i).getListMembers();
			for (int j = 0; j < lista.size(); j++) {
					number ++;
			}
		}
		mainWindow.getJpanelInit().setJtxtPop(String.valueOf(number));
		return number;
	}
	
	public int asignNumberFamily(){
		return number ++;
	}
}
