class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<Integer> ones= new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                ones.add(i);
            }
        }
        if(ones.size()<k){
            return "";
        }
        
        String result ="";
        int minLen =Integer.MAX_VALUE;
        for(int i=0; i<=ones.size()-k; i++){
            int start= ones.get(i);
            int end= ones.get(i + k - 1);
            String current= s.substring(start, end + 1);
            if(current.length()<minLen){
                minLen= current.length();
                result= current;
            }
            else if(current.length() == minLen){
                if(current.compareTo(result)<0){
                    result =current;
                }
            }
        }
        
        return result;
    }
}
