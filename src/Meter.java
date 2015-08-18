/**
 * Created by Yogesh on 17-Aug-15.
 */
public class Meter extends Length{
    double value;
    public static String conversionFactor="baseToMeters";
    public Meter(double value) {
        this.value = value;
    }
    

    @Override
    public double toBaseUnit() {
        return (this.value / conversionFactors.get(this.conversionFactor));
    }
    
}
