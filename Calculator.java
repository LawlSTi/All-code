/**
Calculator class derived from MathLibrary class
Defines abstract methods from MathLibrary and
computes arithmetic calulations.
*/
package Project2;
public class Calculator extends MathLibrary
{
   
   //Instanced variables
   private double num1;
   private double num2;
   
   //Accessor methods
   public double getNum1 ( ) {
      return num1;
   }
   public double getNum2 ( ) {
      return num2;
   }
   
   //Mutator methods
   public void setNum1 (double num1) {
      this.num1 = num1;
   }
   public void setNum2 (double num2) {
      this.num2 = num2;
   }
   
   //Methods for calculating variables input//
   //Output expected relative to the type of method//
   //Add = addition, Sub = subtraction, etc.//
   public double add(double num1, double num2) {
      return num1 + num2;
   }
   public double subtract(double num1, double num2) {
      return num1 - num2;
   }
   public double multiply(double num1, double num2) {
      return num1 * num2;
   }
   public double divide(double num1, double num2) {
      return num1 / num2;
   }
   public double power(double num1, double num2) {
      return Math.pow(num1,num2);
   }
   
   //Equals method for verifying value in method is equal//
   //to a certain type. Returns false or true.//
   public static boolean isDouble(String str) {
    try { 
        Double.parseDouble(str); 
    } catch(NumberFormatException e) { 
        return false; 
    }
    return true;
   }
   
}