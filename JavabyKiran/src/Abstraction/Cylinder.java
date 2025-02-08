package Abstraction;

public class Cylinder extends VolumeCalculator {
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.height=height;
		this.radius=radius;
	}
	@Override
	double CalculateVolume() {
		return Math.PI*Math.pow(radius,2)*height;
	}
	

}
