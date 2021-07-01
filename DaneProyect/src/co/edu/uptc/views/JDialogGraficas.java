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

public class JDialogGraficas extends JDialog{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanelInit jPInit;
    private JPanelNivelEducational panelNivel;
	private JPanelMenVsWomen panelWomen;
	private JPanelRangosEdad jPanelRangosEdad;

    public JDialogGraficas( JPanelInit jpInit, int n ){
        jPInit = jpInit;
        setLayout( new BorderLayout( ) );
        if (n == 1) {
        	 panelNivel = new JPanelNivelEducational(jpInit);
             add( panelNivel );	
		}else if (n == 2) {
			panelWomen = new JPanelMenVsWomen(jpInit);
			add( panelWomen );	
		}else if (n == 3) {
			jPanelRangosEdad = new JPanelRangosEdad(jpInit);
			add( jPanelRangosEdad );	
		}

        setTitle( "Gráficas" );
        pack( );

        centrar( );
    }
    
    private void centrar( ){
        Dimension screen = Toolkit.getDefaultToolkit( ).getScreenSize( );
        int xEsquina = ( screen.width - getWidth( ) ) / 2;
        int yEsquina = ( screen.height - getHeight( ) ) / 2;
        setLocation( xEsquina, yEsquina );
    }

	public JPanelInit getjPInit() {
		return jPInit;
	}

	public void setjPInit(JPanelInit jPInit) {
		this.jPInit = jPInit;
	}

	

	public JPanelNivelEducational getPanelNivel() {
		return panelNivel;
	}

	public void setPanelNivel(JPanelNivelEducational panelNivel) {
		this.panelNivel = panelNivel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
