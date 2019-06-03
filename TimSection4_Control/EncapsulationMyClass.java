package TimSection4_Control;

public class EncapsulationMyClass {
	
	public static void main(String[] args) {
		EncapsulationSomeClass whatever = new EncapsulationSomeClass(); //Instantiating our EncapsulationSomeClass
		
		System.out.println(whatever.visibleString);
//		System.out.println(whatever.myString); myString is not visible, due to it being private
	}

}
