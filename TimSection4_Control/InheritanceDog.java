package TimSection4_Control;

public class InheritanceDog extends InheritanceAnimal{

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	//inherits all of InheritanceAnimals Methods and Variables
	
	public InheritanceDog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight); // super is used to call the constructor in the Parent Class
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	private void chew() // 2nd
	{
		System.out.println("Dog.chew() called");
	}

	public void eat() // 1st
	{
		System.out.println("Dog.eat() called");
		chew();
		super.eat(); // cannot be static
	}
	
	public void walk()
	{
		System.out.println("Dog.walk() called");
		super.move(5);
	}
	
	public void run()// 4th
	{
		System.out.println("Dog.run() called");
		move(10); // calls the closest move
	}
	
	private void moveLegs(int speed) // 6th
	{
		System.out.println("Dog.moveLegs() called");
	}
	
	// this is the closest move
	public void move(int speed) // 5th 
	{
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
	}
	
}
