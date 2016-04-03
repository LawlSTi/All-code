/**
This is a child class of the parent class Pet.
Class Invariant: Each object has a name, weight, age and type.
Negative age's and weight's will throw an error and terminate.
*/

public class Dog extends Pet
{
   //Instanced variables//
   private String animal;
   private double dosage = 0;
   
   //Constructor for Dog. Accepts type of animal. Super'd to//
   //Pet constructor//
   public Dog (String initialName, int initialAge,
                        double initialWeight, String pAnimal) 
   {
      super(initialName, initialAge, initialWeight);
      animal = pAnimal;
   }
   //No arg constructor for Dog. No input accepted//
   public Dog ( ) {
      super();
      animal = "Null";   
   }
   
   //Overiding toString to include type of animal//
   public String toString ( ) {
      String result = super.toString();
      result += "\nType: " + animal;
      return result;
   }
   
   //Methods for calculating correct amount of medication dosage//
   //Dosage output in mL format for both methods//
   public double acepromazine( ) {
      dosage = (getWeight() / 2.2) * (.03 / 10);
      return dosage;
    }
    
    public double carprofen ( ) {
      dosage = (getWeight() / 2.2) * (.5 / 12);
      return dosage;
    }
    
}

