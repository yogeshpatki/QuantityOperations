package com.bootcamp.conversions;

public class Feet extends Length {
	double value;
	public static final double ConversionFactor = 3.28084d;

	public Feet(double value) {
		this.value = value;
	}

	@Override
	public double toBaseUnit() {
		return (this.value / ConversionFactor);

	}
	
	@Override
	public Feet fromBaseUnit(double value) {
		return new Feet(value * ConversionFactor);

	}

}
