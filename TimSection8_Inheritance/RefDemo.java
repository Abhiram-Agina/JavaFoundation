package TimSection8_Inheritance;

public class RefDemo {
	public static void main(String[] args) {
		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainbox = new Box();
		double vol, wgh;
		
		vol = weightbox.volume();
		wgh = weightbox.weight;
		System.out.println("Volume of weightbox is " + vol);
		System.out.println("Weight of weightbox is " + wgh);
		System.out.println();
		
		// assign BoxWeight reference to Box reference
		plainbox = weightbox;
		
		vol = plainbox.volume(); // OK, volume() defined in Box
		System.out.println("Volume of plainbox is " + vol);
		
		/* The Following statement is invalid because plainbox
		   does not define a weight number */
//		System.out.println("Weight of plainbox is " + plainbox.weight);
	}
}
