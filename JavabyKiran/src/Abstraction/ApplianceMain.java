package Abstraction;

public class ApplianceMain {
	public static void main(String[] args) {
		Refrigerator r = new Refrigerator();
		r.turnOn();
		Appliance a = new WashingMachine();
		a.turnOn();
	}

}
