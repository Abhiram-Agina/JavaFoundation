package TimSection4_Control;


class PolymorphismMovie
{
	private String name;
	
	public PolymorphismMovie(String name)
	{
		this.name = name;
	}
	
	public String plot()
	{
		return "no plot here";
	}
}

class PolymorphismJaws extends PolymorphismMovie
{
	public PolymorphismJaws() {
		super("Jaws");
	}
	
	public String plot()
	{
		return "A shark eats a lot of people";
	}
}

class PolymorphismIndependenceDay extends PolymorphismMovie
{
	
}

public class PolymorphismMain {
	
	public static void main(String[] args) {
		
	}

}
