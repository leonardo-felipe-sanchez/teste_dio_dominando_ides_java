package application;

import java.util.Scanner;

import services.PrintService;
import services.PrintServiceName;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>();
		
		//PrintServiceName<String> ps = new PrintServiceName<String>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();
		String x = ps.first();
//		String x = (String) ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}
}