package co.edu.uptc.models;

public class Hardware {

	private String id;
	private String name;
	private String description;
	private Integer cantidad;
	private short unitPrice;
	
	public Hardware(String id, String name, String description,  Integer cantidad, short unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.cantidad = cantidad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public short getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(short unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
