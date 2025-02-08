package Polymorphism;

public class Motorcycle extends Vehicle1 {
	private boolean hasSidecar;
	
	public Motorcycle(String make,String model,int year,String fuel_type,boolean hasSidecar) {
		super(make ,model,year,fuel_type);
		this.hasSidecar= hasSidecar ;
		
	}
	public double calculateFuelEfficiency() {
		return 30.0;
	}
	public double getmaxSpeed() {
		return 200.0;
	}
	
	

}
