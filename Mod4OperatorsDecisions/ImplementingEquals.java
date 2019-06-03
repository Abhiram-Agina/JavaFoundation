package Mod4OperatorsDecisions;

public final class ImplementingEquals {

	private String name;
	private String address;
	private int balance;
	
	public ImplementingEquals(String name, String address, int balance)
	{
		this.name = name;
		this.address = address;
		this.balance = balance;
	}
	
	public boolean equals(Object other)
	{
		boolean rv = false;
		if(other instanceof ImplementingEquals)
		{
			ImplementingEquals c2 = (ImplementingEquals)other;
			rv = c2.name.equals(this.name);
			c2.address.equals(this.address);
		}
		return rv;
	}
	
	public static void main(String[] args) {
		
		ImplementingEquals i1 = new ImplementingEquals("Fred", "Colorado", 0);
		ImplementingEquals i2 = new ImplementingEquals("Jim", "Washington", 1000);
		ImplementingEquals i3 = new ImplementingEquals("Fred", "Colorado", 0);
		ImplementingEquals i4 = new ImplementingEquals("Fred", "Colorado", 1000);
		
		System.out.println("i1 == i2 is " + (i1 == i2));
		System.out.println("i1 == i3 is " + (i1 == i3));
		System.out.println("i1 == i4 is " + (i1 == i4));
		
		System.out.println("i1.equals(i2) is " + (i1.equals(i2)));
		System.out.println("i1.equals(i3) is " + (i1.equals(i3)));
		System.out.println("i1.equals(i4) is " + (i1.equals(i4)));
		
	}

}
