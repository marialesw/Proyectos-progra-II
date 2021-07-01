/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.persistens;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import co.edu.uptc.models.Category;
import co.edu.uptc.models.Product;
import co.edu.uptc.views.Constants;
import co.edu.uptc.views.MainWindow;

/**
 *
 * @author Asus
 */
public class FileProductsCSV {

	List<Product> productList;
	private MainWindow jfMainWindow;

	public FileProductsCSV(MainWindow jfMainWindow) {
		this.jfMainWindow = jfMainWindow; 
	}

	public void saveProducts(List<Product> productList ) throws IOException{
		if (productList != null && !productList.isEmpty()) {
			File file = new File(Constants.ARCHIVO);
			FileOutputStream outputStream = new FileOutputStream(file);
			OutputStreamWriter writer = new OutputStreamWriter(outputStream);
			for (Product product : productList) {
				writer.write(product.estructureProduct());
			}
			writer.close();
			outputStream.close();
		}
	}
	
	public List<Product> obtenerProduct() throws IOException{
		productList = new ArrayList<>();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(Constants.ARCHIVO));
		String line = bufferedReader.readLine();
		while(line != null){
			String[] fields = line.split(Constants.SEPARADOR);
				Product product = null;
				product = new Product(Integer.parseInt(fields[0]), fields[1],Category.valueOf(fields[2]),
						Double.parseDouble(fields[3]), fields[4], fields[5],Integer.parseInt(fields[6]));
			line = bufferedReader.readLine();
			productList.add(product);
		}
		bufferedReader.close();
		return productList;
	}
}
