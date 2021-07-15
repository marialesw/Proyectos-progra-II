package models.dao;

import java.util.ArrayList;

import models.Part_Jug;


public class ManagerPart_Jug {

	private ArrayList<Part_Jug> partidosJugados;

	public ManagerPart_Jug() {
		partidosJugados = new ArrayList<>();
	}

	public void addPart_Jug(Part_Jug part_jug) {
		partidosJugados.add(part_jug);
	}

	public ArrayList<Part_Jug> getPart_Jug() {
		return new ArrayList<>(partidosJugados);
	}
}
