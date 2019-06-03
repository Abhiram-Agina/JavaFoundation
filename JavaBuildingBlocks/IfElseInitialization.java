package JavaBuildingBlocks;

public class IfElseInitialization {
	static int i; // This is known as an instance or class variable, usually denoted as static
	// get automatically initialized to 0..
	
	public static void main(String[] args) {
		boolean check = true;
		int answer; // local variables can only be marked as final
		int onlyOneBranch;
		
		if(check){
			answer = 1; // here 
			onlyOneBranch = 1; // only initialized in the if-true section
		}else {
			answer = 2; // and here
		}
		
//		System.out.println("Value of onlyOneBranch: " + onlyOneBranch); --> Does not compile, just to be safe
		
		System.out.println("Value of answer: " + answer); // OK because Compiler sees that a value is assigned
		// to "answer" regardless of the boolean value of "check". 
	
		System.out.println("Value of i: " + i);
	}

}
