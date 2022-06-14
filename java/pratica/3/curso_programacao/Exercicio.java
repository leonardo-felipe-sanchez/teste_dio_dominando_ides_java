package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("exercicio 1");
		
		int x, x2, x3, x4, x5, x6, x7, x8, soma;
		
		x = sc.nextInt();
		
		x2 = sc.nextInt();
		
		soma = x + x2;
		
		System.out.println(soma);
	
		System.out.println("exercicio 2");
		
		x3 = sc.nextInt();
		
		double pi = 3.14159;
		
		double circulo = pi * Math.pow(x3, 2); 
		
 		System.out.println(circulo);

 		System.out.println("exercicio 3");
 		
 		x4 = sc.nextInt();
		
		x5 = sc.nextInt();

 		x6 = sc.nextInt();
		
		x7 = sc.nextInt();

		
		int DIFERENCA = x4 * x5 - x6 * x7;
		
		System.out.println(DIFERENCA);
		
		System.out.println("exercicio 4");
		
		x8 = sc.nextInt();
		Locale.setDefault(Locale.US);
		double x9 = sc.nextDouble();
		double x10= sc.nextDouble();
		
		double salario = x9 * x10;
		
		System.out.println("number: "+ x8);
		System.out.println("salary: "+ salario);
		
		System.out.println("exercicio 3");
		
		double x11;
		
		x11 = sc.nextDouble();

		double x12;
		
		x12 = sc.nextDouble();

		double x13;
		
		x13 = sc.nextDouble();
		
		double x14;
		
		x14 = sc.nextDouble();

		double x15;
		
		x15 = sc.nextDouble();

		double x16;
		
		x16 = sc.nextDouble();

		double somao = x11 + x12 + x13 + x14 + x15 + x16;
		
System.out.println("valor a pagar: "+ somao);
		
				sc.close();
	}
	
}
