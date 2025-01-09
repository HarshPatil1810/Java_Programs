class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    c++;
                    check(grid,i,j);
                }
            }
        }
        return c;
    }
    public static void check(char arr[][],int row,int col){
if( row < 0 || col < 0 || row >= arr.length || col >= arr[0].length || arr[row][col] == '0') {
			return;
		}
        arr[row][col] = '0';
		check(arr, row + 1, col);
		check(arr,row, col + 1);
		check(arr, row - 1, col);
		check(arr, row, col -1);
    }
}
