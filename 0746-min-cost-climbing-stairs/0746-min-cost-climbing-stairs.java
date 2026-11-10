class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        int[] dp= new int[n];
        Arrays.fill(dp, -1);
        return Math.min(minimize(cost, dp, n-1), minimize(cost, dp, n-2));
    }

    public int minimize(int[] cost, int[] dp, int idx){
        if(idx<0) return 0;
        if(idx==0 || idx==1) return cost[idx];
        if(dp[idx]!=-1) return dp[idx];
        int pick1= cost[idx]+ minimize(cost, dp, idx-1);
        int pick2= cost[idx]+ minimize(cost, dp, idx-2);
        return dp[idx]=Math.min(pick1, pick2);
    }
}