package DateandTime;

import java.util.*;
public class SleepDemo {

   public static void main(String args[]) {
      try { 
         System.out.println(new Date( ) + "\n"); 
         Thread.sleep(5*200*10); 
         System.out.println(new Date( ) + "\n"); 
      } catch (Exception e) {
         System.out.println("Got an exception!"); 
      }
   }
}
