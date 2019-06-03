package JavaBuildingBlocks; // must be the first non comment line of code
import java.util.*; // comes after package statement

//String name; DOES NOT COMPILE --> it is not defined in the class

//package JavaBuildingBlocks; DOES NOT COMPILE --> package declarations cannot come before import statements

public class OrderingElements { // then comes our class
	static double weight; // variables and methods can go in either order
	
	public static void main(String[] args) {
		System.out.println("This is the value of weight: " + weight);
	}
	double height; // variables and methods can be declared anywhere and in no specific order.
}

class NewOrder{} // When defining multiple classes in one file there can only be one public class defined
// It is also fine if neither class 
