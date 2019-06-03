package JavaBuildingBlocks;

public class LocalDefaultInitialization {
	
	public static void main(String[] args) {
		int y = 10; // This is a a local variable, because it is defined inside of a method
		
		int x; // declared here** 
//		int sum = x + y;   --> Does not compile, because local variables must be defined before use
		
		x = 25; // initialized here**
		int sum = x + y; // This will compile.
		
		System.out.println(sum);
	}

}
