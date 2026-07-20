class Solution {

    public void dfs(int isConnected[][], boolean[] flag, int node){
        flag[node]=true;
        for(int i=0; i<isConnected.length; i++){
            if(isConnected[node][i]==1 && !flag[i]){
                dfs(isConnected, flag, i);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        boolean flag[]= new boolean[n];
        int count=0;
        for(int i=0; i<n; i++){
            if(!flag[i]){
                count++;
                dfs(isConnected, flag, i);
            }
        }

        return count;
    }
}