/**
 *@see BSTInferface.java for interace implemented
 *in this class. This class implenets methods called
 *in BSTInterface. 
 */
import java.util.*;
public class NodeMethods implements BSTInterface
{
   Node root = null;
   /**
    *Adds nodes by means of leftChild being less than or
    *greater than it's parent node. Only two children per
    *parent node.
    */
   public void add(int val) {
      Node newNode = new Node(val);
      if (root == null) {
         root = newNode;
      }
      else {
         Node focusNode = root;
         Node parent = null;
         while (true) {
            parent = focusNode;
            if (val < focusNode.value) {
               focusNode = focusNode.leftChild;
               if (focusNode == null) {
                  parent.leftChild = newNode;
                  return;
               }
            }
            else {
               focusNode = focusNode.rightChild;
               if (focusNode == null) {
                  parent.rightChild = newNode;
                  return;
               }
            }
         }
      }
   }
   /**
    *Failed findNodeLocation() attempt. Unable to implement.
    */
   public Node findNodeLocation(Node focusNode, int val) {
      if (focusNode == null) {
         return focusNode;
      }
      if (val < focusNode.value) {
         focusNode = findNodeLocation(focusNode.leftChild, val);
      } 
      
      return null;
   }
   /**
    *Traverses node in ascending order from the left mode node
    *to the right most node. Verifies each node in between before
    *moving to next parent.
    */
   public void inOrderTraversal(Node focusNode) {
      //recursive
      if (focusNode != null) {
         inOrderTraversal(focusNode.leftChild);
         System.out.println(focusNode.value + " "); //prints nodes in ascending order to screen
         inOrderTraversal(focusNode.rightChild);         
      }
      //base
      else { /*do nothing*/ }
   }
}