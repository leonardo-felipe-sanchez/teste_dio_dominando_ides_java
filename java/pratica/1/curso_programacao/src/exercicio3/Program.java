package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		Accont accont;
		
		System.out.print("Enter accont number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			accont = new Accont(number, holder, initialDeposit);
				
		} else {
			accont = new Accont(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(accont);
		
		System.out.println();
		System.out.println("enter a deposit value: ");
		double depositValue = sc.nextDouble();
		accont.deposit(depositValue);
		System.out.println("updated account data: ");
		System.out.println(accont);
		
		System.out.println();
		System.out.println("enter a deposit value: ");
		double withdrawValue = sc.nextDouble();
		accont.withdraw(withdrawValue);
		System.out.println("updated account data: ");
		System.out.println(accont);
		sc.close();
		
		
	}
	
}
