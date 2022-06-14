package basica;

import java.util.Locale;

public class Scanf {

	public static void main(String[] args) {
		
		double x = 10.35784;
		
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
	
	}
	
}
