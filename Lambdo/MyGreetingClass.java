package Lambdo;

public class MyGreetingClass {

	public static void main(String args[]) {
		MyGreetingInterface morningGreeting = (str) -> "Good Morning " + str + "!";
		MyGreetingInterface eveningGreeting = (str) -> "Good Evening " + str + "!";
		MyGreetingInterface byeGreeting = (str) -> "Good Bye " + str + " I never want to see you again!!!!!!!";
	  
	  	// Output: Good Morning Luis! 
		System.out.println(morningGreeting.processName("Luis"));
		
		// Output: Good Evening Jessica!
		System.out.println(eveningGreeting.processName("Jessica"));	
		
		System.out.println(byeGreeting.processName("Jessica"));	
	}
	
}
