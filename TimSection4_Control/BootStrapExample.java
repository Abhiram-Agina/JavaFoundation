package TimSection4_Control;

public class BootStrapExample {
	
	public static void main(String[] args) {
		BootStrapHello bsh = new BootStrapHello(); // Creating an instance of the class
		
		bsh.setEmailAddress("aagina02@opusd.us"); //calling setEmailAddress and supplying a value
		System.out.println(bsh.getEmailAddress()); // calling getEmailAddress and it will return our inputed value
	}

}
