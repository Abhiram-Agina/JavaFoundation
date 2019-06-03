package Mod2JavaBasics;

public class ReferenceExpressions {
	
	static Tester t = new Tester(); // this is a simple expression
	static Tester[] r; // reference to Tester
	
	
	public static void main(String[] args) 
	{	
		System.out.println(t.numOne); // t.numOne helps us access and change the value of numOne
		System.out.println(t.numTwo);
		
		int value = t.numOne; // putting the "value" of t.numOne into value  
		t.numOne = 1024; // t allows for field access
		
		System.out.println(value);
		System.out.println(t.numOne);

	
//		s = r[0].numOne = 123; This is an integer
//		System.out.println(r[0]); This is a reference to Tester
	}

}

class Tester
{
	
	public int numOne = 20103; // created public so that it can be accessed outside of the class
	public long numTwo = 7;

}
