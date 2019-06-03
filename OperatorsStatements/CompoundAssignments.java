package OperatorsStatements;

public class CompoundAssignments {
	
	public static void main(String[] args) {
		
		int a = 2, b = 3;
		a = a * b; // simple assignment operators
		a *= b; // compound assignment operators
		
		long x = 10;
		int y = 5;
//		y = y * x; // DOES NOT COMPILE : first computes y * x (hence assigning a long value to an int) 
		y *= x; // first casts y to a long then computes.
		
		short s = 10;
		int j = (s = 0); // can access if it has larger scope.
		
	}

}
