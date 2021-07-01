package co.edu.uptc.views;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.uptc.controllers.MainController;

public class MainWindow extends JFrame{
	
	private Events events;
	private JPanelMenus jPanelMenus;
	private JPanelRegister jPanelRegister;
	private JDialogAddPerson daP;
	private MainController controller;
	private JPanelInit jpanelInit;
	
	public MainWindow() {
		setLayout(new BorderLayout());
		setTitle(Constants.T_MAIN_WINDOW);
		setSize(800, 600);		
		initComponents();
		setResizable(false);//No permite que se pueda maximizar la ventana
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void initComponents() {
		events = new Events(this);
		controller = new MainController(this);
		jPanelMenus = new JPanelMenus(this);
		add(jPanelMenus, BorderLayout.NORTH);
		createPanelInit();
	}
	
	public void createPanelRegister(){
		jPanelRegister = new JPanelRegister(this);
		add(jPanelRegister, BorderLayout.CENTER);
	}
	
	public void createPanelInit(){
		jpanelInit = new JPanelInit(this);
		add(jpanelInit, BorderLayout.CENTER);
	}
	
    public void mostrarDialogAddPerson( ){
        daP = new JDialogAddPerson( jPanelRegister );
        daP.setVisible( true );
    }
    
    public void cerrarDialogoAddP() {
		daP.setVisible(false);
	}

	public Events getEvents() {
		return events;
	}

	public void setEvents(Events events) {
		this.events = events;
	}

	public JPanelMenus getjPanelMenus() {
		return jPanelMenus;
	}

	public void setjPanelMenus(JPanelMenus jPanelMenus) {
		this.jPanelMenus = jPanelMenus;
	}

	public JPanelRegister getjPanelRegister() {
		return jPanelRegister;
	}

	public void setjPanelRegister(JPanelRegister jPanelRegister) {
		this.jPanelRegister = jPanelRegister;
	}

	public JDialogAddPerson getDaP() {
		return daP;
	}

	public void setDaP(JDialogAddPerson daP) {
		this.daP = daP;
	}

	
	public JPanelInit getJpanelInit() {
		return jpanelInit;
	}

	public void setJpanelInit(JPanelInit jpanelInit) {
		this.jpanelInit = jpanelInit;
	}

	public MainController getController() {
		return controller;
	}

	public void setController(MainController controller) {
		this.controller = controller;
	}
}
