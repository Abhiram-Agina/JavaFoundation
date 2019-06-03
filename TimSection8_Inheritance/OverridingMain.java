package TimSection8_Inheritance;

import TimSection4_Control.Friend;

public class OverridingMain {
	
	public static void main(String[] args) {
		OverridingPerson p = new OverridingPerson("Andrew", "Grey");
		System.out.println(p.getName() + " has " + p.hairColor + " hair");
		p.greet();
// 		p.doFavor(); // Created in Friend class so Person doesn't have the variable info
		System.out.println("==================================");
		
		OverridingFriend f = new OverridingFriend("Toni", "Blond", " help you fix that flat tire");
		System.out.println(f.getName() + " has " + f.hairColor + " hair"); // Inherits .getName() from Person
		f.greet();
		f.doFavor();
	}
	
}
