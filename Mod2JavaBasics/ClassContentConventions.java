package Mod2JavaBasics; // Defines where class belongs

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class ClassContentConventions {

	public static void main(String[] args) 
	{
		Date d = new Date(); // uses Date import
		java.util.Date u = new java.util.Date(); // Does not require Date import
		System.out.println("Today is " + d);
		List l = new ArrayList();
		//		 new java.util.ArrayList();
	}
	
}

class OtherClass{
}

interface AnInterface{
}
