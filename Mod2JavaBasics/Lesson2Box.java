package Mod2JavaBasics;

public class Lesson2Box {
	
	private Lesson2Thing[] things = {
			new Lesson2Thing(), new Lesson2Thing(), new Lesson2Thing()
	};
	
	public Lesson2Thing getOneThing()
	{
		return things[2];
	}
	
	public Lesson2Thing[] getManyThings()
	{
		return things;
	}
	
	public void showThing()
	{
		System.out.println("Things:");
		for(Lesson2Thing t: things)
		{
			System.out.println(t.toString());
		}
		System.out.println("-----------------------------------------------------------------------");
	}

}
