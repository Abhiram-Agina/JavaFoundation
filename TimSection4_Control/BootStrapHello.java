package TimSection4_Control;

public class BootStrapHello {
	
	private String emailAddress; // private fields are always recommended, in order to protect data integrity.
	// this is the Encapsulated Data
	
	public String getEmailAddress() //We are using getter and setter methods to access and use emailAddress
	{
		return emailAddress; // can access emailAdress because it is class private.
	}
	
	public void setEmailAddress(String email)
	{
		if(email.indexOf("@")!= -1) //Checks if it is a real E-mail address
		{
			this.emailAddress = email;
		}else
		{
			throw new IllegalArgumentException("Email Address is invalid");
		}
	}

}
