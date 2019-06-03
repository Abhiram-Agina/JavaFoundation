package Mod2JavaBasics;

public class CastingPrimitive {
	
	public static void main(String[] args) {
		
		int x;// x must always stay an int
		x = 123;
		
		
		byte b = 12;// ok
		byte c = 10;
//		byte d = b + c; FAILS TO COMPILE, because java automatically converts "b + c" to an int value	
		
//		byte b2 = 1234;    to Big will not fit into byte type
//		float f = 1.3; Does not compile - Double literal		
//		b = x; NOT OK
		
// Examples of cast operater	
		
		b = (byte)x; 
		float f = 1.3f;
		float g = (float)1.3;
		byte d = (byte)(b + c);// its GOODY
		
		byte b2 = (byte)1234;// compiles but will return an odd unwanted result.
		
		System.out.println(b);
		System.out.println(b2);
		
		
	}

}
