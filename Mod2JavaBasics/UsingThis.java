package Mod2JavaBasics;


public class UsingThis {
	
	public static int numOne;// variable
	public void doStuff()
	{
		this.numOne = this.numOne + 10; // fixed
	}
	
	public static void main(String[] args) 
	{
		UsingThis u = new UsingThis(); // These 2 variable point to 2 different objects
		UsingThis u2 = new UsingThis();
		u.numOne = 12;
		u2.numOne = 12;
		
		System.out.println(u.numOne == u2.numOne);
		u.doStuff(); // will call the method seperately
		u2.doStuff();
		
	}
	

}
