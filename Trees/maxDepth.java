
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class maxDepth {
     public int maxDep(TreeNode root) {
    if (root == null) {
            return 0; // An empty tree has a depth of 0.
        }

        int leftDepth = maxDep(root.left);
        int rightDepth = maxDep(root.right);

        // The depth of the tree rooted at the current node is the maximum of
        // the depths of its left and right subtrees, plus 1 for the current node.
        return Math.max(leftDepth, rightDepth) + 1;
}
}