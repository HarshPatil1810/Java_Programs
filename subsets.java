import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        // Generate all subsets (2^n possibilities)
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subset = new ArrayList<>();
            
            // Check each bit of i to see which elements to include in the subset
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // If the j-th bit is set, include nums[j]
                    subset.add(nums[j]);
                }
            }
            
            // Add the generated subset to the answer
            ans.add(subset);
        }
        
        return ans;
    }
}
