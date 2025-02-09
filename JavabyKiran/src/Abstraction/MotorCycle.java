package Abstraction;

public class MotorCycle extends Vehicle {
	
	@Override
	public void StopEngine () {
		System.out.println("Motorcycle engine start with selfstart button or kickstart");
	}
	@Override
	public void StartEngine() {
		System.out.println("Motorcycle engine stop by turning key to off position");
	}

}
