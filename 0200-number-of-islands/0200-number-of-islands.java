class Solution {

    public void bsf(char[][] grid, int[][] flag, int r, int c){
        flag[r][c]=1;
        int m= grid.length;
        int n= grid[0].length;
        Queue<Integer> q= new LinkedList<>();
        q.add(r);
        q.add(c);
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};
        while(!q.isEmpty()){
            int row= q.poll();
            int col= q.poll();
            
        for(int i=0; i<4; i++){
            int nrow= row+dRow[i];
            int ncol= col+dCol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && flag[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                flag[nrow][ncol]=1;
                q.add(nrow);
                q.add(ncol);
            }
        }
        }
    }
    public int numIslands(char[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int flag[][]= new int[m][n];
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(flag[i][j]==0 && grid[i][j]=='1'){
                    count++;
                    bsf(grid, flag, i, j);
                }
            }
        }
        return count;
    }
}