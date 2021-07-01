package co.edu.uptc.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JPanelAddCanasta extends JPanel{

	private JLabel labelImage;
	private JPanel panelImage;
	private ImageIcon icon;
	private JPanel panelDescription;
	private JLabel labelTitle;
	private Font fuente;
	private JLabel labelPrecio;
	private JLabel labelDescripcion;
	private JButton buttonCanasta;
	private ImageIcon icono;
	private JButton buttonCancel;
	private JPanelUsers jpanelUser;

	public JPanelAddCanasta(JPanelUsers jPanelUsers) {
		this.jpanelUser = jPanelUsers;
		setPreferredSize(new Dimension(550, 450));
		setLayout(new GridLayout(1, 2));
		initComponents();
		setBackground(Color.blue);
		setVisible(true);
	}
	
	public void initComponents() {
		
		panelImage = new JPanel();
		panelImage.setLayout(null);
		labelImage = new JLabel();
		labelImage.setBounds(50, 50, 300, 400);
		panelImage.setBackground(Color.white);
		panelImage.add(labelImage);
		this.add(panelImage);
		
		panelDescription = new JPanel();
		panelDescription.setBackground(Color.white);
		panelDescription.setLayout(null);
		
		labelTitle = new JLabel();
		fuente = new Font("Arial", 1, 18);
		labelTitle.setFont(fuente);
		labelTitle.setBounds(50, 100, 300, 30);
		panelDescription.add(labelTitle);
		
		labelPrecio = new JLabel();
		fuente = new Font("Arial", 2, 16);
		labelPrecio.setFont(fuente);
		labelPrecio.setForeground(Color.red);
		labelPrecio.setBounds(50, 180, 300, 30);
		panelDescription.add(labelPrecio);
		
		labelDescripcion = new JLabel();
		fuente = new Font("Arial", 3, 16);
		labelDescripcion.setFont(fuente);
		labelDescripcion.setForeground(Color.BLACK);
		labelDescripcion.setBounds(50, 230, 300, 30);
		panelDescription.add(labelDescripcion);
		
		buttonCanasta = new JButton();
		buttonCanasta.setBounds(0, 350, 180, 50);
		icono = new ImageIcon(getClass().getResource("/images/canasta.png"));
		icon = new ImageIcon(icono.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
		buttonCanasta.setIcon(icon);
		buttonCanasta.setText("Añadir");
		fuente = new Font("Arial", 3, 16);
		buttonCanasta.setFont(fuente);
		buttonCanasta.setForeground(Color.BLUE);
		buttonCanasta.setBackground(Color.WHITE);
		buttonCanasta.setBorder(null);
		buttonCanasta.setActionCommand(Constants.ADD_CANASTA);
		buttonCanasta.addActionListener(jpanelUser);
		panelDescription.add(buttonCanasta);
		
		buttonCancel = new JButton(Constants.T_LABEL_CANCELAR);
		buttonCancel.setBounds(170, 380, 80,10);
		fuente = new Font("Arial", 2, 12);
		buttonCancel.setFont(fuente);
		buttonCancel.setForeground(Color.red);
		buttonCancel.setBackground(Color.white);
		buttonCancel.setBorder(null);
		buttonCancel.setPreferredSize(new Dimension(50, 5));
		buttonCancel.setActionCommand(Constants.T_LABEL_CANCELAR);
		buttonCancel.addActionListener(jpanelUser);
		panelDescription.add(buttonCancel);
		
		this.add(panelDescription);
	}
	public String obtenerNmbre(){
		return labelTitle.getText();
	}
	public void addImage(Icon imagen){
		labelImage.setIcon(imagen);
	}
	
	public void modificarLabels(String name, String precio, String description){
		labelTitle.setText(name);
		labelPrecio.setText(precio);
		labelDescripcion.setText(description);
	}
}
