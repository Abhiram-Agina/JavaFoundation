package TimSection8_Inheritance;

class BookOverridingA {
	int i,j; // access modifier set to default
	
	BookOverridingA(int a, int b){
		i = a;
		j = b;
	}
	
	// display i and j
	private void show(){
		System.out.println("i and j: " + i + " " + j);
	}
}

class BookOverridingB extends BookOverridingA{
	int k;
	
	BookOverridingB(int a, int b, int c){
		super(a,b);
		k = c;
	}
	
	void show(String msg){
		System.out.println(msg + k);
	}
}

public class BookOverriding{
	public static void main(String[] args) {
		LoadingB subOb = new LoadingB(1,3,5);
		
		subOb.show();// this calls show() in A
		subOb.show("This is k: ");// this calls show() in B
	}
}
