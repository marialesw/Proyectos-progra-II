package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JDialog;

import co.edu.uptc.models.Category;

public class DialogoAgregarProducto extends JDialog{
    
    private JPanelAdminProductos ventanaPrincipal;
    private JPanelAddProduct panelAgregar;

    public DialogoAgregarProducto( JPanelAdminProductos ecv ){
        ventanaPrincipal = ecv;

        setLayout( new BorderLayout( ) );

        panelAgregar = new JPanelAddProduct( this );
        add( panelAgregar );

        setTitle( "Agregar Producto" );
        pack( );

        centrar( );
    }
    
    private void centrar( ){
        Dimension screen = Toolkit.getDefaultToolkit( ).getScreenSize( );
        int xEsquina = ( screen.width - getWidth( ) ) / 2;
        int yEsquina = ( screen.height - getHeight( ) ) / 2;
        setLocation( xEsquina, yEsquina );
    }

  
    public void agregarProducto( int id, String name, String image, Category category, double priceUnit, String Description, int quantity) throws IOException{
        ventanaPrincipal.agregarProducto( this, id, name, image, category, priceUnit, Description, quantity);
    }
}
