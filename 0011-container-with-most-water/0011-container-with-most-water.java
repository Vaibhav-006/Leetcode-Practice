class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right= height.length-1;
        int water= Integer.MIN_VALUE;
        while(left<right){
            int min= Math.min(height[left], height[right]);
            water= Math.max(water, min*(right-left));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return water;
    }
}