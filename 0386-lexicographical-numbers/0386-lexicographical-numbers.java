class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> al= new ArrayList<>();
        List<Integer> res= new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            String num= Integer.toString(i);
            al.add(num);
        }
        Collections.sort(al);
        for(int i=0; i<al.size(); i++){
            int num= Integer.parseInt(al.get(i));
            res.add(num);
        }
        return res;
    }
}