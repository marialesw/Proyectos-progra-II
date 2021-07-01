package co.edu.uptc.views;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

import co.edu.uptc.controllers.MainController;
import co.edu.uptc.models.Gender;
import co.edu.uptc.models.NivelEducational;

public class JPanelMenVsWomen extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFreeChart grafica;
	private DefaultPieDataset datos;
	private JPanelInit init;
	private MainController controller;

	public JPanelMenVsWomen(JPanelInit panelInit) {
		this.init = panelInit;
		datos = new DefaultPieDataset();
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		controller = init.getMainWindow().getController();
		datos.setValue("Hombres",controller.numberPersonsGender(Gender.MALE));
		datos.setValue("Mujeres",controller.numberPersonsGender(Gender.FEMALE));
		datos.setValue("Otro",controller.numberPersonsGender(Gender.OTHER));
		
		grafica = ChartFactory.createPieChart3D("Hombres vs Mujeres", datos, true, true, false); 
        PiePlot3D pieplot3d = (PiePlot3D)grafica.getPlot(); 
        pieplot3d.setDirection(Rotation.CLOCKWISE); 
        pieplot3d.setForegroundAlpha(0.5F); 
		ChartPanel Panel = new ChartPanel(grafica);
		this.add(Panel);
	}
}
