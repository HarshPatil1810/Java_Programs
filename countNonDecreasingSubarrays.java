class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        // Iterate over all possible subarray start points
        for (int start = 0; start < n; start++) {
            int operations = 0; // Reset operations for each subarray
            int prev = nums[start]; // Track the previous element in the subarray

            // Iterate over the subarray end points
            for (int end = start; end < n; end++) {
                if (nums[end] < prev) {
                    // Calculate operations needed to make nums[end] >= prev
                    operations += (prev - nums[end]);
                }
                prev = Math.max(prev, nums[end]); // Update prev for next comparison

                // If operations exceed k, stop checking further
                if (operations > k) break;

                // Count this subarray as valid
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {6, 3, 1, 2, 4, 4};
        int k = 7;
        System.out.println("Count of non-decreasing subarrays: " + sol.countNonDecreasingSubarrays(nums, k));
    }
}
