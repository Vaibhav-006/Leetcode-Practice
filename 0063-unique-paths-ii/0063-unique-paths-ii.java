class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m= obstacleGrid.length;
        int n= obstacleGrid[0].length;
        int[][] dp= new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(obstacleGrid[i][j]==1) dp[i][j]=0;
                else dp[i][j]=-1;
            }
        }
        return count(dp, m-1, n-1);
    }

    public int count(int[][] dp, int i, int j){        
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(i==0 && j==0) return 1;
        int left= count(dp, i, j-1);
        int up= count(dp, i-1, j);
        return dp[i][j]= left+up;
    }
}