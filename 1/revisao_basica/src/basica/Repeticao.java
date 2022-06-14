package basica;

import java.util.Locale;
import java.util.Scanner;

public class Repeticao {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		int x = sc.nextInt();
		int soma = 0;
		while (x!= 0) {
			 soma += x;
			
			x = sc.nextInt();
		}
		System.out.println(soma);
		
		int n = sc.nextInt();
		int soma2 = 0;
		int x1 = 0;
		
		for(int i = 0; i <n; i++) {
			x1 = sc.nextInt();
			soma2 += x1;
			
		}
		
		System.out.println(soma2);
		
		for (int i = 0; i<5; i++) {
			System.out.println("valor de i: "+ i);
		}
		System.out.println(" ");
		for (int i = 4; i>=0; i--) {
			System.out.println("valor de i: "+ i);
		}
		 char resp ;
		do {
			System.out.println("digite a tempreatura em celsius :");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.println("Equivalente em faraianait: "+ f);
			System.out.print("Deseja repetir (s/n)?");
			
			 resp = sc.next().charAt(0);
			
			
		}while(resp != 'n');
		
		sc.close();
	}
}
