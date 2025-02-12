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
    private int preIndex=0;
    HashMap<Integer,Integer> inordermap=new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            inordermap.put(inorder[i],i);
        }
       return helper(preorder,0,preorder.length-1);
    }

    private TreeNode helper(int[] preorder,int sindex,int eindex){
        if(sindex>eindex) return null;

        int fnode=preorder[preIndex++];
        TreeNode root=new TreeNode(fnode);

        int index=inordermap.get(fnode);

        root.left=helper(preorder,sindex,index-1);
        root.right=helper(preorder,index+1,eindex);

        return root;

        
    }
}
