package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class JPanelComputadores extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<JButton> computadoresList;
	private JPanelUsers jpanelUsers;
	private ImageIcon icon;
	private JButton buttonAud;
	private Font fuente;

	public JPanelComputadores(JPanelUsers jPanelUsers) {
		this.jpanelUsers = jPanelUsers;
		setLayout(new GridLayout(2, 5));
		computadoresList = new ArrayList<>();
		setVisible(true);
	}

	public void initComponents() {
		for (int i = 0; i < computadoresList.size(); i++) {
			this.add(computadoresList.get(i));
			computadoresList.get(i).setActionCommand(Constants.SELECTED_3);
			computadoresList.get(i).addActionListener(jpanelUsers);
		}
	}
	
	public void newButton(String imagen, String txt){
		ImageIcon icono = new ImageIcon(imagen);
		buttonAud = new JButton();
		buttonAud.setSize(190, 150);
		icon = new ImageIcon(icono.getImage().getScaledInstance(buttonAud.getWidth(),buttonAud.getHeight(), Image.SCALE_DEFAULT));
		buttonAud.setIcon(icon);
		buttonAud.setText(txt);
		fuente = new Font("Arial", 1, 14);
		buttonAud.setFont(fuente);
		buttonAud.setContentAreaFilled(true);
		buttonAud.setBackground(Color.white);
		computadoresList.add(buttonAud);
	}
	
	public List<JButton> getCelularesList() {
		return computadoresList;
	}
	
	public String obtenerTitulo(int i){
		return computadoresList.get(i).getText();
	}
	
	public Icon obtenerImagen(int i){
		return computadoresList.get(i).getIcon();
	}

	public void setCelularesList(List<JButton> celularesList) {
		this.computadoresList = celularesList;
	}
}