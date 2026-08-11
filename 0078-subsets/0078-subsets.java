class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        backtracking(0, nums, res, new ArrayList<>());
        return res;
    }

    public void backtracking(int idx, int[] nums, List<List<Integer>> res, List<Integer> al){
        res.add(new ArrayList<>(al));

        for(int i=idx; i<nums.length; i++){
            al.add(nums[i]);
            backtracking(i+1, nums, res, al);
            al.remove(al.size()-1);
        }
    }
}