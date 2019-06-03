package Lambdo;

public class Lambda1 {

	public static void main(String[] args) {
		ZeroFuncInterface f = () -> System.out.println("Zero parameter lambda");
		
		f.abstractFun();
	}
	
}
