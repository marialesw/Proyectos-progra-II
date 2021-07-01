package co.edu.uptc.views;

import java.awt.Color;

import javax.swing.JPanel;

public class JPanelAdminisUsers extends JPanel {
	

	private JPanelListUsers listUsers;

	public JPanelAdminisUsers() {
		setLayout(null);
    	setBackground(new Color(29, 26, 91));
		initComponents();
	}
	
	private void initComponents() {
		listUsers = new JPanelListUsers(this);
		listUsers.setBounds(500, 20, 400, 500);
		this.add(listUsers);
	}
}
