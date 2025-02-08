package Polymorphism;

public class Truck extends Vehicle1 {
	private double loadCapacity;
	
	public Truck(String make,String model,int year,String fuel_type,double loadCapacity) {
		super(make ,model,year,fuel_type);
		this.loadCapacity= loadCapacity;
		
	}
	@Override
	public double calculateFuelEfficiency() {
		return 8.0;
	}
	@Override
	public double getmaxSpeed() {
		return 120.0;
	}
	@Override
		public double calculateDistanceTraveled(float speed,float time) {
			return speed *time;
		}
	
	

}
