package Mod4OperatorsDecisions;

public class IncrementDecrement {
	
	public static void main(String[] args) {
		
		int[] xa = {0,1,2,3,4};
		int idx = 0;
		xa[++idx] = xa[idx] + 1000;
		for(int v: xa)
		{
			System.out.println(">" + v);
		}
		
		int[] xb = {0,1,2,3,4};
		int idy = 0;
		xb[idy++] = xb[idy] + 1000;
		for(int v: xb)
		{
			System.out.println(">" + v);
		}
		
	}

}
