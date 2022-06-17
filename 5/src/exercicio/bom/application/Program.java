package exercicio.bom.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exercicio.bom.model.entities.copy.Reservation;
import exercicio.bom.model.exceptions.DomainException;

public class Program {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			try {
				System.out.print("Room number: ");
				int number = sc.nextInt();
				System.out.print("check-in date (dd/MM/yyyy): ");
				Date checkIn = sdf.parse(sc.next());
				
				System.out.print("check-out date (dd/MM/yyyy): ");
				Date checkOut = sdf.parse(sc.next());
	
			
					Reservation reservation = new Reservation(number, checkIn, checkOut);
					System.out.println("Reservation: "+ reservation);
				
				System.out.println();
				System.out.println("Entre com a data para atualizar a reserva: ");
				
				System.out.print("check-in date (dd/MM/yyyy): ");
				checkIn = sdf.parse(sc.next());
				
				System.out.print("check-out date (dd/MM/yyyy): ");
				checkOut = sdf.parse(sc.next());
	
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: "+ reservation);
			}
			
			catch(ParseException e) {
				System.out.println("invalid date format");
			}
			catch (DomainException e) {
				System.out.println("errou na reserva viado:"+ e.getMessage());
			} catch(RuntimeException e) {
				System.out.println("Digite direito man�, censei desse caralho");
			}
				sc.close();

	}
}
