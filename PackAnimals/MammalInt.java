package PackAnimals;

import Interfaceo.*;
/* File name : MammalInt.java */

public class MammalInt implements Football {

   public void eat() {
      System.out.println("Mammal eats");
   }

   public void travel() {
      System.out.println("Mammal travels");
   } 

   public int noOfLegs() {
      return 0;
   }

   public static void main(String args[]) {
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
   }

@Override
public void setHomeTeam(String name) {
	// TODO Auto-generated method stub
	
}

@Override
public void setVisitingTeam(String name) {
	// TODO Auto-generated method stub
	
}

@Override
public void homeTeamScored(int points) {
	// TODO Auto-generated method stub
	
}

@Override
public void visitingTeamScored(int points) {
	// TODO Auto-generated method stub
	
}

@Override
public void endOfQuarter(int quarter) {
	// TODO Auto-generated method stub
	
}
} 
