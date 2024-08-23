class Solution {
    // Method to search for a node with a specific value in a Binary Search Tree (BST)
    public TreeNode searchBST(TreeNode root, int val) {
        // Base case: if the current node is null or the node's value equals the target value, return the current node
        if (root == null || root.val == val) {
            return root;
        }

        // If the target value is greater than the current node's value, search in the right subtree
        // Otherwise, search in the left subtree
        return root.val < val ? searchBST(root.right, val) : searchBST(root.left, val);
    }
}
