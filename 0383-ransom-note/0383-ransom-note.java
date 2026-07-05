class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> al= new ArrayList<>();
        for(int i=0; i<magazine.length(); i++){
            char ch= magazine.charAt(i);
            al.add(ch);
        }
        for(int i=0; i<ransomNote.length(); i++){
            char ch= ransomNote.charAt(i);
            if(!al.contains(ch)){
                return false;
            }
            al.remove(Character.valueOf(ch));
        }
        return true;
    }
}