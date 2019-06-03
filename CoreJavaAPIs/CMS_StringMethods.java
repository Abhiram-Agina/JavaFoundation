package CoreJavaAPIs;

public class CMS_StringMethods {

	public static void main(String[] args) {
		
		String s = "animals";
		System.out.println(s.length()); // counts the number of characters starting at '1' -> 7
		// P.S : This includes spaces
		System.out.println("===========================================================================");
		System.out.println();
		
		
		
		String s2 = "animals"; // this method starts counting from '0'
		System.out.println(s2.charAt(0)); // looks for/finds the character at 0 -> a
		System.out.println(s2.charAt(6)); // looks for/finds the character at 6 -> s
		System.out.println(s2.charAt(7)); // looks for the character at 7 -> throws an exception
		System.out.println("===========================================================================");
		System.out.println();
		
		// following code shows how to use indexOf():
		String s3 = "animals";
		System.out.println(s3.indexOf('a')); //Looks for the first 'a' that matches and returns its index val. 
		System.out.println(s3.indexOf("al")); // Can also look for Strings.
		System.out.println(s3.indexOf('a', 4)); // starts looking for 'a' after the index value 4.
		System.out.println(s3.indexOf("al", 5)); // unlike charAt(), indexOf() return -1 instead of an error.
		System.out.println("===========================================================================");
		System.out.println();
		
		
		// following code shows how to use substring()
		
		String s4 = "animals";
		System.out.println(s4.substring(3)); // looks for characters, returns parts of the string.
		System.out.println(s4.substring(s4.indexOf('m'))); // looks for index of 'm' and starts from there.
		System.out.println(s4.substring(3, 4)); // gives restraints as to what this should return.
		System.out.println(s4.substring(3, 7)); // not including character on "3".
		
		System.out.println(s4.substring(3,3)); // prints nothing
		System.out.println(s4.substring(3,2)); // throws an exception
		System.out.println(s4.substring(3,8)); // throws an exception
		System.out.println("===========================================================================");
		System.out.println();
		
		
		// following code shows how to use Upper and Lower methods
		
		String s5 = "animals";
		System.out.println(s5.toUpperCase()); // ANIMALS
		System.out.println("ASD123".toLowerCase());
		System.out.println("===========================================================================");
		System.out.println();
		
		
		// following code shows how to use equals method.
		
		System.out.println("abc".equals("ABC"));
		System.out.println("ABC".equals("ABC"));          
		System.out.println("abc".equalsIgnoreCase("ABC"));;
		
	
		
	}
	
}
