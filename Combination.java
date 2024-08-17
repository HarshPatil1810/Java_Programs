class Solution {
    public void help(int i,int n,int k,List<Integer>subset,List<List<Integer>> ans){
            if(k==0){
                ans.add(new ArrayList(subset));
                return;
            }
            if(k>n-i+1) 
            return;
            if(i>n)
            return;
            subset.add(i);

            help(i+1,n,k-1,subset,ans);
            subset.remove(subset.size()-1);
            help(i+1,n,k,subset,ans);
        }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        help(1,n,k,subset,ans);
        return ans;
    }
}
