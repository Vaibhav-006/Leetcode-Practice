class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;
        k%=total; 
        int[][] temp=new int[m][n];
        
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++) {
                int newIndex=(i*n+j+k)%total;
                int newRow=newIndex/n;
                int newCol=newIndex%n;
                
                temp[newRow][newCol]=grid[i][j];
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        for (int[] row : temp){
            List<Integer> listRow=new ArrayList<>();
            for (int val : row) {
                listRow.add(val);
            }
            res.add(listRow);
        }     
        return res;
    }
}
