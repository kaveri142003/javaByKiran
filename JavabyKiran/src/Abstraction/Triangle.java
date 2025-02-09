package Abstraction;

public class Triangle extends Shape1 {
	private double a,b,c;
	
	// constructor
	public Triangle(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	@Override
	double CalculateArea() {
		double  s= (a+b+c)/2; // semi-perimeter
		return Math.sqrt(s *(s-a) *(s-b)*(s-c));
	}
	@Override
	
	double CalaculatePerimeter() {
		return a+b+c;
	}

}
