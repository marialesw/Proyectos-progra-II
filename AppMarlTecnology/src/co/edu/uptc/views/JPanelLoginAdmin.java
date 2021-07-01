package co.edu.uptc.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import co.edu.uptc.utilities.Utillidades;


public class JPanelLoginAdmin extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ImageIcon image;
	private ImageIcon icon;
	private GridBagConstraints gbc;
	private JButton imgLogo;
	private Font fuente;
	private Color colorFondo;
	private JLabel labelInicioSesion;
	private JLabel labelUser;
	private JTextField jTextUser;
	private JLabel labelPassword;
	private JPasswordField jTextPassword;
	private JButton buttonInitSesion;
	private JButton labelSalir;
	private MainWindow mainWindow;
	private JButton labelVolver;


	public JPanelLoginAdmin(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		setLayout(new GridBagLayout());
		setPreferredSize(new Dimension(800, 700));
		colorFondo = Color.decode("#F8FAFB");
		setBackground(colorFondo);
		initComponents();
		setVisible(false);
	}

	private void initComponents() {
		gbc = new GridBagConstraints();
		generateBasicGridX(gbc);
		generateBasicGridY(gbc);
		gbc.insets = new Insets(5, 0, 5, 0);
		
		TitledBorder tb = BorderFactory.createTitledBorder("Inicio de Sesion");
		fuente = new Font("Berlin Sans FB Demi", 0, 14);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLUE);
		setBorder(tb);
		
		
		imgLogo = new JButton();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 2;
		gbc.gridwidth = 9;
		gbc.fill = GridBagConstraints.VERTICAL;
		imgLogo.setBounds(0, 0, 400, 200);
		image = new ImageIcon(getClass().getResource("/images/logo.png"));
		icon = new ImageIcon(image.getImage().getScaledInstance(imgLogo.getWidth(),imgLogo.getHeight(), Image.SCALE_DEFAULT));
		imgLogo.setIcon(icon);
		imgLogo.setBackground(getColorFondo());
		imgLogo.setBorder(null);
		this.add(imgLogo, gbc);
		
		labelInicioSesion = new JLabel(Constants.T_LABEL_INIT_SESION);
		fuente = new Font("Arial", 2, 14);
		labelInicioSesion.setFont(fuente);
		labelInicioSesion.setForeground(Color.black);
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 4;
		labelInicioSesion.setHorizontalAlignment(SwingConstants.CENTER); 
		this.add(labelInicioSesion, gbc);
		
		labelUser = new JLabel(Constants.LABEL_USER);
		fuente = new Font("verdana", 1, 16);
		labelUser.setFont(fuente);
		labelUser.setForeground(Color.blue);
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridwidth = 2;
		this.add(labelUser, gbc);

		jTextUser = new JTextField("");
		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 4;
		jTextUser.setPreferredSize(new Dimension(300, 20));
		fuente = new Font("Arial", 0, 16);
		jTextUser.setFont(fuente);
		this.add(jTextUser, gbc);

		labelPassword = new JLabel(Constants.LABEL_PASSWORD);
		fuente = new Font("verdana", 1, 16);
		labelPassword.setFont(fuente);
		labelPassword.setForeground(Color.BLUE);
		gbc.gridx = 2;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		this.add(labelPassword, gbc);

		jTextPassword = new JPasswordField("");
		gbc.gridx = 2;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 4;
		jTextPassword.setPreferredSize(new Dimension(300, 20));
		fuente = new Font("Arial", 0, 16);
		jTextPassword.setFont(fuente);
		this.add(jTextPassword, gbc);
		
		buttonInitSesion = new JButton(Constants.LABEL_INIT_ADMIN);
		fuente = new Font("Arial", 0, 16);
		buttonInitSesion.setFont(fuente);
		buttonInitSesion.setBackground(Color.decode("#FE2542"));
		buttonInitSesion.setForeground(Color.decode("#D4FBF9"));
		gbc.gridx = 3;
		gbc.gridy = 11;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		buttonInitSesion.setPreferredSize(new Dimension(200, 20));
		buttonInitSesion.setActionCommand(Constants.LABEL_INIT_ADMIN);
		buttonInitSesion.addActionListener(mainWindow.getEvents());
		this.add(buttonInitSesion, gbc);
		
		labelVolver = new JButton(Constants.T_LABEL_VOLVER);
		fuente = new Font("Arial", 2, 12);
		labelVolver.setFont(fuente);
		labelVolver.setForeground(Color.black);
		gbc.gridx = 4;
		gbc.gridy = 11;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		labelVolver.setBackground(getColorFondo());
		labelVolver.setBorder(null);
		labelVolver.setPreferredSize(new Dimension(50, 5));
		labelVolver.setActionCommand(Constants.T_LABEL_VOLVER);
		labelVolver.addActionListener(mainWindow.getEvents());
		this.add(labelVolver, gbc);
		
		labelSalir = new JButton(Constants.T_LABEL_SALIR);
		fuente = new Font("Arial", 2, 12);
		labelSalir.setFont(fuente);
		labelSalir.setForeground(Color.black);
		gbc.gridx = 5;
		gbc.gridy = 11;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		labelSalir.setBackground(getColorFondo());
		labelSalir.setBorder(null);
		labelSalir.setPreferredSize(new Dimension(50, 5));
		labelSalir.setActionCommand(Constants.T_LABEL_SALIR);
		labelSalir.addActionListener(mainWindow.getEvents());
		this.add(labelSalir, gbc);
	}
	
	public Font getFuente() {
		return fuente;
	}

	public void setFuente(Font fuente) {
		this.fuente = fuente;
	}

	public Color getColorFondo() {
		return colorFondo;
	}

	public void setColorFondo(Color colorFondo) {
		this.colorFondo = colorFondo;
	}

	private void generateBasicGridX(GridBagConstraints gbc){
		gbc.weightx = 1;
		gbc.gridheight = 1;
		for (int i = 0; i < 9; i++) {
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
	
	public String obtenerUsuario() {
		if (jTextUser.getText() != null && !jTextUser.getText().isEmpty()) {
			return jTextUser.getText();
		} else {
			Utillidades.showMessageWarning("Debe ingresar el usuario", "Advertencia");
		}
		return null;
	}
	
	public String obtenerContrasena() {
		if (jTextPassword.getText() != null && !jTextPassword.getText().isEmpty()) {
			return jTextPassword.getText();
		} else {
			Utillidades.showMessageWarning("Debe ingresar la contrase�a", "Advertencia");
		}
		return null;
	}

	public void limpiarCampos(){
		jTextPassword.setText("");
		jTextUser.setText("");
	}
}
