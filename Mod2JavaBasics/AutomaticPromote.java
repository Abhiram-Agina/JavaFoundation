package Mod2JavaBasics;

public class AutomaticPromote {
	
	public static void main(String[] args) {
		
		byte a  = 40;
		byte b  = 40;
		byte c  = 40;
		int d = a * b / c ;; // automatic conversion to type int

		
//		b = b * 2; Error! Cannot assign an int to a byte
		
		byte z = (byte) ((byte)b * 2);
		
	}
	
	
}
