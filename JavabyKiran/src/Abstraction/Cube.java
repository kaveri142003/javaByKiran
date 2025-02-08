package Abstraction;

public class Cube extends VolumeCalculator {
	private double side;
	
	
	public Cube(double side) {
		this .side=side;
	}
	@Override
	double CalculateVolume() {
		return side *side*side;
	}

}
