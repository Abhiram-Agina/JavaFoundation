package TimSection4_Control;

public class InheritanceTester {
	
	public static void main(String[] args) {
		InheritanceAnimal animal = new InheritanceAnimal("Chinchilla", 1, 1, 5, 5);
		
		InheritanceDog dog = new InheritanceDog("Shitzu", 13, 37, 2, 4, 1, 36, "fluffy");
		dog.eat();// Inheriting the method eat from InheritanceAnimal
	//	dog.walk();
		dog.run();
	}

}
