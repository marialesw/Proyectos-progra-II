package co.edu.uptc.view;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import co.edu.uptc.constants.Constantes;


public class PanelBotones extends JPanel {

	private JButton btGuardar;
	private JButton btBorrar;
	private JButton btVisualizar;

	private MainWindow mainWindow;

	public PanelBotones(MainWindow  vistaPrincipal) {
		this.mainWindow = vistaPrincipal;
		TitledBorder tb = BorderFactory.createTitledBorder("Acciones");
		setBorder(tb);

		btGuardar = new JButton("Guardar");
		btGuardar.setActionCommand(Constantes.GUARDAR);
		btGuardar.addActionListener(vistaPrincipal.getControllerHar());

		btBorrar = new JButton("Borrar");
		btBorrar.setActionCommand("BORRAR");
		btBorrar.addActionListener(vistaPrincipal.getControllerHar());

		btVisualizar = new JButton("Visualizar");
		btVisualizar.setActionCommand("Visualizar");
		btVisualizar.addActionListener(vistaPrincipal.getControllerHar());

		setLayout(new FlowLayout());
		add(btGuardar);
		add(btBorrar);
		add(btVisualizar);
	}

	public JButton getBtGuardar() {
		return btGuardar;
	}

	public void setBtGuardar(JButton btGuardar) {
		this.btGuardar = btGuardar;
	}

	public JButton getBtVisualizar() {
		return btVisualizar;
	}

	public void setBtVisualizar(JButton btVisualizar) {
		this.btVisualizar = btVisualizar;
	}

	public JButton getBtBorrar() {
		return btBorrar;
	}

	public void setBtBorrar(JButton btBorrar) {
		this.btBorrar = btBorrar;
	}

}
