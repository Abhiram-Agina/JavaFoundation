package TimSection8_Inheritance;

// create a superclass
class CallingA {
	CallingA() {
		System.out.println("Inside A's constructor.");
	}
}

class CallingB extends CallingA { 
	CallingB() { // the first line of a constructor must be super() regardless if it is written down or not
		System.out.println("Inside B's constructor."); // specifically in a default constructor
	}
}

class CallingC extends CallingB {
	CallingC() {
		System.out.println("Inside C's constructor.");
	}
}

public class ConstructorExecution {
	public static void main(String[] args) {
		CallingC c = new CallingC();
	}
}
