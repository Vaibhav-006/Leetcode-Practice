class Solution {
    public int cherryPickup(int[][] grid) {
        int n= grid.length;
        int m= grid[0].length;
        int[][][] dp= new int[n][m][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        return helper(grid, dp, 0, 0, m-1, n, m);
    }

    public int helper(int[][] grid, int[][][] dp, int steps, int c1, int c2, int n, int m){

        if(c1<0 || c2<0 || c1>=m || c2>=m) return Integer.MIN_VALUE;
        if(steps==n-1){
            if(c1==c2) return grid[steps][c1];
            else return grid[steps][c1]+grid[steps][c2];
        }
        if(dp[steps][c1][c2]!=-1) return dp[steps][c1][c2];
        int max=Integer.MIN_VALUE;
        for(int i=-1; i<=1; i++){
            for(int j=-1; j<=1; j++){
                int val=0;
                if(c1==c2) val= grid[steps][c2];
                else val= grid[steps][c1]+grid[steps][c2];
                val+= helper(grid, dp, steps+1, c1+i, c2+j, n, m);
                max= Math.max(max, val);
            }
        }

        return dp[steps][c1][c2]= max;
    }
}