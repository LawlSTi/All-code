import java.io.*;
public class FileIOExample
{
   public static void main (String[] args)
   {
      PrintWriter pw = null;
      String a = "Yes it works!";
      int b = 67890;
      
      try {
         pw = new PrintWriter (new FileOutputStream("file1.txt", true));
      }
      catch (FileNotFoundException FNF) {
         System.out.println ("Could not create file");
      }
      System.out.println ("Writing to the file...");
      pw.println ("Hello there!!");
      pw.println (a);
      pw.println (b);
      pw.flush(); //Forces Java to send data from buffer into file
      System.out.println ("File writing complete!");
      pw.close();
   }
}