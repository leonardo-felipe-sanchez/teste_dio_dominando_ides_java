package array;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x;
		
		int y = (int) obj;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] vect = new double[n];
		Product[] vest = new Product[n];
		String[] veqt = new String[] {"Maria", "bob", "Alex"};
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
			System.out.println("digite o nome");
			sc.nextInt();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vest[i] = new Product(name,price);
		}
		
		double sum = 0.0;
		double sum1 = 0.0;
		
		for (int i = 0; i<n; i++) {
			sum += vect[i];
		}
		
		for(int i = 0; i<vest.length; i++) {
			sum1 += vest[i].getPrice();
		}

		for(int i=0; i<veqt.length; i++) {
			System.out.println(veqt[i]);
		}
		System.out.println("----------------------------");
		for(String obb: veqt) {
			System.out.println(obb);
		}
		
		double avg = sum / n;
		double avg1 = sum1 / n;
		
		System.out.printf("AVERAGE PRICE: %.2f%n", avg1);
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

		System.out.println(obj);
		System.out.println(y);
		sc.close();
	}
	
}
