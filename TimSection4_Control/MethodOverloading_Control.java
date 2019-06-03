package TimSection4_Control;

public class MethodOverloading_Control {
	
	public static void main(String[] args) {
		int newScore = calculateScore("Bob",500);
		System.out.println("New Score is " + newScore);
		calculateScore(75); // overloaded methods are differentiated between each other by the type/number of the parameters
		calculateScore();
	}
	
	public static int calculateScore(String playerName, int score)
	{
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	

	public static int calculateScore(int score) // In order to overload a method it must have the same name but a different number or a different type of parameters.
	{
		System.out.println("Unamed player scored " + score + " points");
		return score * 1000;
	}
	
	private static void calculateScore() // overloaded methods may have different return types as long as the method parameters are a different type/number.  
	{
		System.out.println("No player name, no player score.");
	}

}
