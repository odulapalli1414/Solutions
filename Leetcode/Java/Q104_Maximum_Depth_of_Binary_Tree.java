class Solution {
    // Method to calculate the maximum depth of a binary tree
    public int maxDepth(TreeNode root) {
        // Base case: If the node is null, return 0 (no depth)
        if (root == null) {
            return 0;
        }

        // Recursively find the maximum depth of the left subtree
        int leftMax = maxDepth(root.left);
        // Recursively find the maximum depth of the right subtree
        int rightMax = maxDepth(root.right);

        // Return the larger of the two depths, plus 1 to account for the current node
        return Math.max(leftMax, rightMax) + 1;
    }
}
