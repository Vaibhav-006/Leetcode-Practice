class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map= new HashMap<>();
        List<Integer> al= new ArrayList<>();
        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        for(int val : map.values()){
            if(al.contains(val)){
                return false;
            }
            al.add(val);
        }
        return true;
    }
}