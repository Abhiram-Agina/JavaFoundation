package TimSection4_Control;

class MethodOverloadingInheritanceA2 {
	
	int i, j;
	
	MethodOverloadingInheritanceA2(int a, int b){
		i = a;
		j = b;
	}
	
	void show()
	{
		System.out.println("i and j: " + i + " " + j);
	}
}

	class MethodOverloadingInheritanceB2 extends MethodOverloadingInheritanceA2
	{
		int k;
		
		MethodOverloadingInheritanceB2(int a, int b, int c)
		{
			super(a,b);
			k = c;
		}
		
		void show()
		{
			super.show();
			System.out.println("k: " + k);
		}
	}
	
	public class Override2 {
		public static void main(String[] args) {
			MethodOverloadingInheritanceB2 subOb = new MethodOverloadingInheritanceB2(1, 2, 3);
			
			subOb.show();
		}
	}

