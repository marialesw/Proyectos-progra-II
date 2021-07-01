package co.edu.uptc.views;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class PanelImagen extends JPanel{

 
    private JLabel imagen;

    
    public PanelImagen( )
    {
        FlowLayout layout = new FlowLayout( );
        layout.setHgap( 0 );
        layout.setVgap( 0 );
        setLayout( layout );
        //
        // Carga la imagen
        ImageIcon icono = new ImageIcon( "data/titulo.png" );

        // La agrega a la etiqueta
        imagen = new JLabel( "" );
        imagen.setIcon( icono );
        add( imagen );
        //
        // Color de fondo blanco
        setBackground( Color.WHITE );
        setBorder( new LineBorder( Color.GRAY ) );
    }
}