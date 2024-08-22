class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // Create lists to store leaf nodes of both trees
        ArrayList<Integer> tree1 = new ArrayList<>();
        ArrayList<Integer> tree2 = new ArrayList<>();

        // Collect leaf nodes from both trees
        leafNodes(root1, tree1);
        leafNodes(root2, tree2);

        // Compare the leaf node sequences from both trees
        return tree1.equals(tree2);
    }

    // Helper function to collect leaf nodes from a tree
    public static void leafNodes(TreeNode root, ArrayList<Integer> arr) {
        // If the current node is null, return (base case for recursion)
        if (root == null) {
            return;
        }

        // If the current node is a leaf node (no left and right children)
        if (root.left == null && root.right == null) {
            arr.add(root.val); // Add the leaf node's value to the list
        }

        // Recursively collect leaf nodes from the left and right subtrees
        leafNodes(root.left, arr);
        leafNodes(root.right, arr);
    }
}
