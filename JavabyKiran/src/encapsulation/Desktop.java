package encapsulation;

import java.util.Scanner;

public class Desktop {	
	Scanner sc = new Scanner(System.in);
	private String  brand, RAMsize,processor;
	String u_ram;
	//Setter
	public void setBrand (String b) {
		brand =b;
	}
	public void setramSize(String R) {
		RAMsize =R;
	}
	public void setprocessor (String p) {
		processor =p;
	}
	public void setu_ram (String S) {
		u_ram =S;
	}
	//getter
	public String getBrand() {
		return brand;	
	}
	public String getramSize() {
		return RAMsize;
			
	}
	public String getprocessor() {
		return processor;
			
	}
	public String getu_ram() {
		return u_ram;		
	}
	// acceptvalue
	public void acceptvalue() {
		System.out.println ("enter brand name ");
		setBrand (sc.next());
		
		System.out.println ("enter ramSize");
		setramSize (sc.next ());
		
		System.out.println("enter processor name");
		setprocessor(sc.next ());	
		
		System.out.println("enter u_ram name");
		setu_ram(sc.next ());	
		
		//displayvalue
	}
	public void displayvalue() {
		System.out.println("getBrand:"+ getBrand());
		System.out.println ("getramSize:"+ getramSize());
		System.out.println("getprocessor:"+ getprocessor());
		System.out.println("getu_ram:"+ getu_ram());
		
	}
}
