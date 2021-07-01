package co.edu.uptc.views;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.rmi.Remote;

import javax.swing.JOptionPane;

import co.edu.uptc.models.TypeDocument;
import co.edu.uptc.utilities.Utillidades;

public class Events implements ActionListener{
	
	private MainWindow jfMainWindow;
	private int aux;
	private Utillidades utillidades;
	private String nameUser;
	private String password;
	private String name;
	private String lastName;
	private TypeDocument typeDocument;
	private String numberDocument;
	private int id;

	public Events(MainWindow jfMainWindow) {
		this.jfMainWindow = jfMainWindow;
		utillidades = new Utillidades();
	}
	
	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		switch (action) {
		case Constants.BUTTON_INIT_SESION_ADMINISTRADOR:
			jfMainWindow.remove(jfMainWindow.getjPanelInit());
			jfMainWindow.createPanelLoginAdmin();
			break;
		case Constants.BUTTON_INIT_SESION_USER:
			jfMainWindow.remove(jfMainWindow.getjPanelInit());
			jfMainWindow.createPanelLogin();
			break;
		case Constants.T_MENU_CATEGORIES:
			System.out.println("CATEEEE");
			jfMainWindow.getjPanelUsers().remove(jfMainWindow.getjPanelUsers().getCelularesYTablets());
			//jfMainWindow.getjPanelUsers().crearPanelCategorias();
			break;
		case Constants.T_MENU_CANASTA:
			System.out.println("gsh");
			jfMainWindow.getjPanelUsers().mostrarDialogo(2);
			jfMainWindow.getjPanelUsers().generarCanasta(e);
			break;
		case Constants.LABEL_INIT_ADMIN:
			String user = jfMainWindow.getjPanelLoginAdmin().obtenerUsuario();
			String pasword = jfMainWindow.getjPanelLoginAdmin().obtenerContrasena();
			if (user != null && pasword != null) {
				if (jfMainWindow.getController().verificarCuentaAdministrador(user, pasword)) {
					jfMainWindow.remove(jfMainWindow.getjPanelLoginAdmin());
					jfMainWindow.createPanelAdministrator();
					jfMainWindow.setLocationRelativeTo(null);
				}else {
					utillidades.showMessageError("Usuario o Contrase�a incorrectos", "Error");
				}
				jfMainWindow.getjPanelLoginAdmin().limpiarCampos();
			}
			break;
		case Constants.LABEL_INIT_USER:
			String user1 = jfMainWindow.getjPanelLogin().obtenerUsuario();
			String pasword1 = jfMainWindow.getjPanelLogin().obtenerContrasena();
			if (user1 != null && pasword1 != null) {
				if (jfMainWindow.getController().verificarCuentaUsuario(user1, pasword1)) {
					jfMainWindow.remove(jfMainWindow.getjPanelLogin());
					jfMainWindow.createPanelUsuarios();
					jfMainWindow.setLocationRelativeTo(null);
				}else {
					utillidades.showMessageError("Usuario o Contrase�a incorrectos", "Error");
				}
				jfMainWindow.getjPanelLogin().limpiarCampos();
			}
			break;
		case Constants.BUTTON_REGISTER:
			jfMainWindow.remove(jfMainWindow.getjPanelLogin());
			jfMainWindow.createPanelCreateUser();
			break;
		case Constants.BUTTON_CANCEL:
			jfMainWindow.remove(jfMainWindow.getjPanelCreateUser());
			jfMainWindow.createPanelLogin();
			break;
		case Constants.T_LABEL_VOLVER:
			if (jfMainWindow.getjPanelLogin().isEnabled()) {
				jfMainWindow.remove(jfMainWindow.getjPanelLogin());
			}else{
				jfMainWindow.remove(jfMainWindow.getjPanelLoginAdmin());	
			}
			jfMainWindow.createPanelInit();
			break;
		case Constants.T_MENU_CERRAR:
			jfMainWindow.remove(jfMainWindow.getjPanelUsers());
			jfMainWindow.setSize(new Dimension(650, 710));
			jfMainWindow.setLocationRelativeTo(null);
			jfMainWindow.repaint();
			jfMainWindow.createPanelInit();
			break;
		case Constants.BUTTON_CREATE_ACCOINT:
			try {
				createAccoint();
				jfMainWindow.getController().getControllerUsers().readFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			break;
		case Constants.BUTTON_ADMIN_PRODUCTS:
			jfMainWindow.getJpanelAdministrador().remove(jfMainWindow.getJpanelAdministrador().getjPanelAdminCenter());
			jfMainWindow.getJpanelAdministrador().createJpanelAdminProductos();
			jfMainWindow.getController().getControllerProducts().actualizeList();
			break;
		case Constants.T_MENU_INIT:
			jfMainWindow.getJpanelAdministrador().remove(jfMainWindow.getJpanelAdministrador().getJpanelAdminProductos());
			jfMainWindow.getJpanelAdministrador().createJpanelCenter();
			break;
		case Constants.BUTTON_ADMIN_USERS:
//			jfMainWindow.getJpanelAdministrador().remove(jfMainWindow.getJpanelAdministrador().getjPanelAdminCenter());
//			jfMainWindow.getJpanelAdministrador().createJpanelAdminUsers();
				//jfMainWindow.getJpanelAdministrador().getJpanelAdminProductos().getPanelLista().actualizarLista(jfMainWindow.getController().getControllerProducts().readFile());
			break;
		case Constants.CERRAR_S:
			jfMainWindow.remove(jfMainWindow.getJpanelAdministrador());
			jfMainWindow.setSize(new Dimension(650, 710));
			jfMainWindow.setLocationRelativeTo(null);
			jfMainWindow.repaint();
			jfMainWindow.createPanelInit();
			break;
		case Constants.T_LABEL_SALIR:
			if (utillidades.printMessageDeseaSalir() == 0) {
				jfMainWindow.setVisible(false);
			}
			break;
		default:
			break;
		}
		jfMainWindow.revalidate();
		jfMainWindow.repaint();
	}

	private void createAccoint() throws IOException {
		name = jfMainWindow.getjPanelCreateUser().obtenerNombre();
		lastName = jfMainWindow.getjPanelCreateUser().obtenerApellidos();
		nameUser = jfMainWindow.getjPanelCreateUser().obtenerUsuario();
		password = jfMainWindow.getjPanelCreateUser().obtenerContrasena();
		typeDocument = jfMainWindow.getjPanelCreateUser().getjBoxTypeDocument();
		numberDocument = jfMainWindow.getjPanelCreateUser().obtenerNumeroDocumento();
		if (jfMainWindow.getController().getControllerUsers().isNameUser(nameUser) == false) {
			jfMainWindow.getController().getControllerUsers().addUser(nameUser, password, name, lastName, typeDocument, numberDocument);
			jfMainWindow.getjPanelCreateUser().limpiarCampos();
		}		
	}
}
