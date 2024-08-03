class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightsideview(root,result,1);
        return result;
    }

    public void rightsideview(TreeNode root , List<Integer> result,int level)
    {
      if(root == null)
      {
        return;
      }

      if(result.size() < level)
      {
           result.add(root.val);
      }
     
      rightsideview(root.right,result,level + 1);
      rightsideview(root.left,result,level + 1);
    }
}