package TimSection8_Inheritance;

class Box {
	double width;
	double height;
	double depth;
	
	//construct a clone of an object
	Box(Box ob) { // pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	// Constructor used when all dimensions specified
	Box(double w, double h, double d) { 
		width = w;
		height = h;
		depth = d;
	}
	
	// Constructor used when no dimensions specified
		Box() { 
			width = -1; // used -1 to indicate
			height = -1; // an uninitialized
			depth = -1; // box
		}
		
		//constructor used when cube is created
		Box(double len)
		{
			width = height = depth = len;
		}
		
		// compute and return volume
		double volume()
		{
			return width * height * depth;
		}
}

// Here, Box is extended to include weight.
class BoxWeight extends Box {
	double weight; // weight of box
	
	//constructor for BoxWeight
	BoxWeight(double w, double h, double d, double m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}
}

//Here, Box is extended to include color.
class ColorBox extends Box {
	int color; // color of Box
	
	ColorBox(double w, double h, double d, int c) {
		width = w;
		height = h;
		depth = d;
		color = c;
	}
}

public class DemoBoxWeight {
	public static void main(String[] args) {
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("weight of mybox1 is " + mybox1.weight);
		System.out.println();
		
		vol = mybox2.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("weight of mybox1 is " + mybox2.weight);
	}
}
