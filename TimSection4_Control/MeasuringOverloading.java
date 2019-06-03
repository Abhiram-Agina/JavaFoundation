package TimSection4_Control;

public class MeasuringOverloading {
	
	public static void main(String[] args) 
	{
		System.out.println(calcFeetAndInchestoCentimeters(100));
	}
	
	public static double calcFeetAndInchestoCentimeters(double feet, double inches)
	{
		if(!(feet>=0) | !(inches>=0) | !(inches<=12))
		{
			return -1;
		}
			double centiFeet = 30.48 * feet;
			double centiInches = 2.54 * inches;
			double sumLength = centiFeet + centiInches;
			System.out.println("feet inputed converts to " + centiFeet + "centimeters");
			System.out.println("inches inputed converts to " + centiInches + "centimeters");
			System.out.println();
			System.out.println("The total number of centimeters is: ");
			return sumLength;
	}
	
	public static double calcFeetAndInchestoCentimeters(double inches) // has one less parameter
	{
		if(!(inches>=0))
		{
			return -1;
		}
			double feetInches = 0.0833333 * inches;
			return calcFeetAndInchestoCentimeters(100, 12); // calling overloading the method through calling it
	}

}
