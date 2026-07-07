class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int ones=0;
        int max= Integer.MIN_VALUE;
        for(int r=0; r<nums.length; r++){
            if(nums[r]==1){
                ones++;
            }
            if((r-l+1)-ones>1){
                if(nums[l]==1){
                    ones--;
                }
                l++;
                
            }
            max= Math.max(max, ones);
        }
        if(max==nums.length) return nums.length-1;
        return max;
    }
}