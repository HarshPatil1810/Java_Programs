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
class Solution {
    int minDiff = Integer.MAX_VALUE;

    void inorder(TreeNode root, TreeNode[] prev) {
        if (root == null)
            return;

        inorder(root.left, prev);

        if (prev[0] != null) {
            minDiff = Math.min(minDiff, root.val - prev[0].val);
        }

        prev[0] = root;
        inorder(root.right, prev);
    }

    public int getMinimumDifference(TreeNode root) {
        TreeNode[] prev = new TreeNode[1];
        inorder(root, prev);
        return minDiff;
    }
}
