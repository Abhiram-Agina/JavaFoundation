package JavaBuildingBlocks;

public class ScopeTest {
// The Goal: Find where the scope ends for each of the variables in the code	
	
	public static void main(String[] args) {
		int roomInBelly = 5;
		boolean hungry = true;
		int amountOfFood = 27;
		
		if(hungry) { 
			boolean timeToEat = true;
			while(amountOfFood > 0) {
				int amountEaten = 2;
				roomInBelly = roomInBelly - amountEaten;
				amountOfFood = amountOfFood - amountEaten;
			} // --> Scope ends here for amountEaten.
		} // --> Scope ends here for timeToEat.   
		System.out.println(amountOfFood);
	} // --> Scope ends here for roomInBelly, hungry, and amountOfFood. 
	
}
