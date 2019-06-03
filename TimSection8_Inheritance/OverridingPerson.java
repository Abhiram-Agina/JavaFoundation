package TimSection8_Inheritance;

public class OverridingPerson {
	
	private String name;
	public String hairColor;
	
	public String getName(){
		return name;
	}
	
	public void greet(){
		System.out.println("Hello, my name is " + name);
	}
	
	public OverridingPerson(String name, String hairColor){
		this.name = name;
		this.hairColor = hairColor;
	}

}
