package Polymorphism;

public class Square {
	double side;
	
	Square(double area){
		 this.side =area;
	}
	public double getPerimeter() {
		return  4*side;
	}
	public double getArea() {
		return side = side*side; 
	}

}
