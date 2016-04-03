import java.io.*;
import java.util.Scanner;

public class FileReadClass
{
   public static void main (String[] args)
   {
      Scanner kb = null;
      
      try {
         kb = new Scanner (new FileInputStream("file1.txt"));
      }
      catch (FileNotFoundException FNF) {
         FNF.printStackTrace();
         System.exit(0);
      }
      while (kb.hasNextLine()) {
         System.out.println(kb.nextLine());
      }
      kb.close();
   }
}