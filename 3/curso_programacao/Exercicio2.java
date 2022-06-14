package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, duracao;
		
		x = sc.nextInt();
		y = sc.nextInt();
		if(x<0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
	
		if(x%2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
	
		if(x%y == 0 || y%x == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("não sao Multiplos");
		}
		
			if(x < y) {
				duracao = x - y;
			} else {
				duracao = 24 - x + y;
			}
		
			System.out.println(duracao);
			
		double x1, soma, x2, y1, juros;
		
		soma =0;
		
		x1 = 0.0;
		
		if(x == 1) {
			x1 = 4.0;
			
			soma = x1 * y;
			
			System.out.println("total: R$ " + soma);
		} else if(x == 2){
			x1 = 4.5;
			
			soma = x1 * y;
			
			System.out.println("total: R$ " + soma);
		}else if(x == 3){
			x1 = 5.0;
			
			soma = x1 * y;
			
			System.out.println("total: R$ " + soma);
		}else if(x == 4){
			x1 = 2.0;
			
			soma = x1 * y;
			
			System.out.println("total: R$ " + soma);
		}else if(x == 5){
			x1 = 1.5;
			
			soma = x1 * y;
			
			System.out.println("total: R$ " + soma);
		}
		
		x2 = sc.nextDouble();
		
		if(x2>= 0.0 && x2< 25.0) {
			System.out.println("Intervalo (0,25]");
		} else if(x2>=25.0 && x2 <50.0) {
			System.out.println("Intervalo (25,50]");
		} else if(x2>=50.0 && x2<75.0) {
			System.out.println("Intervalo (50,75]");
		} else if(x2>=75.0 && x2<= 100.0) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

		y1 = sc.nextDouble();
		
		if(x2 == 0.0 && y1 == 0.0 ) {
			System.out.println("Origem");
		}
		else if(x2 >0.0 && y1 > 0.0) {
			System.out.println("Q1");
		} else if(x2<0.0 && y1>0.0) {
			System.out.println("Q2");
		} else if(x2 < 0.0 && y1 < 0.0) {
			System.out.println("Q3");
		} else if(x2>0 && y1<0.0) {
			System.out.println("Q4");
		}

		if(x2 <2000.0) {
			System.out.printf("isento");
		} else if(x2<3000.0) {
			
			juros = (x2- 2000.0)* 0.08;
			
			System.out.printf("R$ %.2f ", juros);
		} else if(x2<4500.0) {
			
			juros = (x2- 3000.0)* 0.18+ 1000.0 * 0.08;
			
			System.out.printf("R$ %.2f ", juros);
		} else if(x2>4500.0) {
			
			juros = (x2- 4500.0)* 0.28+ 1500.0 * 0.18+ 1000.0 * 0.08;
			
			System.out.printf("R$ %.2f ", juros);
		}
		
		
		sc.close();
		
	}
	
}
