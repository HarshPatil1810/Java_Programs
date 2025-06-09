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

   String preorderT(TreeNode node) {
        if (node == null) {
            return "X,";  // X represents null
        }

        // Use # to ensure unique node separation (e.g., "#12," won't match "#2,")
        StringBuilder sb = new StringBuilder();
        sb.append("#").append(node.val).append(",");
        sb.append(preorderT(node.left));
        sb.append(preorderT(node.right));

        return sb.toString();
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String fulltree=preorderT(root);
        String subtree=preorderT(subRoot);

        return (fulltree.contains(subtree));
    }
}
