class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        // Define boundaries
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1; // Start filling from 1

        while (top <= bottom && left <= right) {
            // Fill the top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++; // Move down the top boundary

            // Fill the right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--; // Move left the right boundary

            // Fill the bottom row (if still within bounds)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--; // Move up the bottom boundary
            }

            // Fill the left column (if still within bounds)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++; // Move right the left boundary
            }
        }
        return matrix;
    }
    
}
