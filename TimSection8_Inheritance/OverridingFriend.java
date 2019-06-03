package TimSection8_Inheritance;

public class OverridingFriend extends OverridingPerson{
	
	private String favor;
	
	public OverridingFriend(String name, String hairColor, String favor){
		super(name, hairColor);
		this.favor = favor;
	}
	
	public void doFavor(){
		System.out.println("Hey, my friend, let me " + favor + "!");
	}
	
	@Override// tells compiler that you want this method to be an Overriding Method
	public void greet() // Overriding greet method in OverridingPerson
	{
		System.out.println("Hey my friend, it's ya boi!!");
	}

}
