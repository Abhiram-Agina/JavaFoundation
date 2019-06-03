package JavaBuildingBlocks;

public class BlockScope {

	public static void main(String[] args) {
		boolean hungry = true;
		
		if(hungry) {
			int bitesOfCheese = 1;
			{
				boolean teenyBit = true;
				System.out.println(bitesOfCheese);// can access the variable because this block is in the "if"
			}
//			System.out.println(teenyBit);
		}
//		System.out.println(teenyBit); // cannot be accessed outside of the block in which it has been created.
	}
	
}
