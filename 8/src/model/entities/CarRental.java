package model.entities;

import java.util.Date;

public class CarRental {
	
	private Date Start;
	private Date finish;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {
		
		
	}
	
public CarRental(Date start, Date finish, Vehicle vehicle) {
		
		Start = start;
		this.finish = finish;
		this.vehicle = vehicle;
		
	}
	
}
