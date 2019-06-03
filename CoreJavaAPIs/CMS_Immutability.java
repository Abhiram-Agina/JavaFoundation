package CoreJavaAPIs;

public class CMS_Immutability {
	
	public static void main(String[] args) {
		
		String s1 = "1";
		String s2 = s1.concat("2"); // refers to "12"
		s2.concat("3"); // for this one line refers to "123" but does not permanently change
		System.out.println(s2); // still refers to "12"
		System.out.println(s1); // still refers to "1"
		
		String name = "Abhiram"; // allows JVM to use String Pool in this case
		String name2 = new String("Abhiram"); // Explicitly asks for the JVM to create a new object.
		
	}

}
