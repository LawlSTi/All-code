import java.util.Scanner;

public class PetTesterAuto
{
   public static void main (String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      //Dog and Cat argument constructors. Prints object infor to screen//
      //along with acepromazine and carprofen dosage//
      Dog dog1 = new Dog("Buddy", 10, 50, "Dog");
      Cat cat1 = new Cat("Fluffy", 6, 17, "Cat"); 
      System.out.println (dog1);
      System.out.println (dog1.getName() + "'s ");
      System.out.printf ("Acepromazine dosage is: %.3f", dog1.acepromazine());
      System.out.println (" ml.");
      System.out.println (dog1.getName() + "'s ");
      System.out.printf ("Carprofen dosage is : %.3f", dog1.carprofen());
      System.out.println (" ml.\n\n");
      System.out.println (cat1);
      System.out.println (cat1.getName() + "'s ");
      System.out.printf ("Acepromazine dosage is: %.3f", cat1.acepromazine());
      System.out.println (" ml.");
      System.out.println (cat1.getName() + "'s ");
      System.out.printf ("Carprofen dosage is : %.3f", cat1.carprofen());
      System.out.println (" ml.\n\n");
      
      //Dog and Cat no arg constructors. Prints placeholder value for//
      //each variable within object//
      Dog dog2 = new Dog();
      Cat cat2 = new Cat();
      System.out.println (dog2);
      System.out.println (cat2);
      
      
   }
}