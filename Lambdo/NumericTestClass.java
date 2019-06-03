package Lambdo;

public class NumericTestClass {
	public static void main(String args[]) {
		NumericTestInterface isEven = (n) -> (n % 2) == 0;
		NumericTestInterface isNegative = (n) -> (n < 0);
		NumericTestInterface isMultipleof10 = (n) -> ((n % 10) == 0);

		// Output: false
		System.out.println(isEven.computeTest(5));

		// Output: true
		System.out.println(isNegative.computeTest(-5));
	}
}
