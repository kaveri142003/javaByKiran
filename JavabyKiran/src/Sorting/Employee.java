package Sorting;

import java.util.Scanner;

public class Employee {
	
	Scanner sc=new Scanner(System.in);
	public String EmployeeName,EmployeeDepartment;
	public int EmployeeID,EmployeeSalary;
	
	public static void sortdata(Employee bb[]) {
		for(int k=0;k<bb.length;k++) {
			for(int j=k+1;j<bb.length;j++) {
				if(bb[k].EmployeeSalary> bb[j].EmployeeSalary) {
					Employee t=bb[k];
					bb[k]=bb[j];
					bb[j]=t;
				}
			}
		}
	}
	
	 public static void acceptdata(Employee a[]){
		  Scanner sc= new Scanner(System.in);
		  for(int k=0;k<a.length;k++) {
			  a[k]=new Employee();
			  a[k].enterStudentinfo();
		  }
		  
	  }
	 public static void displayvalue(Employee a[]) {
	    	for(int k=0;k<a.length;k++) {
	    		a[k].showStudentinfo();
	    	}
	    }
	 public void enterStudentinfo() {
		 
		 System.out.println(" Enter Employee ID :");
		 EmployeeID = sc.nextInt();
		 System.out.println("Enter Employee Name :");
		 EmployeeName = sc.next();
		 System.out.println("Enter Employee Department :");
		 EmployeeDepartment = sc.next();
		 System.out.println(" Enter Employee Salary :");
		 EmployeeSalary = sc.nextInt();
	
	
	 }
	 public void showStudentinfo() {
		 System.out.println("----------");
		 System.out.println("Employee ID :"+EmployeeID);
		 System.out.println("Employee Name:"+EmployeeName);
		 System.out.println("Employee Department :"+EmployeeDepartment);
		 System.out.println("Employee Salary:"+EmployeeSalary);
	 }
	 

}
