package com.bootcamp.conversions;

public class Kilometer extends Length {
	double value;
	public static final double ConversionFactor = 0.001d;

	public Kilometer(double value) {
		this.value = value;
	}

	@Override
	public double toBaseUnit() {
		return (this.value / ConversionFactor);

	}

	@Override
	public Kilometer fromBaseUnit(double value) {
		return new Kilometer(value * ConversionFactor);

	}

}
