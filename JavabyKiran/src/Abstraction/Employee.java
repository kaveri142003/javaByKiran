package Abstraction;

public  abstract class Employee {
	
	protected String Name;
	protected int id;
	protected double Salary;
	
	// constructor
	public Employee(String Name , int id ) {
		this.id=id;
		this.Name=Name;
		
		
	}
	// abstract method
	public abstract double CalculateSalary();
	public abstract void  dispalyInfo();

}
