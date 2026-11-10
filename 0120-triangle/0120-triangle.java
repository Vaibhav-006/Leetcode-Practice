class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n= triangle.size();
        int m= triangle.get(n-1).size();
        int min= Integer.MAX_VALUE;
        int[][] dp= new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                dp[i][j]=-1;
            }
        }
        for(int i=1; i<=n; i++){
            min= Math.min(min, sum(triangle, dp, n-1, n-i));
        }
        return min;
    }

    public int sum(List<List<Integer>> triangle, int[][] dp, int i, int j){
        if(dp[i][j]!=-1) return dp[i][j];
        if(i==0){
            return triangle.get(0).get(0);
        }
        int up= Integer.MAX_VALUE;
        int left= Integer.MAX_VALUE;
        if(j>0){
            left= Math.min(left, sum(triangle, dp, i-1, j-1));
        }
        if(j<i){
            up= Math.min(up, sum(triangle, dp, i-1, j));
        }
        return dp[i][j]=Math.min(up, left)+triangle.get(i).get(j);
    }
}