package com.bootcamp.conversions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AllTestsOnQuantityOperatations {

	@Test
	public void conversionOfEqualLengthToSameUnitShouldBeSame() {

		Meter meter = new Meter(2.04);
		Length yard = new Yard(2.2309644d);

		assertEquals(meter, meter.convert(yard));
		assertEquals(meter, meter.convert(new Centimeter(204)));

	}

	@Test
	public void testAdditionOfMeterWithAnyUnit() {

		Meter meter = new Meter(2.04);
		Yard yard = new Yard(2.2309644d);
		Meter expectedAdditionAnswer = new Meter(4.08);
		assertEquals(expectedAdditionAnswer, meter.add(yard));
	}

	@Test
	public void testAdditionOfCentimeterAndMeter() {

		Meter meter = new Meter(2.04);
		Centimeter centimeter = new Centimeter(100d);
		Centimeter expectedAdditionAnswer = new Centimeter(304);
		assertEquals(expectedAdditionAnswer, centimeter.add(meter));
	}

	@Test
	public void testAdditionOfCentimeterAndYard() {

		Yard yard = new Yard(2.04);
		Centimeter centimeter = new Centimeter(100d);
		Centimeter expectedAdditionAnswer = new Centimeter(286.538);
		assertEquals(expectedAdditionAnswer, centimeter.add(yard));
	}

	@Test
	public void testAdditionOfCentimeterAndRod() {

		Rod rod = new Rod(1);
		Centimeter centimeter = new Centimeter(100d);
		Centimeter expectedAdditionAnswer = new Centimeter(602.919);
		assertEquals(expectedAdditionAnswer, centimeter.add(rod));
		assertEquals(expectedAdditionAnswer, expectedAdditionAnswer.convert(expectedAdditionAnswer));
	}

	@Test
	public void testsValidAdditionsOnVolume() {
		TeaSpoon teaSpoon1 = new TeaSpoon(96);
		TableSpoon tableSpoon = new TableSpoon(16);
		TeaSpoon teaSpoon = new TeaSpoon(48);
		
		assertEquals(teaSpoon1, teaSpoon.add(tableSpoon));

	}

	@Test
	public void testsInvalidAdditionsOnVolume() {
		TableSpoon tableSpoon = new TableSpoon(16);
		Rod rod = new Rod(1);
		assertEquals(null, tableSpoon.add(rod));

	}

	@Test
	public void testsValidConversionsOnVolume() {
		TeaSpoon teaSpoon = new TeaSpoon(48);
		Cup cup = new Cup(1);
		assertEquals(cup, cup.convert(teaSpoon));

	}

	@Test
	public void testsInvalidConversionsOnVolume() {

		TableSpoon tableSpoon = new TableSpoon(16);
		Rod rod = new Rod(1);

		assertEquals(null, tableSpoon.convert(rod));
	}

	
	@Test
	public void testsEqualityOfTemperatures(){
		Celcius temp1 = new Celcius(0);
		Fahrenheit temp2 = new Fahrenheit(32);
		
		assertEquals(temp1,temp2);
		
		;
		
	}
	
	@Test
	public void testsConversionOfTemperature(){
		
		Celcius temp1 = new Celcius(0);
		Fahrenheit temp2 = new Fahrenheit(32);
		
		assertEquals(temp1,temp2.convert(temp1));
	}
}
