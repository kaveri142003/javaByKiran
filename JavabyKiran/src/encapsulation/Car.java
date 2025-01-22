package encapsulation;
import java.util. Scanner;

public class Car {
	Scanner sc = new Scanner(System.in);
	
	private String name; 
	private String color;
	private Double no;
	
	
	public void setname (String n) {
		name= n;
	}
	public void setcolor(String c) {
		color= c;	
	}
	
	public void setno (Double n ) {
		no = n;
	}
	public String getname() {
		return name;
	
	}
	public String getcolor() {
		return color;
		
	}
	public Double getno() {
		return no;
	}	
		public void acceptvalue() {
			System.out.println ("enter car name ");
			setname (sc.next());
			
			System.out.println ("enter car color");
			setcolor (sc.next ());
			
			System.out.println("enter car no");
			setno(sc.nextDouble ());		
			
		}
		public void displayvalue() {
			System.out.println("getname:"+ getname());
			System.out.println ("getcolor:"+ getcolor());
			System.out.println("getno:"+ getno());
		}
	}


