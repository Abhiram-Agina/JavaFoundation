package Abstracto;

/* File name : Salary.java */
public class SalaryIMPL extends EmployeeABS {

private static double salary;   // Annual salary
  
   public double computePay() {
      System.out.println("Computing salary pay for " + getName("JEFF"));
      return salary/52;
   }
   
   SalaryIMPL() {
	   computePay();
   }
   // Remainder of class definition
   
   public static void main(String[] args) {
	SalaryIMPL i = new SalaryIMPL(); 
}
   
}
