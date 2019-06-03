package Mod4OperatorsDecisions;

public class CaseExample {
	
	public static void main(String[] args) {
		
		int day = 7;
		System.out.println("Day number: " + day);
		
		switch(day)
		{
			case 0: // variable are not allowed for cases
				System.out.println("An exciting new week begins!");
				break;
			case 1:
				System.out.println("Boring!");
				break;
			case 2:
				System.out.println("OK, lets try again!");
				break;
			case 3:
				System.out.println("Whoo hoo, half way there!");
				break;
			case 4:
				System.out.println("Still dragging on!");
				break;
			case 5:
				System.out.println("Yay, weekend next!");
				break;
			default:
				System.out.println("Give me your V-BUCKS");
			
		}
		
	}

}
