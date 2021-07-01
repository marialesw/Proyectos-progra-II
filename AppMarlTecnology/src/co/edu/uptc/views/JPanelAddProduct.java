package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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

import co.edu.uptc.models.Category;


public class JPanelAddProduct extends JPanel implements ActionListener{
    

	private static final long serialVersionUID = 1L;
	private static final String AGREGAR = "AgregarProducto";
    private static final String BUSCAR = "BuscarImagen";
    
    private DialogoAgregarProducto dialogo;
    private JTextField txtImage;
    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtUnitPrice;
    private JTextField txtDescription;
    private JTextField txtQuantity;
    private JComboBox txtCategory;
    private JLabel labelImage;
    private JLabel labelId;
    private JLabel labelName;
    private JLabel labelCategory;
    private JLabel labelUnitPrice;
    private JLabel labelDescription;
    private JLabel labelQuantity;
    private JButton botonAgregar;
    private JButton botonExaminar;
	private String imagen;

   
    public JPanelAddProduct( DialogoAgregarProducto dav ){
        dialogo = dav;

        setLayout( new BorderLayout( ) );
        setBorder( new CompoundBorder( new EmptyBorder( 4, 3, 3, 3 ), new TitledBorder( "Agregar producto" ) ) );

        JPanel panelDatos = new JPanel( new GridLayout( 8, 2 ) );

        labelId = new JLabel( "Id: " );
        panelDatos.add( labelId );
        txtId = new JTextField( "" );
        panelDatos.add( txtId );

        
        labelName = new JLabel( "Nombre: " );
        panelDatos.add( labelName );
        txtName = new JTextField( "" );
        panelDatos.add( txtName );

     
        labelImage = new JLabel( "Imagen: " );
        panelDatos.add( labelImage );
        txtImage = new JTextField( "" );
        botonExaminar = new JButton( "Examinar" );
        botonExaminar.setActionCommand( BUSCAR );
        botonExaminar.addActionListener( this );

        JPanel panelImagen = new JPanel( new GridLayout( 1, 2 ) );
        panelImagen.add( txtImage );
        panelImagen.add( botonExaminar );
        panelDatos.add( panelImagen );

        
        labelCategory = new JLabel( "Categoría: " );
        panelDatos.add( labelCategory );
        txtCategory = new JComboBox( Category.values());
        panelDatos.add( txtCategory );

        
        labelUnitPrice = new JLabel( "Precio Unitario: " );
        panelDatos.add( labelUnitPrice );
        txtUnitPrice = new JTextField( "" );
        panelDatos.add( txtUnitPrice );

        
        labelDescription = new JLabel( "Descripción: " );
        panelDatos.add( labelDescription );
        txtDescription = new JTextField( "" );
        panelDatos.add( txtDescription );

        
        labelQuantity = new JLabel( "Cantidad: " );
        panelDatos.add( labelQuantity );
        txtQuantity = new JTextField( "" );
        panelDatos.add( txtQuantity );

        // Botón agregar
        JPanel panelBoton = new JPanel( );
        botonAgregar = new JButton( "Agregar Producto" );
        botonAgregar.setActionCommand( AGREGAR );
        botonAgregar.addActionListener( this );
        panelBoton.add( botonAgregar );

        add( panelDatos, BorderLayout.CENTER );
        add( panelBoton, BorderLayout.SOUTH );
    }

    public void limpiar(){
    	 txtId.setText( "" );
         txtName.setText( "" );
         txtImage.setText( "" );
         txtUnitPrice.setText("");
         txtDescription.setText("");
         txtQuantity.setText("");
    }
   
    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( AGREGAR.equals( comando ) )
        {
            try
            {
                int id = Integer.parseInt(txtId.getText( ));
                String name = txtName.getText( );
                Category category = (Category) txtCategory.getSelectedItem();
                double unitPrice = Double.parseDouble( txtUnitPrice.getText( ) );
                String description =  txtDescription.getText( );
                int quantity = Integer.parseInt( txtQuantity.getText( ) );
                dialogo.agregarProducto(id, name, imagen, category, unitPrice, description, quantity);
                limpiar();
                
            }
            catch( NumberFormatException e )
            {
                JOptionPane.showMessageDialog( this, "El código, la cantidad y el precio debe ser un número entero positivo", "Error", JOptionPane.ERROR_MESSAGE );
            } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else if( BUSCAR.equals( comando ) ){
            JFileChooser fc = new JFileChooser( "./data" );
            fc.setDialogTitle( "Buscar imagen del producto" );
            fc.setMultiSelectionEnabled( false );

            int resultado = fc.showOpenDialog( this );
            if( resultado == JFileChooser.APPROVE_OPTION ){
                imagen = fc.getSelectedFile( ).getAbsolutePath( );
                txtImage.setText( imagen );
            }
        }
    }

}
