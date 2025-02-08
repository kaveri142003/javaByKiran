package Polymorphism;

 public abstract class Vehicle1 {
	protected String make,model,fuel_type;
	protected int year;
	
	
	public Vehicle1(String make,String model,int year,String fuel_type  ) {
		this.make=make;
		this.model=model;
		this.year=year;
		this.fuel_type=fuel_type;
		
	}
	// abstract method
	public abstract  double calculateFuelEfficiency() ;
	public abstract  double getmaxSpeed();
	
	// common method to calculate distance traveled
	public double calculateDistanceTraveled(float speed,float time) {
		return speed *time;
	}
	public void displayInfo() {
		System.out.println("make :"+ make);
		System.out.println("model :"+ model);
		System.out.println("year "+ year);
		System.out.println("Fuel_type :"+ fuel_type);
		
	}
	
	
	
	
	
}
