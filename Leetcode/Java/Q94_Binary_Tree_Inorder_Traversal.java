import java.util.*;

class Solution {
    // List to store the result of the inorder traversal
    List<Integer> list = new ArrayList<>();

    /**
     * Function to perform inorder traversal of a binary tree.
     * Inorder traversal visits the nodes in the following order:
     * 1. Left subtree
     * 2. Root node
     * 3. Right subtree
     *
     * @param root: The root of the binary tree.
     * @return list: List containing the inorder traversal of the tree.
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // If the root is null, return an empty list
        if (root == null) {
            return new ArrayList<>();
        }        

        // Traverse the left subtree
        inorderTraversal(root.left);

        // Visit the root node (add its value to the list)
        list.add(root.val);

        // Traverse the right subtree
        inorderTraversal(root.right);
        
        // Return the result list containing inorder traversal
        return list;
    }
}
