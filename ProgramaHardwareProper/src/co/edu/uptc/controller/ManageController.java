package co.edu.uptc.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.models.Hardware;

public class ManageController {

	private List<Hardware> listHardware;
	private Hardware hardware;

	public ManageController() {
		listHardware = new ArrayList<>();
	}
	
	public void addHard(String id, String name, String description, Integer cantidad,  short unitPrice) {
		Hardware hardware = new Hardware(id, name, description,cantidad, unitPrice);
		listHardware.add(hardware);
	}
	
	public void deleteHar(String id) {
		listHardware.remove(id);
	}

	
	public void imprimir() {
		for (int i = 0; i < listHardware.size(); i++) {
			System.out.println(listHardware);
		}
	}
	
	
}
