class Solution {
    public int maxJump(int[] stones) {
        int n= stones.length;
        int max=Math.abs(stones[0]-stones[1]);
        for(int i=0; i<n-2; i++){
            max= Math.max(max, Math.abs(stones[i+2]-stones[i]));
        }
        return max;
    }
}