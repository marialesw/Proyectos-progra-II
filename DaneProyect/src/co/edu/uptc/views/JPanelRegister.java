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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import co.edu.uptc.models.Gender;
import co.edu.uptc.models.NivelEducational;
import co.edu.uptc.models.Profession;
import co.edu.uptc.models.TypeDocument;

public class JPanelRegister extends JPanel{

	private JPanel panelOptions;
	private JPanelListaPersons jPanelListaPersons;
	private JButton buttonVolver;
	private Font fuente;
	private JButton buttonAdd;
	private JButton buttonDelete;
	private JButton buttonEdit;
	private JButton buttonVisualize;
	private JLabel labelFamily;
	private ImageIcon image;
	private ImageIcon icon;
	private Color fondo;
	private MainWindow mainWindow;
	private JButton buttonSaveFamily;

	public JPanelRegister(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		setLayout(null);
		this.fondo = new Color(239, 228, 176);
		setBackground(fondo);
		initComponents();
	}

	private void initComponents() {
		panelOptions = new JPanel();
		panelOptions.setLayout( new GridLayout(2, 2) );
		panelOptions.setBounds(30, 250, 310, 160);
		panelOptions.setBorder( new CompoundBorder( new EmptyBorder( 10, 10, 10, 10 ), new TitledBorder( "OPCIONES" ) ) );

		buttonAdd = new JButton(Constants.ADD_PERSON);
		buttonAdd.setBackground(fondo);
		buttonAdd.setActionCommand(Constants.ADD_PERSON);
		buttonAdd.addActionListener(mainWindow.getEvents());
		panelOptions.add(buttonAdd);

		buttonDelete = new JButton(Constants.DELETE_PRODUCT);
		buttonDelete.setBackground(fondo);
		panelOptions.add(buttonDelete);

		buttonEdit = new JButton(Constants.EDIT_PRODUCT);
		buttonEdit.setBackground(fondo);
		panelOptions.add(buttonEdit);

		buttonVisualize = new JButton(Constants.VISUALIZE_PRODUCT);
		buttonVisualize.setBackground(fondo);
		panelOptions.add(buttonVisualize);

		this.add(panelOptions);

		labelFamily = new JLabel();
		image = new ImageIcon(getClass().getResource("/images/familia.png"));
		labelFamily.setBounds(10, 10, 350, 210);
		icon = new ImageIcon(image.getImage().getScaledInstance(labelFamily.getWidth(),labelFamily.getHeight(), Image.SCALE_DEFAULT));
		labelFamily.setIcon(icon);
		labelFamily.setBackground(fondo);
		labelFamily.setBorder(null);
		this.add(labelFamily);

		jPanelListaPersons = new JPanelListaPersons();
		jPanelListaPersons.setBounds(380, 20, 350, 400);
		this.add(jPanelListaPersons);

		buttonVolver = new JButton(Constants.BUTTON_VOLVER);
		buttonVolver.setBounds(350, 470, 100, 30);
		fuente = new Font("Arial", 2, 16);
		buttonVolver.setFont(fuente);
		buttonVolver.setForeground(Color.red);
		buttonVolver.setBorder(null);
		buttonVolver.setActionCommand(Constants.BUTTON_VOLVER);
		buttonVolver.addActionListener(mainWindow.getEvents());
		buttonVolver.setBackground(fondo);
		add(buttonVolver);
		
		buttonSaveFamily = new JButton(Constants.BUTTON_SAVE_FAMILY);
		buttonSaveFamily.setBounds(180, 470, 150, 30);
		fuente = new Font("Arial", 2, 16);
		buttonSaveFamily.setFont(fuente);
		buttonSaveFamily.setForeground(Color.red);
		buttonSaveFamily.setBorder(null);
		buttonSaveFamily.setActionCommand(Constants.BUTTON_SAVE_FAMILY);
		buttonSaveFamily.addActionListener(mainWindow.getEvents());
		buttonSaveFamily.setBackground(fondo);
		add(buttonSaveFamily);
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

	public void createFamily(){
		
	}
	
	public JPanel getPanelOptions() {
		return panelOptions;
	}

	public void setPanelOptions(JPanel panelOptions) {
		this.panelOptions = panelOptions;
	}

	public JPanelListaPersons getjPanelListaPersons() {
		return jPanelListaPersons;
	}

	public void setjPanelListaPersons(JPanelListaPersons jPanelListaPersons) {
		this.jPanelListaPersons = jPanelListaPersons;
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
		return buttonDelete;
	}

	public void setButtonDelete(JButton buttonDelete) {
		this.buttonDelete = buttonDelete;
	}

	public JButton getButtonEdit() {
		return buttonEdit;
	}

	public void setButtonEdit(JButton buttonEdit) {
		this.buttonEdit = buttonEdit;
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

}
