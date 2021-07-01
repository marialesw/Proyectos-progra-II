package co.edu.uptc.views;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import co.edu.uptc.controllers.MainController;
import co.edu.uptc.models.NivelEducational;

public class JPanelNivelEducational extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFreeChart grafica;
	private DefaultCategoryDataset datos;
	private JPanelInit init;
	private MainController controller;

	public JPanelNivelEducational(JPanelInit panelInit) {
		this.init = panelInit;
		datos = new DefaultCategoryDataset();
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		controller = init.getMainWindow().getController();
		datos.addValue(controller.numberPersonsNivelEducativo(NivelEducational.PRIMARIA),
				"Poblacion", NivelEducational.PRIMARIA.getName());
		datos.addValue(controller.numberPersonsNivelEducativo(NivelEducational.SECUNDARIA),
				"Poblacion", NivelEducational.SECUNDARIA.getName());
		datos.addValue(controller.numberPersonsNivelEducativo(NivelEducational.TECNICO), 
				"Poblacion",  NivelEducational.TECNICO.getName());
		datos.addValue(controller.numberPersonsNivelEducativo(NivelEducational.TECNOLOGO),
				"Poblacion",  NivelEducational.TECNOLOGO.getName());
		datos.addValue(controller.numberPersonsNivelEducativo(NivelEducational.PROFESIONAL),
				"Poblacion",  NivelEducational.PROFESIONAL.getName());
		datos.addValue(controller.numberPersonsNivelEducativo(NivelEducational.MAESTRIA),
				"Poblacion",  NivelEducational.MAESTRIA.getName());
		datos.addValue(controller.numberPersonsNivelEducativo(NivelEducational.DOCTORADO),
				"Poblacion",  NivelEducational.DOCTORADO.getName());
		
		grafica = ChartFactory.createBarChart("Nivel Educacional",
				"Niveles", "Población", datos,
				PlotOrientation.VERTICAL, true, true, false);
		ChartPanel Panel = new ChartPanel(grafica);
		this.add(Panel);
	}
}
