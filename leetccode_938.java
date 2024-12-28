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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        int totalSum=0;

        if(root.val > low)
             totalSum += rangeSumBST(root.left, low, high);

        if(root.val>=low && root.val <= high)
             totalSum += root.val;

         if(root.val < high)
            totalSum += rangeSumBST(root.right, low, high);

        return totalSum;
    }
}
