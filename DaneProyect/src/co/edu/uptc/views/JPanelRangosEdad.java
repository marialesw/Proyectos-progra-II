package co.edu.uptc.views;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import co.edu.uptc.controllers.MainController;
import co.edu.uptc.models.NivelEducational;

public class JPanelRangosEdad extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFreeChart grafica;
	private DefaultCategoryDataset datos;
	private JPanelInit init;
	private MainController controller;
	private static final String RANGE_1 = "0 - 10";
	private static final String RANGE_2 = "10 - 20";
	private static final String RANGE_3 = "20 - 30";
	private static final String RANGE_4 = "30 - 40";
	private static final String RANGE_5 = " > 40";


	public JPanelRangosEdad(JPanelInit panelInit) {
		this.init = panelInit;
		datos = new DefaultCategoryDataset();
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		controller = init.getMainWindow().getController();
		datos.addValue(controller.numberPersonsRangosEdad(1),
				"Poblacion", RANGE_1);
		controller = init.getMainWindow().getController();
		datos.addValue(controller.numberPersonsRangosEdad(2),
				"Poblacion", RANGE_2);
		controller = init.getMainWindow().getController();
		datos.addValue(controller.numberPersonsRangosEdad(3),
				"Poblacion", RANGE_3);
		controller = init.getMainWindow().getController();
		datos.addValue(controller.numberPersonsRangosEdad(4),
				"Poblacion", RANGE_4);
		controller = init.getMainWindow().getController();
		datos.addValue(controller.numberPersonsRangosEdad(5),
				"Poblacion", RANGE_5);
		
		grafica = ChartFactory.createBarChart("Rangos de edad",
				"Edades", "Población", datos,
				PlotOrientation.VERTICAL, true, true, false);
		ChartPanel Panel = new ChartPanel(grafica);
		this.add(Panel);
	}
}
