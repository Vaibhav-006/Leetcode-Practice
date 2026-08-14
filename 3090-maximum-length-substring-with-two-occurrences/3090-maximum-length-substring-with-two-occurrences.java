class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        int l=0;
        int max=0;
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            while(map.get(ch)>2){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }
            max= Math.max(max, i-l+1);
        }
        return max;
        
    }
}