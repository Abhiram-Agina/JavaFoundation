package JavaBuildingBlocks;

public class GarbageCollection {
	
	public static void main(String[] args) {
		String one, two;
		one = new String("a"); // one points to "a".
		two = new String("b"); // two points to "b".
		
		one = two; // one points to two which then points to "b". 
		String three = one; // three points to one which point to "b".
		one = null; // One now point to null.
		
		
		// You can garbage collect "a" at line 10 and you can garbage collect "one" at 12. 
	}

}
