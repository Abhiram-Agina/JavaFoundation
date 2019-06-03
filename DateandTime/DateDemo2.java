package DateandTime;

import java.util.Date;

public class DateDemo2 {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();
      Date late = new Date(12/31/18);

      // display time and date using toString()
      System.out.println(date.toString());
      System.out.println(date.after(late));
      System.out.println(date.getTime());
   }
}
