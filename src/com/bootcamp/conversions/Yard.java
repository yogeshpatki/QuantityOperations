package com.bootcamp.conversions;

public class Yard extends Length{

	double value;
    public static double ConversionFactor= 1.09361d;
    
    public Yard(double value) {
        this.value = value;
       
    }
    

    @Override
    public double toBaseUnit() {
        return (this.value / ConversionFactor);
    }
    
    @Override
    public Yard fromBaseUnit(double value) {
        return new Yard((value * ConversionFactor));
    }
    
    public Yard convertToYard(Length length){
		return fromBaseUnit(length.toBaseUnit());
		
	}
    public Yard addToYard(Length length){
    	return fromBaseUnit(length.toBaseUnit() + this.toBaseUnit());
		
	}
    
}
