package CoreJavaAPIs;

public class UnderstandingEquality {

	String name;
	public static void main(String[] args) {
		
		UnderstandingEquality UE1 = new UnderstandingEquality();
		UnderstandingEquality UE2 = new UnderstandingEquality();
		UnderstandingEquality UE3 = UE1;
		
		System.out.println(UE1 == UE1); // true
		System.out.println(UE1 == UE2); // false
		System.out.println(UE1.equals(UE2)); // true
		
		
	}

}
