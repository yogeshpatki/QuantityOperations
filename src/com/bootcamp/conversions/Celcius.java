package com.bootcamp.conversions;

public class Celcius extends Temperature{
	double value;
	public static final double ConversionFactor = 1d;

	public Celcius(double value) {
		this.value = value;
	}

	@Override
	public double toBaseUnit() {
		return (this.value / ConversionFactor);

	}
	
	@Override
	public Celcius fromBaseUnit(double value) {
		return new Celcius(value * ConversionFactor);

	}

	

}
