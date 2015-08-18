package com.bootcamp.conversions;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AllTestsOnQuantityOperatations {

  
    @Test
    public void conversionOfEqualLengthToSameUnitShouldBeSame(){
    	
    	
    	Meter meter = new Meter(2.04);
    	Length yard = new Yard(2.2309644d);
    	Centimeter centimeter = new Centimeter(100);
    	System.out.println(centimeter.addToCentimeter(yard).value);
    	assertEquals(meter,meter.convertToMeter(yard));
    	assertEquals(meter,meter.convertToMeter(new Centimeter(204)));
       	
    }
    
    @Test
    public void testAdditionOfMeterWithAnyUnit(){
    	
    	
    	Meter meter = new Meter(2.04);
    	Yard yard = new Yard(2.2309644d);
    	Meter expectedAdditionAnswer = new Meter(4.08);
    	assertEquals(expectedAdditionAnswer, meter.addToMeter(yard));
    }
    
    @Test
    public void testAdditionOfCentimeterAndMeter(){
    	  	
    	Meter meter = new Meter(2.04);
    	Centimeter centimeter = new Centimeter(100d);
    	Centimeter expectedAdditionAnswer = new Centimeter(304);
    	assertEquals(expectedAdditionAnswer, centimeter.addToCentimeter(meter));
    }
 
    @Test
    public void testAdditionOfCentimeterAndYard(){
    	  	
    	Yard yard = new Yard(2.04);
    	Centimeter centimeter = new Centimeter(100d);
    	Centimeter expectedAdditionAnswer = new Centimeter(286.538);
    	assertEquals(expectedAdditionAnswer, centimeter.addToCentimeter(yard));
    }
 
    @Test
    public void testAdditionOfCentimeterAndRod(){
    	  	
    	Rod rod = new Rod(1);
    	Centimeter centimeter = new Centimeter(100d);
    	Centimeter expectedAdditionAnswer = new Centimeter(602.919);
    	assertEquals(expectedAdditionAnswer, centimeter.addToCentimeter(rod));
    }

    
}
