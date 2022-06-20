package entities.Product;

import java.util.List;
import java.util.function.Predicate;

import entities.Producte;

public class ProductService {

	public double filteredSum(List<Producte> list, Predicate<Producte> criteria){
		double sum = 0.0;
		for(Producte p : list) {
			if(/*p.getName().charAt(p) == 'T'*/ criteria.test(p)){
				sum+= p.getPrice();
			}
		}
		return sum;
	}
	
}
