package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import co.edu.uptc.models.Person;



public class JPanelListaPersons extends JPanel implements ListSelectionListener{
   
    private JList listaProductos;

 
    public JPanelListaPersons(){
        setLayout( new BorderLayout( ) );
        initComponents();
    }
    
    public void initComponents(){
        setBackground(new Color(29, 26, 91));
        JPanel panelListaYBotones = new JPanel( );
        panelListaYBotones.setLayout( new BorderLayout( ) );
        panelListaYBotones.setBorder( new CompoundBorder( new EmptyBorder( 4, 3, 3, 3 ), new TitledBorder( "Miembros de la familia" ) ) );

        listaProductos = new JList( );
        listaProductos.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
        listaProductos.addListSelectionListener( this );

        JScrollPane scroll = new JScrollPane( );
        scroll.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
        scroll.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
        scroll.setBorder( new CompoundBorder( new EmptyBorder( 3, 3, 3, 3 ), new LineBorder( Color.BLACK, 1 ) ) );
        scroll.getViewport( ).add( listaProductos );

        panelListaYBotones.add( scroll, BorderLayout.CENTER );
        add( panelListaYBotones, BorderLayout.CENTER );
    }


    @SuppressWarnings("unchecked")
	public void actualizarLista( List<Person> list )
    {
        listaProductos.setListData( list.toArray() );
        listaProductos.setSelectedIndex( 0 );

    }

    public void seleccionar( int seleccionado ){
        listaProductos.setSelectedIndex( seleccionado );
        listaProductos.ensureIndexIsVisible( seleccionado );
    }
    
    public int index(){
        return listaProductos.getSelectedIndex();
    }

    public boolean haySeleccionado( ){
        return !listaProductos.isSelectionEmpty( );
    }

    public void valueChanged( ListSelectionEvent e )
    {
        
    }
}