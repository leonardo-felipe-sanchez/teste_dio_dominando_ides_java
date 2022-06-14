package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Condicao {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("quantas horas?");
		hora =sc.nextInt();
		
		if(hora<12) {
			System.out.println("bom dia");
		}else if(hora <18) {
			System.out.println("boa tarde");
		}else {
		System.out.println("boa noite");
		}
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
			if(minutos > 100) {
				conta += (minutos - 100) * 2.0;
				
			}	
		
			System.out.println("valor a pagar: R$"+ conta);
			
			int x = sc.nextInt();
			String dia;
			
			switch(x) {
			case 1:
				dia = "domingo";
				break;
				
			case 2:
				dia = "segunda";
				break;
				
			case 3:
				dia = "terca";
				break;
				
			case 4:
				dia = "quarta";
				break;
				
			case 5:
				dia = "quinta";
				break;
				
			case 6:
				dia = "sexta";
				break;
				
			case 7:
				dia = "sabado";
				break;
				
			default:
				dia = "valor invalido";
				break;
			}
			
		System.out.println("dia da semana:"+ dia);	

		double price = 34.5;
		double desconto = (price < 20.0)? price * 0.1 : price * 0.05;
		
		if(price < 20.0) {
			desconto = price * 0.1;
		} else {
			desconto = price * 0.05; 
		}
		
		
		
		System.out.println(desconto);
		
		sc.close();
		
	}
	
	
}
