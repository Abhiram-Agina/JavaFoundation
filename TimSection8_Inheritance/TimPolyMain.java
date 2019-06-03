package TimSection8_Inheritance;

class PolyMovie
{
	private String name;
	public PolyMovie(String name){//Constructor
		this.name = name;
	}
	
	protected String plot() { // can be static
		return "No plot here";
	}
	
	public String getName(){
		return name;
	}
}

class Jaws extends PolyMovie{
	public Jaws() { // Constructor must be created if it inherits a non default constructor.
		super("Jaws");// Super constructor must be called if it inherits a constructor
	}
	
	@Override //  Overridden can only be final but cannot override final
	public final String plot() {// access modifier cannot have lessen scope than the original method when overriding
		return "A shark eats a lot of people"; // output is the only thing that can be changed
	}
}

class IndependenceDay extends PolyMovie{
	public IndependenceDay() {
		super("Independence Day");
	}
	
	@Override
	public String plot() {
		return "Aliens are Attacking";
	}
}

class MazeRunner extends PolyMovie{
	public MazeRunner() {
		super("Maze Runner");
	}

	@Override
	public String plot() {
		return "Kids try and escape a maze.";
	}
}

class StarWars extends PolyMovie{
	public StarWars() {
		super("Star Wars");
	}
	
	@Override
	public String plot() {
		return "Darth vader attempt to dominate.";
	}
}

class Forgettable extends PolyMovie{

	public Forgettable() {
		super("Forgettable");
	}
}

public class TimPolyMain { // Polymorphism allows action to react differently based on which class it refers to
	
	public static void main(String[] args) {
		for(int i = 1; i < 11; i++){
			PolyMovie movie = randomMovie();
			System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
		}
	}
	
	public static PolyMovie randomMovie()
	{
		int randomNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number generated was " + randomNumber);
		switch (randomNumber)
		{
		case 1:return new Jaws();
		case 2:return new IndependenceDay();
		case 3:return new MazeRunner(); 
		case 4:return new StarWars();
		case 5:return new Forgettable();
		}
		return null;
	}

}
