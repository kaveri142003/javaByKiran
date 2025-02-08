package Polymorphism;

public class ShapeTest {
	public static void main(String[] args) {
		Circle kk = new Circle(5);
		
		System.out.println("circle of perimeter  :"+ kk.getPerimeter());
		System.out.println("circle of area:"+ kk.getArea());
	}
}
