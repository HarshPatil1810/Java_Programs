class Solution {
    public int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;  // Use this to avoid potential overflow with (s+e)/2

            if (nums[mid] == target) {
                return mid;  // Target found
            }

            // Check if the left half is sorted
            if (nums[s] <= nums[mid]) {
                // Check if the target lies within the sorted left half
                if (nums[s] <= target && target < nums[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            // Otherwise, the right half must be sorted
            else {
                // Check if the target lies within the sorted right half
                if (nums[mid] < target && target <= nums[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        // Target is not found
        return -1;
    }
}
