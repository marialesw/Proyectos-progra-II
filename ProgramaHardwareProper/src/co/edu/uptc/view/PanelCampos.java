package co.edu.uptc.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import co.edu.uptc.controller.ControllerHardware;
import co.edu.uptc.utilities.Utillidades;

public class PanelCampos extends JPanel {

	private MainWindow mainWindow;
	private ControllerHardware controller;
	private JLabel lblIdentificador;
	private JLabel lblNombre;
	private JLabel lblDescripcion;
	private JLabel lblcantidad;
	private JLabel lblPrecioUnitario;
	private JTextField tfIdentificador;
	private JTextField tfNombre;
	private JTextField tfDescripcion;
	private JTextField tfCantidad;
	private JTextField tfPrecioUnitario;
	private PropertiesTitle propertiesTitle;
	private Utillidades utilities;

	public PanelCampos(MainWindow principal, ControllerHardware controller) {
		this.controller = controller;
		this.mainWindow = principal;
		TitledBorder tb = BorderFactory.createTitledBorder("Datos");
		setBorder(tb);
		// Labels
		lblIdentificador = new JLabel("Identificador:");
		lblNombre = new JLabel("Nombre:");
		lblDescripcion = new JLabel("Descripcion:");
		lblcantidad = new JLabel("Cantidad:");
		lblPrecioUnitario = new JLabel("precio Unitario:");
		// Fields
		tfIdentificador = new JTextField();
		tfNombre = new JTextField();
		tfDescripcion = new JTextField();
		tfCantidad = new JTextField();
		tfPrecioUnitario = new JTextField();

		JPanel panelDat = new JPanel(new GridLayout(6, 2));
		panelDat.add(lblIdentificador);
		panelDat.add(tfIdentificador);
		panelDat.add(lblNombre);
		panelDat.add(tfNombre);
		panelDat.add(lblDescripcion);
		panelDat.add(tfDescripcion);
		panelDat.add(lblcantidad);
		panelDat.add(tfCantidad);
		panelDat.add(lblPrecioUnitario);
		panelDat.add(tfPrecioUnitario);
		setLayout(new BorderLayout());
		add(panelDat, BorderLayout.CENTER);
	}
	
	public void limpiar() {
		tfIdentificador.setText("");
		tfNombre.setText("");
		tfDescripcion.setText("");
		tfCantidad.setText("");
		tfPrecioUnitario.setText("");
	}

	public void refresh(){
		propertiesTitle = controller.getPropertiesTitle("MenuIdioma");
		lblIdentificador.setText(propertiesTitle.getProperty("Identificador"));
		lblNombre.setText(propertiesTitle.getProperty("Nombre"));
		lblDescripcion.setText(propertiesTitle.getProperty("Descripcion"));
		lblcantidad.setText(propertiesTitle.getProperty("Cantidad"));
		lblPrecioUnitario.setText(propertiesTitle.getProperty("PrecioUnitario"));
	}
	
	public String obtenerIdentificador() {
		if (tfIdentificador.getText() != null && !tfIdentificador.getText().isEmpty()) {
			return tfIdentificador.getText();
		} else {
			Utillidades.showMessageWarning("Debe ingresar el identificador del Hardware", "Advertencia");
		}
		return null;
	}

	public String obtenerNombre() {
		if (tfNombre.getText() != null && !tfNombre.getText().isEmpty()) {
			return tfNombre.getText();
		} else {
			Utillidades.showMessageWarning("Debe Ingresar el nombre del Hardware", "Advertencia");
		}
		return null;
	}
	
	public String obtenerDescripcion() {
		if (tfDescripcion.getText() != null && !tfDescripcion.getText().isEmpty()) {
			return tfDescripcion.getText();
		} else {
			Utillidades.showMessageWarning("Debe ingresar la descripcion del Hardware", "Advertencia");
		}
		return null;
	}
	
	public Short obtenerPrecioUnitario() {
		if (tfPrecioUnitario.getText() != null && !tfPrecioUnitario.getText().isEmpty()) {
			return Utillidades.convertStringToShort(tfPrecioUnitario.getText());
		} else {
			Utillidades.showMessageWarning("Debe ingresar el precio Unitario del Hardware", "Advertencia");
		}
		return null;
	}
	
	public Integer obtenerCantidad() {
		if (tfCantidad.getText() != null && !tfCantidad.getText().isEmpty()) {
			return Utillidades.convertStringToInt((tfCantidad.getText()));
		} else {
			Utillidades.showMessageWarning("Debe ingresar la cantidad del Hardware", "Advertencia");
		}
		return (Integer)null;
	}
	
	public MainWindow getMainWindow() {
		return mainWindow;
	}

	public void setMainWindow(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}

	public JLabel getLblIdentificador() {
		return lblIdentificador;
	}

	public void setLblIdentificador(JLabel lblIdentificador) {
		this.lblIdentificador = lblIdentificador;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public JLabel getLblDescripcion() {
		return lblDescripcion;
	}

	public void setLblDescripcion(JLabel lblDescripcion) {
		this.lblDescripcion = lblDescripcion;
	}

	public JLabel getLblcantidad() {
		return lblcantidad;
	}

	public void setLblcantidad(JLabel lblcantidad) {
		this.lblcantidad = lblcantidad;
	}

	public JLabel getLblPrecioUnitario() {
		return lblPrecioUnitario;
	}

	public void setLblPrecioUnitario(JLabel lblPrecioUnitario) {
		this.lblPrecioUnitario = lblPrecioUnitario;
	}

	public JTextField getTfIdentificador() {
		return tfIdentificador;
	}

	public void setTfIdentificador(JTextField tfIdentificador) {
		this.tfIdentificador = tfIdentificador;
	}

	public JTextField getTfNombre() {
		return tfNombre;
	}

	public void setTfNombre(JTextField tfNombre) {
		this.tfNombre = tfNombre;
	}

	public JTextField getTfDescripcion() {
		return tfDescripcion;
	}

	public void setTfDescripcion(JTextField tfDescripcion) {
		this.tfDescripcion = tfDescripcion;
	}

	public JTextField getTfCantidad() {
		return tfCantidad;
	}

	public void setTfCantidad(JTextField tfCantidad) {
		this.tfCantidad = tfCantidad;
	}

	public JTextField getTfPrecioUnitario() {
		return tfPrecioUnitario;
	}

	public void setTfPrecioUnitario(JTextField tfPrecioUnitario) {
		this.tfPrecioUnitario = tfPrecioUnitario;
	}
}
