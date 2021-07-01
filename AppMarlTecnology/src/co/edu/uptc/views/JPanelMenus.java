package co.edu.uptc.views;

import java.awt.Color;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;



public class JPanelMenus extends JMenuBar{
	
	private static final long serialVersionUID = 1L;
	
	private JMenu jMainMenu;
	private JButton jMCanasta;

	private JMenuItem  jmiEnglish, jmiSpanish, jmInit;

	private JMenuItem jmExit;
	private MainWindow mainWindow;

	private int n;

	private JMenu jMlanguage;

	private JMenuItem jmCSesion;

	public JPanelMenus(MainWindow mainWindow, int n){
		this.n = n;
		this.mainWindow = mainWindow;
		setBackground(Color.decode("#CD5C5C"));
		initComponents();
	}

	private void initComponents() {
		
		jMainMenu = new JMenu(Constants.T_MAIN_MENU);
		jMainMenu.setBackground(Color.white);
		this.add(jMainMenu);

		jMlanguage = new JMenu(Constants.T_MENU_LANGUAGE);
		jMlanguage.setBackground(Color.white);
		this.add(jMlanguage);

		//		English
		jmiEnglish = new JMenuItem(Constants.T_MENU_ENGLISH);
		jMlanguage.add(jmiEnglish);	

		//		Spanish
		jmiSpanish = new JMenuItem(Constants.T_MENU_SPANISH);
		jMlanguage.add(jmiSpanish);
		if (n == 1) {
			jmInit = new JMenuItem(Constants.T_MENU_INIT);
			jmInit.setActionCommand(Constants.T_MENU_INIT);
			jmInit.addActionListener(mainWindow.getEvents());
			jMainMenu.add(jmInit);	
		}else if (n == 2) {
			jmInit = new JMenuItem(Constants.T_MENU_CATEGORIES);
			jmInit.setActionCommand(Constants.T_MENU_CATEGORIES);
			jmInit.addActionListener(mainWindow.getEvents());
			jMainMenu.add(jmInit);	
			
			jmCSesion = new JMenuItem(Constants.T_MENU_CERRAR);
			jmCSesion.setActionCommand(Constants.T_MENU_CERRAR);
			jmCSesion.addActionListener(mainWindow.getEvents());
			jMainMenu.add(jmCSesion);
			
			jMCanasta = new JButton(Constants.T_MENU_CANASTA);
			jMCanasta.setBackground(Color.white);
			jMCanasta.setActionCommand(Constants.T_MENU_CANASTA);
			jMCanasta.setBackground(Color.decode("#CD5C5C"));
			jMCanasta.addActionListener(mainWindow.getjPanelUsers());
			jMainMenu.add(jMCanasta);
			
		}
		
		jmExit = new JMenuItem(Constants.T_LABEL_SALIR);
		jmExit.setActionCommand(Constants.T_LABEL_SALIR);
		jmExit.addActionListener(mainWindow.getEvents());
		jMainMenu.add(jmExit);	
	}	

	public void changeLanguage(){
		
	}
}