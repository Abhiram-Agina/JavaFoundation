package TimSection4_Control;

public class SwitchChallenge {
	
	public static void main(String[] args)
	{
		printDayOfTheWeek(6);
	}
	
	public static void printDayOfTheWeek(int day)
	{
		switch(day) // using switches
		{
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday"); break;
		case 7: System.out.println("Saturday"); break;
		default: System.out.println("Invalid Day!!"); break;
		}
		
		if(day>7 | day<1) // using if-else
		{System.out.println("Invalid Day!!!");}
		else if(day == 1){System.out.println("Sunday");}
		else if(day == 2){System.out.println("Monday");}
		else if(day == 3){System.out.println("Tuesday");}
		else if(day == 4){System.out.println("Wednesday");}
		else if(day == 5){System.out.println("Thursday");}
		else if(day == 6){System.out.println("Friday");}
		else{System.out.println("Saturday");}
	}

}
