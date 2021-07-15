package models.dao;

import java.util.ArrayList;

import models.Part_Arb;

public class ManagerPart_Arb {

	private ArrayList<Part_Arb> partidosArb;

	public ManagerPart_Arb() {
		partidosArb = new ArrayList<>();
	}

	public void addPart_Arb(Part_Arb part_arb) {
		partidosArb.add(part_arb);
	}

	public ArrayList<Part_Arb> getPart_Arb() {
		return new ArrayList<>(partidosArb);
	}
}
