class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> al= new ArrayList<>();
        for(int num : nums){
            al.add(num);
        }
        int min=0;
        while(true){
            min+=k;
            if(!al.contains(min)) break;
        }
        return min;
        
    }
}