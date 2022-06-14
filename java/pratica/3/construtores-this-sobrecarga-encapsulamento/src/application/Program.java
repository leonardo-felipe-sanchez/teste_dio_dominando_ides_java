package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;


public class Program {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

/*Product product = new Product();*/

/*sobrecarga*/ //Product p = new Product();

System.out.println("Enter product data: ");
System.out.print("Name: ");

/*product.name = sc.nextLine();*/

String name = sc.nextLine();

System.out.print("Price: ");

//product.price = sc.nextDouble();
double price = sc.nextDouble();
// sobrecarga --> System.out.print("Quantity in stock: ");

//product.quantity = sc.nextInt();
// sobrecarga --> int quantity = sc.nextInt();

/*construtor |
 * 			 V  */
Product product = new Product(name, price/* sobrecarga --> quantity*/);

/*getter and setter, se não não tiver esses dois no Product.java, dará erro --> product.name = "Computer"; */

product.setName("Computer");

System.out.println("Updated name: " + product.getName());
product.setPrice(1200.00);
System.out.println("Updated price: " + product.getPrice());


System.out.println();
System.out.println("Product data: " + product);
System.out.println();
System.out.print("Enter the number of products to be added in stock: ");

//int quantity = sc.nextInt();

int quantity = sc.nextInt();

product.addProducts(quantity);
System.out.println();
System.out.println("Updated data: " + product);
System.out.println();
System.out.print("Enter the number of products to be removed from stock: ");
quantity = sc.nextInt();
product.removeProducts(quantity);
System.out.println();
System.out.println("Updated data: " + product);
sc.close();
}
}