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
import co.edu.uptc.models.Venta;
import co.edu.uptc.views.Constants;
import co.edu.uptc.views.MainWindow;

/**
 *
 * @author Asus
 */
public class FileVentasCSV {

	List<Venta> ventasList;
	private MainWindow jfMainWindow;

	public FileVentasCSV(MainWindow jfMainWindow) {
		this.jfMainWindow = jfMainWindow; 
	}

	public void saveProducts(List<Venta> ventaList ) throws IOException{
		if (ventaList != null && !ventaList.isEmpty()) {
			File file = new File(Constants.ARCHIVO_VENTAS);
			FileOutputStream outputStream = new FileOutputStream(file);
			OutputStreamWriter writer = new OutputStreamWriter(outputStream);
			for (Venta venta : ventaList) {
				writer.write(venta.estructureVenta());
			}
			writer.close();
			outputStream.close();
		}
	}
	
	public List<Venta> obtenerProduct() throws IOException{
		ventasList = new ArrayList<>();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(Constants.ARCHIVO_VENTAS));
		String line = bufferedReader.readLine();
		while(line != null){
			String[] fields = line.split(Constants.SEPARADOR);
				Venta venta = null;
				venta = new Venta(Integer.parseInt(fields[0]), fields[1], Integer.parseInt(fields[2]), Double.parseDouble(fields[3]));
			line = bufferedReader.readLine();
			ventasList.add(venta);
		}
		bufferedReader.close();
		return ventasList;
	}
}
