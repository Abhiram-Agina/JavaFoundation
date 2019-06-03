package Mod2JavaBasics;

public class Lesson2Thing {
	
	public int numOne;
	public long numTwo;
	
	public void doStuff()
	{
		this.numOne = this.numOne + 10;
		numTwo++;
	}
	
	public boolean sameAs(Lesson2Thing other)
	{
		return other == this;
	}
	
	public String toString()
	{
		return "Thing: numOne = " + this.numOne + ", numTwo = " + this.numTwo;
	}

}
