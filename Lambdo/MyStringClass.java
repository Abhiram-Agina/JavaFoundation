package Lambdo;

public class MyStringClass {
	public static void main (String args[]) {
		// Block lambda to reverse string
		MyStringInterface reverseStr = (str) -> {
			String result = "";
			
			for(int i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);
			
			return result;
		};

		// Output: omeD adbmaL
		System.out.println(reverseStr.myStringFunction("Lambda Demo")); 
	}
}
