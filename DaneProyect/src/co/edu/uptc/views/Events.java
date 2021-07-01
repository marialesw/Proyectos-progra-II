package co.edu.uptc.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.rmi.Remote;

import javax.swing.JOptionPane;
import javax.swing.RepaintManager;

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
		case Constants.REGISTER_FAMILY:
			jfMainWindow.remove(jfMainWindow.getJpanelInit());
			jfMainWindow.createPanelRegister();
			break;
		case Constants.NIVEL_EDU_BUTTON:
			jfMainWindow.getJpanelInit().mostrarDialogGraphics(1);
			break;
		case Constants.MENS_VS_WOMENS:
			jfMainWindow.getJpanelInit().mostrarDialogGraphics(2);
			break;
		case Constants.AGES_BUTTON:
			jfMainWindow.getJpanelInit().mostrarDialogGraphics(3);
			break;
		case Constants.BUTTON_SAVE_FAMILY:
			jfMainWindow.getController().createFamily();
			jfMainWindow.repaint();
			break;
		case Constants.BUTTON_ADD:
			jfMainWindow.getjPanelRegister().createPerson();
			break;
		case Constants.ADD_PERSON:
			jfMainWindow.mostrarDialogAddPerson();
			break;
		case Constants.BUTTON_CANCEL:
			jfMainWindow.cerrarDialogoAddP();
			break;
		case Constants.BUTTON_VOLVER:
			jfMainWindow.remove(jfMainWindow.getjPanelRegister());
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

//	private void createAccoint() throws IOException {
//		name = jfMainWindow.getjPanelCreateUser().obtenerNombre();
//		lastName = jfMainWindow.getjPanelCreateUser().obtenerApellidos();
//		nameUser = jfMainWindow.getjPanelCreateUser().obtenerUsuario();
//		password = jfMainWindow.getjPanelCreateUser().obtenerContraseña();
//		typeDocument = jfMainWindow.getjPanelCreateUser().getjBoxTypeDocument();
//		numberDocument = jfMainWindow.getjPanelCreateUser().obtenerNumeroDocumento();
//		if (jfMainWindow.getController().getControllerUsers().isNameUser(nameUser) == false) {
//			jfMainWindow.getController().getControllerUsers().addUser(nameUser, password, name, lastName, typeDocument, numberDocument);
//		}		
//	}
}
