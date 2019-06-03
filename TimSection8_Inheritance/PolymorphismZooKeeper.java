package TimSection8_Inheritance;

public class PolymorphismZooKeeper {
	
	public void feedAnimal(PolymorphismAnimal [] animals) {
		for (PolymorphismAnimal a : animals) {
			String name = a.getName();
			String food = a.eats();
			System.out.println(name + " likes " + food);
			a.eat(food);
			System.out.println("==================================");
		}
	}

}
