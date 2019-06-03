package Mod2JavaBasics;

public class Lesson2CodeExamples {
	
	public static void main(String[] args) {
		
		Lesson2Thing t = new Lesson2Thing();
		int n = t.numOne;
		System.out.println("value read is " + n);
		
		System.out.println("t is " + t);
		t.numOne = 99;
		t.numTwo = 100;
		System.out.println("t is " + t);
		
		
		Lesson2Box b = new Lesson2Box();
		
		System.out.println("numOne in a boxed thing is " + b.getOneThing().numOne);
		b.getOneThing().numOne = 5432;
		System.out.println("numOne in a boxed thing is " + b.getOneThing().numOne);
		
		System.out.println("numOne in another boxed thing is " + b.getManyThings()[0].numOne);
		b.getManyThings()[0].numOne = 5432;
		System.out.println("numOne in another boxed thing is " + b.getManyThings()[0].numOne);
		
		System.out.println("t is " + t);
		t.doStuff();
		System.out.println("t is " + t);
		
		System.out.println("t is the same reference as \" this\" " + "inside a method called an t? " + t.sameAs(t));
		
	}

}
