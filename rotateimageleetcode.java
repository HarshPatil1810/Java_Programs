class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix (swap matrix[i][j] with matrix[j][i])
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n / 2; l++) {
                int temp = matrix[k][l];
                matrix[k][l] = matrix[k][n - l - 1];
                matrix[k][n - l - 1] = temp;
            }
        }
    }
}
