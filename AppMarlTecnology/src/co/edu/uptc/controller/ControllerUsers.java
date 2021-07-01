package co.edu.uptc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import co.edu.uptc.models.TypeDocument;
import co.edu.uptc.models.User;
import co.edu.uptc.persistens.FileBinaryUsers;
import co.edu.uptc.views.Constants;

public class ControllerUsers {

	
	private List<User> listUsers;
	private User user;
	private int id;
	private FileBinaryUsers binaryUsers;
	
	
	public ControllerUsers() {
		listUsers = new ArrayList<>();
		id = 1000;
		binaryUsers = new FileBinaryUsers();
		try {
			testBinary();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void addUser(String nameUser, String password, String name, String lastName, TypeDocument typeDocument, String numberDocument) throws IOException {
		User user = new User(nameUser, password, name, lastName, typeDocument, numberDocument);
		this.id = (id + 1);
		user.setId(id);
		listUsers.add(user);
		binaryUsers.writeBinary(id, name, lastName, typeDocument, numberDocument, nameUser, password);
	}	
	
	@SuppressWarnings("unlikely-arg-type")
	public void deleteUser(int id) {
		listUsers.remove(id - 100);
	}
	
	private void testBinary() throws Exception {
		String dataConfig = "";
		String[] attribute = new String[7];
		List<String> dataBase = binaryUsers.readBinaryList();
		for (String string : dataBase) {
			dataConfig = configSeparator(string);
			attribute = dataConfig.split(Pattern.quote("?"));
			addUser(attribute);
		}
	}
	
	public TypeDocument  getEnum(String name){
		if (TypeDocument.CEDULA.getName() == name) {
			return TypeDocument.CEDULA;
		}else if (TypeDocument.CEDULA.getName() == name) {
			return TypeDocument.CONTRASENA;
		}else if (TypeDocument.TARGETA_IDENTIDAD.getName() == name) {
			return TypeDocument.TARGETA_IDENTIDAD;
		}
		return TypeDocument.TARGETA_EXTRANGERIA;
	}
	
	private void addUser(String[] attributes) {
		String id = attributes[0];
		String name = attributes[1];
		String lastName = attributes[2];
		String typeDocument = attributes[3];
		String numberDocument = attributes[4];
		String nameUser = attributes[5];
		String pasword = attributes[6];
		
		User user = new User(nameUser, pasword, name, lastName, getEnum(typeDocument), numberDocument);
		listUsers.add(user);
	}
	
	private String configSeparator(String caracter) {
		String auxString = "";
		for (int i = 0; i < caracter.length(); i++) {
			if (caracter.charAt(i) != Constants.CHARACTER) {
				auxString += caracter.charAt(i);
			} else if (i != caracter.length() - 1 && caracter.charAt(i + 1) != Constants.CHARACTER) {
				auxString += caracter.charAt(i);
			}
		}
		return auxString;
	}
	
	public boolean isNameUser(String nameUser){
		for (int i = 0; i < listUsers.size(); i++) {
			System.out.println(listUsers.get(i).getNameUser()) ;
			if (listUsers.get(i).getNameUser().equals(nameUser)) {
				return true;
			}
		}
		return false;
	}
	
	public void imprimir() {
		for (int i = 0; i < listUsers.size(); i++) {
			System.out.println(listUsers);
		}
	}
	
	public void readFile(){
		try {
			binaryUsers.readBinary();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void editUser(int i, String nameUser, String pasword, String name, String lastName, TypeDocument typeDocument, String numberDocument){
			listUsers.get(i).setId(user.getId());
			listUsers.get(i).setName(nameUser);
			listUsers.get(i).setPasword(pasword);
			listUsers.get(i).setName(name);
			listUsers.get(i).setLastName(lastName);
			listUsers.get(i).setTypeDocument(typeDocument);
			listUsers.get(i).setNumberDocument(numberDocument);
	}


	public List<User> getListUsers() {
		return listUsers;
	}


	public void setListUsers(List<User> listUsers) {
		this.listUsers = listUsers;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public FileBinaryUsers getBinaryUsers() {
		return binaryUsers;
	}


	public void setBinaryUsers(FileBinaryUsers binaryUsers) {
		this.binaryUsers = binaryUsers;
	}
}
