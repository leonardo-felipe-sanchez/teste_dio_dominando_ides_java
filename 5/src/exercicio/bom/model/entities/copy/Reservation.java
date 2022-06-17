package exercicio.bom.model.entities.copy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exercicio.bom.model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut){
		
		if(!checkOut.after(checkIn))
			throw new DomainException("bota a data certa otário, se liga otário, porra otário, você mesmo otário");

		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut){
		Date now = new Date();
		
		if(checkIn.before(now) || checkOut.before(now))
			throw new DomainException("caralho mano, olhou o calendario não porra? vamo ter que fazer essa porra de novo por sua causa, bengola murcha");
		if(!checkOut.after(checkIn))
			throw new DomainException("bota a data certa otário, se liga otário, porra otário, você mesmo otário");
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room " 
				+ roomNumber
				+ ", check-in"
				+sdf.format(checkIn)
				+", check-out"
				+sdf.format(checkOut)
				+ ", "
				+ duration()
				+" nights";
	}
}
