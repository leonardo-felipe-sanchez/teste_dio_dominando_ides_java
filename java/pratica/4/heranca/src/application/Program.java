package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		/*
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		
		//upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.00);
		Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
	
		//Downcasting
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		if(acc3 instanceof BusinessAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalace();
			System.out.println("UPDATE!");
		} else {
			System.out.println("baitola");
		}*/
		
		//herança
		/*
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "bob", 1000.0, 500.00);
		acc3.withdraw(200.0);*/
		
		//polimorfismo
		
/*	Account x = new Account(1020, "Alex", 1000.0);
	Account y = new SavingAccount(1023, "Maria", 1000.0, 0.01);
	
	x.withdraw(50.0);
	y.withdraw(50.0);
	
	System.out.println(x.getBalance());
	System.out.println(y.getBalance());
*/
		//classes abstratas: elsa não podem ser instânciadas
		
/*		Account acc1 = new Account(1001, "Alex", 1000.0);
		Account acc2 = new SavingAccount(1004, "Anna", 1000.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "bob", 1000.0, 500.00);
*/		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList <>();
		
		list.add( new SavingAccount(1001, "Alex", 500.00, 0.01));
		list.add( new BusinessAccount(1002, "Maria", 1000.00, 400.0));
		list.add(new SavingAccount(1004, "bob", 300.0, 0.01));
		list.add( new BusinessAccount(1005, "anna", 500.00, 500.0));
		
		double sum = 0.0 ;
		
		
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
	
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n",acc.getNumber(),acc.getBalance());
		}
	
	}
	
}
