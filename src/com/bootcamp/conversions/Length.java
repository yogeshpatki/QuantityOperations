package com.bootcamp.conversions;

public abstract class Length implements AddableQuantity {

	@Override
	public boolean equals(Object object) {
		double precision = 0.001;
		if (object instanceof Length) {
			Length len = (Length) object;

			if (Math.abs(this.toBaseUnit() - len.toBaseUnit()) < precision) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	@Override
	public Quantity add(Quantity length) {
		if (length instanceof Length) {
			return this.fromBaseUnit(length.toBaseUnit() + this.toBaseUnit());
		} else
			return null;
	}

	@Override
	public Quantity convert(Quantity length) {
		if (length instanceof Length)
			return fromBaseUnit(length.toBaseUnit());
		else
			return null;
	}

}
