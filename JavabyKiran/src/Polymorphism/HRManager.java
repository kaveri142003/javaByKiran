package Polymorphism;

public class HRManager extends Employee {
	
	public void  Work() {
		super.Work();
		System.out.println("Work under HR");
	}
	
	public void addEmployee() {
		System.out.println("We can add new employee in this method");
	}
	

}
