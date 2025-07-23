class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalcolor=image[sr][sc];

        if(originalcolor == color) return image;
        dfs(image,sr,sc,originalcolor,color);
        return image;

    }

    private void dfs(int[][] image,int i,int j,int originalcolor , int color){
        if(i<0 || i>=image.length || j<0 || j>=image[0].length) return ;

        if(image[i][j] != originalcolor){
            return;
        }
        image[i][j] = color;

        dfs(image,i-1,j,originalcolor,color);
        dfs(image,i+1,j,originalcolor,color);
        dfs(image,i,j-1,originalcolor,color);
        dfs(image,i,j+1,originalcolor,color);


    }
}
