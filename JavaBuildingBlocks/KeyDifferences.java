package JavaBuildingBlocks;

public class KeyDifferences {
	
	public static void main(String[] args) {
//		int value = null; --> Primitive types cannot point to null
//		char c = null; --> this includes char
		
		String s = null; // Where as reference types like String and Object can point to null
		Object o = null; // null means that this reference type currently points to nothing.
		
		String reference = "Hello";
		int len = reference.length(); // Reference types can be used to call specific methods
		int primitive = 13;
//		int PrimLen = primitive.length(); // But primitive types cannot call methods 
		
		// Primitives also have lowercase names like int,byte 
		//but Reference types have names like Object,String --> Uppercase.
		
		
	}

}
