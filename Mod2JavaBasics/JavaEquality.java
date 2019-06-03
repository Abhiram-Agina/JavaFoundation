package Mod2JavaBasics;

import java.util.Date;

public class JavaEquality {

	public static void main(String[] args) {
		
		//Using Primitives
		int x = 99;
		int y = 99;
		int z = 99;
		
		System.out.println(x == y);// checks if both variables are pointing at the same memory location(DATA)
		System.out.println(x == z);
		
		//Using Reference Types
		Date d1 = new Date(1200);
		Date d2 = new Date(1200);
		
		System.out.println(d1 == d2);// They point at different memory locations so it will return false. 
		
		d2 = d1;// both Reference variables now point to the same location(DATA).
		System.out.println(d1 == d2); 
		
	}
	
}
