package TimSection8_Inheritance;

// Using super to overcome name hiding
class SecondUseA {
	int i;
}

// Create a subclass by extending class A.
class SecondUseB extends SecondUseA{
	int i; // this i hides the i in A
	
	SecondUseB(int a, int b){
		super.i = a; // i in SecondUseA
		i = b; // i in SecondUseB
	}
	
	void show() {
		System.out.println("i in superclass: " + super.i);// super allows us to access the hidden i.
		System.out.println("i in superclass: " + i);
	}
}

public class UseSuper {
	public static void main(String[] args) {
		SecondUseB subOb = new SecondUseB(1, 2);
		
		subOb.show();
	}
}
