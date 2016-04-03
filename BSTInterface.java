/**
@author: Vimal Kumar
@desc: The interface contains methods required to create a binary tree
*/
public interface BSTInterface
{
   //Creates a new Node and adds the new node at the appropriate position in the tree
   public void add(int val);
   //Given the root node and a value finds where a new node with the 
   //given value would be added in the tree
   public Node findNodeLocation(Node focusNode, int val);
   //Method for in order traversal of the tree, prints out node values in order
   public void inOrderTraversal(Node focusNode);
}