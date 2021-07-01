package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JDialog;

public class JDialogAddCompra extends JDialog{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanelUsers jpanelUsers;
    private JPanelAddCanasta jPanelAddCanasta;
	private JPanelProductosCanasta jpanelProductsCanasta;
	private ArrayList<String> process;


    public JDialogAddCompra( JPanelUsers ecv, int n ){
        jpanelUsers = ecv;

        setLayout( new BorderLayout( ) );
        if (n == 1) {
        	 jPanelAddCanasta = new JPanelAddCanasta(ecv);
             this.add(jPanelAddCanasta);	
             setTitle( "Producto" );
		}else if (n == 2) {
			jpanelProductsCanasta = new JPanelProductosCanasta(ecv);
			this.add(jpanelProductsCanasta);
		}
        pack( );

        centrar( );
    }
    
    private void centrar( ){
        Dimension screen = Toolkit.getDefaultToolkit( ).getScreenSize( );
        int xEsquina = ( screen.width - getWidth( ) ) / 2;
        int yEsquina = ( screen.height - getHeight( ) ) / 2;
        setLocation( xEsquina, yEsquina );
    }

	public JPanelUsers getJpanelUsers() {
		return jpanelUsers;
	}

	public void setJpanelUsers(JPanelUsers jpanelUsers) {
		this.jpanelUsers = jpanelUsers;
	}

	public JPanelAddCanasta getjPanelAddCanasta() {
		return jPanelAddCanasta;
	}

	public JPanelProductosCanasta getJpanelProductsCanasta() {
		return jpanelProductsCanasta;
	}

	public void setJpanelProductsCanasta(JPanelProductosCanasta jpanelProductsCanasta) {
		this.jpanelProductsCanasta = jpanelProductsCanasta;
	}

	public void setjPanelAddCanasta(JPanelAddCanasta jPanelAddCanasta) {
		this.jPanelAddCanasta = jPanelAddCanasta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
