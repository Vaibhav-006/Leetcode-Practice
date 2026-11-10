class Solution {
    public int minPathSum(int[][] grid) {
        int n= grid.length;
        int m= grid[0].length;
        int[][] dp= new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                dp[i][j]=-1;
            }
        }
        return sum(grid, dp, n-1, m-1);
    }

    public int sum(int[][] grid, int[][] dp, int i, int j){
        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j<0) return 100000;
        if(dp[i][j]!=-1) return dp[i][j];
        int up= grid[i][j]+ sum(grid, dp, i-1, j);
        int left= grid[i][j]+ sum(grid, dp, i, j-1);
        return dp[i][j]= Math.min(up,left);
    }
}