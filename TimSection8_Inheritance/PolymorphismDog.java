package TimSection8_Inheritance;

public class PolymorphismDog extends PolymorphismAnimal {
	
	public String getName(){
		return "Dougal the Dog";
	}
	
	public String eats(){
		return "Kibbles";
	}
	
	public void eat(String food){
		System.out.println("Woof, wag! Great, " + food + "! I eat everything anyway, so I like this too.");
	}

}
