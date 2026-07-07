class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int vowel=0;
        for(int r=0; r<k; r++){
            char ch= s.charAt(r);
            if(ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i'){
                vowel++;
            }
        }
        int max=vowel;
        for(int r=k; r<s.length(); r++){
            char ch= s.charAt(r);
            if(ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i'){
                vowel++;
            }
            if(s.charAt(left)=='a' || s.charAt(left)=='e' || s.charAt(left)=='o' || s.charAt(left)=='u' || s.charAt(left)=='i'){
                vowel--;
            }
            left++;
            max= Math.max(max, vowel);

        }
        return max;
    }
}