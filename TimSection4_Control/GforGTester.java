package TimSection4_Control;

public class GforGTester {
	
	public static void main (String[] args)  
    { 
        GforGEncapsulation obj = new GforGEncapsulation(); 
          
        // setting values of the variables  
        obj.setName("Harsh"); 
        obj.setAge(19); 
        obj.setRoll(51); 
          
        // Displaying values of the variables 
        System.out.println("Geek's name: " + obj.getName()); 
        System.out.println("Geek's age: " + obj.getAge()); 
        System.out.println("Geek's roll: " + obj.getRoll()); 
          
        // Direct access of geekName is not possible 
        // due to encapsulation `
        // System.out.println("Geek's roll: " + obj.geekName);         
    } 

}
