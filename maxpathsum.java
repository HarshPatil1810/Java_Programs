class Solution {
    public int maxPathSum(TreeNode root) {
        pathsum(root);
        return ans;
    }
    int ans=Integer.MIN_VALUE;
    public int pathsum(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=Math.max(0,pathsum(root.left));
        int right=Math.max(0,pathsum(root.right));
        ans=Math.max(ans,left+right+root.val);

        return Math.max(left,right)+root.val;
    }
}