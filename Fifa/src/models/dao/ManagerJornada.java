package models.dao;

import java.util.ArrayList;
import models.Jornada;

public class ManagerJornada {

private ArrayList<Jornada> jornadas;
	
	public ManagerJornada() {
		jornadas = new ArrayList<>();
	}
	
	public void addJornada(Jornada jornada) {
		jornadas.add(jornada);
	}
	
	public ArrayList<Jornada> getJornada() {
		return new ArrayList<>(jornadas);
	}
}