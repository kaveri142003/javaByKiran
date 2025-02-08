package Polymorphism;
import java.util.Scanner;
public class Person1 {
	Scanner sc =new Scanner (System.in);
	private String Name;
	private  int age;
	
	public Person1 () {
		acceptPerson() ;
		
	}
	//parameterized constructor
	public Person1(String N,int a) {
		setName(N);
		setage(a);;
		
	}
	//setter
	public void setName(String N) {
		Name= N;
	}
	public void setage(int a) {
		age= a;
		
	}
	// getter
	public String getName() {
		return Name;
	}
	public int getage() {
		return age;
	}
	public void acceptPerson() {
		System.out.println("Enter person details ");
		System.out.println("Enter Name ->");
		setName(sc.nextLine());
		System.out.println("Enter age ->");
		setage(sc.nextInt());	
	}
	
	public void showData() {
		System.out.println();
		System.out.println("------------");
		System.out.println("----peson Info----");
		System.out.println("Name :"+ getName());
		System.out.println("age :"+ getage());
	}
	@Override
	public String toString() {
		return "Name :" + getName()+" " +"age :" + getage();
	}

}
