class Solution {
    public int thirdMax(int[] nums) {
        Long max1=null;
        Long max2=null;
        Long max3=null;

        for(long val : nums){
            if((max1!=null && val==max1) || (max2!=null && val==max2) || (max3!=null && val==max3)){
                continue;
            }
            if(max1==null || val>max1){
                max3=max2;
                max2=max1;
                max1=val;
            }
            else if(max2==null || val>max2){
                max3=max2;
                max2=val;
            }
            else if(max3==null || val>max3){
                max3=val;
            }
            
        }
        return (max3==null) ? max1.intValue() : max3.intValue();
    }
}