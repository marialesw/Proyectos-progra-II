package models.dao;

import java.util.ArrayList;
import models.Posicion;

public class ManagerPosicion {

private ArrayList<Posicion> posiciones;
	
	public ManagerPosicion() {
		posiciones = new ArrayList<>();
	}
	
	public void addPosicion(Posicion jornada) {
		posiciones.add(jornada);
	}
	
	public ArrayList<Posicion> getPosicion() {
		return new ArrayList<>(posiciones);
	}
}
