package Sorting;

import java.util.Scanner;

public class Studentdata{ 
	String name;
	 int age;
    public  Studentdata () {
   
    }
    public static void sortData (Studentdata ss[]) {
    	for(int k=0;k<ss.length;k++) {
    		for (int j=k+1;j<ss.length;j++) {
    			if (ss[k].age>ss[j].age) {
    				Studentdata t=ss[k];
   				ss[k]=ss[j];
   				ss[j]=t;
  			}
    		}
    	}
    }
    
    public static void displayvalue(Studentdata ss[]) {
    	for(int k=0;k<ss.length;k++) {
    		ss[k].showStudentinfo();
    	}
    }

  public static void acceptdata(Studentdata ss[]){
	  Scanner sc= new Scanner(System.in);
	  for(int k=0;k<ss.length;k++) {
		  ss[k]=new Studentdata();
		  ss[k].enterStudentinfo();
	  }
	  
  }
	  
  
  public void enterStudentinfo() {
	  Scanner sc= new Scanner (System.in);
	  System.out.println("Enter name");
	  name = sc.next();
	  System.out.println("Enter age");
	  age = sc.nextInt();
	  
	  
  }
  public void showStudentinfo() {
	  System.out.println("-----");
	  System.out.println("Nmae ->"+ name);
	  System.out.println("Age ->"+age);
  }
	  
  }
