package Abstraction;

public class MainSCT {
	public static void main(String[] args) {
		
		Circle1 circle = new Circle1(5);
		System.out.println("circle area :"+circle.CalculateArea());
		System.out.println("circle perimeter :"+ circle.CalaculatePerimeter());
		
		Triangle triangle = new Triangle(3,4,5);
		System.out.println("trainge area :"+ triangle.CalculateArea());
		System.out.println("triangle perimeter :"+triangle.CalaculatePerimeter());
	}

}
