/**
CalcInterface class used as tester class
to retrieve user input and pass to Calculator
and MathLibrary classes for calculations. Value
is stored in MathLibrary variable result and
returned to this class for printout.
*/
package Project2;
import java.util.*;
public class CalcInterface
{
   public static void main(String[] args)
   {
      //Variable and object declaration//
      MathLibrary result = new Calculator(); 
      Calculator calc = new Calculator();
      Scanner kb = new Scanner(System.in); 
      boolean param = true;
      boolean param2 = true;
      String operator = null;
      String input = null;
      String[] value = null;  //array to store string tokens
      String decision = null;
      
      //While loop for getting user input in proper format and//
      //either breaking out of loop should the user input an//
      //operator for the second value, or exiting the loop once//
      //a third value is input. This loop will throw exceptions//
      //for invalid input and catches those exceptions//
      while (param) { //Main while loop, loops until users eneters N or n to terminate program
         System.out.println("Enter two doubles and an operator, using a space between each, to be used in calculations.");
         System.out.println("The only acceptable formats are 'double double operator' or 'double operator'.");
         System.out.println("All other formats will throw an exception! Integers entered will be made doubles.");
         System.out.print  ("The ONLY acceptable operators are +, -, *, /, and ^.\n\nPlease enter input: ");
         input = kb.nextLine();
         value = input.split("\\s"); //tokenizes string
         while(param2) {
            try {
               if (!calc.isDouble(value[0])) {  //checks if value[0] can be parsed to Double
                  throw new MalformedInputException();
               }
               else {
                  calc.setNum1(Double.parseDouble(value[0]));  //parses string to double. Sets to num1.
               } //end if//  
                            
               if (!calc.isDouble(value[1]))  {   //checks if value[1] can be parsed to double first
                 if (!value[1].equals("+"))       //checks if value[1] is equal to any of these operators
                   if (!value[1].equals("-"))
                     if (!value[1].equals("*"))
                       if (!value[1].equals("/"))
                         if (!value[1].equals("^")) {
                           throw new InvalidOperatorException(); //InvalidOperatorException thrown if user enter
                         }                                       //anything other than an accepted operator
                         else {
                           operator = value[1];   //sets value[1] to string operator of its RESPECTIVE if statement
                           break;                 //if value[1] is an operator, then break to outer loop
                         }                        //so a third value cannot be established
                       else {
                         operator = value[1];
                         break;
                       }
                     else {
                       operator = value[1];
                       break;
                     }
                   else {
                     operator = value[1];
                     break;
                   }
                 else {
                   operator = value[1];
                   break;
                 }
               }
               else {
                  calc.setNum2(Double.parseDouble(value[1]));  //parses string to double. Sets to num2.
               } //end nested if//
               
               if (!value[2].equals("+"))  //checks if value[2] is equal to any of these operators
                   if (!value[2].equals("-"))
                     if (!value[2].equals("*"))
                       if (!value[2].equals("/"))
                         if (!value[2].equals("^")) {
                           throw new InvalidOperatorException(); //InvalidOperatorException thrown if user enters
                         }                                       //anything other than an accepted operator
                         else {                    //sets value[2] to string operator of its respective if statement
                           operator = value[2];    //bresks to outter loop so no other input is excepted.
                           break;
                         }
                       else {
                         operator = value[2];
                         break;
                       }
                     else {
                       operator = value[2];
                       break;
                     }
                   else {
                     operator = value[2];
                     break;
                   }
                 else {
                   operator = value[2];
                   break;
                 } //end nested if//                              
            }
            catch (MalformedInputException e) {
               e.printStackTrace();
               break;
            }
            catch (InvalidOperatorException e) {
               e.printStackTrace();
               break;
            }
            catch (Exception e) {
               e.printStackTrace();
               break;
            }
         } //end nested while(param2)//
        
         //Calc object is passed through methods in Calculator class for calculations//
         //Result object of MathLibrary is used to store value or completed operation//
         //Result is printed to screen//
         if(calc.isDouble(value[1])) {
            if(operator.equals("+"))
               result.setResult(calc.add(calc.getNum1(), calc.getNum2()));
            if(operator.equals("-"))
               result.setResult(calc.subtract(calc.getNum1(), calc.getNum2()));
            if(operator.equals("*"))
               result.setResult(calc.multiply(calc.getNum1(), calc.getNum2()));
            if(operator.equals("/"))
               result.setResult(calc.divide(calc.getNum1(), calc.getNum2()));
            if(operator.equals("^"))
               result.setResult(calc.power(calc.getNum1(), calc.getNum2()));
         }
         try {
            if(!calc.isDouble(value[1]))
               if(!value[1].equals("+"))           //if value[1] is an operator, result is the value of  
                  if(!value[1].equals("-"))        //input and result and whatever the operation requested
                     if(!value[1].equals("*"))
                        if(!value[1].equals("/"))
                           if(!value[1].equals("^"))
                              throw new MalformedInputException(); //MalformedInputException thrown after of InvalidOperatorException from above
                           else {
                              result.setResult(calc.power(calc.getNum1(), calc.getResult()));
                           }
                        else {
                           result.setResult(calc.divide(calc.getNum1(), calc.getResult()));
                        }
                     else {
                        result.setResult(calc.multiply(calc.getNum1(), calc.getResult()));
                     }
                  else {
                     result.setResult(calc.subtract(calc.getNum1(), calc.getResult()));
                  }
               else {
                  result.setResult(calc.add(calc.getNum1(), calc.getResult()));
               }
         }   
         catch (MalformedInputException e) {
            e.printStackTrace();
         }
         catch (Exception e) {
            e.printStackTrace();
         }
      
         while (param2) {     //Nested while loop for checking if user wants to calculate something else
               System.out.println("Your result is: " + result.getResult() + "\n"); //Value of Result printed to screen
               System.out.print("Would you like to make another calculation? [Y or N]: ");
               try {
                  decision = kb.nextLine();
                  if (decision.equalsIgnoreCase("Y"))
                     break;
                  else if (decision.equalsIgnoreCase("N"))
                     System.exit(0);
                  else
                     throw new InputMismatchException();
               }
               catch (InputMismatchException e) {
                  e.printStackTrace();
               }
               catch (Exception e) {
                  e.printStackTrace();
               }
         } //end nested while(param2)
          
      } //end while(param)
   }
}
