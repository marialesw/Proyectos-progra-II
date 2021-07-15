package co.edu.uptc.view;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import co.edu.uptc.controller.Action;
import co.edu.uptc.controller.ControllerHardware;

public class JBMenu extends JMenuBar {

	private JMenu jMenuIdioma;
	private JMenuItem jMILenguaje;
	private PropertiesTitle propertiesTitle;
	private ControllerHardware controller;
	private PanelBotones panelBotones;
	private JMenuBar jMenuBarAyuda;

	public JBMenu(ControllerHardware controller, PropertiesTitle propertiesTitle) {
		setBackground(Color.decode("#111110"));
		this.controller = controller;
		this.propertiesTitle = propertiesTitle;
		initComponentes();
	}

	public void initComponentes() {
		jMenuBarAyuda = new JMenuBar();
		jMenuIdioma = new JMenu(propertiesTitle.getProperty("MenuIdioma"));
		jMILenguaje = new JMenuItem(propertiesTitle.getProperty("Lenguaje"));
		jMILenguaje.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jMILenguaje.addActionListener(controller);
		jMILenguaje.setActionCommand(Action.LENGUAJE.name());

		jMenuBarAyuda.add(jMenuIdioma);
		jMenuIdioma.add(jMILenguaje);
		add(jMenuBarAyuda);
		setjMenuBarAyuda(jMenuBarAyuda);

	}

	public void refresh() {
		propertiesTitle = controller.getPropertiesTitle("MenuIdioma");
		jMenuIdioma.setText(propertiesTitle.getProperty("MenuIdioma"));
	}

	public JMenu getjMenuIdioma() {
		return jMenuIdioma;
	}

	public void setjMenuIdioma(JMenu jMenuIdioma) {
		this.jMenuIdioma = jMenuIdioma;
	}

	public JMenuItem getjMILenguaje() {
		return jMILenguaje;
	}

	public void setjMILenguaje(JMenuItem jMILenguaje) {
		this.jMILenguaje = jMILenguaje;
	}

	public PropertiesTitle getPropertiesTitle() {
		return propertiesTitle;
	}

	public void setPropertiesTitle(PropertiesTitle propertiesTitle) {
		this.propertiesTitle = propertiesTitle;
	}

	public JMenuBar getjMenuBarAyuda() {
		return jMenuBarAyuda;
	}

	public void setjMenuBarAyuda(JMenuBar jMenuBarAyuda) {
		this.jMenuBarAyuda = jMenuBarAyuda;
	}

}
