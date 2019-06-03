package TimSection4_Control;

public class SimonEncapsulation {

	public static void add(int x) // creates a copy 
	{
		x++; // this x is different from the x in the main method
		System.out.println("x is " + x);
	}
	
	public static void add(StringBuilder sb)
	{
		sb.append(", world!"); // copy does not apply to Stringbuilders which are mutable
		System.out.println("sb is " + sb);
	}
	
	public static void change(StringBuilder sb)
	{
		sb = new StringBuilder("Goodbye"); // refreshes and creates a new instance of the StringBuilder sb
		System.out.println("sb is " + sb);
	}
	
	 static public void main(String[] args) {
		int x = 99;
		add(x);
		System.out.println("x in caller is " + x);
		System.out.println("==============================");
		
		StringBuilder sb = new StringBuilder("Hello");
		add(sb);
		System.out.println("sb in caller is " + sb);
		System.out.println("===============================");
		
		sb = new StringBuilder("Hello"); // refreshes and creates a new instance of the StringBuilder sb
		change(sb);
		System.out.println("sb in caller is " + sb);
		System.out.println("===============================");
	}
	
}
