class Solution {
    public int numEnclaves(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        boolean[][] flag= new boolean[m][n];
        for(int i=0; i<n; i++){
            if(grid[0][i]==1 && !flag[0][i]){
                dfs(0, i, grid, flag);
            }
        }
        for(int i=0; i<m; i++){
            if(grid[i][n-1]==1 && !flag[i][n-1]){
                dfs(i, n-1, grid, flag);
            }
        }
        for(int i=0; i<n; i++){
            if(grid[m-1][i]==1 && !flag[m-1][i]){
                dfs(m-1, i, grid, flag);
            }
        }
        for(int i=0; i<m; i++){
            if(grid[i][0]==1 && !flag[i][0]){
                dfs(i, 0, grid, flag);
            }
        }
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1 && !flag[i][j]){
                    count++;
                }
            }
        }
        return count;
        
    }

    public void dfs(int r, int c, int[][] grid, boolean[][] flag){
        flag[r][c]=true;
        int m= grid.length;
        int n= grid[0].length;
        int[] dRow= {-1, 1, 0, 0};
        int[] dCol= {0, 0, -1, 1};
        for(int i=0; i<4; i++){
            int row= r+dRow[i];
            int col= c+dCol[i];
            if(row>=0 && row<m && col>=0 && col<n && grid[row][col]==1 && !flag[row][col]){
                dfs(row, col, grid, flag);
            }
        }
    }
}