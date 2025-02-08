package Polymorphism;

public   class Cars extends Vehicle1{
	private int numDoors;
	
	public Cars (String make,String model,int year,String fuel_type ,int numDoors) {
		super(make, model,year,fuel_type);
		this.numDoors=numDoors;
	}
	//override
	public double calculateFuelEfficiency() {
		return 15.0;
	}
	@Override
	public double getmaxSpeed() {
		return 180.0;
	}
	

}
