class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m= heights.length;
        int n= heights[0].length;
        int[][] arr= new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]= Integer.MAX_VALUE;
            }
        }
        arr[0][0]=0;
        PriorityQueue<int[]> pq= new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.add(new int[]{0, 0, 0});
        int[] dRow= {-1, 1, 0, 0};
        int[] dCol= {0, 0, -1, 1};
        while(!pq.isEmpty()){
            int[] curr= pq.poll();
            int diff= curr[0];
            int r= curr[1];
            int c= curr[2];
            if(r==m-1 && c==n-1) return diff;
            for(int i=0; i<4; i++){
                int nRow= r+dRow[i];
                int nCol= c+dCol[i];
                if(nRow>=0 && nCol>=0 && nRow<m && nCol<n){
                    int effort= Math.max(Math.abs(heights[r][c]-heights[nRow][nCol]), diff);
                    if(effort<arr[nRow][nCol]){
                        arr[nRow][nCol]=effort;
                        pq.add(new int[]{effort, nRow, nCol});
                    }
                }
            }
        }
        return arr[m-1][n-1];
    }
}