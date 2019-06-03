package CoreJavaAPIs;

import java.util.*;

public class JAL_Using {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); // Can add any type
		list.add("hawk");
		list.add(Boolean.TRUE);
		System.out.println(list);
		
		
		ArrayList<String> safer = new ArrayList<>(); // Only accepts Strings
		safer.add("sparrow");
//		safer.add(Boolean.TRUE); Cannot add types other than String to our ArrayList
 		
		
		List<String> birds = new ArrayList<>();
		birds.add("Hawk");
		birds.add(1,"Robin");
		birds.add(0,"Blue Jay");
		birds.add(1,"Cardinal");
		System.out.println(birds);

System.out.println("===========================================================");
System.out.println();

		List<String> birds = new
		
	}
}
