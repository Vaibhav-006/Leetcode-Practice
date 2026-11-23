class Solution {
    public boolean checkString(String s) {
        boolean flag= false;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(flag && ch=='a') return false;
            if(ch=='b') flag=true;
        }
        return true;
        
    }
}