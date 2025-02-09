package Abstraction;

public class Programmer extends Employee {
	private double hourlyRate;
	private int hoursWorked;
	
	//constructor
	public Programmer (String Name , int Id,double hourlyRate, int hoursWorked) {
		super(Name,Id);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	@Override
	public double CalculateSalary() {
		 return Salary=hourlyRate *hoursWorked;
		
	}
	@Override
	
	public void dispalyInfo() {
		System.out.println("Programmer Details :");
		System.out.println("id :"+id);
		System.out.println("name :"+Name);
		System.out.println("Salary :"+Salary);
		
		
	}

}
