package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelCelularesYTablets extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<JButton> celularesList;
	private JPanelUsers jpanelUsers;
	private ImageIcon icon;
	private JButton buttonCel;
	private Font fuente;
	private int selected;
	private String imagen;
//	private String txtImagen;
//	private JButton buttonV;

	public JPanelCelularesYTablets(JPanelUsers jPanelUsers) {
		this.jpanelUsers = jPanelUsers;
		setLayout(new GridLayout(4, 5));
		celularesList = new ArrayList<>();
		setVisible(true);
	}

	public void initComponents() {
		for (int i = 0; i < celularesList.size(); i++) {
			this.add(celularesList.get(i));
			celularesList.get(i).setActionCommand(Constants.SELECTED_1);
			celularesList.get(i).addActionListener(jpanelUsers);
		}
	}
	
	public void newButton(String imagen, String txt){
		this.imagen = imagen;
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
		celularesList.add(buttonCel);
	}

	public List<JButton> getCelularesList() {
		return celularesList;
	}
	
	public String obtenerTitulo(int i){
		return celularesList.get(i).getText();
	}
	
	public Icon obtenerImagen(int i){
		return celularesList.get(i).getIcon();
	}
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void setCelularesList(List<JButton> celularesList) {
		this.celularesList = celularesList;
	}

	public int getSelected() {
		return selected;
	}

	public void setSelected(int selected) {
		this.selected = selected;
	}
}