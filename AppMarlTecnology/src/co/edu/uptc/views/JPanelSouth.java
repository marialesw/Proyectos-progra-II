package co.edu.uptc.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelSouth extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabelUniversity;
	private JLabel jLabelName;
	private JLabel jLabelContacto;
	private JLabel jLabelLicencia;
	private JLabel labels;
	private JButton imgCCLicence;
	private ImageIcon image;
	private ImageIcon icon;
	private Color color;
	private GridBagConstraints gbc;
	private JPanel panelLicen;


	public JPanelSouth() {
		setLayout(new GridBagLayout());
		this.color =  Color.darkGray;
		setBackground(color);
		initComponents();
		setVisible(true);
	}
	
	public void initComponents(){
		gbc = new GridBagConstraints();
		generateBasicGridX(gbc);
		generateBasicGridY(gbc);
		gbc.insets = new Insets(10, 10, 10, 10);
		
		jLabelUniversity = new JLabel("UNIVERSIDAD PEDAGÓGICA Y TECNOLÓGICA DE COLOMBIA");
		jLabelUniversity.setForeground(Color.white);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 3;
		this.add(jLabelUniversity, gbc);


		jLabelName = new JLabel("MARIA LISBETH LATORRE ORJUELA");
		jLabelName.setForeground(Color.white);
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 3;
		this.add(jLabelName, gbc);


		jLabelContacto = new JLabel("maria.latorre@uptc.edu.co");
		jLabelContacto.setForeground(Color.white);
		gbc.gridx = 4;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		this.add(jLabelContacto, gbc);


		jLabelLicencia = new JLabel("Copyright © 2018 MarlTecnology.");
		jLabelLicencia.setForeground(Color.white);
		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		this.add(jLabelLicencia, gbc);
		
		panelLicen = new JPanel();
		panelLicen.setPreferredSize(new Dimension(150, 50));
		panelLicen.setBackground(color);

		imgCCLicence = new JButton();
		imgCCLicence.setBounds(0,0, 150, 50);
		image = new ImageIcon(getClass().getResource("/images/licencia.png"));
		icon = new ImageIcon(image.getImage().getScaledInstance(imgCCLicence.getWidth(),imgCCLicence.getHeight(), Image.SCALE_DEFAULT));
		imgCCLicence.setIcon(icon);
		imgCCLicence.setBackground(color);
		imgCCLicence.setBorder(null);
		gbc.gridx = 6;
		gbc.gridy = 1;
		gbc.gridheight = 2;
		gbc.gridwidth = 1;
		panelLicen.add(imgCCLicence);
		this.add(panelLicen, gbc);
	}
	
	private void generateBasicGridX(GridBagConstraints gbc){
		gbc.weightx = 1;
		gbc.gridheight = 1;
		for (int i = 0; i < 8; i++) {
			gbc.gridx = i;
			add(new JLabel("" ), gbc);
		}
	}

	private void generateBasicGridY(GridBagConstraints gbc){
		gbc.weighty = 1;
		gbc.gridheight = 1;
		for (int i = 0; i < 4; i++) {
			gbc.gridy = i;
			add(new JLabel(""  ), gbc);
		}
	}

}
