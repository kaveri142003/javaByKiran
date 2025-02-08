package Interfaces;

public class FullTimeEmployee implements Employee {
	private double Salary;
	private String Name;
	
	
	// constructor
	public FullTimeEmployee(double Salary,String Name) {
		this.Name=Name;
		this.Salary=Salary;
	}
	@Override
	 public double  CalculateSalary() {
		return Salary;
	}
	public String getemployeeDetails() {
		return "full time employee :Name ="+Name + ",Salary ="+Salary;
	}

}
