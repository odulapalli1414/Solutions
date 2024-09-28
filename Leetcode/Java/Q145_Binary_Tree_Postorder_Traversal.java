import java.util.*;

// Definition for a binary tree node (assuming it's provided somewhere else in your code)
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    // List to store the result of postorder traversal
    List<Integer> list = new ArrayList<>();

    // Method to perform postorder traversal on the binary tree
    public List<Integer> postorderTraversal(TreeNode root) {
        // Base case: if the root is null, return an empty list
        if (root == null) {
            return new ArrayList<>();
        }

        // Recursive call to traverse the left subtree
        postorderTraversal(root.left);

        // Recursive call to traverse the right subtree
        postorderTraversal(root.right);

        // Add the current node's value to the list (postorder: left, right, root)
        list.add(root.val);

        // Return the list containing the postorder traversal result
        return list;
    }
}
