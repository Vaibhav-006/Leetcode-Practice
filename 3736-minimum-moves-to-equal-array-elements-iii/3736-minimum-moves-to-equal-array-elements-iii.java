class Solution {
    public int minMoves(int[] nums) {
        int max= Integer.MIN_VALUE;
        for(int num : nums){
            max= Math.max(max, num);
        }
        int ans=0;
        for(int num : nums){
            ans+= Math.abs(max-num);
        }
        return ans;

    }
}