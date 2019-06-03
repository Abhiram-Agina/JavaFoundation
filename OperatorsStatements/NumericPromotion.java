package OperatorsStatements;

public class NumericPromotion {

	public static void main(String[] args) {
		
		int a = 1;
		long b = 2;
		
		System.out.println("Data type of a + b is a 'long' : " + (a + b));
		
		double c = 39.21;
		float d = 2.79f;
		
		System.out.println("Data type of c + d is a 'double' : " + (c + d));
		
		short e = 10;
		short f = 3;
		
		System.out.println("Data type of e / f is a 'int' : " + (e / f));
		
		short x = 14;
		float y = 13;
		double z = 30;
		
		System.out.println("Data type of x * y / z is a 'double' : " + (x * y / z));
		
	}
	
}
