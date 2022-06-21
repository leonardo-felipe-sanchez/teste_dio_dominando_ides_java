package entities;

public class Producte {

	private String name;
	private Double price; 
	
	public Producte(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static String staticUpperCaseName(Producte p) {
		return p.getName().toUpperCase();
		
	}
	
	public String nonstaticUpperCaseName() {
		return name.toUpperCase();
		
	}
	
	@Override
	public String toString() {
		return  name + ", " + String.format("%.2f", price);
	}
	
}