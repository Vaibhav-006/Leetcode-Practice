class Solution {

    public void dfs(int isConnected[][], boolean[] flag, int node){
        flag[node]=true;
        for(int i=0; i<isConnected[0].length; i++){
            if(isConnected[node][i]==1 && !flag[i]){
                dfs(isConnected, flag, i);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int r= isConnected.length;
        int c= isConnected[0].length;
        boolean flag[]= new boolean[r];
        int count=0;
        for(int i=0; i<r; i++){
            if(!flag[i]){
                count++;
                dfs(isConnected, flag, i);
            }
        }

        return count;
    }
}