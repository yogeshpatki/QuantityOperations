/**
 * Created by Yogesh on 17-Aug-15.
 */
public class Centimeter extends Length{
    public double value;
    public static final String conversionFactor = "baseToCentimeters";
    public Centimeter(double value) {
        this.value = value;
    }

    @Override
    public double toBaseUnit() {
        return (this.value / conversionFactors.get(this.conversionFactor));
    }

	@Override
	public boolean equals(Object obj) {
	if(obj instanceof Length){
		Length len = (Length)obj;
		
		if(this.toBaseUnit()==len.toBaseUnit())
			return true;
		else
			return false;
	}
	
	else
		return false;
    
	}
}
