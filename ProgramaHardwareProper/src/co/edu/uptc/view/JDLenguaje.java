package co.edu.uptc.view; 

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JRadioButton;

import co.edu.uptc.controller.*;

public class JDLenguaje extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JRadioButton jRSpanish, jREnglish, jRPortugues, jRChino, jRFrances;
	private PropertiesTitle propertiesTitle;
	private ButtonGroup group1;
	private JButton JbAceptar;
	public ControllerHardware controllerHar;
	
	public JDLenguaje(PropertiesTitle propertiesTitle, ControllerHardware controllerApp) {
		this.propertiesTitle = propertiesTitle;
		this.controllerHar = controllerApp;
		setTitle(propertiesTitle.getProperty("Lenguaje"));
		setSize(200,220);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new GridBagLayout());
		initComponentes();
	}

	public void initComponentes() {
		GridBagConstraints gridBagC = new GridBagConstraints();
		gridBagC.fill = GridBagConstraints.BOTH;
		gridBagC.insets = new Insets(10, 10, 10, 10);
		
		JbAceptar = new JButton(propertiesTitle.getProperty("Aceptar"));
		JbAceptar.setActionCommand(Action.ACEPTAR.name());
		JbAceptar.addActionListener(controllerHar);
		gridBagC.gridx= 1;//que tan a la -> de la pantalla esta
		gridBagC.gridy = 6;//cuanto hacia abajo
		gridBagC.weightx= 0.1;//porcentaje de tamaño
		gridBagC.weighty = 0.1;
		gridBagC.gridheight = 1;//cuantas filas
		gridBagC.gridwidth = 2;//cuantas columnas 		
		add(JbAceptar,gridBagC);
		
		jRSpanish = new JRadioButton(propertiesTitle.getProperty("Btn_Spanish"));
		gridBagC.gridx= 2;//que tan a la -> de la pantalla esta
		gridBagC.gridy = 1;//cuanto hacia abajo
		gridBagC.weightx= 0.1;//porcentaje de tamaño
		gridBagC.weighty = 0.1;
		gridBagC.gridheight = 1;//cuantas filas
		gridBagC.gridwidth = 2;//cuantas columnas 				
		add(jRSpanish,gridBagC);
		
		jREnglish = new JRadioButton(propertiesTitle.getProperty("Btn_English"));
		gridBagC.gridx= 2;//que tan a la -> de la pantalla esta
		gridBagC.gridy =2;//cuanto hacia abajo
		gridBagC.weightx= 0.1;//porcentaje de tamaño
		gridBagC.weighty = 0.1;
		gridBagC.gridheight = 1;//cuantas filas
		gridBagC.gridwidth = 2;//cuantas columnas 				
		add(jREnglish,gridBagC);
		
		jRPortugues = new JRadioButton(propertiesTitle.getProperty("Btn_Portugues"));
		gridBagC.gridx= 2;//que tan a la -> de la pantalla esta
		gridBagC.gridy =3;//cuanto hacia abajo
		gridBagC.weightx= 0.1;//porcentaje de tamaño
		gridBagC.weighty = 0.1;
		gridBagC.gridheight = 1;//cuantas filas
		gridBagC.gridwidth = 2;//cuantas columnas 				
		add(jRPortugues,gridBagC);
		
		jRFrances = new JRadioButton(propertiesTitle.getProperty("Btn_Frances"));
		gridBagC.gridx= 2;//que tan a la -> de la pantalla esta
		gridBagC.gridy = 4;//cuanto hacia abajo
		gridBagC.weightx= 0.1;//porcentaje de tamaño
		gridBagC.weighty = 0.1;
		gridBagC.gridheight = 1;//cuantas filas
		gridBagC.gridwidth = 2;//cuantas columnas 				
		add(jRFrances,gridBagC);
		
		group1 = new ButtonGroup();
		group1.add(jREnglish);
		group1.add(jRSpanish);
		group1.add(jRPortugues);
		group1.add(jRFrances);
	}
	
	public int selectLanguage(){
		int language = 1;
		if (jRSpanish.isSelected()) {
			 language = 1;
		}else if (jREnglish.isSelected()) {
			 language = 2;
		}else if(jRPortugues.isSelected()) {
			language = 3;
		}else if(jRFrances.isSelected()) {
			language = 4;
		}
		return language;
	}
	
	public void refresh(){
		propertiesTitle = controllerHar.getPropertiesTitle("MenuIdioma");
		JbAceptar.setText(propertiesTitle.getProperty("Aceptar"));
		jRSpanish.setText(propertiesTitle.getProperty("Btn_Spanish"));
		jREnglish.setText(propertiesTitle.getProperty("Btn_English"));
		jRPortugues.setText(propertiesTitle.getProperty("Btn_Portugues"));
		jRFrances.setText(propertiesTitle.getProperty("Btn_Frances"));
	}
}
