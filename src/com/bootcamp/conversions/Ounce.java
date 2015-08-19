package com.bootcamp.conversions;

public class Ounce extends Volume {
	double value;
	public static final double ConversionFactor = 0.1666d;

	public Ounce(double value) {
		this.value = value;
	}

	@Override
	public double toBaseUnit() {
		return (this.value / ConversionFactor);

	}

	@Override
	public Ounce fromBaseUnit(double value) {
		return new Ounce(value * ConversionFactor);

	}
}
