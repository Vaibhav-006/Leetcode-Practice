class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int r= grid.length;
        int c= grid[0].length;
        if(grid[0][0]!=0 || grid[r-1][c-1]!=0) return -1;
        int[][] dist= new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                dist[i][j]= Integer.MAX_VALUE;
            }
        }
        dist[0][0]=1;

        int[] dRow= {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dCol= {0, 0, -1, 1, -1, 1, -1, 1};
        Queue<Integer> q= new LinkedList<>();
        q.add(0);
        q.add(0);
        while(!q.isEmpty()){
            int row=q.poll();
            int col=q.poll();
            if(row==r-1 && col==c-1) break;
            for(int i=0; i<8; i++){
                int nRow= row+dRow[i];
                int nCol= col+dCol[i];
                if(nRow>=0 && nRow<r && nCol>=0 && nCol<c && grid[nRow][nCol]==0){
                    if(dist[row][col]+1<dist[nRow][nCol]){
                        dist[nRow][nCol]=dist[row][col]+1;
                        q.add(nRow);
                        q.add(nCol);
                    }
                    
                }
            }

        }
        if(dist[r-1][c-1]!=Integer.MAX_VALUE) return dist[r-1][c-1];
        return -1;
        
    }
}