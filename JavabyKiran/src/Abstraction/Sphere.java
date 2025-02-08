package Abstraction;

public class Sphere  extends VolumeCalculator{
	private double radius;
	
	// constructor
	public Sphere(double radius) {
		this.radius=radius;
	}
	@Override
	double CalculateVolume() {
		return (4.0/3.0) *Math.PI* Math.pow(radius, 3);
	}

}
