package inheritance;

import java.util.Scanner;

public class Vehicle {
	Scanner sc= new Scanner (System.in);
	private String vehicleType ,Power,Torque,length,noOfCylender;
	
	
	 //setter
	public void setPower(String p) {
		Power =p;
	}
	public void setvehicleType(String v) {
		vehicleType =v;
	}
	public void setTorque(String T) {
		Torque =T;
	}
	public void setlength(String l) {
		length =l;
	}
	public void setnoOfCylender(String c) {
		noOfCylender =c;
	}
	// getter
	public String getpower() {
		return Power ;	
	}
	public String getvehicleType() {
		return vehicleType ;	
	}
	public String getTorque() {
		return Torque ;	
	}
	public String getlength() {
		return length ;	
	}
	public String getnoOfCylender() {
		return noOfCylender ;	
	}
	public void acceptvalue1() {
		
		System.out.println("Enter Power:");
		setPower(sc.next());
	
	   System.out.println("Enter vehicleType:");
	   setvehicleType ( sc.next());

     System.out.println("Enter torque:");
     setTorque ( sc.next());

    System.out.println("Enter length :");
    setlength (sc.next());
    
    System.out.println("Enter noOfCylender:");
	setnoOfCylender (sc.next());

  }
	public void displayvalue(){
		 System.out.println("vehicle Details:");
		 System.out.println("power:"+ getpower());
		 System.out.println("vehicletype:"+getvehicleType());
		 System.out.println("torque:"+ getTorque());
		 System.out.println("length:"+getlength());
}
	Vehicle(){
		 acceptvalue1();
}
}
