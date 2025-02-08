package Interfaces;

public class MainJob {
	public static void main(String[] args) {
		Employee fullTimeEmp=new FullTimeEmployee(30000,"kaveri");
		Employee partTimeEmp = new PartTimeEmployee("bob",39,80);
		
		System.out.println(fullTimeEmp.getemployeeDetails());
		System.out.println("calculated salary"+fullTimeEmp.CalculateSalary());
		
		System.out.println(partTimeEmp.getemployeeDetails());
		System.out.println("calculate salary"+partTimeEmp.CalculateSalary());
	}

}
