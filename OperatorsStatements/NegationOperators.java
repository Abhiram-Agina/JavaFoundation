package OperatorsStatements;

public class NegationOperators {
	public static void main(String[] args) {
		
		boolean x = false;
		System.out.println(x);
		x = !x; // negates the boolean of x true -> false or false -> true.
		System.out.println(x);
		
		double y = 1.21;
		System.out.println(y);
		y = -y; // negates the value of y: 1.21 -> -1.21 or -1.21 -> 1.21 
		System.out.println(y);
		y = -y;
		System.out.println(y);
		
//		int z = !5;	DOES NOT COMPILE because you can't use boolean logical operators on integers
//		boolean y = -true; DOES NOT COMPILE
//		boolean z = !0; DOES NOT COMPILE
		
	}
}
