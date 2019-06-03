package TimSection8_Inheritance;

class LoadingA {
	int i,j; // access modifier set to default
	
	LoadingA(int a, int b){
		i = a;
		j = b;
	}
	
	// display i and j
	void show(){
		System.out.println("i and j: " + i + " " + j);
	}
}

class LoadingB extends LoadingA{
	int k;
	
	LoadingB(int a, int b, int c){
		super(a,b);
		k = c;
	}
	
	void show(String msg){
		super.show(); // this calls A's show
		System.out.println(msg + k);
	}
}

public class LoadingVSRiding{
	public static void main(String[] args) {
		BookOverridingB subOb = new BookOverridingB(1,3,5);
		
		subOb.show();// this calls show() in A
		subOb.show("This is k: ");// this calls show() in B
	}
}
