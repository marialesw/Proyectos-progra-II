package co.edu.uptc.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.uptc.constants.Constantes;
import co.edu.uptc.view.JBMenu;
import co.edu.uptc.view.JDLenguaje;
import co.edu.uptc.view.JTableDatos;
import co.edu.uptc.view.MainWindow;
import co.edu.uptc.view.PanelBotones;
import co.edu.uptc.view.PanelCampos;
import co.edu.uptc.view.PropertiesTitle;

public class ControllerHardware implements ActionListener{

	public PanelCampos panelCampos;
	public JDLenguaje jDLenguaje;
	public MainWindow mainWindow;
	public JTableDatos jTableDatos;
	public PropertiesTitle propertiesTitle;
	public JBMenu jBMenu;
	public PanelBotones panelBotones;
	public ManageController manageController;

	public String id;
	public String name;
	public String description;
	public Integer cantidad;
	public Short unitPrice;
	
	
	public ControllerHardware() {
		manageController = new ManageController();
		propertiesTitle = new PropertiesTitle("Espanol");
		mainWindow = new MainWindow(this, propertiesTitle);
		panelCampos = new PanelCampos(mainWindow, this);
		panelBotones = new PanelBotones(mainWindow);
		jBMenu = new JBMenu(this, propertiesTitle);
		jTableDatos = new JTableDatos();
		jDLenguaje = new JDLenguaje(propertiesTitle, this);
		mainWindow.add(jTableDatos, BorderLayout.SOUTH);
		mainWindow.add(panelCampos, BorderLayout.CENTER);
		mainWindow.add(panelBotones, BorderLayout.EAST);
		mainWindow.add(jBMenu, BorderLayout.NORTH);
		mainWindow.setVisible(true);
	}

	public PropertiesTitle getPropertiesTitle(String string) {
		return propertiesTitle;
	}

	public void actionPerformed(ActionEvent e) {
		String accion = e.getActionCommand();
		if(accion.equals(Constantes.LENGUAJE)) {
			jDLenguaje.setVisible(true);
		}else if (accion.equals(Constantes.ACEPTAR)) {
			mangeLanguage();
		}else if(accion.equals(Constantes.GUARDAR)) {
			id = getPanelCampos().obtenerIdentificador();
			name = getPanelCampos().obtenerNombre();
			description = getPanelCampos().obtenerDescripcion();
			cantidad = getPanelCampos().obtenerCantidad();
			unitPrice = getPanelCampos().obtenerPrecioUnitario();
			if (id != null && !id.isEmpty() && name != null && !name.isEmpty()
					&& description != null && cantidad != null && unitPrice != null ) {
				manageController.addHard(id, name, description, cantidad, unitPrice);
				String[] elementos = {id, name, description, String.valueOf(cantidad), String.valueOf(unitPrice)};
				jTableDatos.addElemn(elementos);
				addTable();
				getPanelCampos().limpiar();
				
			}
			
		}
	}
	
	public void addTable() {
		Object [] fila = new Object[5];
		fila[0] = id;
		fila[1] = name;
		fila[2] = description;
		fila[3] = cantidad;
		fila[4] = unitPrice;
		jTableDatos.addElemn(fila);
	}
	


	public void mangeLanguage() {
		if (jDLenguaje.selectLanguage() == 1) {
			propertiesTitle = new PropertiesTitle("Espanol");
		} else if (jDLenguaje.selectLanguage() == 2) {
			propertiesTitle = new PropertiesTitle("Ingles");
		}else if(jDLenguaje.selectLanguage() == 3) {
			propertiesTitle = new PropertiesTitle("Portugues");
		}else if(jDLenguaje.selectLanguage() == 4) {
			propertiesTitle = new PropertiesTitle("Frances");
		}
		jDLenguaje.setVisible(false);
		updatelanguage();
	}

	public void updatelanguage() {
		jBMenu.refresh();
		jDLenguaje.refresh();
		panelCampos.refresh();
	}

	public PanelCampos getPanelCampos() {
		return panelCampos;
	}

	public void setPanelCampos(PanelCampos panelCampos) {
		this.panelCampos = panelCampos;
	}

	public JDLenguaje getjDLenguaje() {
		return jDLenguaje;
	}

	public void setjDLenguaje(JDLenguaje jDLenguaje) {
		this.jDLenguaje = jDLenguaje;
	}

	public MainWindow getMainWindow() {
		return mainWindow;
	}

	public void setMainWindow(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}

	public JTableDatos getjTableDatos() {
		return jTableDatos;
	}

	public void setjTableDatos(JTableDatos jTableDatos) {
		this.jTableDatos = jTableDatos;
	}

	public PropertiesTitle getPropertiesTitle() {
		return propertiesTitle;
	}

	public void setPropertiesTitle(PropertiesTitle propertiesTitle) {
		this.propertiesTitle = propertiesTitle;
	}

	public JBMenu getjBMenu() {
		return jBMenu;
	}

	public void setjBMenu(JBMenu jBMenu) {
		this.jBMenu = jBMenu;
	}

	public PanelBotones getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(PanelBotones panelBotones) {
		this.panelBotones = panelBotones;
	}
	
	
	
}
