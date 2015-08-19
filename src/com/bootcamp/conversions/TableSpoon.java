package com.bootcamp.conversions;

public class TableSpoon extends Volume {
	double value;
	public static final double ConversionFactor = 0.33333d;

	public TableSpoon(double value) {
		this.value = value;
	}

	@Override
	public double toBaseUnit() {
		return (this.value / ConversionFactor);

	}

	@Override
	public TableSpoon fromBaseUnit(double value) {
		return new TableSpoon(value * ConversionFactor);

	}

}
