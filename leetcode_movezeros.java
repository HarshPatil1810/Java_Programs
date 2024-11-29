class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int nonZeroindex=0;

        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[nonZeroindex]=nums[i];
                nonZeroindex++;
            }
        }
        for(int k=nonZeroindex;k<n;k++){
            nums[k]=0;
        }
    }
}
