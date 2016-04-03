/**
Tester class for Pet.java and all subclasses.
Uses two objects, Dog and Cat, and accepts input
from user and prints out correct animal info and
dosage for medication.
*/

import java.util.Scanner;

public class PetTester
{
   public static void main (String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      System.out.print ("Is this for a Dog or a Cat?: ");
      String tAnimal = kb.nextLine();
      
      //Dog input. Expected output: information put in by user//
      //plus the dosage for medication//
      if (tAnimal.equals("Dog")) { 
         System.out.print ("Please enter your dog's name: ");
         String pName = kb.nextLine();
         System.out.print ("Please enter your dog's age: ");
         int pAge = kb.nextInt();
         System.out.print ("Please enter your dog's weight: ");
         double pWeight = kb.nextDouble();
         Dog dog1 = new Dog(pName, pAge, pWeight, tAnimal); //Dog arg constructor
         System.out.println (dog1);
         System.out.print (dog1.getName() + "'s ");
         System.out.printf ("Acepromazine dosage is: %.3f", dog1.acepromazine());
         System.out.println (" ml.");
         System.out.print (dog1.getName() + "'s ");
         System.out.printf ("Carprofen dosage is : %.3f", dog1.carprofen());
         System.out.println (" ml.\n\n");
      }
      //Cat input. Expected output: information put in by user//
      //plus the dosage for medication//
      else if (tAnimal.equals("Cat")) {
         System.out.print ("Please enter your cat's name: ");
         String pName = kb.nextLine();
         System.out.print ("Please enter your cat's age: ");
         int pAge = kb.nextInt();
         System.out.print ("Please enter your cat's weight: ");
         double pWeight = kb.nextDouble();
         Cat cat1 = new Cat(pName, pAge, pWeight, tAnimal); //Cat arg constructor
         System.out.println (cat1);
         System.out.print (cat1.getName() + "'s ");
         System.out.printf ("Acepromazine dosage is: %.3f", cat1.acepromazine());
         System.out.println (" ml.");
         System.out.print (cat1.getName() + "'s ");
         System.out.printf ("Carprofen dosage is : %.3f", cat1.carprofen());
         System.out.println (" ml.\n\n");
      }
      //Else statement for invalid animal type input. 
      else
         System.out.println ("Error: Invalid animal type. Restart the program" +
                                 " and enter either Dog or Cat.");
   }
}