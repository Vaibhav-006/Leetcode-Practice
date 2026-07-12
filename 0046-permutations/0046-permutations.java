class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        boolean flag[]= new boolean[nums.length];
        backtracking(nums, new ArrayList<>(), flag, res);
        return res;
    }

    public void backtracking(int nums[], List<Integer> curr, boolean flag[], List<List<Integer>> res){
        if(curr.size()==nums.length){
            res.add(new ArrayList(curr));
        }
        for(int i=0; i<nums.length; i++){
            if(flag[i]) continue;

            curr.add(nums[i]);
            flag[i]=true;
            backtracking(nums, curr, flag, res);
            curr.remove(curr.size()-1);
            flag[i]=false;
        }
    }

}