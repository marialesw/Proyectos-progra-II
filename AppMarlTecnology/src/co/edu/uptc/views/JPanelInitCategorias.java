package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelInitCategorias extends JPanel implements MouseListener{

	private JButton button1, button2, button3, button4;
	private JPanel panel1, panel2, panel3, panel4;
	private ImageIcon image;
	private ImageIcon icon;
	private Color color;
	private JPanelUsers jPanelUsers;
	private JPanelImage1 image1;
	private JLabel label;

	
	public JPanelInitCategorias(JPanelUsers jPanelUsers) {
		this.jPanelUsers = jPanelUsers;
    	color = new Color(29, 26, 91);
    	setBackground(new Color(29, 26, 91));
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		
		setLayout(new GridLayout(2, 2));
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(color);
		button1 = new JButton();
		button1.setBounds(50, 50, 400, 300);
		image = new ImageIcon(getClass().getResource("/images/celyta.jpg"));
		icon = new ImageIcon(image.getImage().getScaledInstance(button1.getWidth(),button1.getHeight(), Image.SCALE_DEFAULT));
		button1.setIcon(icon);
		button1.setBackground(color);
		button1.setBorder(null);
		button1.setActionCommand(Constants.BUTTON1);
		button1.addActionListener(jPanelUsers);
		button1.addMouseListener(this);
		panel1.add(button1);
		this.add(panel1);
		
		panel2 = new JPanel();
		panel2.setBackground(color);
		panel2.setLayout(null);
		button2 = new JButton();
		button2.setBounds(50, 50, 450, 220);
		image = new ImageIcon(getClass().getResource("/images/audiov.jpg"));
		icon = new ImageIcon(image.getImage().getScaledInstance(button2.getWidth(),button2.getHeight(), Image.SCALE_DEFAULT));
		button2.setIcon(icon);
		button2.setBackground(color);
		button2.setBorder(null);
		button2.setActionCommand(Constants.BUTTON2);
		button2.addActionListener(jPanelUsers);
		button2.addMouseListener(this);
		panel2.add(button2);
		this.add(panel2);
		
		panel3 = new JPanel();
		panel3.setBackground(color);
		panel3.setLayout(null);
		button3 = new JButton();
		button3.setBounds(50, 50, 450, 220);
		image = new ImageIcon(getClass().getResource("/images/comput.png"));
		icon = new ImageIcon(image.getImage().getScaledInstance(button3.getWidth(),button3.getHeight(), Image.SCALE_DEFAULT));
		button3.setIcon(icon);
		button3.setBackground(color);
		button3.setBorder(null);
		button3.setActionCommand(Constants.BUTTON3);
		button3.addActionListener(jPanelUsers);
		button3.addMouseListener(this);
		panel3.add(button3);
		this.add(panel3);
		
		panel4 = new JPanel();
		panel4.setBackground(color);
		panel4.setLayout(null);
		button4 = new JButton();
		button4.setBounds(50, 50, 450, 220);
		image = new ImageIcon(getClass().getResource("/images/videoj.jpg"));
		icon = new ImageIcon(image.getImage().getScaledInstance(button4.getWidth(),button4.getHeight(), Image.SCALE_DEFAULT));
		button4.setIcon(icon);
		button4.setBackground(color);
		button4.setBorder(null);
		button4.setActionCommand(Constants.BUTTON4);
		button4.addActionListener(jPanelUsers);
		button4.addMouseListener(this);
		panel4.add(button4);
		this.add(panel4);
	}
	
	public void createPanelRepalce1(){
		image1 = new JPanelImage1();
		image1.setVisible(true);
		this.add(image1);
	}
	
	public JLabel addText(String path){
		label = new JLabel();
		label.setBounds(20, 150, 500, 100);
		image = new ImageIcon(getClass().getResource(path));
		icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icon);
		return label;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == button1) {
			System.out.println("click");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == button1) {
			panel1.remove(button1);
			addText("/images/txtCels.png");
			panel1.add(label);
			button1.setBounds(10, 10, 500, 400);
			panel1.add(button1);
			repaint();
		}else if (e.getSource() == button2) {
			panel2.remove(button2);
			addText("/images/txtAud.png");
			panel2.add(label);
			button2.setBounds(10, 10, 500, 400);
			panel2.add(button2);
			repaint();
		}else if (e.getSource() == button3) {
			panel3.remove(button3);
			addText("/images/txtComp.png");
			panel3.add(label);
			button3.setBounds(10, 10, 500, 400);
			panel3.add(button3);
			repaint();
		}else if (e.getSource() == button4) {
			panel4.remove(button4);
			addText("/images/txtVide.png");
			panel4.add(label);
			button4.setBounds(10, 10, 500, 400);
			panel4.add(button4);
			repaint();
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == button1) {
			button1.setBounds(10, 10, 500, 300);
			panel1.remove(label);
			panel1.add(button1);
			repaint();
		}else if (e.getSource() == button2) {
			button2.setBounds(10, 10, 500, 300);
			panel2.remove(label);
			panel2.add(button2);
			repaint();
		}else if (e.getSource() == button3) {
			button3.setBounds(10, 10, 500, 300);
			panel3.remove(label);
			panel3.add(button3);
			repaint();
		}else if (e.getSource() == button4) {
			button4.setBounds(10, 10, 500, 300);
			panel4.remove(label);
			panel4.add(button4);
			repaint();
		}
	}
}
