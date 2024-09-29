//0=blue,1=red,2=green,without sort technique
class Solution {
    public void sortColors(int[] nums) {
        int num1=0,num2=0,num0=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==0){
                num0++;
            }
            else if(nums[i]==1){
                num1++;
            }
            else{
                num2++;
            }

        }
        int index = 0;
        
        // Fill with 0s
        for (int i = 0; i < num0; i++) {
            nums[index++] = 0;
        }
        
        // Fill with 1s
        for (int i = 0; i < num1; i++) {
            nums[index++] = 1;
        }
        
        // Fill with 2s
        for (int i = 0; i < num2; i++) {
            nums[index++] = 2;
        }
        
    }
}
