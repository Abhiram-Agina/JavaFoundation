package TimSection4_Control;

public class StringRules {
	
	public static void main(String[] args) {
		
		String[] sa = new String[10];
		for(int i = 0; i < sa.length; i++)
		{
			sa[i] = new String("Hello" + i);
			System.out.println(sa[i]);
		}
		
		System.out.println(sa.length);
	}

}
