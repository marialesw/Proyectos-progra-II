package co.edu.uptc.views;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosMause implements MouseListener{
	
	private MainWindow mainWindow;
	
	public EventosMause(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == Constants.BUTTON1) {
			System.out.println("click");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == Constants.BUTTON1) {
			System.out.println("ENTRÓ AL BOTON");
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == Constants.BUTTON1) {
			System.out.println("SALIO DEL BOTON");
		}
	}

}
