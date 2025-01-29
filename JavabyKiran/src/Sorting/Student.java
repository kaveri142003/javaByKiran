package Sorting;

import java.util.Scanner;

public class Student extends Person {
	Scanner sc= new Scanner (System.in);
	
	private int mathMarks,engMarks,bioMarks;
	
	//getters
	public void setmathMarks(int n) {
		mathMarks = n;
		
	}
	public void setengMarks(int e) {
		engMarks = e;
		
	}
	public void setbioMarks(int b) {
		bioMarks = b;
		
	}
	
	//setters
	public int getmathMarks() {
		return mathMarks ;
	
	}
	public int getengMarks() {
		return engMarks ;
	
	}
	public int getbioMarks() {
		return bioMarks ;
	
	}
	
	
	
	public void acceptvaleStudents(){
		
		System.out.println("Enter mathMarks:");
		 mathMarks= sc.nextInt();
		
		System.out.println("Enter engMarks :");
		engMarks= sc.nextInt();
		
		System.out.println("Enter bioMarks:");
		bioMarks= sc.nextInt();
		
	}
	
	
	
	public void displayvalueStudent(){
		 System.out.println("student Details:");
		 System.out.println("mathMarks:"+mathMarks);
		 System.out.println(" engMarks:"+engMarks);
		 System.out.println(" bioMarks:"+bioMarks);	 
	}
	
	
	public void totalmarks() {
		int sum;
		sum = mathMarks+engMarks+bioMarks;
		System.out.println();
		System.out.println("----");
		System.out.println("tatal marks :"+sum);
	}
	
	Student(){
		acceptvalue();
		acceptvaleStudents();
		displayvalue();
		displayvalueStudent();
		
		
	}
	
	
	
	}

