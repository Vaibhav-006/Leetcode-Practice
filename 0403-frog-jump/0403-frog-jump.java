class Solution {
    public boolean canCross(int[] stones) {
        if(stones[1]!=1) return false;
        int n= stones.length;
        HashMap<Integer, HashSet<Integer>> dp= new HashMap<>();

        for(int stone : stones){
            dp.put(stone, new HashSet<>());
        }
        dp.get(0).add(0);
        for(int i=0; i<n; i++){
            int current= stones[i];
            for(int k : dp.get(current)){
            for(int j=k-1; j<=k+1; j++){
                if(j<=0) continue;
                if(dp.containsKey(current+j)){
                    dp.get(current+j).add(j);
                }
            }
            }
        }

        return !dp.get(stones[n-1]).isEmpty();
        
    }
}