package TimSection8_Inheritance;

public class PolymorphismZoo {
	
	public static void main(String[] args) {
		PolymorphismAnimal [] zoo = {
				new PolymorphismLion(), new PolymorphismDog()
		};
		
		PolymorphismZooKeeper keeper = new PolymorphismZooKeeper();
		keeper.feedAnimal(zoo);
	}

}
