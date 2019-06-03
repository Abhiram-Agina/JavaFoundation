package Lambdo;

public class MyNewStringClass {
	public static String reverseStr(MyNewStringInterface reverse, String str){
		  return reverse.myStringFunction(str);
		}

		public static void main (String args[]) {
			// Block lambda to reverse string
			MyNewStringInterface reverse = (str) -> {
				String result = "";
				
				for(int i = str.length()-1; i >= 0; i--)
					result += str.charAt(i);
				
				return result;
			};

			// Output: omeD adbmaL
			System.out.println(reverseStr(reverse, "RACECAR")); 
		}
}
