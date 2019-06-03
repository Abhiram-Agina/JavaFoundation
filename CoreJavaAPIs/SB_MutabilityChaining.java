package CoreJavaAPIs;

public class SB_MutabilityChaining {
	
	public static void main(String[] args) {
		
		String s = new String("start");
		s.concat("+middle"); // !!!  REMEMBER: Strings are immutable
		String noChange = s.concat("+end");
		
		System.out.println(noChange);
		
		
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle"); // Unlike Strings, StringBuilders are mutable so methods will change their values
		StringBuilder same = sb.append("+end");
		
		System.out.println(same); // prints --> start+middle+end
		
		
// ======================================================================================		

		
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de"); // Appends "de" --> results in "abcde"
		b = b.append("f").append("g");  // ==> [b = a.append("de").append("f").append("g");] 
		
		
		System.out.println("a = " + a); // Prints "abcdefg"
		System.out.println("b = " + b); // Prints "abcdefg"
		
		// CRITICAL: When appending/chaining you must trace methods all the way back to the initialization
		
	}

}
