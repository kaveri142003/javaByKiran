package inheritance;

import java.util.Scanner;

public class Car extends Vehicle{
	Scanner sc= new Scanner (System.in);
	private String CarName ,Brand,Color,Weight,GearType,SittingCapacity;
	
	//setter
	
	public void setCarName(String N) {
		CarName = N;
	}
	public void setBrand(String b) {
		Brand = b;
	}
	
	public void setcolor(String C) {
		Color = C;
	}
	
	public void setWeight(String W) {
		Weight = W;
	}
	
	public void setGearType(String g) {
		GearType = g;
	}

	public void setSittingCapacity(String s) {
		SittingCapacity = s;
	}
	
	//getter
	public String getCarName() {
		return CarName;
	}
	public String getBrand() {
		return Brand;
	}
	
	public String getcolr() {
		return Color;
	}
	
	public String getWeigth() {
		return Weight;
	}
	
	public String getGearType() {
		return GearType;
	}
	public String getSittingCapacity() {
		return SittingCapacity;
	}
	
	public void acceptvalue() {
	System.out.println("Enter CarName :");
		setCarName(sc.next());
	 System.out.println("Enter brand :");
	 setBrand(sc.next());
    System.out.println("Enter color :");
    setcolor(sc.next());
    System.out.println("Enter weight :");
	setWeight(sc.next());
	System.out.println("Enter Cargeartype :");
	setGearType(sc.next());
	System.out.println("Enter SittingCapacity :");
	setSittingCapacity(sc.next());
}
	public void showvalue() {
		 System.out.println("car Details:");
		 System.out.println("power:"+ getCarName());
		 System.out.println("brand:"+ getBrand());
		 System.out.println("color:"+ getcolr());
		 System.out.println("weight:"+ getWeigth());
		 System.out.println("CargearType :"+getGearType());
		 System.out.println("sittingtype:"+getSittingCapacity());

		 
}
	Car(){
		acceptvalue();
		 displayvalue();
		 showvalue();
	}
	
	
	

}
