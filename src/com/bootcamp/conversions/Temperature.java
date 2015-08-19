package com.bootcamp.conversions;

public abstract class Temperature implements NonAddableQuantity{

	@Override
	public Quantity convert(Quantity temperature) {
		if (temperature instanceof Temperature)
			return fromBaseUnit(temperature.toBaseUnit());
		else
			return null;
		
	}
	
	@Override
	public boolean equals(Object object) {
		double precision = 0.001;
		if (object instanceof Temperature) {
			Temperature temp = (Temperature) object;

			if (Math.abs(this.toBaseUnit() - temp.toBaseUnit()) < precision) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	

}
