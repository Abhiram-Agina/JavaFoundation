package Mod2JavaBasics;

public class ScopeExceptions {
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 10; i++)//scope of i extends from here 
			System.out.println("i is " + i);// to here. Due to a lack of curly braces a for loop scope will always extends for 1 line.  
		
//		System.out.println("final i is " + i); OUT OF SCOPE
		
		
		int j = 0;// j starts here
		for (int i = 0; i < 10; i++) // i starts here
		{
			System.out.println("i is " + i);
			j += i;
		}// i ends here
		
//		System.out.println("final i is " + i); OUT OF SCOPE
		System.out.println("final j is " + j); 
		
	}// j ends here
	
	public void doStuff(int i)// i starts here
	{
		System.out.println("i is " + i);
	}// i ends here

}
