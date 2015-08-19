package com.bootcamp.conversions;

public class Fahrenheit extends Temperature{
	double value;
	public static final double ConversionFactor = 1.8d;
	public static final double conversionValue = 32d;

	public Fahrenheit(double value) {
		this.value = value;
	}

	@Override
	public double toBaseUnit() {
		return ((this.value - conversionValue) / ConversionFactor);

	}

	@Override
	public Celcius fromBaseUnit(double value) {
		return new Celcius((value * ConversionFactor) + conversionValue);

	}

}
