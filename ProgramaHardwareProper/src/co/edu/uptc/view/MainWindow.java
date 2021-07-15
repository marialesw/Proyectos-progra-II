package co.edu.uptc.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import co.edu.uptc.controller.ControllerHardware;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	public PropertiesTitle propertiesTitle;
	private ControllerHardware controllerHar;
	public JTableDatos jTableDatos;

	public MainWindow(ControllerHardware controller, PropertiesTitle propertiesTitle) {
		this.propertiesTitle = propertiesTitle;
		this.controllerHar = controller;
		setSize(800, 600);
		setTitle("Empresa de Hardware");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setVisible(true);
		setResizable(false);
	}

	public PropertiesTitle getPropertiesTitle() {
		return propertiesTitle;
	}

	public void setPropertiesTitle(PropertiesTitle propertiesTitle) {
		this.propertiesTitle = propertiesTitle;
	}

	public ControllerHardware getControllerHar() {
		return controllerHar;
	}

	public void setControllerHar(ControllerHardware controllerHar) {
		this.controllerHar = controllerHar;
	}
	
	
}
