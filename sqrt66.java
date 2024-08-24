class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;  // Handling edge case where x is 0

        long start = 1;
        long end = x;
        long ans = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                ans = mid;  // mid might be the potential answer
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) ans;
    }
}
