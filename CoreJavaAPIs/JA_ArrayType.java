package CoreJavaAPIs;

public class JA_ArrayType {
	
	public static void main(String[] args) {
		
		String[] bugs = {"crickket", "beetle", "ladybug"};
		String[] alias = bugs;
		
		System.out.println(bugs.equals(alias));		//true
		System.out.println(bugs.toString());
		
	}

}
