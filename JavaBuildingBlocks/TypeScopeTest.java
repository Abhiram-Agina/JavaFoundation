package JavaBuildingBlocks;

public class TypeScopeTest {
	static int MAX_LENGTH = 5; // Class variable
	static int length; // Instance variable
	
	public static void main(String[] args) {
		int inches = 7; // Local variable
		if(length < MAX_LENGTH) {
			int newSize = length + inches; // Local variable
			length = newSize;
		} // --> Scope ends here for newSize.
	} // --> Scope ends here for inches.

} // --> Scope ends here for length, MAX_LENGTH.
