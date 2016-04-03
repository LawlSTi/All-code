package Project2;c
public class InvalidOperatorException extends Exception
{
   public InvalidOperatorException ( ) {
      super ("Invaid Operator input");
   }
   public InvalidOperatorException (String message) {
      super (message);
   }
}