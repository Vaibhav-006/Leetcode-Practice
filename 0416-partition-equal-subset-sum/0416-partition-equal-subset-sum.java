class Solution {
    public boolean canPartition(int[] nums) {
        int n= nums.length;
        int sum=0;
        for(int num : nums){
            sum+= num;
        }
        if(sum%2!=0) return false;
        int target= sum/2;
        int[][] dp= new int[n][target+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<=target; j++){
                dp[i][j]=-1;
            }
        }
        return helper(nums, dp, target, n-1);
        
    }

    public boolean helper(int[] nums, int[][] dp, int target, int idx){
        if(target==0) return true;
        if(idx==0) return nums[0]==target;
        if(dp[idx][target]!=-1) return dp[idx][target]==1;
        boolean pick= false;
        if(target>=nums[idx]) pick= helper(nums, dp, target-nums[idx], idx-1);
        boolean nPick= helper(nums, dp, target, idx-1);
        dp[idx][target] = (pick || nPick) ? 1 : 0;
        return pick || nPick;
    }
}