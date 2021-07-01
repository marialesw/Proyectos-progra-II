package co.edu.uptc.models;

public class Product {

	private int code;
	private String name;
	private Category category;
	private double priceUnit;
	private String description;
	private String imageIcon;
	private int quantity;
	
	public Product(int code, String name, Category category, double priceUnit, String description, String imageIcon, int quantity) {
		super();
		this.code = code;
		this.name = name;
		this.category = category;
		this.priceUnit = priceUnit;
		this.description = description;
		this.imageIcon = imageIcon;
		this.quantity = quantity;
	}
	
	public String estructureProduct() {
		return code + "," + name + "," + category + "," + priceUnit + "," + description + "," +imageIcon + "," + quantity + "," + "\n";
	}

	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(double priceUnit) {
		this.priceUnit = priceUnit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImageIcon() {
		return imageIcon;
	}


	public void setImageIcon(String imageIcon) {
		this.imageIcon = imageIcon;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.code);
		builder.append(", ");
		builder.append(this.name);
		builder.append(", ");
		builder.append(this.category);
		builder.append(", ");
		builder.append(this.priceUnit);
		builder.append(", ");
		builder.append(this.description);
		builder.append(", ");
		builder.append(this.imageIcon);
		builder.append(", ");
		builder.append(this.quantity);
		builder.append("\n");
		
		return builder.toString();
	}
}
