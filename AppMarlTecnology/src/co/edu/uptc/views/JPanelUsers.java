package co.edu.uptc.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import co.edu.uptc.controller.ControllerProducts;
import co.edu.uptc.models.Category;

public class JPanelUsers extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanelInitCategorias jPanelInitCategorias;
	private JPanelCelularesYTablets celularesYTablets;
	private JPanelMenus jPanelMenus;
	private MainWindow mainWindow;
	private Color color;
	private JPanelAudiovisuales jPanelAudioV;
	private JPanelComputadores jPanelComput;
	private JPanelVideoGames jPanelVideoG;
	private JPanelSouth jPanelSouth;
	private JDialogAddCompra jDialogAddCan;

	public JPanelUsers(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		mainWindow.setSize(1200, 720);
		setLayout(new BorderLayout());
		initComponents();
		setVisible(true);
	}

	public void createScroll(int n) {
		JScrollPane scroll = new JScrollPane();
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBorder(new CompoundBorder(new EmptyBorder(3, 3, 3, 3), new LineBorder(Color.BLACK, 1)));
		if (n == 1) {
			scroll.getViewport().add(celularesYTablets);
		} else if (n == 2) {
			scroll.getViewport().add(jPanelAudioV);
		} else if (n == 3) {
			scroll.getViewport().add(jPanelComput);
		} else if (n == 4) {
			scroll.getViewport().add(jPanelVideoG);
		}

		this.add(scroll, BorderLayout.EAST);
	}

	private void initComponents() {
		crearPanelCategorias();
		jPanelMenus = new JPanelMenus(mainWindow, 2);
		this.add(jPanelMenus, BorderLayout.NORTH);
		jPanelSouth = new JPanelSouth();
		this.add(jPanelSouth, BorderLayout.SOUTH);
	}

	public void mostrarDialogo(int n) {
		jDialogAddCan = new JDialogAddCompra(this, n);
		jDialogAddCan.setVisible(true);
	}

	public void crearPanelCategorias() {
		jPanelInitCategorias = new JPanelInitCategorias(this);
		this.add(jPanelInitCategorias, BorderLayout.CENTER);
	}

	public void crearPanelCelularesYt() {
		celularesYTablets = new JPanelCelularesYTablets(this);
		this.add(celularesYTablets, BorderLayout.CENTER);
	}

	public void crearPanelAudioVis() {
		jPanelAudioV = new JPanelAudiovisuales(this);
		this.add(jPanelAudioV, BorderLayout.CENTER);
	}

	public void crearPanelVideoGames() {
		jPanelVideoG = new JPanelVideoGames(this);
		this.add(jPanelVideoG, BorderLayout.CENTER);
	}

	public void crearPanelComputadores() {
		jPanelComput = new JPanelComputadores(this);
		this.add(jPanelComput, BorderLayout.CENTER);
	}

	public JPanelCelularesYTablets getCelularesYTablets() {
		return celularesYTablets;
	}

	public void setCelularesYTablets(JPanelCelularesYTablets celularesYTablets) {
		this.celularesYTablets = celularesYTablets;
	}

	public JPanelInitCategorias getjPanelInitCategorias() {
		return jPanelInitCategorias;
	}

	public void setjPanelInitCategorias(JPanelInitCategorias jPanelInitCategorias) {
		this.jPanelInitCategorias = jPanelInitCategorias;
	}

	public JPanelMenus getjPanelMenus() {
		return jPanelMenus;
	}

	public void setjPanelMenus(JPanelMenus jPanelMenus) {
		this.jPanelMenus = jPanelMenus;
	}

	public MainWindow getMainWindow() {
		return mainWindow;
	}

	public void setMainWindow(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void selected2(ActionEvent e) {
		Object product = e.getSource();
		ControllerProducts cproducts = mainWindow.getController().getControllerProducts();
		mostrarDialogo(1);
		for (int i = 0; i < jPanelAudioV.getCelularesList().size(); i++) {
			if (jPanelAudioV.getCelularesList().get(i) == product) {
				String titulo = jPanelAudioV.obtenerTitulo(i);
				jDialogAddCan.getjPanelAddCanasta().addImage(jPanelAudioV.obtenerImagen(i));
				jDialogAddCan.getjPanelAddCanasta().modificarLabels(titulo, cproducts.getPrice(titulo),
						cproducts.getDescription1(titulo));
			}
		}
	}

	public void selected1(ActionEvent e) {
		Object product = e.getSource();
		ControllerProducts cproducts = mainWindow.getController().getControllerProducts();
		mostrarDialogo(1);
		for (int i = 0; i < celularesYTablets.getCelularesList().size(); i++) {
			if (celularesYTablets.getCelularesList().get(i) == product) {
				String titulo = celularesYTablets.obtenerTitulo(i);
				jDialogAddCan.getjPanelAddCanasta().addImage(celularesYTablets.obtenerImagen(i));
				jDialogAddCan.getjPanelAddCanasta().modificarLabels(titulo, cproducts.getPrice(titulo),
						cproducts.getDescription1(titulo));
			}
		}
	}

	public void selected3(ActionEvent e) {
		Object product = e.getSource();
		ControllerProducts cproducts = mainWindow.getController().getControllerProducts();
		mostrarDialogo(1);
		for (int i = 0; i < jPanelComput.getCelularesList().size(); i++) {
			if (jPanelComput.getCelularesList().get(i) == product) {
				String titulo = jPanelComput.obtenerTitulo(i);
				jDialogAddCan.getjPanelAddCanasta().addImage(jPanelComput.obtenerImagen(i));
				jDialogAddCan.getjPanelAddCanasta().modificarLabels(titulo, cproducts.getPrice(titulo),
						cproducts.getDescription1(titulo));
			}
		}
	}

	public void selected4(ActionEvent e) {
		Object product = e.getSource();
		ControllerProducts cproducts = mainWindow.getController().getControllerProducts();
		mostrarDialogo(1);
		for (int i = 0; i < jPanelVideoG.getCelularesList().size(); i++) {
			if (jPanelVideoG.getCelularesList().get(i) == product) {
				String titulo = jPanelVideoG.obtenerTitulo(i);
				jDialogAddCan.getjPanelAddCanasta().addImage(jPanelVideoG.obtenerImagen(i));
				jDialogAddCan.getjPanelAddCanasta().modificarLabels(titulo, cproducts.getPrice(titulo),
						cproducts.getDescription1(titulo));
			}
		}
	}

	public void generarCanasta(ActionEvent e) {
		Object product = e.getSource();
		ControllerProducts cproducts = mainWindow.getController().getControllerProducts();
		for (int i = 0; i < jDialogAddCan.getJpanelProductsCanasta().getCelularesList().size(); i++) {
			if (jDialogAddCan.getJpanelProductsCanasta().getCelularesList().get(i) == product) {
				String titulo = jDialogAddCan.getJpanelProductsCanasta().obtenerTitulo(i);
				jDialogAddCan.getJpanelProductsCanasta()
						.addImage(jDialogAddCan.getJpanelProductsCanasta().obtenerImagen(i));
			}
		}
	}

	public void anadirCanasta(ActionEvent e) {
		Object product = e.getSource();
		ControllerProducts cproducts = mainWindow.getController().getControllerProducts();
		String titulo = jDialogAddCan.getjPanelAddCanasta().obtenerNmbre();
		cproducts.addProductoCanasta(titulo);
	}

	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		System.out.println(action);
		switch (action) {
		case Constants.ADD_CANASTA:
			anadirCanasta(e);
			break;
		case Constants.T_LABEL_CANCELAR:
			jDialogAddCan.setVisible(false);
			break;
		case Constants.T_MENU_CANASTA:
			mostrarDialogo(2);
			break;
		case Constants.SELECTED_1:
			selected1(e);
			break;
		case Constants.SELECTED_2:
			selected2(e);
			break;
		case Constants.SELECTED_3:
			selected3(e);
			break;
		case Constants.SELECTED_4:
			selected4(e);
			break;
		case Constants.BUTTON1:
			this.remove(jPanelInitCategorias);
			crearPanelCelularesYt();
			int products = mainWindow.getController().getControllerProducts().numberProducts();
			for (int i = 0; i < products; i++) {
				if (mainWindow.getController().getControllerProducts().isEqualsIsCategory(i, Category.CELULARES)) {
					celularesYTablets.newButton(mainWindow.getController().getControllerProducts().getImages(i),
							mainWindow.getController().getControllerProducts().getDescription(i));

				}
			}
			celularesYTablets.initComponents();
			createScroll(1);
			break;
		case Constants.BUTTON2:
			this.remove(jPanelInitCategorias);
			crearPanelAudioVis();
			int products1 = mainWindow.getController().getControllerProducts().numberProducts();
			for (int i = 0; i < products1; i++) {
				if (mainWindow.getController().getControllerProducts().isEqualsIsCategory(i, Category.AUDIOVISUALES)) {
					jPanelAudioV.newButton(mainWindow.getController().getControllerProducts().getImages(i),
							mainWindow.getController().getControllerProducts().getDescription(i));

				}
			}
			jPanelAudioV.initComponents();
			createScroll(2);
			break;
		case Constants.BUTTON3:
			this.remove(jPanelInitCategorias);
			crearPanelComputadores();
			int products11 = mainWindow.getController().getControllerProducts().numberProducts();
			for (int i = 0; i < products11; i++) {
				if (mainWindow.getController().getControllerProducts().isEqualsIsCategory(i, Category.COMPUTACION)) {
					jPanelComput.newButton(mainWindow.getController().getControllerProducts().getImages(i),
							mainWindow.getController().getControllerProducts().getDescription(i));

				}
			}
			jPanelComput.initComponents();
			createScroll(3);
			break;
		case Constants.BUTTON4:
			this.remove(jPanelInitCategorias);
			crearPanelVideoGames();
			int products111 = mainWindow.getController().getControllerProducts().numberProducts();
			for (int i = 0; i < products111; i++) {
				if (mainWindow.getController().getControllerProducts().isEqualsIsCategory(i, Category.VIDEOJUEGOS)) {
					jPanelVideoG.newButton(mainWindow.getController().getControllerProducts().getImages(i),
							mainWindow.getController().getControllerProducts().getDescription(i));

				}
			}
			jPanelVideoG.initComponents();
			createScroll(4);
			break;
		default:
			break;
		}
		revalidate();
		repaint();
	}
}
