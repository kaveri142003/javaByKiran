package Interfaces;

public class MainVehicle {
	public static void main(String[] args) {
		Vehicle car= new Car("Toyoto","corola",50);
		Vehicle bike = new Bike("Yamha","MH-15",30);
		
		// display vehicle details calculate daily rent
		
		car.getVehicleType();
		System.out.println("rental cost for 5 days :"+ car.CalculateRent(5));
		System.out.println();
		
		bike.getVehicleType();
		System.out.println("rental cost for 3 days:"+bike.CalculateRent(3));
		System.out.println();
	}

}
