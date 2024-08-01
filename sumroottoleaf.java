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
    int sum=0;
    public void sumnum(TreeNode node, int num)
    {
        num=num*10+node.val;
        if(node.left==null && node.right==null)
        {
            sum=sum+num;
            return;
        }
        if(node.left!=null) sumnum(node.left,num);
         if(node.right!=null) sumnum(node.right,num);
    }
    public int sumNumbers(TreeNode root) {
        sumnum(root,0);
        return sum;

    }
}