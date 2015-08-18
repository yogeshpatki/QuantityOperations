package com.bootcamp.conversions;

public class Rod extends Length{
	double value;
	public static final double ConversionFactor = 0.198838782d;
    public Rod(double value) {
        this.value = value;
    }
    
    @Override
    public double toBaseUnit() {
    	 return (this.value / ConversionFactor);
    
    }

	@Override
	public Rod fromBaseUnit(double value) {
		 return new Rod(value * ConversionFactor);
    

	}
	public Rod convertToRod(Length length){
		return fromBaseUnit(length.toBaseUnit());
		
	}
	public Rod addToRod(Length length){
		return fromBaseUnit(length.toBaseUnit() + this.toBaseUnit());
		
	}
}
