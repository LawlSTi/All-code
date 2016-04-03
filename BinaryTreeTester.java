/**
 *Tester class for Binary Search Tree.
 *Takes user input in one line and uses
 *NodeMethods class to search and input
 *into tree. Automatically prints out
 *inOrderTraversal.
 */
import java.util.*;
public class BinaryTreeTester
{
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      Scanner kb2 = new Scanner(System.in);
      NodeMethods tree = new NodeMethods();
      String text = null;
     
         System.out.print("Enter a string of numbers to be added to the tree.\n");
         System.out.print("Enter any character afterwards to terminate your string: ");
         while (kb.hasNextInt()) {
            int temp = kb.nextInt();
            tree.add(temp);
            if (!kb.hasNextInt()) {
               break;
            }
         }
      tree.inOrderTraversal(tree.root);     
   }
}