package CoreJavaAPIs;

public class CMS_Concatenation {
	
	public static void main(String[] args) {
		
		// These are the 2 ways to create Strings
		String name = "Fluffy";
		String name2 = new String("Fluffy"); 
		
		/* Rules for String concatenation:
		 *  - 1. If both operands are numeric, + means numeric addition
		 *  - 2. If either operand is a String, + means concatenation
		 *  - 3. The expression is evaluated left to right
		 */
		
		System.out.println(1 + 2); // 3 (1st)
		System.out.println("a" + "b"); // ab (2nd)
		System.out.println("a" + "b" + 3); // ab3 (2nd then 3rd)
		System.out.println(1 + 2 + "c"); // 3c (3rd then 2nd)
		
		
		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four); // 64 (3rd then 2nd)
		
		
		String s = "1";
		s += "2";
		s += 3; // Compiler allows it as it follows Concatenation rules
		System.out.println(s); // prints 123
		
	}

}
