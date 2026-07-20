class Solution {

    public void dfs(List<List<Integer>> al, boolean[] flag, int node){
        flag[node]=true;
        for(int val : al.get(node)){
            if(!flag[val]){
                dfs(al, flag, val);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> al= new ArrayList<>();
        int r= isConnected.length;
        int c= isConnected[0].length;
        for(int i=0; i<r; i++){
            al.add(new ArrayList());
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(i!=j && isConnected[i][j]==1){
                    al.get(i).add(j);
                    // al.get(j).add(i);
                }
            }
        }

        boolean flag[]= new boolean[r];
        int count=0;
        for(int i=0; i<r; i++){
            if(!flag[i]){
                count++;
                dfs(al, flag, i);
            }
        }
        return count;
    }
}