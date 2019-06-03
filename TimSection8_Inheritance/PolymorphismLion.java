package TimSection8_Inheritance;

public class PolymorphismLion extends PolymorphismAnimal {
	private static final String FAVORITE_FOOD = "Meat";
	
	@Override
	public String getName(){
		return "Larry the Lion";
	}
	
	@Override
	public String eats(){ // access modifier cannot have less of a scope than the original method when overriding
		return FAVORITE_FOOD;
	}

	@Override
	public void eat(String food)
	{
		if (food.equals(FAVORITE_FOOD)) {
			System.out.println("Roar, yum I love " + food + ".");
		}else {
			System.out.println("ROAR!... Eat the zookeeper!");
		}
	}
}
