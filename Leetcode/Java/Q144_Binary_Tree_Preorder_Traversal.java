import java.util.*;

// Definition for a binary tree node
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
    // List to store the result of the preorder traversal
    List<Integer> list = new ArrayList<>();
    
    // Method to perform preorder traversal of a binary tree
    public List<Integer> preorderTraversal(TreeNode root) {
        // Base case: if the current node is null, return an empty list
        if (root == null) {
            return new ArrayList<>();
        }        

        // Add the value of the current node (root) to the list
        list.add(root.val);
        
        // Recursively traverse the left subtree
        preorderTraversal(root.left);
        
        // Recursively traverse the right subtree
        preorderTraversal(root.right);
        
        // Return the list containing the preorder traversal
        return list;
    }
}
