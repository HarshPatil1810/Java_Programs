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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averageOfLevels = new ArrayList<>();

        Queue<TreeNode> treeQueue = new LinkedList<>();
        treeQueue.add(root);

        while (!treeQueue.isEmpty()) {
            int levelSize = treeQueue.size();
            double levelSum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = treeQueue.poll();
                levelSum += node.val;

                if (node.left != null) treeQueue.add(node.left);
                if (node.right != null) treeQueue.add(node.right);
            }
            
          

                 double averageForLevel = levelSum / levelSize;

            averageOfLevels.add(averageForLevel);
        
        }

        return averageOfLevels;
    }
}