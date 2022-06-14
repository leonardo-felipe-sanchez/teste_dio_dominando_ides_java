package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		Product[] vest = new Product[n];
		
		for (int i =0; i<vest.length; i++) {
		
			vect[i] = sc.nextDouble();
			
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vest[i] = new Product(name, price);
			
		}
	
		double sum = 0.0;
		
		for ( int i=0; i<n; i++) {
			sum += vest[i].getPrice();
		}
	
		double avg = sum / n;
	
		System.out.printf("AVERAGE PRICE = %.2f", avg);
		
		sc.close();
	}
	
}
