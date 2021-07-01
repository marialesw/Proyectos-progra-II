package co.edu.uptc.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import co.edu.uptc.models.Category;

public class JPanelAdminProductos extends JPanel{
	
    private JPanelListaProductos panelLista;
    private JPanelDatosProduct panelDatos;
    private JPanelFiltrarProductos panelBusquedaOrdenamiento;
    private JPanelOperations panelOperations;
    private PanelImagen panelImagen;
    private MainWindow mainWindow;

    public JPanelAdminProductos(MainWindow mainWindow ){
    	this.mainWindow = mainWindow;
    	setBackground(new Color(29, 26, 91));
        setLayout( null);
        panelDatos = new JPanelDatosProduct( );
        panelDatos.setBounds(440, 20, 520, 400);
        add( panelDatos );

        panelLista = new JPanelListaProductos(this);
        panelLista.setBounds(20, 20, 400, 400);
        add( panelLista );

        panelBusquedaOrdenamiento = new JPanelFiltrarProductos( this );
        panelBusquedaOrdenamiento.setBounds(20, 440, 400, 100);
        add( panelBusquedaOrdenamiento );

        panelOperations = new JPanelOperations( this );
        panelOperations.setBounds(440, 440, 520, 100);
        add( panelOperations );

        panelImagen = new PanelImagen( );
       // panelImagen.setBounds(440, 440, 520, 100);
        add( panelImagen );

        actualizarLista( );

    }
    
    private void actualizarLista( )
    {
    	
    }

    public void ordenarPorMarca( )
    {
        
        panelDatos.limpiarCampos( );
        actualizarLista( );
    }

    public void ordenarPorCilindrada( )
    {
        panelDatos.limpiarCampos( );
        actualizarLista( );
    }
    public void ordenarPorAnio( )
    {
        panelDatos.limpiarCampos( );
        actualizarLista( );
    }
    
    public void buscar( ){
        String nombreBuscado = JOptionPane.showInputDialog( this, "Modelo Buscado" );

        if( nombreBuscado != null )
        {
            String anioBuscado = JOptionPane.showInputDialog( this, "Año Buscado" );
            if( anioBuscado != null )
            {
                try
                {
                    int anio = Integer.parseInt( anioBuscado );
                    actualizarLista( );
                }
                catch( NumberFormatException nfe )
                {
                    JOptionPane.showMessageDialog( this, "El año debe se un número entero", "Error", JOptionPane.ERROR_MESSAGE );
                }
            }
        }
    }

    public void mostrarDialogoAgregarProducto( )
    {
        DialogoAgregarProducto dav = new DialogoAgregarProducto( this );
        dav.setVisible( true );
    }

    public void agregarProducto( DialogoAgregarProducto dialogo,  int id, String name, String image, Category category, double priceUnit, String description, int quantity ) throws IOException {
    	mainWindow.getController().getControllerProducts().addProduct(id, name, category, priceUnit, description, image, quantity);
    	mainWindow.getController().getControllerProducts().imprimir();
    	mainWindow.getJpanelAdministrador().getJpanelAdminProductos().getPanelLista().actualizarLista(mainWindow.getController().getControllerProducts().listarProductos());
    }

    public void buscarMasAntiguo( ){
    	
    }

    public void buscarMasPotente( )
    {
        
    }

  
    public void buscarMasEconomico( )
    {
        
    }

    public void comprarVehiculo( )
    {
    	
    }
    
    public void disminuirPrecio( )
    {
        
    }

    public void reqFuncOpcion1( )
    {
        
        JOptionPane.showMessageDialog( this, "opcion 1", "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

 
    public void reqFuncOpcion2( )
    {
        JOptionPane.showMessageDialog( this, "opcion 2", "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

	public JPanelListaProductos getPanelLista() {
		return panelLista;
	}

	public void setPanelLista(JPanelListaProductos panelLista) {
		this.panelLista = panelLista;
	}

	public JPanelDatosProduct getPanelDatos() {
		return panelDatos;
	}

	public void setPanelDatos(JPanelDatosProduct panelDatos) {
		this.panelDatos = panelDatos;
	}

	public JPanelFiltrarProductos getPanelBusquedaOrdenamiento() {
		return panelBusquedaOrdenamiento;
	}

	public void setPanelBusquedaOrdenamiento(JPanelFiltrarProductos panelBusquedaOrdenamiento) {
		this.panelBusquedaOrdenamiento = panelBusquedaOrdenamiento;
	}

	public JPanelOperations getPanelOperations() {
		return panelOperations;
	}

	public void setPanelOperations(JPanelOperations panelOperations) {
		this.panelOperations = panelOperations;
	}

	public PanelImagen getPanelImagen() {
		return panelImagen;
	}

	public void setPanelImagen(PanelImagen panelImagen) {
		this.panelImagen = panelImagen;
	}

	public MainWindow getMainWindow() {
		return mainWindow;
	}

	public void setMainWindow(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}

}