package co.edu.uptc.views;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class JPanelOptionsAdmin extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double ovalo;
	private JLabel imgUsers;
	private ImageIcon image;
	private ImageIcon icon;
	private Color colorFondo;
	private JButton imgSettings;
	private JButton imgCloseSes;
	private JPanel panelOptions;
	private Font fuente;
	private Label cuenta;
	private MainWindow mainWindow;

	public JPanelOptionsAdmin(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		setPreferredSize(new Dimension(215, 200));
		initComponents();
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		this.colorFondo = Color.lightGray;
		setBackground(colorFondo);
		setVisible(true);
	}
	
	public void initComponents(){

		imgUsers = new JLabel();
		imgUsers.setBounds(20,20 , 200, 250);
		image = new ImageIcon(getClass().getResource("/images/Adminis.png"));
		icon = new ImageIcon(image.getImage().getScaledInstance(imgUsers.getWidth(),imgUsers.getHeight(), Image.SCALE_DEFAULT));
		imgUsers.setIcon(icon);
		imgUsers.setBackground(colorFondo);
		imgUsers.setBorder(null);
		this.add(imgUsers);
		
		panelOptions = new JPanel();
		panelOptions.setLayout(new GridLayout(2, 1));
		panelOptions.setPreferredSize(new Dimension(200, 200));
		
		TitledBorder tb = BorderFactory.createTitledBorder("Opciones");
		fuente = new Font("Berlin Sans FB Demi", 0, 14);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLUE);
		panelOptions.setBorder(tb);
		
		imgSettings = new JButton("Ajustes");
		imgSettings.setBounds(500,50 , 40, 30);
		image = new ImageIcon(getClass().getResource("/images/ajustes.png"));
		icon = new ImageIcon(image.getImage().getScaledInstance(imgSettings.getWidth(),imgSettings.getHeight(), Image.SCALE_DEFAULT));
		imgSettings.setIcon(icon);
		imgSettings.setBackground(Color.LIGHT_GRAY);
		imgSettings.setBorder(null);
		panelOptions.add(imgSettings);
		
		imgCloseSes = new JButton("Cerrar Sesion");
		imgCloseSes.setBounds(600,50 , 36, 20);
		image = new ImageIcon(getClass().getResource("/images/cerrarSesion.png"));
		icon = new ImageIcon(image.getImage().getScaledInstance(imgCloseSes.getWidth(),imgCloseSes.getHeight(), Image.SCALE_DEFAULT));
		imgCloseSes.setIcon(icon);
		imgCloseSes.setBackground(Color.LIGHT_GRAY);
		imgCloseSes.setActionCommand(Constants.CERRAR_S);
		imgCloseSes.addActionListener(mainWindow.getEvents());
		imgCloseSes.setBorder(null);
		panelOptions.add(imgCloseSes);
		
		cuenta = new Label(Constants.LABEL_MARIA);
		this.add(cuenta);
		this.add(panelOptions);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		 Stroke pincel = new BasicStroke(2.0f);
		 ((Graphics2D) g).setStroke(pincel);
       // g.drawOval(10, 10, 200, 200 );
	}
}
