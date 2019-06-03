package JavaBuildingBlocks;

public class VariableScopeLocal {
	
	private static void main(String[] args) {
		// public boolean hungry = false; --> Local Variables may never have a scope larger than their method
		boolean hungry = false;
		
		if(hungry) {
			int bitesOfCheese = 1;
		} // bitesOfCheese goes out of scope here because it is declared inside the if statement.
		
//		System.out.println(bitesOfCheese); 
	}// hungry goes out of scope here 
	
}
