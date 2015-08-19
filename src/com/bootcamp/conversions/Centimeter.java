package com.bootcamp.conversions;

public class Centimeter extends Length {
	public double value;
	public static final double ConversionFactor = 100d;

	public Centimeter(double value) {
		this.value = value;
	}

	@Override
	public double toBaseUnit() {
		return (this.value / ConversionFactor);

	}
	@Override
	public Centimeter fromBaseUnit(double value) {
		return new Centimeter(value * ConversionFactor);

	}

}
