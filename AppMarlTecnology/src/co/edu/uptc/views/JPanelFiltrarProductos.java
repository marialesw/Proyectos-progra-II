package co.edu.uptc.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class JPanelFiltrarProductos extends JPanel implements ActionListener{
    

    private static final String BUSCAR = "Buscar";

    private static final String ORDENAR_CILINDRADA = "OrdenarCilindrada";

    private static final String ORDENAR_ANIO = "OrdenarAño";

    private static final String ORDENAR_MARCA = "OrdenarMarca";

    private JPanelAdminProductos ventanaPrincipal;
    private JButton botonOrdenarMarca;
    private JButton botonOrdenarCilindrada;
    private JButton botonOrdenarAnio;
    private JButton botonBuscar;

  
    public JPanelFiltrarProductos( JPanelAdminProductos jpAdminProd )
    {
        ventanaPrincipal = jpAdminProd;
        setLayout( new GridBagLayout( ) );

        setBorder( new TitledBorder( "Ordenar y filtrar" ) );

        botonOrdenarMarca = new JButton( "Ordenar de A-Z" );
        botonOrdenarMarca.setActionCommand( ORDENAR_MARCA );
        botonOrdenarMarca.addActionListener( this );
        GridBagConstraints gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets( 3, 3, 3, 3 );
        add( botonOrdenarMarca, gbc );

        botonOrdenarAnio = new JButton( "Filtrar por categoría" );
        botonOrdenarAnio.setActionCommand( ORDENAR_ANIO );
        botonOrdenarAnio.addActionListener( this );
        gbc.gridy = 1;
        add( botonOrdenarAnio, gbc );

        botonOrdenarCilindrada = new JButton( "Ordenar de Z-A" );
        botonOrdenarCilindrada.setActionCommand( ORDENAR_CILINDRADA );
        botonOrdenarCilindrada.addActionListener( this );
        gbc.gridx = 1;
        gbc.gridy = 0;
        add( botonOrdenarCilindrada, gbc );

        botonBuscar = new JButton( "Producto más vendido" );
        botonBuscar.setActionCommand( BUSCAR );
        botonBuscar.addActionListener( this );
        gbc.gridy = 1;
        add( botonBuscar, gbc );

    }

    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( ORDENAR_MARCA.equals( comando ) )
        {
            ventanaPrincipal.ordenarPorMarca( );
        }
        else if( ORDENAR_CILINDRADA.equals( comando ) )
        {
            ventanaPrincipal.ordenarPorCilindrada( );
        }
        else if( ORDENAR_ANIO.equals( comando ) )
        {
            ventanaPrincipal.ordenarPorAnio( );
        }
        else if( BUSCAR.equals( comando ) )
        {
            ventanaPrincipal.buscar( );
        }
    }
}
