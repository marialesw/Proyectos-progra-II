package co.edu.uptc.views;

import java.awt.Color;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;



public class JPanelMenus extends JMenuBar{
	
	private static final long serialVersionUID = 1L;
	
	private JMenu jMainMenu, jMLanguage;
	private JMenuItem  jmiEnglish, jmiSpanish, jmInit;

	private JMenuItem jmExit;
	private MainWindow mainWindow;

	public JPanelMenus(MainWindow mainWindow){
		this.mainWindow = mainWindow;
		initComponents();
		setBackground(new Color(34, 177, 76));
	}

	private void initComponents() {
		
		jMainMenu = new JMenu(Constants.T_MAIN_MENU);
		jMainMenu.setBackground(Color.black);
		this.add(jMainMenu);
		
		jmInit = new JMenuItem(Constants.T_MENU_INIT);
		jmInit.setActionCommand(Constants.T_MENU_INIT);
		jmInit.addActionListener(mainWindow.getEvents());
		jMainMenu.add(jmInit);	
		
		jmExit = new JMenuItem(Constants.T_LABEL_SALIR);
		jmExit.setActionCommand(Constants.T_LABEL_SALIR);
		jmExit.addActionListener(mainWindow.getEvents());
		jMainMenu.add(jmExit);	
	}	

	public void changeLanguage(){
		
	}
}