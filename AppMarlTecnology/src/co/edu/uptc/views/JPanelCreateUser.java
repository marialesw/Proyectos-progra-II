package co.edu.uptc.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import co.edu.uptc.models.TypeDocument;
import co.edu.uptc.utilities.Utillidades;

public class JPanelCreateUser extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MainWindow mainWindow;
	private Color colorFondo;
	private GridBagConstraints gbc;
	private JButton imgLogo;
	private ImageIcon image;
	private ImageIcon icon;
	private JLabel labelNewUser;
	private Font fuente;
	private JLabel labelNameUser;
	private JTextField jTextNameUser;
	private JLabel lastName;
	private JTextField jTextLastName;
	private JLabel labelTypeDocument;
	private JComboBox jBoxTypeDocument;
	private JLabel labelNumberDocument;
	private JTextField jTextDocumentNumber;
	private JLabel labelName;
	private JTextField jTextName;
	private JLabel labelPasword;
	private JPasswordField jTextPassword;
	private JButton buttonCreateAccoint;
	private JButton buttonCancel;
	private JButton labelSalir;

	public JPanelCreateUser(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		setLayout(new GridBagLayout());
		setPreferredSize(new Dimension(800, 700));
		colorFondo = Color.decode("#F8FAFB");
		setBackground(colorFondo);
		initComponents();
		setVisible(false);
	}
	
	public void initComponents(){
		gbc = new GridBagConstraints();
		generateBasicGridX(gbc);
		generateBasicGridY(gbc);
		gbc.insets = new Insets(5, 5, 5, 5);
		
		imgLogo = new JButton();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;//EJE Y
		gbc.gridwidth = 3;//EJE X
		gbc.fill = GridBagConstraints.VERTICAL;
		imgLogo.setBounds(0, 0, 300, 150);
		image = new ImageIcon(getClass().getResource("/images/logo.png"));
		icon = new ImageIcon(image.getImage().getScaledInstance(imgLogo.getWidth(),imgLogo.getHeight(), Image.SCALE_DEFAULT));
		imgLogo.setIcon(icon);
		imgLogo.setBackground(colorFondo);
		imgLogo.setBorder(null);
		this.add(imgLogo, gbc);
		

		labelNewUser = new JLabel(Constants.LABEL_NEW_USER);
		fuente = new Font("Times New Roman", 3, 20);
		labelNewUser.setFont(fuente);
		labelNewUser.setForeground(Color.blue);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		this.add(labelNewUser, gbc);
		
		labelName = new JLabel(Constants.LABEL_NAME);
		fuente = new Font("Arial", 3, 14);
		labelName.setFont(fuente);
		labelName.setForeground(Color.BLACK);
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(labelName, gbc);

		jTextName = new JTextField("");
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		jTextName.setPreferredSize(new Dimension(250, 10));
		fuente = new Font("Arial", 0, 16);
		jTextName.setFont(fuente);
		this.add(jTextName, gbc);

		lastName = new JLabel(Constants.LABEL_LAST_NAME);
		fuente = new Font("Arial", 3, 14);
		lastName.setFont(fuente);
		lastName.setForeground(Color.BLACK);
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(lastName, gbc);

		jTextLastName = new JTextField("");
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		jTextLastName.setPreferredSize(new Dimension(250, 10));
		fuente = new Font("Arial", 0, 16);
		jTextLastName.setFont(fuente);
		this.add(jTextLastName, gbc);

		labelTypeDocument  = new JLabel(Constants.LABEL_TYPE_DOCUMENT);
		fuente = new Font("Arial", 3, 14);
		labelTypeDocument.setFont(fuente);
		labelTypeDocument.setForeground(Color.BLACK);
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		//labelTypeDocument.setHorizontalAlignment(SwingConstants.RIGHT); 
		this.add(labelTypeDocument, gbc);

		jBoxTypeDocument = new JComboBox<>(TypeDocument.values());
		fuente = new Font("Arial", 0, 14);
		jBoxTypeDocument.setFont(fuente);
		jBoxTypeDocument.setPreferredSize(new Dimension(250, 10));
		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		this.add(jBoxTypeDocument, gbc);

		labelNumberDocument = new JLabel(Constants.LABEL_NUMBER_DOCUMENT);
		fuente = new Font("Arial", 3, 14);
		labelNumberDocument.setFont(fuente);
		labelNumberDocument.setForeground(Color.BLACK);
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(labelNumberDocument, gbc);

		jTextDocumentNumber = new JTextField("");
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		jTextDocumentNumber.setPreferredSize(new Dimension(250, 10));
		fuente = new Font("Arial", 0, 16);
		jTextDocumentNumber.setFont(fuente);
		this.add(jTextDocumentNumber, gbc);
		
		labelNameUser = new JLabel(Constants.LABEL_NAME_USER);
		fuente = new Font("Arial", 3, 14);
		labelNameUser.setFont(fuente);
		labelNameUser.setForeground(Color.black);
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(labelNameUser, gbc);

		jTextNameUser = new JTextField("");
		gbc.gridx = 2;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		jTextNameUser.setPreferredSize(new Dimension(250, 10));
		fuente = new Font("Arial", 0, 16);
		jTextNameUser
		.setFont(fuente);
		this.add(jTextNameUser, gbc);
		
		labelPasword = new JLabel(Constants.LABEL_CREATE_PASWORD);
		fuente = new Font("Arial", 3, 14);
		labelPasword.setFont(fuente);
		labelPasword.setForeground(Color.black);
		gbc.gridx = 1;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(labelPasword, gbc);

		jTextPassword = new JPasswordField("");
		gbc.gridx = 2;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		jTextPassword.setPreferredSize(new Dimension(250, 10));
		fuente = new Font("Arial", 0, 16);
		jTextPassword.setFont(fuente);
		this.add(jTextPassword, gbc);
		
		buttonCreateAccoint = new JButton(Constants.BUTTON_CREATE_ACCOINT);
		fuente = new Font("Arial", 0, 16);
		buttonCreateAccoint.setFont(fuente);
		buttonCreateAccoint.setBackground(Color.decode("#FE2542"));
		buttonCreateAccoint.setForeground(Color.decode("#D4FBF9"));
		gbc.gridx = 1;
		gbc.gridy = 10;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		buttonCreateAccoint.setPreferredSize(new Dimension(200, 20));
		buttonCreateAccoint.setActionCommand(Constants.BUTTON_CREATE_ACCOINT);
		buttonCreateAccoint.addActionListener(mainWindow.getEvents());
		this.add(buttonCreateAccoint, gbc);
		
		buttonCancel = new JButton(Constants.BUTTON_CANCEL);
		fuente = new Font("Arial", 0, 16);
		buttonCancel.setFont(fuente);
		buttonCancel.setBackground(Color.decode("#FE2542"));
		buttonCancel.setForeground(Color.decode("#D4FBF9"));
		gbc.gridx = 2;
		gbc.gridy = 10;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		buttonCancel.setPreferredSize(new Dimension(200, 20));
		buttonCancel.setActionCommand(Constants.BUTTON_CANCEL);
		buttonCancel.addActionListener(mainWindow.getEvents());
		this.add(buttonCancel, gbc);
		
		labelSalir = new JButton(Constants.T_LABEL_SALIR);
		fuente = new Font("Arial", 2, 12);
		labelSalir.setFont(fuente);
		labelSalir.setForeground(Color.black);
		gbc.gridx = 3;
		gbc.gridy = 10;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		labelSalir.setBackground(colorFondo);
		labelSalir.setBorder(null);
		labelSalir.setPreferredSize(new Dimension(50, 5));
		labelSalir.setActionCommand(Constants.T_LABEL_SALIR);
		labelSalir.addActionListener(mainWindow.getEvents());
		this.add(labelSalir, gbc);
	}
	
	public void limpiarCampos(){
		jTextName.setText("");
		jTextLastName.setText("");
		jTextNameUser.setText("");
		jTextDocumentNumber.setText("");
		jTextPassword.setText("");
		jBoxTypeDocument.setSelectedItem(TypeDocument.values());
	}
	
	public String obtenerNombre() {
		if (jTextName.getText() != null && !jTextName.getText().isEmpty()) {
			return jTextName.getText();
		} else {
			Utillidades.showMessageWarning("Debe ingresar su nombre", "Advertencia");
		}
		return null;
	}
	
	public String obtenerApellidos() {
		if (jTextLastName.getText() != null && !jTextLastName.getText().isEmpty()) {
			return jTextLastName.getText();
		} else {
			Utillidades.showMessageWarning("Debe ingresar sus apellidos", "Advertencia");
		}
		return null;
	}
	
	public String obtenerNumeroDocumento() {
		if (jTextDocumentNumber.getText() != null && !jTextDocumentNumber.getText().isEmpty()) {
			return jTextDocumentNumber.getText();
		} else {
			Utillidades.showMessageWarning("Debe ingresar su numero de documento", "Advertencia");
		}
		return null;
	}

	public TypeDocument getjBoxTypeDocument() {
		return (TypeDocument)jBoxTypeDocument.getSelectedItem();
	}
	
	public String obtenerUsuario() {
		if (jTextNameUser.getText() != null && !jTextNameUser.getText().isEmpty()) {
			return jTextNameUser.getText();
		} else {
			Utillidades.showMessageWarning("Debe ingresar un usuario", "Advertencia");
		}
		return null;
	}
	
	@SuppressWarnings("deprecation")
	public String obtenerContrasena() {
		if (jTextPassword.getText() != null && !jTextPassword.getText().isEmpty()) {
			return jTextPassword.getText();
		} else {
			Utillidades.showMessageWarning("Debe ingresar una contrase�a", "Advertencia");
		}
		return null;
	}
	
	
	private void generateBasicGridX(GridBagConstraints gbc){
		gbc.weightx = 1;
		gbc.gridheight = 1;
		for (int i = 0; i < 7; i++) {
			gbc.gridx = i;
			add(new JLabel("" ), gbc);
		}
	}

	private void generateBasicGridY(GridBagConstraints gbc){
		gbc.weighty = 1;
		gbc.gridheight = 1;
		for (int i = 0; i < 12; i++) {
			gbc.gridy = i;
			add(new JLabel("" ), gbc);
		}
	}
}
