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
        boolean isBst=true;
        inorder(root,inOrderList);
        int prev=inOrderList.get(0);

        for(int i=1;i<inOrderList.size();i++){
            if(inOrderList.get(i) <= prev) isBst=false;

            prev=inOrderList.get(i);
        }
        

        return isBst;

    }
    public void inorder(TreeNode node,List<Integer> list){
        if(node==null) return;
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }

}
