import java.util.Scanner;

public class UnitConvertor {

	public Centimeter toCentimeter(Length length){
		return new Centimeter(length.toBaseUnit()*100);
		
	}
	
	public double toMeter(Length length){
		return length.toBaseUnit();
	}
	
	public static void main(String[] args) {
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Select the conversion:");
		System.out.println("1. meters to Centimeters");
		System.out.println("2. centimeters to meters");
		switch(sc.nextInt()){
		case 1:
			
			break;
		
		
		}*/
		
		convert();
		
		
	}
	
	public static void convert(){
		Scanner sc = new Scanner(System.in);
		
			Meter len = new Meter(1);
		System.out.println(len.conversionFactor);
//		System.out.println(len.toBaseUnit() * Length.conversionFactors.get(len.conversionFactor));
		System.out.println("Exiting");
	}
	
}
