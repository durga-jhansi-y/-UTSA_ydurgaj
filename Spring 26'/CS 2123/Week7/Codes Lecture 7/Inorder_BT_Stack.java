import java.util.*;
//In-order Binery Tree Traversal using Stack 
public class Node 
{
   int data;
   Node left, right;

   Node(int item) 
   {
      data = item;
      left = right = null;
   }
   
   void inorderIterative(Node root)
   {
      Stack<Node> stack = new Stack<>();
      Node current = root;
      while (current != null || !stack.isEmpty()) 
      {
         while (current != null) 
         {
            stack.push(current);
            current = current.left;
         }
         current = stack.pop();
         System.out.print(current.data + " ");
         current = current.right;
      }
   }

   public static void main(String[] args) 
   {
      Node root = new Node(3);
      root.left = new Node(5);
      root.right = new Node(6);
      root.left.left = new Node(8);
      root.left.right = new Node(9);
      
      System.out.println("In-order BT(Stack Based):");
      root.inorderIterative(root);
   }
}