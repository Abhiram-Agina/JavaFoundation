package BookAbstractClasses;

abstract class Animal {
	protected int age;
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	public abstract String getName(); // Creates a promise that the sublass(Swan) must fulfill
}

class DemoSwan {
	public String getName() {
		return "Swan";
	}
}

public class DemoTest {
	
}


