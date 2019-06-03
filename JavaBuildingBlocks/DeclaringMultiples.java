package JavaBuildingBlocks;

public class DeclaringMultiples {
	
	public static void main(String[] args) {
		String s1,s2;
		String s3 = "hi", s4 = "bye"; 
		// multiple declaration can only be done if the variables are all the same type.
		
		int i , j , k = 89; 
		// In this 3 variables i,j,k were declared but only k was initialized
		
//		int a, String b; --> this is invalid don't get tripped up on this.
		
// =======================================================================		
		
		boolean b1, b2;  // --> valid	
		String t1 = "2", t2; // --> valid
		int i1; int i2; // --> valid cause semicolon separates between statements
		
		
//		double d1, double d2; 
		// --> invalid java does not allow the declaration of 2 different types in the same statement.
		
//		int i3; i4; --> invalid cause semicolon separates between statements and does not act as a ','
		
// =========================================================================
		
		/*Identifier RULES:
		 * 
		 * -> A identifier name must start with either $, _, or letters 
		 * -> Subsequent character may also be numbers.
		 * -> You are not allowed to use java reserved words as identifier names
		 * 
		 * legal identifiers are ouuewrouewrou, pio123442, _______ljfewjf
		 * illegal identifiers are 3pohji, public, *_codfe, ohweqouiuh@
		 */
		
		
	}

}
