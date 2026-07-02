class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        int hay= haystack.length();
        int need= needle.length();
        if(need>hay){
            return -1;
        }
        for(int i=0; i<=hay-need; i++){
            if((haystack.substring(i, i+need)).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}