package TimSection8_Inheritance;

public class VariTypesMain {
	
	public static void main(String[] args) {		
		VariTypesAnimal a;
		
		System.out.println("================Investigating an Animal=====================");
		System.out.println();
		a = new VariTypesAnimal();
		showAnimalType(a); // Assigning a to type Animal
		
		System.out.println("================Investigating a Lion=====================");
		System.out.println();
		a = new VariTypesLion();
		showAnimalType(a);// Assigning a to type Lion
		
		System.out.println("================Investigating a Dog=====================");
		System.out.println();
		a = new VariTypesDog();
		showAnimalType(a);// Assigning a to type Dog
	}
	
	private static void showAnimalType(VariTypesAnimal a){
		Class theClass = a.getClass();
		String className = theClass.getName();
		Class parentClass = theClass.getSuperclass();
		String parentClassName = parentClass.getName();
		System.out.println("Class name is " + className);
		System.out.println("Parent Class name is " + parentClassName);
		
		if(a instanceof VariTypesAnimal)
		{
			System.out.println("It is an Animal");
		}
		
		if(a instanceof VariTypesLion)
		{
			System.out.println("It is a Lion");
		}
		
		if(a instanceof VariTypesDog)
		{
			System.out.println("It is a Dog");
		}
		
		System.out.println("This animal says: " + a.whatDoYouSay());
	}
	
}
