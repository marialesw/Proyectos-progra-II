package models.dao;

import java.util.ArrayList;
import models.Gol;

public class ManagerGoles {

	private ArrayList<Gol> goles;

	public ManagerGoles() {
		goles = new ArrayList<>();
	}

	public void addGol(Gol gol) {
		goles.add(gol);
	}

	public ArrayList<Gol> getGoles() {
		return new ArrayList<>(goles);
	}
}
