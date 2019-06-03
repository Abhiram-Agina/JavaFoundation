package Mod2JavaBasics;

public class VariableScopeExample {
	
	public static void main(String[] args)
	{
		int i; // starts here
		double d;// starts here
		
		{
			String s;//starts here
			
		}//ends here for s
		
	}// ends here for i and d

}//  scope of the int variable i extends from its declaration in the method
//to the closing bracket of the method in which it is defined/ 
