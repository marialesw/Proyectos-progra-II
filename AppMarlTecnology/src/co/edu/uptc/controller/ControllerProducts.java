package co.edu.uptc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import co.edu.uptc.models.Category;
import co.edu.uptc.models.Product;
import co.edu.uptc.models.TypeDocument;
import co.edu.uptc.persistens.FileBinaryUsers;
import co.edu.uptc.persistens.FileProductsCSV;
import co.edu.uptc.views.MainWindow;

public class ControllerProducts {


	private List<Product> listProduct;
	private Product product;
	private FileProductsCSV fileProductsCSV;
	private MainWindow mainWindow;
	private List<Product> productosCanasta;

	public ControllerProducts(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		listProduct = new ArrayList<>();
		productosCanasta = new ArrayList<>();
		fileProductsCSV = new FileProductsCSV(mainWindow);
		try {
			listProduct = fileProductsCSV.obtenerProduct();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void addProductoCanasta(String product){
		for (int i = 0; i < listProduct.size(); i++) {
			if (listProduct.get(i).getName() == product) {
				productosCanasta.add(listProduct.get(i));
				System.out.println("producto " + listProduct.get(i));
			}
		}
	}

	public int numberProducts(){
		int number = listProduct.size();
		System.out.println(number);
		return number;
	}

	public String getDescription(int n){
		String descriptions = "";
		return descriptions = (listProduct.get(n).getName());
	}
	
	public boolean isEqualsIsCategory(int n, Category category){
		return listProduct.get(n).getCategory() == category;
	}
	
	public String getImages(int n){
		String urlImage = "";
		return urlImage = listProduct.get(n).getImageIcon();						
	}
	
	public String getPrice(String title){
		String price = "";
		for (int i = 0; i < listProduct.size(); i++) {
			if (listProduct.get(i).getName() == title) {
				price = ("$ " + (int)listProduct.get(i).getPriceUnit() + ".");
			}
		}
		return price;
	}
	
	public String getName(String title){
		String price = "";
		for (int i = 0; i < listProduct.size(); i++) {
			if (listProduct.get(i).getName() == title) {
				price = ("$ " + (int)listProduct.get(i).getPriceUnit() + ".");
			}
		}
		return price;
	}
	
	public String getDescription1(String title){
		String price = "";
		for (int i = 0; i < listProduct.size(); i++) {
			if (listProduct.get(i).getName() == title) {
				price = listProduct.get(i).getDescription();
			}
		}
		return price;
	}


	public void actualizeList(){
		try {
			fileProductsCSV.saveProducts(listProduct);
			listProduct = fileProductsCSV.obtenerProduct();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		mainWindow.getJpanelAdministrador().getJpanelAdminProductos().getPanelLista().actualizarLista(listarProductos());
	}

	public void addProduct(int code, String name, Category category, double priceUnit, String description, String imageIcon, int quantity) throws IOException{
		product = new Product(code, name, category, priceUnit, description, imageIcon, quantity);
		listProduct.add(product);
		saveProduct();
	}	

	@SuppressWarnings("unlikely-arg-type")
	public void deleteUser(int id) {
		listProduct.remove(id - 100);
	}

	public void imprimir() {
		for (int i = 0; i < listProduct.size(); i++) {
		}
	}

	public List<Product> readFile() throws IOException{
		return fileProductsCSV.obtenerProduct();
	}


	public List<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public FileProductsCSV getFileProductsCSV() {
		return fileProductsCSV;
	}

	public void setFileProductsCSV(FileProductsCSV fileProductsCSV) {
		this.fileProductsCSV = fileProductsCSV;
	}

	public void saveProduct() throws IOException{
		fileProductsCSV.saveProducts(listProduct);
	}

	public List<String> listarProductos(){
		List<String> list = new ArrayList();
		if(listProduct!=null && !listProduct.isEmpty()) {
			for (Product product : listProduct) {
				StringBuilder sb = new StringBuilder();
				sb.append("Codigo: ");
				sb.append(product.getCode());
				sb.append(" Nombre: ");
				sb.append(product.getName());
				sb.append("Categoría: ");
				sb.append(product.getCategory());
				list.add(sb.toString());
			}
		}
		return list;
	}

	public void editProduct(int i, String name, Category category, double priceUnit, String description, String imageIcon){
		listProduct.get(i).setCode(i);
		listProduct.get(i).setName(name);
		listProduct.get(i).setCategory(category);
		listProduct.get(i).setPriceUnit(priceUnit);
		listProduct.get(i).setDescription(description);
		listProduct.get(i).setImageIcon(imageIcon);
	}
}
