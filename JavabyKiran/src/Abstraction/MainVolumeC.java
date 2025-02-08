package Abstraction;

public class MainVolumeC {
	public static void main(String[] args) {
		Cube cube = new Cube (3);
		Sphere sphere= new Sphere(4);
		Cylinder cylinder = new Cylinder(2,5);
		
		// display the volumes
		System.out.println("volume of cube :"+cube.CalculateVolume());
		System.out.println("volume of sphere :"+sphere.CalculateVolume());
		System.out.println("volume of cylinder :"+ cylinder.CalculateVolume());
		
        
	}
}
