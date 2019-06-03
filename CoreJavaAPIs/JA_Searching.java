package CoreJavaAPIs;

import java.util.Arrays;

public class JA_Searching {

	public static void main(String[] args) { // This is a varargs -> variable argument.
		
		int [] numbers = {2, 4, 6, 8};
		
		System.out.println(Arrays.binarySearch(numbers, 2)); // if found returns its index 0
		System.out.println(Arrays.binarySearch(numbers, 4));
		System.out.println(Arrays.binarySearch(numbers, 1)); //negates the value at which it should be then -1
		System.out.println(Arrays.binarySearch(numbers, 3)); // 3 should be at "1" so it returns -1 - 1 = -2 
		System.out.println(Arrays.binarySearch(numbers, 9)); // 9 should be at "4" so it returns -4 - 1 = -5
		
		
		int[] QuizNumbers = new int[] {3, 2, 1};
		System.out.println(Arrays.binarySearch(QuizNumbers, 2)); // returns "1".
		System.out.println(Arrays.binarySearch(QuizNumbers, 3)); // Since the array is unsorted -> unpredictable
		
	}
	
}
