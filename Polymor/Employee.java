package Polymor;

/* File name : Employee.java */
public class Employee {
   private String name;
   private String address;
   private int number;

   public Employee(String nameC, String addressC, int numberC) {
      System.out.println("Constructing an Employee");
      this.name = nameC;
      this.address = addressC;
      this.number = numberC;
   }

   public void mailCheck() {
      System.out.println("Mailing a check to " + this.name + " " + this.address);
   }

   public String toString() {
      return name + " " + address + " " + number;
   }

   public String getName() {
      return name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String newAddress) {
      address = newAddress;
   }

   public int getNumber() {
      return number;
   }
}

