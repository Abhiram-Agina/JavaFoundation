package OperatorsStatements;

public class CastingPrimitives {
	public static void main(String[] args) {
		
		int x = (int)1.0; // casting is always required when converting a larger numerical data into a smaller
		short y = (short)1234567890; // wraps to next positive number as it does not fit.
		int z = (int)9l;
		long t = 192301398193810323L;
		
	}
}
