class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;

        // Count 0s, 1s, and 2s
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                c0++;
            } else if (nums[i] == 1) {
                c1++;
            } else {
                c2++;
            }
        }

        int count = 0;

        // Fill 0s
        for (int k = 0; k < c0; k++) {
            nums[count++] = 0;
        }

        // Fill 1s
        for (int k = 0; k < c1; k++) {
            nums[count++] = 1;
        }

        // Fill 2s
        for (int k = 0; k < c2; k++) {
            nums[count++] = 2;
        }
    }
}
