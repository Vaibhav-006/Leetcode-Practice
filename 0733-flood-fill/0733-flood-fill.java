class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        int ic=image[sr][sc];
        helper(image, sr, sc, color, ic);
        return image;
    }
    public void helper(int[][] image, int row, int col, int color, int ic){
        if(row>=0 && row<image.length && col>=0 && col<image[0].length && image[row][col]==ic){
            image[row][col]=color;
        }
        else{
            return;
        }
        helper(image, row-1, col, color, ic);
        helper(image, row+1, col, color, ic);
        helper(image, row, col-1, color, ic);
        helper(image, row, col+1, color, ic);
    }
}