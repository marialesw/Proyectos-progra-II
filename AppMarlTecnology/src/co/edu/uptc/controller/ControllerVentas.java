package co.edu.uptc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import co.edu.uptc.models.Venta;
import co.edu.uptc.persistens.FileBinaryUsers;
import co.edu.uptc.persistens.FileProductsCSV;
import co.edu.uptc.persistens.FileVentasCSV;
import co.edu.uptc.views.MainWindow;

public class ControllerVentas {


	private List<Venta> listVentas;
	private Venta venta;
	private FileVentasCSV fileVentasCSV;
	private MainWindow mainWindow;


	public ControllerVentas(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		listVentas = new ArrayList<>();
		fileVentasCSV = new FileVentasCSV(mainWindow);	
	}

	public void actualizeList(){
		try {
			fileVentasCSV.saveProducts(listVentas);
			listVentas = fileVentasCSV.obtenerProduct();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		mainWindow.getJpanelAdministrador().getJpanelAdminProductos().getPanelLista().actualizarLista(listarProductos());
	}

	public void addVenta(int code, String user, int numberProductos, double valorTotal) throws IOException{
		venta = new Venta(code, user, numberProductos, valorTotal);
		listVentas.add(venta);
		saveProduct();
	}	

	@SuppressWarnings("unlikely-arg-type")
	public void deleteUser(int id) {
		listVentas.remove(id - 100);
	}

	public void imprimir() {
		for (int i = 0; i < listVentas.size(); i++) {
		}
	}

	public List<Venta> readFile() throws IOException{
		return fileVentasCSV.obtenerProduct();
	}


	public List<Venta> getListProduct() {
		return listVentas;
	}

	public void setListProduct(List<Venta> listProduct) {
		this.listVentas = listProduct;
	}

	public Venta getProduct() {
		return venta;
	}

	public void setProduct(Venta product) {
		this.venta = product;
	}

	public FileVentasCSV getFileProductsCSV() {
		return fileVentasCSV;
	}

	public void setFileProductsCSV(FileVentasCSV fileProductsCSV) {
		this.fileVentasCSV = fileProductsCSV;
	}

	public void saveProduct() throws IOException{
		fileVentasCSV.saveProducts(listVentas);
	}

	public List<String> listarProductos(){
		List<String> list = new ArrayList();
		if(listVentas!=null && !listVentas.isEmpty()) {
			for (Venta product : listVentas) {
				StringBuilder sb = new StringBuilder();
				sb.append("Codigo: ");
				sb.append(product.getCode());
				sb.append(" Fecha: ");
				sb.append(product.getFechaVenta());
				sb.append("Valor: ");
				sb.append(product.getValorTotal());
				list.add(sb.toString());
			}
		}
		return list;
	}
}
