package Abstraction;

public class Circle1 extends Shape1 {
	private double radius;
	
	public Circle1(double radius) {
		this.radius=radius;
		
	}
	@Override
	double CalculateArea() {
		return Math.PI *radius *radius;
	}
	@Override
	double CalaculatePerimeter() {
		return 2 *Math.PI*radius;
	}
}
