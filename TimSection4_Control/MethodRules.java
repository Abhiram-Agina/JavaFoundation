package TimSection4_Control;

public class MethodRules {
	
	public void simpleMethod()
	{
		if(Math.random() > 0.5)
		{
			System.out.println("Larger number");
			return;	
		}else {
			System.out.println("Smaller number");// no return required because method is void
		}
		System.out.println("From the end");
	}
	
	
	public String returningMethod()
	{
		if(Math.random() > 0.5) {
			return "Partway through";
		}
		// return 99;    cannot return INT
		return "At the End";
	}
	
	
	public void simpleArgs(String s, int y) // these variables dont conflict due to the fact that it is a parrallelogram
	{
		System.out.println("String s is: " + s);
		System.out.println("int y is " + y);
	}
	
	public static void simpleStatic()
	{
		System.out.println("SimpleStatic");
	}

	
	public static void main(String[] args) {
		simpleStatic();
// 		simpleMethod();  cannot call non static methods from static methods
		
	}
}
