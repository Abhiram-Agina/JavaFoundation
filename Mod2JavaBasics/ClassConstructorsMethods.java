package Mod2JavaBasics;

public class ClassConstructorsMethods {
	
	public float getTemperature()
	{
		return temperature;//referenced before the initialized
	}
	
	public static int getABigNumber()
	{
		return A_BIG_NUMBER;//referenced before the initialized
	}
	
	private static int A_BIG_NUMBER = 123456;// when declared in a class the variables are still able to compile
	private float temperature;// since they are being referenced in methods  
	
	public ClassConstructorsMethods()
	{
		temperature = 98.4F;
	}
	
	public void makeOne()
	{
		AConcept ac = new AConcept();// AConcept cannot be abstract cause you cant make an instance of an abstract class
	}
	
	public SecretClass sc;
	
	class AnInnerClass{
		public void doStuff()
		{}
	}
}
