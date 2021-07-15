package models.dao;

import java.util.ArrayList;

import models.Lugar;

public class ManagerLugar {

	private ArrayList<Lugar> lugares;
	
	public ManagerLugar() {
		lugares = new ArrayList<>();
	}
	
	public void addLugar(Lugar lugar) {
		lugares.add(lugar);
	}
	
	public ArrayList<Lugar> getLugares() {
		return new ArrayList<>(lugares);
	}
}
