class Solution {
    public int longestWPI(int[] hours) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int prefix=0;
        int max=0;
        for(int i=0; i<hours.length; i++){
            prefix+=(hours[i]>8) ? 1 : -1;
            if(prefix>0){
                max=i+1;
            }
            else{
                map.putIfAbsent(prefix, i);
                if(map.containsKey(prefix-1)){
                    max= Math.max(max, i-map.get(prefix-1));
                }
            }
        }
        return max;

    }
}