package Mod2JavaBasics;

public class Scope {

	private static int y = 99;//starts here
	
	public static void main(String[] args)
	{	
		int x = y;// starts here
	
		{
// 			x = d; OUT OF SCOPE	
			int j = 100;// starts here 
			
			System.out.println("Value of j is " + j + " and x is " + x);
			
			int d = 100;// starts here
			x = d;	
		}// ends here for j and d
		
//		System.out.println("Value of j is " + j); OUT OF SCOPE
//		System.out.println("Value of d is " + d); OUT OF SCOPE
		
		System.out.println("Value of x is " + x);
	}// ends here for x
	
	
}// ends here for y
