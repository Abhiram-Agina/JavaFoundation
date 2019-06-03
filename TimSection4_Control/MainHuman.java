package TimSection4_Control;

public class MainHuman {
	
	public static void main(String[] args) {
		Person p = new Person("Andrew", "Grey");
		System.out.println(p.getName() + " has " + p.hairColor + " hair");
		p.greet();
// 		p.doFavor(); // Created in Friend class so Person doesn't have the variable info
		System.out.println("==================================");
		
		Friend f = new Friend("Tony", "Blond", " help you fix that flat tire");
		System.out.println(f.getName() + " has " + f.hairColor + " hair"); // Inherits .getName() from Person
		f.greet();
		f.doFavor();
	}

}
