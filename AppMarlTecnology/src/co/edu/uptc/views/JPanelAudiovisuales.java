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

public class JPanelAudiovisuales extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<JButton> audiovisualesList;
	private JPanelUsers jpanelUsers;
	private ImageIcon icon;
	private JButton buttonAud;
	private Font fuente;

	public JPanelAudiovisuales(JPanelUsers jPanelUsers) {
		this.jpanelUsers = jPanelUsers;
		setLayout(new GridLayout(3, 5));
		audiovisualesList = new ArrayList<>();
		setVisible(true);
	}

	public void initComponents() {
		for (int i = 0; i < audiovisualesList.size(); i++) {
			this.add(audiovisualesList.get(i));
			audiovisualesList.get(i).setActionCommand(Constants.SELECTED_2);
			audiovisualesList.get(i).addActionListener(jpanelUsers);
		}
	}
	
	public void newButton(String imagen, String txt){
		ImageIcon icono = new ImageIcon(imagen);
		buttonAud = new JButton();
		buttonAud.setSize(170, 300);
		icon = new ImageIcon(icono.getImage().getScaledInstance(buttonAud.getWidth(),buttonAud.getHeight(), Image.SCALE_DEFAULT));
		buttonAud.setIcon(icon);
		buttonAud.setText(txt);
		fuente = new Font("Arial", 1, 14);
		buttonAud.setFont(fuente);
		buttonAud.setContentAreaFilled(true);
		buttonAud.setBackground(Color.white);
		audiovisualesList.add(buttonAud);
	}
	
	public List<JButton> getCelularesList() {
		return audiovisualesList;
	}
	
	public String obtenerTitulo(int i){
		return audiovisualesList.get(i).getText();
	}
	
	public Icon obtenerImagen(int i){
		return audiovisualesList.get(i).getIcon();
	}

	public void setCelularesList(List<JButton> celularesList) {
		this.audiovisualesList = celularesList;
	}
}