package co.edu.uptc.view;

import java.util.Properties;

public class PropertiesTitle extends Properties{

	public PropertiesTitle(String lenguaje){
		switch (lenguaje) {
		case "Espanol":
			getProperties("espanol.properties");
			break;
		case "Ingles":
			getProperties("ingles.properties");
		case "Portugues":
			getProperties("portugues.properties");
		case "Frances":
			getProperties("frances.properties");
		case "Chino":
			getProperties("chino.properties");

		default:
			getProperties("Espanol");
			break;
		}
	}
	
	private void getProperties(String lenguaje){
		try {
			this.load(getClass().getResourceAsStream(lenguaje));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
