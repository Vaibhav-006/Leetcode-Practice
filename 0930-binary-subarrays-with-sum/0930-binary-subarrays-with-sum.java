class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int count1=0;
        int left=0;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            while(sum>goal) {
                sum -= nums[left++];
            }
            count1+=i-left+1;
        }
        if(goal-1<0){
            return count1;
        }
        sum=0;
        left=0;
        int count2=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            while(sum>goal-1) {
                sum-=nums[left++];
            }
            count2+=i-left+1;
        }
        return count1-count2;
    }
}