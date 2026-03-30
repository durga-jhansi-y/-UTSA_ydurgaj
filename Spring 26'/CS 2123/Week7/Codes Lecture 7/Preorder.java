import java.util.*;

import java.util.ArrayList;
import java.util.List;

class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) 
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Preorder 
{

    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }
    private void preorderHelper(TreeNode node, List<Integer> result) 
    {
        if (node == null) 
        {
            return; // Base case: if the node is null, do nothing
        }

        result.add(node.val); // Visit the root
        preorderHelper(node.left, result); // Traverse the left subtree
        preorderHelper(node.right, result); // Traverse the right subtree
    }

    public static void main(String[] args) 
    {
        // Example Usage:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Preorder traversal = new Preorder();
        List<Integer> preorderResult = traversal.preorderTraversal(root);
        System.out.println("Preorder Traversal: " + preorderResult); // Expected: [1, 2, 4, 5, 3]
    }
}