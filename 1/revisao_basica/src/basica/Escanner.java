package basica;

import java.util.Scanner;

public class Escanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String x3;
		
		x3= sc.next();
				
		int x4;
		
		x4 = sc.nextInt();
				
		double x5;
		
		x5 = sc.nextDouble();
		
		char x6;
		
		x6 = sc.next().charAt(0);

		System.out.println("voce digitou:" + x3);
		System.out.println("voce digitou: "+ x4);
		System.out.println("voce digitou: "+ x5);
		System.out.println("voce digitou: "+ x6);

		int x10;
		String x7, x8, x9;
		x10 = sc.nextInt();
		sc.nextLine();
		x7 = sc.next();
		x8 = sc.next();
		x9 = sc.next();
	
		System.out.println("dados digitados");
		System.out.println(x7);
		System.out.println(x8);
		System.out.println(x9);
		System.out.println(x10);
		sc.close();

	}
	
}
