package models.dao;

import java.util.ArrayList;

import models.Persona;

public class ManagerPerson {

	private ArrayList<Persona> personas;

	public ManagerPerson() {
		personas = new ArrayList<>();
	}

	public void addPerson(Persona persona) {
		personas.add(persona);
	}

	public ArrayList<Persona> getPerson() {
		return new ArrayList<>(personas);
	}
}
