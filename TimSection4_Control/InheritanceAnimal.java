package TimSection4_Control;

public class InheritanceAnimal{
	
	private String name;	//I am creating private traits for all "Animals"
	private int brain; 
	private int body;
	private int size;
	private int weight;
	
	public InheritanceAnimal(String name, int brain, int body, int size, int weight){
		this.name = name;
		this.brain = brain; 
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
	
	// getters and setters are a way of encapsulating the current data and making it only accessible through methods of the current class.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBrain() {
		return brain;
	}

	public void setBrain(int brain) {
		this.brain = brain;
	}

	public int getBody() {
		return body;
	}
	
	public void eat() // 3rd
	{
		System.out.println("Animal.eat() called");
	}
	
	public void move(int speed) // 6th
	{
		System.out.println("Animal.move() called, Animal is moving at " + speed);
	}

	
}
