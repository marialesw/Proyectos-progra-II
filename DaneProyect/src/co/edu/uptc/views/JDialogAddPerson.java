package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.Calendar;

import javax.swing.JDialog;

import co.edu.uptc.models.Gender;
import co.edu.uptc.models.NivelEducational;
import co.edu.uptc.models.Profession;
import co.edu.uptc.models.TypeDocument;

public class JDialogAddPerson extends JDialog{
    
    private JPanelRegister jPRegister;
    private JPanelAddPerson panelAgregar;

    public JDialogAddPerson( JPanelRegister ecv ){
        jPRegister = ecv;

        setLayout( new BorderLayout( ) );

        panelAgregar = new JPanelAddPerson( jPRegister );
        add( panelAgregar );

        setTitle( "Agregar Persona" );
        pack( );

        centrar( );
    }
    
    private void centrar( ){
        Dimension screen = Toolkit.getDefaultToolkit( ).getScreenSize( );
        int xEsquina = ( screen.width - getWidth( ) ) / 2;
        int yEsquina = ( screen.height - getHeight( ) ) / 2;
        setLocation( xEsquina, yEsquina );
    }

	public JPanelRegister getjPRegister() {
		return jPRegister;
	}

	public void setjPRegister(JPanelRegister jPRegister) {
		this.jPRegister = jPRegister;
	}

	public JPanelAddPerson getPanelAgregar() {
		return panelAgregar;
	}

	public void setPanelAgregar(JPanelAddPerson panelAgregar) {
		this.panelAgregar = panelAgregar;
	}
}
