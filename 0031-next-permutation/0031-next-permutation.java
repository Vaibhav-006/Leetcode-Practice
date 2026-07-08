class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1){
            return;
        }
        int n= nums.length;
        int p=n-2;
        while(p>=0 && nums[p]>=nums[p+1]){
            p--;
        }
        int i=n-1;
        if(p!=-1){
            while(nums[i]<=nums[p]){
                i--;
            }
            int temp= nums[p];
            nums[p]=nums[i];
            nums[i]=temp;
        }
        reverse(p+1, n-1, nums);
        
    }

    public void reverse(int start, int end, int arr[]){
        while(start<end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}