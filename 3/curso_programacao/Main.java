package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.35784;

//		saida: escrita printf
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("bom dia");
		//Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("resultado = "+ x +" metros");
		System.out.printf("resultado = %.2f metros%n", x);
		
		double renda = 4000.0;
		String nome = "Maria";
		int idade = 31;
		
		System.out.printf("%s tem %d anos e ganha %.2f reais%n%n", nome, idade, renda);
		
		String product1 = "computer";
		String product2= "Office desk";
		
		int age= 30;
		int code = 5250;
		char gender = 'f';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
	
		System.out.println("products:");
		System.out.printf("%s which price is $ %.2f%n", product1, price1);
		System.out.printf("%s which price is $ %.2f%n%n", product2, price2);
		System.out.println("record: "+ age +" years old, code "+ code +" and gender: "+ gender);
		System.out.println(" ");
		System.out.println("measure with eight decimal places: "+ measure);
		System.out.printf("rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure );
	
		int x1, y1;
		
		x1 = 5;
		
		y1 = 2 * x1;
		
		System.out.println(x1);
		System.out.println(y1);
		
		int x2;
		double y2;
		
		x2 = 5;
		
		y2 = 2 * x1;
		
		System.out.println(x2);
		System.out.println(y2);
	
		double b , B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		System.out.println(area);

		float b1, B1, h1, area1;

		b1 = 6f;
		B1 = 8f;
		h1 = 5f;

		area1 = (b1 + B1) / 2f * h1;	
		
		System.out.println(area1);
	
		int a1, b3;
		double resultado;
	
		a1 = 5; 
		b3 = 2;
		
		resultado = (double) a1 / b3;
		
		System.out.println(resultado);
	
		int b4;
		double a2;
	
		a2 = 5.0; 
		b4 = (int) a2;
		
		System.out.println(b4);
	
//		entrada: teclado, scanf

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
	
		double tres = 3.0;
		double quatro = 4.0;
		double cinco = -5.0;
		double ra, be, ce;
		
		ra = Math.sqrt(tres);
		be = Math.sqrt(quatro);
		ce = Math.sqrt(25.0);
		
		System.out.println("raiz quadrada de " +tres+" = "+ ra);
		System.out.println("raiz quadrada de " +quatro+" = "+ be);
		System.out.println("raiz quadrada de 25 " + ce);
		
		ra = Math.pow(tres, quatro);
		be = Math.pow(tres, 2.0);
		ce = Math.pow(5.0, 2.0);

		System.out.println(tres + " elevado a "+ quatro+ " = "+ ra);
		System.out.println(tres + " elevado ao quadrado = "+ be);
		System.out.println("5 elevado ao quadrado = "+ ce);

		ra = Math.abs(tres);
		be = Math.abs(cinco);
		
		System.out.println("o valor absoluto de "+ quatro + " = "+ ra);
		System.out.println("o valor absoluto de "+ cinco + " = "+ be);
	}
		
//	processamento: processador ou comandos feito pelo programador, comando atribuição
}
