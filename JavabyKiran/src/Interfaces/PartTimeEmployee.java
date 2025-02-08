package Interfaces;

public class PartTimeEmployee implements Employee {
	private double hourlyrate;
	private int hoursWorked;
	private String Name;
	
	// constructor
	public PartTimeEmployee (String Name,double hourlyrate, int hoursWorked) {
		this.Name=Name;
		this.hoursWorked=hoursWorked;
		this.hourlyrate=hourlyrate;
	}
	@Override
	public double CalculateSalary() {
		return hourlyrate* hoursWorked;
	}
	@Override
	public String getemployeeDetails() {
		return "part time employee : name ="+Name +",hurlyrate ="+hourlyrate + ",hour worked=" +hoursWorked +",total salary ="+CalculateSalary();
	}

}
