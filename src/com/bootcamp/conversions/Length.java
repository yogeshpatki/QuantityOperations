package com.bootcamp.conversions;

public abstract class Length {

	public abstract double toBaseUnit();

	public abstract Length fromBaseUnit(double value);

	@Override
	public boolean equals(Object obj) {
		double precision = 0.001;
		if (obj instanceof Length) {
			Length len = (Length) obj;

			if (Math.abs(this.toBaseUnit() - len.toBaseUnit()) < precision) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
