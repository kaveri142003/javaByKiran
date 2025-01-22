package encapsulation;
import java.util.Scanner;

public class Employeedemo {
	Scanner sc = new Scanner(System.in);
	private String name,department,education;
	private int id;
	private double salary;
	
	public void setname(String n) {
		name=n;
	}
	public void setdepartment(String d) {
		department=d;
		
	}
	public void seteducation(String e) {
		education = e;
	}
	public void setid(int i) {
		id=i;
	}
	public void setsalary(double s) {
		salary = s;
	}
	//getter
	
	public String getname() {
	  return  name;
	}
	public String getdepartment() {
		return department;
		
	}
	public String geteducation() {
		return education;
	}
    public int getid() {
    	return id;
    	
    }
    public double getsalary() {
    	return salary;
    }
    
    public void acceptvalue() {
    	System.out.println ("Enter employee name");
    	setname(sc.next()); 
    
       System.out.println ("Enter employee deparment");
	   setdepartment (sc.next()); 
	   
	   System.out.println ("Enter employee education");
     	seteducation(sc.next());   
   	
    	System.out.println ("Enter employee name");
	   setname(sc.next()); 
    }  
	   public void displayvalue() {
		   System.out.println("  ");
		   System.out.println("employee name : " + name);
		   System.out.println("employee department :"+ department);
		   System.out.println("employee education:"+ education);
		   System.out.println("employee id:" + id);
		   System.out.println("employee salary:" +salary);	   
		   
	   }
	
   	
	
    	
    	
    }

