package Abstraction;

public class Animal1Test {
	public static void main(String[] args) {
		Animal1 lion = new Lion1 ();
		Animal1 tiger= new Tiger1();
		Animal1 deer = new Deer1();
		
		
		
		System.out.println("lion:");
		lion.eat();
		lion.sleep();
		
		System.out.println("Tiger:");
		tiger.eat();
		tiger.sleep();
		
		System.out.println("Deer :");
		deer.eat();
		deer.sleep();
		
		
		
		
		
		
	}
	

}
