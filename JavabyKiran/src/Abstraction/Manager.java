package Abstraction;

public class Manager extends Employee {
	private double baseSalary;
	private double Bonus;
	
	// constructor
	public Manager(String Name , int id,double Salary,double basaSalary,double Bonus) {
			super( Name,id);
			this.baseSalary=baseSalary;
			this.Bonus=Bonus;
	}
	@Override
	public double CalculateSalary() {
		 return Salary = baseSalary + Bonus;
	}
	@Override
	public void dispalyInfo() {
		System.out.println("Manager details:");
		System.out.println("id :"+id);
		System.out.println("name :"+Name);
		System.out.println("salary : $"+Salary);
	}

}
