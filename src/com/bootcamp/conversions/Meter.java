package com.bootcamp.conversions;

public class Meter extends Length{
    double value;
    public static final double ConversionFactor = 1d;
    public Meter(double value) {
        this.value = value;
    }
    

    @Override
    public double toBaseUnit() {
    	 return (this.value / ConversionFactor);
    
    }

	@Override
	public  Meter fromBaseUnit(double value) {
		 return new Meter(value * ConversionFactor);

	}
	
	
	public  Meter convertToMeter(Length length){
		return fromBaseUnit(length.toBaseUnit());
		
	}
	public Meter addToMeter(Length length){
		return fromBaseUnit(length.toBaseUnit() + this.toBaseUnit());
	}
    
}
