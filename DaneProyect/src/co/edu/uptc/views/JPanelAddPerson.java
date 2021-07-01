package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Calendar;

import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import co.edu.uptc.models.Gender;
import co.edu.uptc.models.NivelEducational;
import co.edu.uptc.models.Profession;
import co.edu.uptc.models.TypeDocument;
import co.edu.uptc.utilities.Utillidades;


public class JPanelAddPerson extends JPanel {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String AGREGAR = "AgregarProducto";
    private static final String BUSCAR = "BuscarImagen";
    
    private JDialogAddPerson jDialog;
    private JTextField txtImagen;
    private JTextField txtLastName;
    private JTextField txtName;
    private JTextField txtNumberDocument;
    private JComboBox txtTypeDocument;
    private JLabel labelImage;
    private JLabel labelLastName;
    private JLabel labelName;
    private JLabel labelTypeDocument;
    private JLabel labelNumberDocument;
    private JButton botonAgregar;
    private JButton botonExaminar;
	private JLabel labelNivelEducational;
	private JComboBox txtNivelEducational;
	private JLabel labelProfession;
	private JComboBox txtProfession;
	private JLabel labelGender;
	private JComboBox txtGender;
	private JButton botonCancelar;
	private JCalendar jcalendarBirthdate;
	private JPanel panelCalendario;
	private JLabel labelCalendar;
	private JPanelRegister jPanelRegister;
	private Calendar fecha;

   
    public JPanelAddPerson( JPanelRegister jPanelRegister){
    	this.jPanelRegister = jPanelRegister;
        setLayout( new BorderLayout( ) );
        setBorder( new CompoundBorder( new EmptyBorder( 4, 3, 3, 3 ), new TitledBorder( "Agregar persona" ) ) );

        JPanel panelDatos = new JPanel( new GridLayout( 8, 2 ) );

        
        labelName = new JLabel( "Nombres: " );
        panelDatos.add( labelName );
        txtName = new JTextField( "" );
        panelDatos.add( txtName );

        labelLastName = new JLabel( "Apellidos: " );
        panelDatos.add( labelLastName );
        txtLastName = new JTextField( "" );
        panelDatos.add( txtLastName );
        
        labelTypeDocument = new JLabel( "Tipo de documento: " );
        panelDatos.add( labelTypeDocument );
        txtTypeDocument = new JComboBox( TypeDocument.values());
        panelDatos.add( txtTypeDocument );

        
        labelNumberDocument = new JLabel( "Número de documento: " );
        panelDatos.add( labelNumberDocument );
        txtNumberDocument = new JTextField( "" );
        panelDatos.add( txtNumberDocument );
        
        panelCalendario = new JPanel();
        panelCalendario.setLayout(new GridLayout(1, 2));
        labelCalendar = new JLabel( "Fecha de Nacimiento: " );
        panelCalendario.add( labelCalendar );
        jcalendarBirthdate = new JCalendar();
        panelCalendario.add(jcalendarBirthdate);
        
        labelNivelEducational = new JLabel( "Nivel Educacional: " );
        panelDatos.add( labelNivelEducational );
        txtNivelEducational = new JComboBox( NivelEducational.values());
        panelDatos.add( txtNivelEducational );
        
        labelProfession = new JLabel( "Profesión: " );
        panelDatos.add( labelProfession );
        txtProfession = new JComboBox( Profession.values());
        panelDatos.add( txtProfession );

        labelGender = new JLabel( "Género: " );
        panelDatos.add( labelGender );
        txtGender = new JComboBox( Gender.values());
        panelDatos.add( txtGender );
      

        // Botón agregar
        JPanel panelBoton = new JPanel( );
        botonAgregar = new JButton( Constants.BUTTON_ADD );
        botonAgregar.setActionCommand( Constants.BUTTON_ADD );
        botonAgregar.addActionListener(jPanelRegister.getMainWindow().getEvents());
        panelBoton.add( botonAgregar );
        
        botonCancelar = new JButton(Constants.BUTTON_CANCEL);
        botonCancelar.setActionCommand( Constants.BUTTON_CANCEL );
        botonCancelar.addActionListener(jPanelRegister.getMainWindow().getEvents());
        panelBoton.add( botonCancelar );

        add( panelDatos, BorderLayout.NORTH );
        add(panelCalendario, BorderLayout.CENTER);
        add( panelBoton, BorderLayout.SOUTH );
    }
    
    
    public void limpiarCampos(){
		txtName.setText("");
		txtLastName.setText("");
		txtNivelEducational.setSelectedItem(NivelEducational.values());
		txtTypeDocument.setSelectedItem(TypeDocument.values());
		txtProfession.setSelectedItem(Profession.values());
		txtGender.setSelectedItem(Gender.values());
		txtNumberDocument.setText("");
	}
	
	public String obtenerNombre() {
		if (txtName.getText() != null && !txtName.getText().isEmpty()) {
			return txtName.getText();
		} else {
			Utillidades.showMessageWarning("Debe ingresar su nombre", "Advertencia");
		}
		return null;
	}
	
	public String obtenerApellidos() {
		if (txtLastName.getText() != null && !txtLastName.getText().isEmpty()) {
			return txtLastName.getText();
		} else {
			Utillidades.showMessageWarning("Debe ingresar sus apellidos", "Advertencia");
		}
		return null;
	}
	
	public String obtenerNumeroDocumento() {
		if (txtNumberDocument.getText() != null && !txtNumberDocument.getText().isEmpty()) {
			return txtNumberDocument.getText();
		} else {
			Utillidades.showMessageWarning("Debe ingresar su numero de documento", "Advertencia");
		}
		return null;
	}

	public NivelEducational getjBoxNivelEducational() {
		return (NivelEducational)txtNivelEducational.getSelectedItem();
	}
	
	public Profession getjBoxProfession() {
		return (Profession)txtProfession.getSelectedItem();
	}
	
	public Gender getjBoxGender() {
		return (Gender)txtGender.getSelectedItem();
	}
	
	public TypeDocument getjBoxTypeDocument() {
		return (TypeDocument)txtTypeDocument.getSelectedItem();
	}
	
	public Calendar getdateOfBirth() {
//		int año = jcalendarBirthdate.getCalendar().get(Calendar.YEAR);
//		int mes = jcalendarBirthdate.getCalendar().get(Calendar.MARCH);
//		int dia = jcalendarBirthdate.getCalendar().get(Calendar.DAY_OF_MONTH);

		fecha = jcalendarBirthdate.getCalendar();
		return fecha;
	}
}

