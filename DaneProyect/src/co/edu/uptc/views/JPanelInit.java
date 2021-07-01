package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import co.edu.uptc.models.Gender;
import co.edu.uptc.models.NivelEducational;
import co.edu.uptc.models.Profession;
import co.edu.uptc.models.TypeDocument;

public class JPanelInit extends JPanel{

	private JPanel panelOptions;
	private JPanelListFamilys jPanelListFamilys;
	private JButton buttonVolver;
	private Font fuente;
	private JButton buttonAdd;
	private JButton buttonNivelEducation;
	private JButton buttonAges;
	private JButton buttonVisualize;
	private JLabel labelFamily;
	private ImageIcon image;
	private ImageIcon icon;
	private Color fondo;
	private MainWindow mainWindow;
	private JButton buttonSaveFamily;
	private JPanel panelGraficar;
	private JButton buttonRegister;
	private JButton buttonMensAndWomens;
	private JLabel labelChart;
	private JLabel labelPopulation;
	private JTextField jtxtPop;
	private JButton buttonCareer;
	private JDialogGraficas dialogGraficas;

	public JPanelInit(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		setLayout(null);
		this.fondo = new Color(239, 228, 176);
		setBackground(fondo);
		initComponents();
	}

	private void initComponents() {
		
		panelOptions = new JPanel();
		panelOptions.setLayout( new GridLayout(2, 1) );
		panelOptions.setBounds(30, 180, 250, 120);
		panelOptions.setBorder( new CompoundBorder( new EmptyBorder( 10, 10, 10, 10 ), new TitledBorder( "OPCIONES" ) ) );

		buttonRegister = new JButton(Constants.REGISTER_FAMILY);
		buttonRegister.setBackground(fondo);
		buttonRegister.setActionCommand(Constants.REGISTER_FAMILY);
		buttonRegister.addActionListener(mainWindow.getEvents());
		panelOptions.add(buttonRegister);

		buttonVisualize = new JButton(Constants.VISUALIZE_PRODUCT);
		buttonVisualize.setBackground(fondo);
		panelOptions.add(buttonVisualize);

		this.add(panelOptions);
		
		panelGraficar = new JPanel();
		panelGraficar.setLayout( new GridLayout(2, 2) );
		panelGraficar.setBounds(30, 300, 380, 140);
		panelGraficar.setBorder( new CompoundBorder( new EmptyBorder( 10, 10, 10, 10 ), new TitledBorder( "DIAGRAMAS" ) ) );

		buttonMensAndWomens = new JButton(Constants.MENS_VS_WOMENS);
		buttonMensAndWomens.setBackground(fondo);
		buttonMensAndWomens.setActionCommand(Constants.MENS_VS_WOMENS);
		buttonMensAndWomens.addActionListener(mainWindow.getEvents());
		panelGraficar.add(buttonMensAndWomens);

		buttonNivelEducation = new JButton(Constants.NIVEL_EDU_BUTTON);
		buttonNivelEducation.setBackground(fondo);
		buttonNivelEducation.setActionCommand(Constants.NIVEL_EDU_BUTTON);
		buttonNivelEducation.addActionListener(mainWindow.getEvents());
		panelGraficar.add(buttonNivelEducation);

		buttonAges = new JButton(Constants.AGES_BUTTON);
		buttonAges.setBackground(fondo);
		buttonAges.setActionCommand(Constants.AGES_BUTTON);
		buttonAges.addActionListener(mainWindow.getEvents());
		panelGraficar.add(buttonAges);

		buttonCareer = new JButton(Constants.CAREER_BUTTON);
		buttonCareer.setBackground(fondo);
		panelGraficar.add(buttonCareer);

		this.add(panelGraficar);

		labelFamily = new JLabel();
		image = new ImageIcon(getClass().getResource("/images/dane.png"));
		labelFamily.setBounds(0, 0, 790, 170);
		icon = new ImageIcon(image.getImage().getScaledInstance(labelFamily.getWidth(),labelFamily.getHeight(), Image.SCALE_DEFAULT));
		labelFamily.setIcon(icon);
		labelFamily.setBackground(fondo);
		labelFamily.setBorder(null);
		this.add(labelFamily);

		jPanelListFamilys = new JPanelListFamilys();
		jPanelListFamilys.setBounds(420, 120, 320, 350);
		this.add(jPanelListFamilys);

		labelChart = new JLabel();
		image = new ImageIcon(getClass().getResource("/images/pastel.png"));
		labelChart.setBounds(420, 480, 50, 50);
		icon = new ImageIcon(image.getImage().getScaledInstance(labelChart.getWidth(),labelChart.getHeight(), Image.SCALE_DEFAULT));
		labelChart.setIcon(icon);
		labelChart.setBackground(fondo);
		labelChart.setBorder(null);
		this.add(labelChart);
		
		labelPopulation = new JLabel("POBLACIÓN TOTAL: ");
		labelPopulation.setBounds(490, 480, 210, 60);
		fuente = new Font("Arial", 3, 17);
		labelPopulation.setFont(fuente);
		labelPopulation.setForeground(Color.red);
		labelPopulation.setBackground(fondo);
		labelPopulation.setBorder(null);
		this.add(labelPopulation);
		
		jtxtPop = new JTextField();
		fuente = new Font("Arial", 3, 17);
		jtxtPop.setFont(fuente);
		jtxtPop.setBounds(670, 480, 100, 60);
		jtxtPop.setBackground(fondo);
		jtxtPop.setBorder(null);
		jtxtPop.setEditable(false);
		this.add(jtxtPop);

	}

	public MainWindow getMainWindow() {
		return mainWindow;
	}

	public void setMainWindow(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}

	public void createPerson(){
		String name = mainWindow.getDaP().getPanelAgregar().obtenerNombre();
		String lastName =  mainWindow.getDaP().getPanelAgregar().obtenerApellidos();
		TypeDocument  typeDocument =  mainWindow.getDaP().getPanelAgregar().getjBoxTypeDocument();
		NivelEducational nivelEducational =  mainWindow.getDaP().getPanelAgregar().getjBoxNivelEducational();
		Profession profession =  mainWindow.getDaP().getPanelAgregar().getjBoxProfession();
		Gender gender =  mainWindow.getDaP().getPanelAgregar().getjBoxGender();
		Calendar dateOfBirth = mainWindow.getDaP().getPanelAgregar().getdateOfBirth();
		String numberDocument = mainWindow.getDaP().getPanelAgregar().obtenerNumeroDocumento();
		if (name != null && !name.isEmpty() && lastName != null && !lastName.isEmpty() &&
				numberDocument != null && !numberDocument.isEmpty()  ) {
			mainWindow.getController().createPerson( mainWindow.getDaP(), name, lastName, typeDocument, numberDocument, dateOfBirth, nivelEducational, profession, gender);
			mainWindow.getDaP().getPanelAgregar().limpiarCampos();
		}
	}
	
	  public void mostrarDialogGraphics( int n){
	       dialogGraficas = new JDialogGraficas(this, n);
	       dialogGraficas.setVisible(true);
	    }

	public JPanel getPanelOptions() {
		return panelOptions;
	}
	
	public JTextField getJtxtPop() {
		return jtxtPop;
	}

	public void setJtxtPop(String jtxtPop) {
		this.jtxtPop.setText(jtxtPop);
	}

	public void setPanelOptions(JPanel panelOptions) {
		this.panelOptions = panelOptions;
	}

	public JPanelListFamilys getjPanelListFamilys() {
		return jPanelListFamilys;
	}

	public void setjPanelListFamilys(JPanelListFamilys jPanelListFamilys) {
		this.jPanelListFamilys = jPanelListFamilys;
	}

	public JButton getButtonVolver() {
		return buttonVolver;
	}

	public void setButtonVolver(JButton buttonVolver) {
		this.buttonVolver = buttonVolver;
	}

	public Font getFuente() {
		return fuente;
	}

	public void setFuente(Font fuente) {
		this.fuente = fuente;
	}

	public JButton getButtonAdd() {
		return buttonAdd;
	}

	public void setButtonAdd(JButton buttonAdd) {
		this.buttonAdd = buttonAdd;
	}

	public JButton getButtonDelete() {
		return buttonNivelEducation;
	}

	public void setButtonDelete(JButton buttonDelete) {
		this.buttonNivelEducation = buttonDelete;
	}

	public JButton getButtonEdit() {
		return buttonAges;
	}

	public void setButtonEdit(JButton buttonEdit) {
		this.buttonAges = buttonEdit;
	}

	public JButton getButtonVisualize() {
		return buttonVisualize;
	}

	public void setButtonVisualize(JButton buttonVisualize) {
		this.buttonVisualize = buttonVisualize;
	}

	public JLabel getLabelFamily() {
		return labelFamily;
	}

	public void setLabelFamily(JLabel labelFamily) {
		this.labelFamily = labelFamily;
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

	public Color getFondo() {
		return fondo;
	}

	public void setFondo(Color fondo) {
		this.fondo = fondo;
	}

	public JDialogGraficas getDialogGraficas() {
		return dialogGraficas;
	}

	public void setDialogGraficas(JDialogGraficas dialogGraficas) {
		this.dialogGraficas = dialogGraficas;
	}
	
	

}
