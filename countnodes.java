class Solution {
    private int count=0;
    public int countNodes(TreeNode root) {
        
       traversal(root);
       return count;
    }
    public void traversal(TreeNode root){
        if(root == null) return;
        else{
            count+=1;

            traversal(root.left);
            traversal(root.right);
        }
    }
}