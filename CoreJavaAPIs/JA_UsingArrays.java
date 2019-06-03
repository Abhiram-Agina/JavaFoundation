package CoreJavaAPIs;

public class JA_UsingArrays {

	public static void main(String[] args) {
		
		String[] mammals = {"monkey", "chimp", "donkey"};
		System.out.println(mammals.length);
		System.out.println(mammals[0]);
		System.out.println(mammals[1]);
		System.out.println(mammals[2]);
		
		System.out.println();
		
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = i + 5;
			System.out.println(numbers[i]);
		}
		
		numbers[10] = 3; // Out of Bounds
		numbers[numbers.length] = 5; // Out of Bounds
		
		for (int i = 0; i <= numbers.length; i++) numbers[i] = i + 5;  // Out of Bounds because of " <= "
			
		
	}
	
}
