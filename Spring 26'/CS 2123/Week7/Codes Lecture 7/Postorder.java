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

public class Postorder 
{

    public void postorderTraversal(TreeNode root) 
    {
        if (root == null) 
        {
            return;
        }

        postorderTraversal(root.left);  // Traverse left subtree
        postorderTraversal(root.right); // Traverse right subtree
        System.out.print(root.val + " "); // Visit the root node
    }

    public static void main(String[] args) 
    {
        // Example usage:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Postorder traversal = new Postorder();
        System.out.print("Postorder Traversal: ");
        traversal.postorderTraversal(root); // Expected: 4 5 2 3 1
    }
}