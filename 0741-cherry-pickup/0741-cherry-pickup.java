class Solution {
    public int cherryPickup(int[][] grid) {
        int n= grid.length;
        int[][][] dp= new int[2*n-1][n][n];

        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<n; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        return Math.max(0, helper(grid, dp, 0, 0, 0, n));

    }

    public int helper(int[][] grid, int[][][] dp, int steps, int r1, int r2, int n){
        int c1= steps-r1;
        int c2= steps-r2;
        if(r1>=n || r2>=n || c1>=n || c2>=n || grid[r1][c1]==-1 || grid[r2][c2]==-1){   return Integer.MIN_VALUE;
        }
        if(steps==n*2-2) return grid[r1][c1];
        if(dp[steps][r1][r2]!=-1) return dp[steps][r1][r2];
        int cherries= grid[r1][c1];
        if(r1!=r2){
            cherries+= grid[r2][c2];
        }

        int a= helper(grid, dp, steps+1, r1+1, r2, n);
        int b= helper(grid, dp, steps+1, r1, r2+1, n);
        int c= helper(grid, dp, steps+1, r1+1, r2+1, n);
        int d= helper(grid, dp, steps+1, r1, r2, n);

        return dp[steps][r1][r2]= cherries+ Math.max(Math.max(a,b), Math.max(c,d));
        
    }

}