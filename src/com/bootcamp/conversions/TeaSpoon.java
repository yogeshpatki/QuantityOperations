package com.bootcamp.conversions;

public class TeaSpoon extends Volume {
	double value;
	public static final double ConversionFactor = 1d;

	public TeaSpoon(double value) {
		this.value = value;
	}

	@Override
	public double toBaseUnit() {
		return (this.value / ConversionFactor);

	}

	@Override
	public TeaSpoon fromBaseUnit(double value) {
		return new TeaSpoon(value * ConversionFactor);

	}

}
