package TimSection4_Control;

public class InheritanceFish extends InheritanceAnimal{

	private int gills;
	private int eyes;
	private int fins;

	
	public InheritanceFish(String name, int size, int weight) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	
	private void rest()
	{
		
	}
	
	private void moveMuscles()
	{
		
	}
	
	private void moveBackFin()
	{
		
	}
	
	private void swim(int speed)
	{
		moveMuscles();
		moveBackFin();
		super.move(speed);
	}
	
}
