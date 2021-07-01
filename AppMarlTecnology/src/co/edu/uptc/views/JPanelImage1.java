package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelImage1 extends JPanel{

	private JPanel panel1;
	private JButton button1;
	private ImageIcon image;
	private ImageIcon icon;
	private Color color;

	public JPanelImage1() {
		color = new Color(29, 26, 91);
    	setBackground(new Color(29, 26, 91));
		initComponents();
	}

	private void initComponents() {
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		button1 = new JButton();
		button1.setBounds(0, 0, 500, 700);
		image = new ImageIcon(getClass().getResource("/images/celyta.jpg"));
		icon = new ImageIcon(image.getImage().getScaledInstance(button1.getWidth(),button1.getHeight(), Image.SCALE_DEFAULT));
		button1.setIcon(icon);
		button1.setBackground(color);
		button1.setBorder(null);
		panel1.add(button1, BorderLayout.CENTER);
		this.add(panel1);
	}
}
