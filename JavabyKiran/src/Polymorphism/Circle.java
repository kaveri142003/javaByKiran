package Polymorphism;

public class Circle  extends Shapes{
	double radius;
	//constructor
	Circle(double radius){
		this.radius=radius;
	}
	//overriding
	 public double getPerimeter() {
		return 2 *Math.PI*radius;
		
	}
	 public double getArea() {
		 return Math.PI*radius*radius;
	 }

}
