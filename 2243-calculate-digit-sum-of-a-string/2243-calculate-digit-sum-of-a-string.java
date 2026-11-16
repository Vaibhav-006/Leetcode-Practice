class Solution {
    public String digitSum(String s, int k) {
        StringBuilder res = new StringBuilder(s);
        while (res.length() > k) {
            String str="";
            for (int i = 0; i < res.length(); i += k) {
                String sub = res.substring(i, Math.min(i + k, res.length()));
                int sum = 0;
                for (int j = 0; j < sub.length(); j++) {
                    sum += sub.charAt(j)-'0';
                }
                str+= Integer.toString(sum);
            }
            res.replace(0, res.length(), str);
        }
        return res.toString();
    }
}