package co.edu.uptc.views;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.plaf.BorderUIResource;

public class JPanelAdministrator extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanelMenus jPanelMenus;
	private JPanelAdminCenter jPanelAdminCenter;
	private MainWindow mainWindow;
	private JPanelSouth jPanelSouth;
	private JPanelOptionsAdmin jPanelOptions;
	private JPanelAdminProductos jpanelAdminProductos;
	private JPanelAdminisUsers adminisUsers;
	
	
	
	public JPanelAdministrator(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		mainWindow.setSize(1200, 700);
		setLayout(new BorderLayout());
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		jPanelMenus = new JPanelMenus(mainWindow, 1);
		this.add(jPanelMenus, BorderLayout.NORTH);
		jPanelSouth = new JPanelSouth();
		this.add(jPanelSouth, BorderLayout.SOUTH);
		jPanelOptions = new JPanelOptionsAdmin(mainWindow);
		this.add(jPanelOptions, BorderLayout.EAST);
		jPanelAdminCenter = new JPanelAdminCenter(mainWindow);
		jpanelAdminProductos = new JPanelAdminProductos(mainWindow);
		jpanelAdminProductos.setVisible(true);
		createJpanelCenter();
		//createJpanelAdminProductos();
		//createJpanelAdminUsers();
	}
	
	public void createJpanelCenter(){
		jPanelAdminCenter = new JPanelAdminCenter(mainWindow);
		this.add(jPanelAdminCenter, BorderLayout.CENTER);	
	}
	
	public void createJpanelAdminUsers(){
		adminisUsers = new JPanelAdminisUsers();
		adminisUsers.setVisible(true);
		this.add(adminisUsers, BorderLayout.CENTER);
	}
	
	public void createJpanelAdminProductos(){
		jpanelAdminProductos = new JPanelAdminProductos(mainWindow);
		jpanelAdminProductos.setVisible(true);
		this.add(jpanelAdminProductos, BorderLayout.CENTER);
	}

	public JPanelMenus getjPanelMenus() {
		return jPanelMenus;
	}

	public void setjPanelMenus(JPanelMenus jPanelMenus) {
		this.jPanelMenus = jPanelMenus;
	}

	public JPanelAdminCenter getjPanelAdminCenter() {
		return jPanelAdminCenter;
	}

	public void setjPanelAdminCenter(JPanelAdminCenter jPanelAdminCenter) {
		this.jPanelAdminCenter = jPanelAdminCenter;
	}

	public MainWindow getMainWindow() {
		return mainWindow;
	}

	public void setMainWindow(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}

	public JPanelSouth getjPanelSouth() {
		return jPanelSouth;
	}

	public void setjPanelSouth(JPanelSouth jPanelSouth) {
		this.jPanelSouth = jPanelSouth;
	}

	public JPanelOptionsAdmin getjPanelOptions() {
		return jPanelOptions;
	}

	public void setjPanelOptions(JPanelOptionsAdmin jPanelOptions) {
		this.jPanelOptions = jPanelOptions;
	}

	public JPanelAdminProductos getJpanelAdminProductos() {
		return jpanelAdminProductos;
	}

	public void setJpanelAdminProductos(JPanelAdminProductos jpanelAdminProductos) {
		this.jpanelAdminProductos = jpanelAdminProductos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JPanelAdminisUsers getAdminisUsers() {
		return adminisUsers;
	}

	public void setAdminisUsers(JPanelAdminisUsers adminisUsers) {
		this.adminisUsers = adminisUsers;
	}

	
	
}
