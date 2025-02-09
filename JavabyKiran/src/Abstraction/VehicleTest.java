package Abstraction;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle motorcycle = new MotorCycle();
		
		
		System.out.println("Car :");
		car.StartEngine();
		car.StopEngine();
		System.out.println();
		
		System.out.println("Motorcycle:");
		motorcycle.StartEngine();
		motorcycle.StopEngine();
		
		
	}

}
