class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for (int i = 0; i<n; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        char[] result=new char[n];
        int left=0;
        int right=n-1;
        for(int i=0; i<26; i++){
            char currentChar=(char)(i+'a');
            if(freq[i]%2!=0){
                result[n/2] = currentChar;
            }
            int pairs= freq[i] / 2;
            while (pairs>0) {
                result[left++]=currentChar;
                result[right--]= currentChar;
                pairs--;
            }
        }
        return new String(result);

    }
}