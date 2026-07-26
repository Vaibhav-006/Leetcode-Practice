class Solution {
    public int orangesRotting(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        Queue<Integer> q= new LinkedList<>();
        int fresh=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==2){
                    q.add(i);
                    q.add(j);
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        int count=0;
        int dRow[]={-1, 1, 0, 0};
        int dCol[]= {0, 0, -1, 1};
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            count++;
            for(int i=0; i<size/2; i++){
            int row=q.poll();
            int col=q.poll();
            for(int j=0; j<4; j++){
                int nRow= row+dRow[j];
                int nCol= col+dCol[j];
                if(nRow>=0 && nRow<m && nCol>=0 && nCol<n && grid[nRow][nCol]==1){
                    grid[nRow][nCol]=2;
                    fresh--;
                    q.add(nRow);
                    q.add(nCol);
                }
            }
            }
        }
        return (fresh==0) ? count : -1;
    }
}