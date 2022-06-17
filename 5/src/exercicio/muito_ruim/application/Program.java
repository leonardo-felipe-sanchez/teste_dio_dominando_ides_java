package exercicio.muito_ruim.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exercicio.muito_ruim.model.entities.Reservation;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		
		System.out.print("check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		if(!checkOut.after(checkIn))
			System.out.println("bota a data certa otário, se liga otário, porra otário, você mesmo otário");
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: "+ reservation);
		
		System.out.println();
		System.out.println("Entre com a data para atualizar a reserva: ");
		
		System.out.print("check-in date (dd/MM/yyyy): ");
		checkIn = sdf.parse(sc.next());
		
		System.out.print("check-out date (dd/MM/yyyy): ");
		checkOut = sdf.parse(sc.next());

		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			System.out.println("caralho mano, olhou o calendario não porra? vamo ter que fazer essa porra de novo por sua causa, bengola murcha");
		}
		else if(!checkOut.after(checkIn)){
			System.out.println("bota a data certa otário, se liga otário, porra otário, você mesmo otário");
		}
		else {
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: "+ reservation);
			
		}
		}
			sc.close();
	}
}
