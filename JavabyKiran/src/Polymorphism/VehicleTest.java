package Polymorphism;

public class VehicleTest {
	public static void main(String[] args) {
		Cars car = new Cars ("Toyoto", "Corolla",2022,"Petrol",4);
		Truck truck = new Truck("Volvo","fH16",2021,"Diesel",18);
		Motorcycle motorcycle = new Motorcycle("Harley-Davidson","sreet 750",2023,"petrol",false);
		
		car.displayInfo();
		System.out.println("car details");
		System.out.println();
		System.out.println("Fuel efficiency :"+ car.calculateFuelEfficiency()+"km/1");
		System.out.println("Max speed :"+ car. getmaxSpeed()+"km/h");
		System.out.println("Distance traveled with 10L :"+car.calculateDistanceTraveled(120 ,2)+"km/n");
		
		truck.displayInfo();
		System.out.println("Truck details");
		System.out.println();
		System.out.println("Fuel efficiency :"+ truck. calculateFuelEfficiency()+"km/1");
		System.out.println("Max speed :"+ truck. getmaxSpeed()+"km/h");
		System.out.println("Distance traveled with 10L :"+ truck.calculateDistanceTraveled(80,3)+"km/n");
		
		motorcycle.displayInfo();
		System.out.println("Motorcycle details");
		System.out.println();
		System.out.println("Fuel efficiency :"+ motorcycle. calculateFuelEfficiency() +"km/1");
		System.out.println("Max speed :"+ motorcycle. getmaxSpeed()+"km/h");
		System.out.println("Distance traveled with 10L :"+ motorcycle.calculateDistanceTraveled(100,1)+"km/n");
		
	}

}
