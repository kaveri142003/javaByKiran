package Polymorphism;

public class Rectangle extends Shape {
	public void getArea() {
		super.getArea();
		int l=4,b=2;
		System.out.println("area of rectangle :" + l*b);
	}
	

}
