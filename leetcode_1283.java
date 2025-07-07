class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int low=1;
        int high=max;
        while(low < high){
            int mid= (low+high)/2;
            if(sumBYd(nums,mid) <= threshold){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;

    }

    private int sumBYd(int[] nums,int mid){
        int sum=0,n=nums.length;
       for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)(nums[i] / (double)(mid)));

        }
        return sum;
    }
}
