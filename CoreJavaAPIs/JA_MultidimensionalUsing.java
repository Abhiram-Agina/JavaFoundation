package CoreJavaAPIs;

public class JA_MultidimensionalUsing {
	
	public static void main(String[] args) {
		
		int[][] twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				System.out.println(twoD[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
