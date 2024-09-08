public int singleNumber(int[] nums) {
    // Sort the array
    Arrays.sort(nums);
    
    // Iterate through the sorted array
    for (int i = 0; i < nums.length - 1; i += 3) {
        // Check if the current element is different from the next one
        if (i + 1 >= nums.length || nums[i] != nums[i + 1]) {
            return nums[i];
        }
    }
    
    // If the single number is the last element
    return nums[nums.length - 1];
}
