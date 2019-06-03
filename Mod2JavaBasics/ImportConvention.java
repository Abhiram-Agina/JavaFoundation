package Mod2JavaBasics;
import java.util.Date; // java.util represents the last name where as Date represents the First Name;


public class ImportConvention {
	public static void main(String[] args)
	{
		System.out.println("Today is " + new java.util.Date()); // works when there is no java.util.Date import statement.
		System.out.println("Today is " + new Date()); // returns the same thing
	}
}
