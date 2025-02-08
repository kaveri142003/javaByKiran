package Interfaces;

public class Bike  implements Vehicle {
	
	private String Brand;
	private String Model;
	private double DailyRent;
	
	//constructor
	public Bike (String Brand , String Model , double DailyRent) {
		this.Brand=Brand;
		this.DailyRent=DailyRent;
		this.Model=Model;
	}
	@Override
	public double CalculateRent(int days) {
		return DailyRent *days;
	}
	@Override
	public void getVehicleType() {
		System.out.println("vehicle type :");
		System.out.println("brand :"+Brand + ",model :"+Model);
		
	}

}
