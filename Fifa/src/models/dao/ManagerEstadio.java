package models.dao;

import java.util.ArrayList;

import models.Estadio;

public class ManagerEstadio {

private ArrayList<Estadio> estadios;
	
	public ManagerEstadio() {
		estadios = new ArrayList<>();
	}
	
	public void addEstadio(Estadio estadio) {
		estadios.add(estadio);
	}
	
	public ArrayList<Estadio> getEstadios() {
		return new ArrayList<>(estadios);
	}
}
