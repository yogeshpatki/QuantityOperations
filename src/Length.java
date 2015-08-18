import java.util.HashMap;

/**
 * Created by Yogesh on 17-Aug-15.
 */
public abstract class Length {
	public static HashMap<String, Double> conversionFactors = new HashMap<String, Double>();
	
	public void initConversionFactors(){
		
		conversionFactors.put("baseToMeters", 1d);
		conversionFactors.put("baseToCentimeters",100d);
		conversionFactors.put("baseToYards", 1.09d);
		conversionFactors.put("baseToKilometers",0.001d);
	
	}
	
	public abstract double toBaseUnit();
	
	public Length(){
		initConversionFactors();
	}
	
	public boolean compare(Length length){
        if(this.toBaseUnit()== length.toBaseUnit()){
            return true;
        }
        else
            return false;
    }
	
	public double toMeter(Length length){
		
		return length.toBaseUnit() * conversionFactors.get(Meter.conversionFactor);
	}
	
	public double toCentimeter(Length length){
		
		return length.toBaseUnit() * conversionFactors.get(Centimeter.conversionFactor);
	}
}
