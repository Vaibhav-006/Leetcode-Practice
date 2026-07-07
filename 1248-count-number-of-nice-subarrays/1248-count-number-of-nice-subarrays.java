class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int odds=0;
        int total=0;
        
        for (int num : nums) {
            if (num%2!=0) {
                odds++;
            }
            if (map.containsKey(odds-k)) {
                total+=map.get(odds-k);
            }
            map.put(odds,map.getOrDefault(odds,0)+1);
        }
        
        return total;
    }
}
