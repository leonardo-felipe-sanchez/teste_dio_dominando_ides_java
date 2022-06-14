package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import util.Calculator;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
		Calculator calc = new Calculator();
			
			System.out.println("enter product data: ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			Product product = new Product(name, price);
			
			/*encapsulamento*/
			product.setName("Computer");
			System.out.println("Updated name: "+ product.getName());
			product.setPrice(1200.00);
			System.out.println("Updated price: "+ product.getPrice());
			
			System.out.println();
			System.out.println("product data: "+ product);
			
			System.out.println();
			System.out.println("Enter the number of products to be added in stock: ");
			
			int quantity = sc.nextInt();
			product.addProducts(quantity);
		
			System.out.println();
			System.out.println("update data: "+ product);
			
			System.out.println();
			System.out.println("Enter the number of products to be removed in stock: ");
			quantity = sc.nextInt();
			product.removeProducts(quantity);
			
			System.out.println();
			System.out.println("update data: "+ product);

			System.out.println("Enter radius: ");
			double radius = sc.nextDouble();
			
			double c = calc.circunference(radius);
			
			double v = calc.volume(radius);
			
			System.out.printf("circunference : %.2f%n", c);
			System.out.printf("volume : %.2f%n", v);
			System.out.printf("pi value: %.2f%n", calc.PI);
			
			sc.close();
		}
}
