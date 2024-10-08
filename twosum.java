class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> num=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            int complement=target-nums[i];
            if(num.containsKey(complement)){
                return new int[]{num.get(complement),i};
            }
            num.put(nums[i],i);
        }
        return new int[]{};
    }
}