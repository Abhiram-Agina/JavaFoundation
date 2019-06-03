package Mod2JavaBasics;

public class BOX {
	
	public static Tester getOneThing()
	{
		return new Tester();
	}
	
	public static void main(String[] args) {
		
		BOX b = new BOX();
		b.getOneThing().numOne = 123;
		
		System.out.println(b.getOneThing());	// reference to Tester
		System.out.println(b.getOneThing().numOne);
		
	}
	
	public Tester[] getManyThings()
	{
		Tester a = null,b = null,c = null,d = null;
		Tester[] ta = {a ,b ,c ,d};
		return ta;
	}
	
	public static void caller()
	{
		
	BOX f = new BOX();
// 	f.getManyThings(); reference to Array of Tester
//	f.getManyThings()[0]; reference to Tester
	f.getManyThings()[0].numTwo = 277; // of type long
	System.out.println(f.getManyThings()[0].numTwo);
	
	}
}
