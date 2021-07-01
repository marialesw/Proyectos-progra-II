package co.edu.uptc.models;

import java.util.List;

public class Familia {

	private List<Person> listMembers;
	private int number;
	
	public Familia(List<Person> listMembers, int number) {
		super();
		this.listMembers = listMembers;
		this.number = number;
	}

	public List<Person> getListMembers() {
		return listMembers;
	}

	public void setListMembers(List<Person> listMembers) {
		this.listMembers = listMembers;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Familia N°" + number;
	}
}
