package Sorting;

import java.util.Scanner;

public class Person {
	Scanner sc = new Scanner(System.in);

	private String name , gender;
	private int age;
	
	
	//getters
	public void setname(String n) {
		name = n;	
	}
	
	public void setage (int i) {
		age = i;
	}
	
	public void setgender(String g) {
		gender =g;
		
	}
	
	//setters
	public String getname() {
		return name;
	
	}
	public int getage() {
		return age;
	
	}
	public String getgender() {
		return gender;
	}
	
	
	public void acceptvalue() {
		System.out.println ("enter name ");
		setname (sc.next());
		
		System.out.println ("enter age ");
		setage (sc.nextInt());
		
		System.out.println ("enter gender ");
		setgender (sc.next());
	}	
	
	
		public void displayvalue() {
			System.out.println("getname:"+ getname());
			System.out.println ("getage:"+ getage());
			System.out.println("getgender:"+ getgender());
		}
		
		
		Person(){
			
		}
}
