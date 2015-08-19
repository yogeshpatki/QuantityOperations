package com.bootcamp.conversions;

public class Cup extends Volume {
	double value;
	public static final double ConversionFactor = 0.0208333d;

	public Cup(double value) {
		this.value = value;
	}

	@Override
	public double toBaseUnit() {
		return (this.value / ConversionFactor);

	}

	@Override
	public Cup fromBaseUnit(double value) {
		return new Cup(value * ConversionFactor);

	}

}
