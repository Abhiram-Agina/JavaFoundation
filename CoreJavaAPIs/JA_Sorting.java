package CoreJavaAPIs;

import java.util.*;
import java.util.Arrays;

public class JA_Sorting {

	public static void main(String[] args) {

		int[] numbers = {6, 9, 1};
		Arrays.sort(numbers); // Sort from least to greatest -> Numerically
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i] + " ");
		}
		
		
		String[] words = {"10", "9", "100"};
		Arrays.sort(words); // Sorts numbers Alphabetically -> "1" comes before "9".
		
		for(String string: words)
		{
			System.out.println(string + " ");
		}

	}
	
}
