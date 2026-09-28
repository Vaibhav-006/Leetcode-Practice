class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s==null || s.length()<10){
            return new ArrayList<>();
        }
        Set<String> seen= new HashSet<>();
        Set<String> dup= new HashSet<>();
        for(int i=0; i<=s.length()-10; i++){
            String st= s.substring(i, i+10);
            if(seen.contains(st)){
                dup.add(st);
            }
            else{
                seen.add(st);
            }
        }
        return new ArrayList<>(dup);
    }
}