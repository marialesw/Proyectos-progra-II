package co.edu.uptc.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JPanelInit extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton imgLogo;
	private ImageIcon image;
	private ImageIcon icon;
	private MainWindow mainWindow;
	private Color color;
	private GridBagConstraints gbc;
	private JButton imgUser;
	private JButton imgAdministrador;


	public JPanelInit(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		setLayout(new GridBagLayout());
		color = Color.decode("#F8FAFB");
		setBackground(color);
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		gbc = new GridBagConstraints();
		generateBasicGridX(gbc);
		generateBasicGridY(gbc);
		gbc.insets = new Insets(5, 0, 5, 0);
		
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
		imgLogo.setBackground(color);
		imgLogo.setBorder(null);
		this.add(imgLogo, gbc);
		
		imgUser = new JButton();
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridheight = 2;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.VERTICAL;
		imgUser.setBounds(0, 0, 100, 100);
		image = new ImageIcon(getClass().getResource("/images/user.jpg"));
		icon = new ImageIcon(image.getImage().getScaledInstance(imgUser.getWidth(),imgUser.getHeight(), Image.SCALE_DEFAULT));
		imgUser.setVerticalTextPosition(SwingConstants.BOTTOM);
		imgUser.setIcon(icon);
		imgUser.setText(Constants.BUTTON_INIT_SESION_USER);
		imgUser.setBackground(color);
		imgUser.setBorder(null);
		imgUser.setActionCommand(Constants.BUTTON_INIT_SESION_USER);
		imgUser.addActionListener(mainWindow.getEvents());
		this.add(imgUser, gbc);
		
		imgAdministrador = new JButton();
		gbc.gridx = 4;
		gbc.gridy = 4;
		gbc.gridheight = 2;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.VERTICAL;
		imgAdministrador.setBounds(0, 0, 100, 100);
		image = new ImageIcon(getClass().getResource("/images/user.jpg"));
		icon = new ImageIcon(image.getImage().getScaledInstance(imgAdministrador.getWidth(),imgAdministrador.getHeight(), Image.SCALE_DEFAULT));
		imgAdministrador.setVerticalTextPosition(SwingConstants.BOTTOM);
		imgAdministrador.setIcon(icon);
		imgAdministrador.setText(Constants.BUTTON_INIT_SESION_ADMINISTRADOR);
		imgAdministrador.setBackground(color);
		imgAdministrador.setBorder(null);
		imgAdministrador.setActionCommand(Constants.BUTTON_INIT_SESION_ADMINISTRADOR);
		imgAdministrador.addActionListener(mainWindow.getEvents());
		this.add(imgAdministrador, gbc);
	
		
		
	}
	

	private void generateBasicGridX(GridBagConstraints gbc){
		gbc.weightx = 1;
		gbc.gridheight = 1;
		for (int i = 0; i < 9; i++) {
			gbc.gridx = i;
			add(new JLabel("" + i ), gbc);
		}
	}

	private void generateBasicGridY(GridBagConstraints gbc){
		gbc.weighty = 1;
		gbc.gridheight = 1;
		for (int i = 0; i < 12; i++) {
			gbc.gridy = i;
			add(new JLabel("" + i), gbc);
		}
	}

}
