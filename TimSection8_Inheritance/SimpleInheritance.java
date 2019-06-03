package TimSection8_Inheritance;

class InheritBasicsA {
	int i, j;
	
	void showij() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class InheritBasicsB extends InheritBasicsA {
	int k;
	
	void showk() {
		System.out.println("k: " + k);
	}
	
	void sum() {
		System.out.println("i+j+k: " + (i+j+k)); // inherits values of both i and j from InheritBasicsA
	}
}

public class SimpleInheritance {
	public static void main(String[] args) {
		InheritBasicsA superOb = new InheritBasicsA();
		InheritBasicsB subOb = new InheritBasicsB();
		
		// The superclass may be used by itself.
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Contents of superOb: ");
		superOb.showij();
		System.out.println();
		
		/* The subclass has access to all public members of its superclass. */
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Contents of subOb: ");
		subOb.showij();// inherits this method from InheritBasicsA
		subOb.showk();
		System.out.println();
		
		System.out.println("Sum of i, j, and k in subOb");
		subOb.sum();
		
		System.out.println();
	}
}
