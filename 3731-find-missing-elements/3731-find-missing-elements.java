class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int min=nums[0];
        int max=nums[0];
        
        for (int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        List<Integer> res= new ArrayList<>();
        for (int x=min; x<=max; x++) {
            if (!set.contains(x)) {
                res.add(x);
            }
        }
        
        return res;
    }
}
