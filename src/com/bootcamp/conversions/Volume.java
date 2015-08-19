package com.bootcamp.conversions;

public abstract class Volume implements AddableQuantity {

	@Override
	public boolean equals(Object object) {
		double precision = 0.001;
		if (object instanceof Volume) {
			Volume vol = (Volume) object;

			if (Math.abs(this.toBaseUnit() - vol.toBaseUnit()) < precision) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	@Override
	public Quantity add(Quantity volume) {
		if (volume instanceof Volume) {
			return this.fromBaseUnit(volume.toBaseUnit() + this.toBaseUnit());
		} else
			return null;
	}

	@Override
	public Quantity convert(Quantity volume) {
		if (volume instanceof Volume)
			return fromBaseUnit(volume.toBaseUnit());
		else
			return null;
	}

}
