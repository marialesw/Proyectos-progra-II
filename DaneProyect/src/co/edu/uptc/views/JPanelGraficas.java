package co.edu.uptc.views;

import java.awt.Dimension;

import javax.swing.JPanel;

public class JPanelGraficas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanelNivelEducational nivelEducational;
	private JPanelInit jPanelInit;
	private JPanelMenVsWomen menVsWomen;
	private JPanelRangosEdad jPanelRangosEdad;

	public JPanelGraficas(JPanelInit jPInit) {
		this.jPanelInit = jPInit;
		setPreferredSize(new Dimension(700, 450));
		initComponents();
	}

	private void initComponents() {
	}
	
	public void agregarPanelNivelEducational(){
		nivelEducational = new JPanelNivelEducational(jPanelInit);
		nivelEducational.setVisible(true);
		this.add(nivelEducational);
	}
	
	public void agregarPanelRangosdeEdad(){
		jPanelRangosEdad = new JPanelRangosEdad(jPanelInit);
		jPanelRangosEdad.setVisible(true);
		this.add(jPanelRangosEdad);
	}
	
	public void agregarPanelMenvsWomen(){
		menVsWomen = new JPanelMenVsWomen(jPanelInit);
		menVsWomen.setVisible(true);
		this.add(menVsWomen);
	}

	public JPanelNivelEducational getNivelEducational() {
		return nivelEducational;
	}

	public void setNivelEducational(JPanelNivelEducational nivelEducational) {
		this.nivelEducational = nivelEducational;
	}

	public JPanelInit getjPanelInit() {
		return jPanelInit;
	}

	public void setjPanelInit(JPanelInit jPanelInit) {
		this.jPanelInit = jPanelInit;
	}

	public JPanelMenVsWomen getMenVsWomen() {
		return menVsWomen;
	}

	public void setMenVsWomen(JPanelMenVsWomen menVsWomen) {
		this.menVsWomen = menVsWomen;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
