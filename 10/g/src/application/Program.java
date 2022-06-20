package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Producte;
import entities.Product.ProductService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Producte> list = new ArrayList<>();
		
		list.add(new Producte("Tv", 900.00));
		list.add(new Producte("Mouse", 50.00));
		list.add(new Producte("Tablet", 350.50));
		list.add(new Producte("HD Case", 80.90));

	ProductService ps =new ProductService();
	
	double sum = ps.filteredSum(/*list, p -> p.getName().charAt(0) == 'M'*/ list, p -> p.getPrice() < 100.0 );
	
	System.out.println("Sum = " + String.format("%.2f", sum));
	
	}	
}
