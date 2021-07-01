package co.edu.uptc.controller;

import java.util.List;

import co.edu.uptc.models.Product;
import co.edu.uptc.models.User;
import co.edu.uptc.persistens.FileBinaryUsers;
import co.edu.uptc.views.MainWindow;

public class MainController {

	public static final String USER_ADMINISTRADOR = "MARIA";
	public static final String PASSWORD_ADMINISTRADOR = "3729C";
	private ControllerUsers controllerUsers;
	private ControllerProducts controllerProducts;
	private MainWindow mainWindow;
	private ControllerVentas controllerVentas;
	
	public MainController(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		controllerUsers = new ControllerUsers();
		controllerProducts = new ControllerProducts(mainWindow);
		controllerVentas = new ControllerVentas(mainWindow);
	}
	
	public boolean verificarCuentaAdministrador(String user, String password){
		return (user.equals(USER_ADMINISTRADOR) && password.equals(PASSWORD_ADMINISTRADOR));	
	}
	
	public boolean verificarCuentaUsuario(String user, String password){
		List<User> list = controllerUsers.getListUsers();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNameUser().equals(user) && list.get(i).getPasword().equals(password)) {
				return true;
			}
		}
		return false;	
	}

	public ControllerUsers getControllerUsers() {
		return controllerUsers;
	}

	public void setControllerUsers(ControllerUsers controllerUsers) {
		this.controllerUsers = controllerUsers;
	}

	public MainWindow getMainWindow() {
		return mainWindow;
	}

	public ControllerVentas getControllerVentas() {
		return controllerVentas;
	}

	public void setControllerVentas(ControllerVentas controllerVentas) {
		this.controllerVentas = controllerVentas;
	}

	public void setMainWindow(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}

	public static String getUserAdministrador() {
		return USER_ADMINISTRADOR;
	}

	public static String getPasswordAdministrador() {
		return PASSWORD_ADMINISTRADOR;
	}

	public ControllerProducts getControllerProducts() {
		return controllerProducts;
	}

	public void setControllerProducts(ControllerProducts controllerProducts) {
		this.controllerProducts = controllerProducts;
	}
}
