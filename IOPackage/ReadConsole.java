package IOPackage;

import java.io.*;

public class ReadConsole {

   public static void main(String args[]) throws IOException {
      InputStreamReader cin = null;
      FileOutputStream out = null;

      try {
         cin = new InputStreamReader(System.in);
         System.out.println("Enter characters, 'q' to quit.");
         char c;
         out = new FileOutputStream("C:\\Users\\Robo1753\\eclipse-workspace\\Safari\\src\\IOPackage\\WriteTo.txt");
         do {
            c = (char) cin.read();
            out.write(c);
         } while(c != 'q');
      }finally {
         if (cin != null) {
            cin.close();
         }
         if (out != null) {
             out.close();
          }
      }
   }
}
