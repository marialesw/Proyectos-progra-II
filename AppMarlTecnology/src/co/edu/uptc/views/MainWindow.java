package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import co.edu.uptc.controller.MainController;

public class MainWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanelInit jPanelInit;
	private JPanelLoginUser jPanelLogin;
	private JPanelCreateUser jPanelCreateUser;
	private Events events;
	private EventosMause eventosMause;
	private JPanelLoginAdmin jPanelLoginAdmin;
	private MainController controller;
	private JPanelAdministrator jpanelAdministrador;
	private JPanelUsers jPanelUsers;
	
	public MainWindow() {
		controller = new MainController(this);
		events = new Events(this);
		setTitle(Constants.T_MAIN_WINDOW);
		setSize(650, 710);
		Image icon = new ImageIcon(getClass().getResource("/images/MarlTecnology.png")).getImage();
        setIconImage(icon);
		initComponents();
		setResizable(false);//No permite que se pueda maximizar la ventana
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
	}

	private void initComponents() {
		createPanelInit();
		//createPanelAdministrator();
		//createPanelUsuarios();
	}
	
	public void createPanelCreateUser(){
		jPanelCreateUser = new JPanelCreateUser(this);
		jPanelCreateUser.setVisible(true);
		add(jPanelCreateUser);
	}
	
	public void createPanelUsuarios(){
		jPanelUsers = new JPanelUsers(this);
		jPanelUsers.setVisible(true);
		add(jPanelUsers);
	}
	
	public void createPanelAdministrator(){
		jpanelAdministrador = new JPanelAdministrator(this);
		jpanelAdministrador.setVisible(true);
		add(jpanelAdministrador);
	}
	
	public void createPanelInit(){
		jPanelInit = new JPanelInit(this);
		jPanelInit.setVisible(true);
		add(jPanelInit);
	}
	
	public void createPanelLogin(){
		jPanelLogin = new JPanelLoginUser(this);
		jPanelLogin.setVisible(true);
		add(jPanelLogin);
	}
	
	public void createPanelLoginAdmin(){
		jPanelLoginAdmin = new JPanelLoginAdmin(this);
		jPanelLoginAdmin.setVisible(true);
		add(jPanelLoginAdmin);
	}

	public JPanelInit getjPanelInit() {
		return jPanelInit;
	}

	public void setjPanelInit(JPanelInit jPanelInit) {
		this.jPanelInit = jPanelInit;
	}

	public JPanelLoginUser getjPanelLogin() {
		return jPanelLogin;
	}

	public void setjPanelLogin(JPanelLoginUser jPanelLogin) {
		this.jPanelLogin = jPanelLogin;
	}

	public Events getEvents() {
		return events;
	}

	public void setEvents(Events events) {
		this.events = events;
	}

	public JPanelLoginAdmin getjPanelLoginAdmin() {
		return jPanelLoginAdmin;
	}

	public void setjPanelLoginAdmin(JPanelLoginAdmin jPanelLoginAdmin) {
		this.jPanelLoginAdmin = jPanelLoginAdmin;
	}

	public MainController getController() {
		return controller;
	}

	public void setController(MainController controller) {
		this.controller = controller;
	}

	public JPanelCreateUser getjPanelCreateUser() {
		return jPanelCreateUser;
	}

	public void setjPanelCreateUser(JPanelCreateUser jPanelCreateUser) {
		this.jPanelCreateUser = jPanelCreateUser;
	}

	public JPanelAdministrator getJpanelAdministrador() {
		return jpanelAdministrador;
	}

	public void setJpanelAdministrador(JPanelAdministrator jpanelAdministrador) {
		this.jpanelAdministrador = jpanelAdministrador;
	}

	public EventosMause getEventosMause() {
		return eventosMause;
	}

	public void setEventosMause(EventosMause eventosMause) {
		this.eventosMause = eventosMause;
	}

	public JPanelUsers getjPanelUsers() {
		System.out.println(jPanelUsers);
		return jPanelUsers;
	}

	public void setjPanelUsers(JPanelUsers jPanelUsers) {
		this.jPanelUsers = jPanelUsers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
