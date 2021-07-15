package models.dao;

import java.util.ArrayList;

import models.Torn_Equipo;

public class ManagerTorn_Equipo {
	
	private ArrayList<Torn_Equipo> torn_equipos;

	public ManagerTorn_Equipo() {
		torn_equipos = new ArrayList<>();
	}

	public void addTorn_Equipo(Torn_Equipo torn_Equipo) {
		torn_equipos.add(torn_Equipo);
	}

	public ArrayList<Torn_Equipo> getTorn_Equipo() {
		return new ArrayList<>(torn_equipos);
	}
}
