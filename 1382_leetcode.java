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
     List<Integer> sorted =new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
       
        inorderTraversal(root, sorted);
        return buildBalancedTree(sorted, 0, sorted.size() - 1);
    }

    private void inorderTraversal(TreeNode node, List<Integer> list) {
        if(node==null) return;
        inorderTraversal(node.left,sorted);
        sorted.add(node.val);
        inorderTraversal(node.right,sorted);
    }
    private TreeNode buildBalancedTree(List<Integer> list, int start, int end) {
        if (start > end) return null;
        
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(sorted.get(mid));
        
        // Recursively construct left and right subtrees
        root.left = buildBalancedTree(sorted, start, mid - 1);
        root.right = buildBalancedTree(sorted, mid + 1, end);
        
        return root;
    }
}
