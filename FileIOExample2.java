import java.io.*;
import java.util.Scanner;
public class FileIOExample2
{
   public static void main (String[] args)
   {
      PrintWriter pw = null;
      Scanner scan = null;
      String name;
      String age;
      String yourname;
      int age1;
      
      try {
         pw = new PrintWriter (new FileOutputStream("file1.txt"));
      }
      catch (FileNotFoundException FNF) {
         System.out.println ("Could not create file");
      }
      
      pw.println ("Name");
      pw.println ("Age");
      pw.println ("Chris");
      pw.println (30);
      pw.flush();
      pw.close();
      
      
      try {
         scan = new Scanner (new FileInputStream("file1.txt"));
      }
      catch (FileNotFoundException FNF) {
         FNF.printStackTrace();
         System.exit(0);
      }
 
      name = scan.nextLine();
      age = scan.nextLine();
      yourname = scan.nextLine(); 
      age1 = scan.nextInt();
      
      System.out.print (name + ": " + yourname + "\n");
      System.out.print (age + ": " + age1 + "\n");
   }
}