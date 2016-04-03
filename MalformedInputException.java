package Project2;
public class MalformedInputException extends Exception
{
   public MalformedInputException ( ) {
      super("Improper form of input!");
   }
   public MalformedInputException (String message) {
      super(message);
   }
}