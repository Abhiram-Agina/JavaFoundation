package Abstracto;

public abstract class EmployeeABS {
	   private String name;
	   private String address;
	   private int number;
	   
	   public abstract double computePay(); // abstract method
	   // Remainder of class definition
	   
	   public String getName(String name){
		   return name;
	   }
	}