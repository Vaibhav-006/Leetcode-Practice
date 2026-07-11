class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> al= new ArrayList<>();
        long el=1;
        al.add((int)el);
        for(int i=1; i<=rowIndex; i++){
            el=el*(rowIndex-i+1)/i;
            al.add((int)el);
        }
        return al;
    }
}