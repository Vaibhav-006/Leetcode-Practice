class Solution {
    public int missingInteger(int[] nums) {
        ArrayList<Integer> al= new ArrayList<>();
        for(int num : nums){
            al.add(num);
        }
        int sum=nums[0];
        for(int i=1; i<nums.length; i++){
            
            if(nums[i]!=nums[i-1]+1){
                break;
            }
            sum+=nums[i];
        }
        while(true){
            if(!al.contains(sum)){
                break;
            }
            sum+=1;
        }
        return sum;
        
    }
}