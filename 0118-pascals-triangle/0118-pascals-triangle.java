class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ol= new ArrayList<>();
        int count=0;
        while(count<numRows){
            List<Integer> il= new ArrayList<>();
            long el=1;
            il.add((int)el);
            for(int i=1; i<=count; i++){
                el=el*(count-i+1)/i;
                il.add((int)el);
            }
        count++;
        ol.add(il);
        }
        return ol;
    }
}