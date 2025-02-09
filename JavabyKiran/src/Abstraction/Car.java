package Abstraction;

public class Car extends Vehicle {
	
	@Override
	public void StartEngine() {
		System.out.println("Car engine start with a key or push button :");
	}
	@Override
	public void StopEngine() {
		System.out.println("Carengine stop by turning off the ignition");
	}

}
