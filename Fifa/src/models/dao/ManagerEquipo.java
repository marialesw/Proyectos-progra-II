package models.dao;

import java.util.ArrayList;

import models.Equipo;

public class ManagerEquipo {

	private ArrayList<Equipo> equipos;

	public ManagerEquipo() {
		equipos = new ArrayList<>();
	}

	public void addEquipo(Equipo equipo) {
		equipos.add(equipo);
	}

	public ArrayList<Equipo> getEquipo() {
		return new ArrayList<>(equipos);
	}
}
