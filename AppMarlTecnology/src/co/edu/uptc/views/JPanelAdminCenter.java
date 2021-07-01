package co.edu.uptc.views;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JPanelAdminCenter extends JPanel {

	private JButton imgUsers;
	private ImageIcon image;
	private ImageIcon icon;
	private Color color;
	private JButton imgProducts;
	private JButton imgSales;
	private JLabel labelAdminUsers;
	private JLabel labelAdminProducts;
	private JLabel labelAdminSales;
	private MainWindow mainWindow;

	public JPanelAdminCenter(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		this.color = new Color(29, 26, 91);
		setLayout(null);
		setBackground(color);
		initComponents();
		setVisible(true);
	}

	private void initComponents() {


		imgUsers = new JButton();
		imgUsers.setBounds(50,200 , 300, 200);
		image = new ImageIcon(getClass().getResource("/images/usuarios.png"));
		icon = new ImageIcon(image.getImage().getScaledInstance(imgUsers.getWidth(),imgUsers.getHeight(), Image.SCALE_DEFAULT));
		imgUsers.setIcon(icon);
		imgUsers.setBackground(color);
		imgUsers.setBorder(null);
		imgUsers.setActionCommand(Constants.BUTTON_ADMIN_USERS);
		imgUsers.addActionListener(mainWindow.getEvents());
		this.add(imgUsers);
		
		labelAdminUsers = new JLabel(Constants.BUTTON_ADMIN_USERS);
		labelAdminUsers.setForeground(Color.white);
		labelAdminUsers.setBounds(100,400 , 200, 20);
		this.add(labelAdminUsers);
		
		imgProducts = new JButton();
		imgProducts.setBounds(350,200 , 300, 200);
		image = new ImageIcon(getClass().getResource("/images/productos.jpg"));
		icon = new ImageIcon(image.getImage().getScaledInstance(imgProducts.getWidth(),imgProducts.getHeight(), Image.SCALE_DEFAULT));
		imgProducts.setIcon(icon);
		imgProducts.setBackground(color);
		imgProducts.setBorder(null);
		imgProducts.setActionCommand(Constants.BUTTON_ADMIN_PRODUCTS);
		imgProducts.addActionListener(mainWindow.getEvents());
		this.add(imgProducts);
		
		labelAdminProducts = new JLabel(Constants.BUTTON_ADMIN_PRODUCTS);
		labelAdminProducts.setForeground(Color.white);
		labelAdminProducts.setBounds(400,400 , 200, 20);
		this.add(labelAdminProducts);
		
		imgSales = new JButton();
		imgSales.setBounds(650,200 , 300, 200);
		image = new ImageIcon(getClass().getResource("/images/ventas.jpg"));
		icon = new ImageIcon(image.getImage().getScaledInstance(imgSales.getWidth(),imgSales.getHeight(), Image.SCALE_DEFAULT));
		imgSales.setIcon(icon);
		imgSales.setBackground(color);
		imgSales.setBorder(null);
		imgSales.setActionCommand(Constants.BUTTON_ADMIN_SALES);
		imgSales.addActionListener(mainWindow.getEvents());
		this.add(imgSales);
		
		labelAdminSales = new JLabel(Constants.BUTTON_ADMIN_SALES);
		labelAdminSales.setForeground(Color.white);
		labelAdminSales.setBounds(700,400 , 200, 20);
		this.add(labelAdminSales);
	}
}
