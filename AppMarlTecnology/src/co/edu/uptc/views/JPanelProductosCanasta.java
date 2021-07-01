package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelProductosCanasta extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<JButton> canastaList;
	private JPanelUsers jpanelUsers;
	private ImageIcon icon;
	private JButton buttonCel;
	private Font fuente;
	private int selected;
	private String imagen;
	private String txtImagen;
	private JLabel labelTitle;

	public JPanelProductosCanasta(JPanelUsers jPanelUsers) {
		this.jpanelUsers = jPanelUsers;
		setPreferredSize(new Dimension(550, 450));
		setLayout(new GridLayout(4, 5));
		canastaList = new ArrayList<>();
		initComponents();
		setVisible(true);
	}

	public void initComponents() {
		labelTitle = new JLabel("PRODUCTOS EN CANASTA");
		for (int i = 0; i < canastaList.size(); i++) {
			this.add(canastaList.get(i));
			canastaList.get(i).setActionCommand(Constants.SELECTED_1);
			canastaList.get(i).addActionListener(jpanelUsers);
		}
	}
	
	public void newButton(String imagen, String txt){
		this.imagen = imagen;
		this.txtImagen = txt;
		ImageIcon icono = new ImageIcon(imagen);
		buttonCel = new JButton();
		buttonCel.setSize(190, 300);
		icon = new ImageIcon(icono.getImage().getScaledInstance(buttonCel.getWidth(),buttonCel.getHeight(), Image.SCALE_DEFAULT));
		buttonCel.setIcon(icon);
		buttonCel.setText(txt);
		fuente = new Font("Arial", 1, 16);
		buttonCel.setFont(fuente);
		buttonCel.setContentAreaFilled(true);
		buttonCel.setBackground(Color.white);
		canastaList.add(buttonCel);
	}
	
	public void addImage(Icon imagen){
		buttonCel.setIcon(imagen);
	}

	public List<JButton> getCelularesList() {
		return canastaList;
	}
	
	public String obtenerTitulo(int i){
		return canastaList.get(i).getText();
	}
	
	public Icon obtenerImagen(int i){
		return canastaList.get(i).getIcon();
	}
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void setCelularesList(List<JButton> celularesList) {
		this.canastaList = celularesList;
	}

	public int getSelected() {
		return selected;
	}

	public void setSelected(int selected) {
		this.selected = selected;
	}
}