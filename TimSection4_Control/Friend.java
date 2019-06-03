package TimSection4_Control;

public class Friend extends Person { // Since Friend extends Person and a constructor with parameters is defined in Person a similar constructor Friend must be created
	
	private String favor;
	
	public Friend(String name, String hairColor, String favor)
	{
		super(name,hairColor); // Calling super constructor 
		this.favor = favor;
	}
	
	public void doFavor()
	{
		System.out.println("Hey, my friend, let me " + favor + "!");
	}

}
