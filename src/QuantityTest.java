

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QuantityTest {


    @Test
    public void metersShouldEqualCm() {

        
        Length meter = new Meter(1);
        Length centimeter = new Centimeter(100);
        

        assertTrue(meter.compare(centimeter));
        assertTrue(centimeter.compare(meter));

    }

    @Test
    public void metersShouldNotEqualCm() {

        
        Length meter = new Meter(1);
        Length centimeter = new Centimeter(200);
         

        assertFalse(meter.compare(centimeter));
        assertFalse(centimeter.compare(meter));
    }
    
    @Test
    public void testMetertoCentimeter(){
    	
    	Length meter = new Meter(2);
    	Length centimeter = new Centimeter(200);
    	UnitConvertor convertor = new UnitConvertor();
//    	assertTrue(200d == convertor.toCentimeter(meter));
    	assertEquals(centimeter, convertor.toCentimeter(meter));
    	
    	
    }
    
    @Test
    public void testCentimetertoMeter(){
    	
    	Length centimeter = new Centimeter(200);
    	UnitConvertor convertor = new UnitConvertor();
    	assertTrue(2d == convertor.toMeter(centimeter));
    	
    }
    
}
