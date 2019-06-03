package TimSection4_Control;

 class MethodOverloadingInheritanceA {
	
	int i, j;
	
	MethodOverloadingInheritanceA(int a, int b){
		i = a;
		j = b;
	}
	
	void show()
	{
		System.out.println("i and j: " + i + " " + j);
	}
}

	class MethodOverloadingInheritanceB extends MethodOverloadingInheritanceA
	{
		int k;
		
		MethodOverloadingInheritanceB(int a, int b, int c)
		{
			super(a,b);
			k = c;
		}
		
		void show()
		{
			System.out.println("k: " + k);
		}
	}
	
	public class Override {
		public static void main(String[] args) {
			MethodOverloadingInheritanceB subOb = new MethodOverloadingInheritanceB(1, 2, 3);
			
			subOb.show();
		}
	}
