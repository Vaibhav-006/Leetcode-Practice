class Solution {
    public String reverseWords(String s) {
        StringBuilder res= new StringBuilder();
        String str[]= s.split(" ");
        for(int i=0; i<str.length; i++){
            StringBuilder sb= new StringBuilder(str[i]);
            res.append(sb.reverse());
            if(i!=str.length-1){
                res.append(" ");
            }
        }
        return res.toString();
    }
}