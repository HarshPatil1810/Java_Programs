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
    public boolean isValidBST(TreeNode root) {
        List<Integer> inOrderList=new LinkedList<>();
        inordereval(root,inOrderList);
        boolean isbst=true;
        int prev=inOrderList.get(0);

        for(int i=1;i<inOrderList.size();i++){
            if(inOrderList.get(i)<= prev){
                isbst=false;
            }
            prev=inOrderList.get(i);
        }
        return isbst;
    }
    public void inordereval(TreeNode node,List<Integer> inList){
        if(node==null) return;

        inordereval(node.left,inList);
        inList.add(node.val);
        inordereval(node.right,inList);
    }
}
