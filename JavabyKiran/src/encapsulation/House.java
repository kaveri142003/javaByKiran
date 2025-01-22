package encapsulation;
import java.util.Scanner;

public class House {
	Scanner sc = new Scanner(System.in);
	private String address;
	private double price;
	private double noofrooms;
	
	
	public void setaddress(String a) {
		address = a;
	}
	
	public void setprice (double p) {
		price = p;
		
	}
	public void setnoofrooms(double r) {
		noofrooms = r;
	}
//getter
	public String getaddress() {
		return address;
	}
	public double getprice() {
		return price;
		
	}
	public double getnoofrooms() {
		return  noofrooms;
	}
	
	public void acceptvalue() {
		
	System.out.println ("Enter address");
    setaddress (sc.next()); 
	
	System.out.println ("Enter price");
	setprice(sc.nextDouble()); 
   
    System.out.println ("Enter noofrooms");
    setnoofrooms(sc.nextDouble()); 
	}
    public void displayvalue() {
    	   System.out.println("  ");
		   System.out.println("address: " + getaddress());
		   System.out.println("price :"+ getprice());
		   System.out.println("noofrooms:"+ getnoofrooms());
		  
    	
    }
    
    
    
    
    
    
    


}
