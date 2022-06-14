package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entites.enums.ExercicioWorkerLevel;

public class Worker {

	private String name;
	private ExercicioWorkerLevel level;
	private Double baseSalary;
	
	private ExercicioDepartment department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}

	public Worker(String name, ExercicioWorkerLevel level, Double baseSalary, ExercicioDepartment department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ExercicioWorkerLevel getLevel() {
		return level;
	}

	public void setLevel(ExercicioWorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public ExercicioDepartment getDepartment() {
		return department;
	}

	public void setDepartment(ExercicioDepartment department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void setContracts(List<HourContract> contracts) {
		this.contracts = contracts;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public double income(int year, int month) {
		
		Calendar cal = Calendar.getInstance();
		double sum = baseSalary;
	/*	cal.setTime(c.getDate());*/
		for(HourContract c : contracts) {
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		
		return sum;
	}
	
}
