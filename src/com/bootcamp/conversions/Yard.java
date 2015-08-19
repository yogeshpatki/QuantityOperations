package com.bootcamp.conversions;

public class Yard extends Length {

	double value;
	public static double ConversionFactor = 1.09361d;

	public Yard(double value) {
		this.value = value;

	}

	@Override
	public double toBaseUnit() {
		return (this.value / ConversionFactor);
	}

	public Yard fromBaseUnit(double value) {
		return new Yard((value * ConversionFactor));
	}

}
