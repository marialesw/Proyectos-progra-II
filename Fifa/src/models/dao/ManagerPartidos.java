package models.dao;

import java.util.ArrayList;

import models.Partido;

public class ManagerPartidos {

	private ArrayList<Partido> partidos;

	public ManagerPartidos() {
		partidos = new ArrayList<>();
	}

	public void addPartidos(Partido partido) {
		partidos.add(partido);
	}

	public ArrayList<Partido> getPartido() {
		return new ArrayList<>(partidos);
	}
}
