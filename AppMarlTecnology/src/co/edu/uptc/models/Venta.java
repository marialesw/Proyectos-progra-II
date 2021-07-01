package co.edu.uptc.models;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Venta {

	//código de venta, fecha de venta, Usuario, Numero de productos comprados y valor total
	private int code;
	private Calendar fechaVenta;
	private String horaVenta;
	private String user;
	private int numberProductos;
	private double valorTotal;
	
	public Venta(int code, String user, int numberProductos, double valorTotal) {
		super();
		this.code = code;
		this.user = user;
		this.numberProductos = numberProductos;
		this.valorTotal = valorTotal;
		this.horaVenta = getHoraLocal();
		calcularFecha();
	}
	
	public String estructureVenta() {
		return code + "," + user + "," + numberProductos + "," + valorTotal + "," + horaVenta + "," + fechaVenta + "," + "\n";
	}

	
	public String getHoraLocal() { 
        Date today = new Date(); 
        DateFormat formatter; 

        Locale currentLocale = new Locale("de", "DE"); 
        formatter = DateFormat 
                .getTimeInstance(DateFormat.MEDIUM, currentLocale); 
        horaVenta = formatter.format(today); 

        return horaVenta; 
    }  

	public void calcularFecha() {
		Calendar today = Calendar.getInstance();
		this.fechaVenta = today;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Calendar getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Calendar fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getNumberProductos() {
		return numberProductos;
	}

	public void setNumberProductos(int numberProductos) {
		this.numberProductos = numberProductos;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
