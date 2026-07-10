class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        int runningSum = 0;
        int totalSubarrays = 0;
        
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            if (map.containsKey(runningSum - k)) {
                totalSubarrays += map.get(runningSum - k);
            }
            map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
        }
        
        return totalSubarrays;
    }
}