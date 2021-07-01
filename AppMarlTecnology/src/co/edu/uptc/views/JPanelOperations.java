package co.edu.uptc.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import co.edu.uptc.models.Category;
import co.edu.uptc.models.Product;


public class JPanelOperations extends JPanel implements ActionListener{
   
 
    private JPanelAdminProductos ventanaPrincipal;
    private JButton botonAgregar;
    private JButton botonEdit;
    private JButton botonVisualize;
    private JButton botonMasPotente;
    private JButton botonDelete;
    private JButton botonActualize;

    public JPanelOperations( JPanelAdminProductos jpAdminProd ){
        ventanaPrincipal = jpAdminProd;
        setLayout( new GridBagLayout( ) );

        setBorder( new CompoundBorder( new EmptyBorder( 4, 3, 3, 3 ), new TitledBorder( "Operaciones" ) ) );

        botonAgregar = new JButton( Constants.ADD_PRODUCT );
        botonAgregar.setActionCommand( Constants.ADD_PRODUCT );
        botonAgregar.addActionListener( this );
        GridBagConstraints gbc = new GridBagConstraints( );
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets( 0, 0, 5, 5 );
        add( botonAgregar, gbc );

        botonActualize = new JButton( Constants.ACTUALIZE_PRODUCT );
        botonActualize.setActionCommand( Constants.ACTUALIZE_PRODUCT );
        botonActualize.addActionListener( this );
        gbc.gridy = 1;
        add( botonActualize, gbc );

        botonDelete = new JButton(Constants.DELETE_PRODUCT);
        botonDelete.setActionCommand( Constants.DELETE_PRODUCT );
        botonDelete.addActionListener( this );
        gbc.gridx = 1;
        gbc.gridy = 0;
        add( botonDelete, gbc );

        botonEdit = new JButton( Constants.EDIT_PRODUCT );
        botonEdit.setActionCommand( Constants.EDIT_PRODUCT );
        botonEdit.addActionListener( this );
        gbc.gridy = 1;
        add( botonEdit, gbc );

        botonVisualize = new JButton( Constants.VISUALIZE_PRODUCT );
        botonVisualize.setActionCommand( Constants.VISUALIZE_PRODUCT );
        botonVisualize.addActionListener( this );
        gbc.gridx = 2;
        gbc.gridy = 0;
        add( botonVisualize, gbc );
    }

    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( Constants.ADD_PRODUCT.equals( comando ) )
        {
            ventanaPrincipal.mostrarDialogoAgregarProducto( );
        }
        else if( Constants.ACTUALIZE_PRODUCT.equals( comando ) )
        {
            ventanaPrincipal.buscarMasAntiguo( );
        }
        else if( Constants.DELETE_PRODUCT.equals( comando ) )
        {
            ventanaPrincipal.buscarMasEconomico( );
        }
        else if( Constants.EDIT_PRODUCT.equals( comando ) )
        {
            ventanaPrincipal.buscarMasPotente( );
        }
        else if(  Constants.VISUALIZE_PRODUCT.equals( comando ) ){
        	int i = ventanaPrincipal.getMainWindow().getJpanelAdministrador().getJpanelAdminProductos().getPanelLista().index();
        	List<Product> lista = ventanaPrincipal.getMainWindow().getController().getControllerProducts().getListProduct();
            int code = lista.get(i).getCode();
            String name = lista.get(i).getName();
            Category category = lista.get(i).getCategory();
            double priceUnit = lista.get(i).getPriceUnit();
            String description = lista.get(i).getDescription();
            String image = lista.get(i).getImageIcon();
            int quantity = lista.get(i).getQuantity();
            ventanaPrincipal.getPanelDatos().setCamps(code, name, category, priceUnit, description, image, quantity);
        }
    }
    
    
}
