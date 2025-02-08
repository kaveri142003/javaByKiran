package Polymorphism;

import java.util.Scanner;

public class Employee1 extends Person1 {
	Scanner sc=new Scanner(System.in);
	
	private String Post;
	private double Salary;
	 private static Employee1 employee [] =new Employee1[5];
	 private static int count=0;
	
	public Employee1() {
		this.acceptPerson();
		addToArray();
		
	}
	public Employee1(String P,double S) {
		super();
		setPost(P);
		setsalary(S);	
		addToArray();
	}
	@Override
	public void acceptPerson() {
		super.acceptPerson();
		System.out.println("Enter employee Post :");
		setPost(sc.next());
		System.out.println("Enter  employee Salary :");
		setsalary(sc.nextDouble());		
	}
	public void showData() {
		super.showData();
		System.out.println("----employee Info----");
		System.out.println(" employee post :"+getPost());
		System.out.println(" employee salary Rs:"+getSalary());
	}
	// method to display array data
	public static void printData() {
		for(Employee1 e: employee) {
			e.showData();
			System.out.println(e);
			System.out.println("Employee ID -->" + count);	
		}
		// method to add data to array using object
	}
	private void addToArray() {
		if(count > employee.length-1) 
			System.out.println("array is full");
			else {
				employee[count++]=this;
				
			}		
	}
	//parameterized constructor
	public Employee1(String N, int a, String p,double s ) {
		super(N,a);
		setPost(p);
		setsalary(s);
		addToArray();
	}	
	//setter
	public void setsalary(double s) {
		Salary =s;
	}
	public void setPost(String p) {
		Post = p;
	}
	// getter
	public double getSalary() {
		return Salary;
	}
	public String getPost() {
		return Post;
	}
	@Override
	public String toString() {
		return super.toString() + " "+ "post:"+getPost() + "  "+ "Salary :"+getSalary();
	}
	
	
	
}
