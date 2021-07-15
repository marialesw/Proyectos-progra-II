package models.dao;

import java.util.ArrayList;

import models.Torneo;

public class ManagerTorneo {

	private ArrayList<Torneo> torneos;

	public ManagerTorneo() {
		torneos = new ArrayList<>();
	}

	public void addTorneo(Torneo torneo) {
		torneos.add(torneo);
	}

	public ArrayList<Torneo> getTorneo() {
		return new ArrayList<>(torneos);
	}
}
