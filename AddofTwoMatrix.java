class arraymatrix{
    public static void main(String args[]){
    int[][] matrixA = {
        {1, 2, 3},
        {4, 5, 6}
    };
    
    int[][] matrixB = {
        {7, 8, 9},
        {10, 11, 12}
    };

    int rows = matrixA.length;
    int cols = matrixA[0].length;
    int[][] result = new int[rows][cols];

    for(int i=0;i< rows;i++){
        for(int j=0;j<cols;j++){
            result[i][j]=matrixA[i][j]+matrixB[i][j];
        }
    }
    for (int[] row : result) {
        for (int element : row) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
}
