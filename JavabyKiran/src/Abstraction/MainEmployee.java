package Abstraction;

public class MainEmployee {
	public static void main(String[] args) {
		Manager manager = new Manager("alice",1 ,5000 ,1500,780);
		manager.CalculateSalary();
		manager.dispalyInfo();
		
		System.out.println();
		
		
		Programmer programmer = new Programmer("Bob",102,50,160);
		programmer.CalculateSalary();
		programmer.dispalyInfo();
		
	}

}
