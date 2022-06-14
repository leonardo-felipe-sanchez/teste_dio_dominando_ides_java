package entities;

import java.util.Date;

public class HourContract {

	private Date datinha;
	private Double ValueperHour;
	private Integer houras;
	
	public HourContract() {
		
	}

	public HourContract(Date datinha, Double valueperHour, Integer houras) {
		
		this.datinha = datinha;
		ValueperHour = valueperHour;
		this.houras = houras;
	}

	public Date getDatinha() {
		return datinha;
	}

	public void setDatinha(Date datinha) {
		this.datinha = datinha;
	}

	public Double getValueperHour() {
		return ValueperHour;
	}

	public void setValueperHour(Double valueperHour) {
		ValueperHour = valueperHour;
	}

	public Integer getHouras() {
		return houras;
	}

	public void setHouras(Integer houras) {
		this.houras = houras;
	}
	
	public double totalValue(){
		return ValueperHour * houras;
	}
	
}
