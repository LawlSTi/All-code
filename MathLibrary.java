/**Math library class
***Contains declaration for various calculator methods
***To be used as a base class for the calculator class
*/
package Project2;
public abstract class MathLibrary
//public class MathLibrary
{
   //instance variable
   private double result=0.0;

   //abstract methods for various calculator functions
   public abstract double add(double num1, double num2);
   public abstract double subtract(double num1, double num2);
   public abstract double multiply(double num1, double num2);
   public abstract double divide(double num1, double num2);
   public abstract double power(double num1, double num2);
   
   //no argument constructor
   public MathLibrary()
   //public Mathlibrary()
   {
      result = 0.0;
   }
   //constructor with an argument
   public MathLibrary(double result)
   //public Mathlibrary(double result)
   {
      //result = this.result;
      this.result = result;
   }
   //mutator method for MathLibrary
   public void setResult(double result)
   {
      //result = this.result;
      this.result = result;
   }
   //accessor method for MathLibrary
   public double getResult()
   {
      return result;
   }

}