class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color= new int[graph.length];
        Arrays.fill(color, -1);
        for(int i=0; i<graph.length; i++){
            if(color[i]==-1){
                color[i]=0;
                if(dfs(graph, color, i)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(int[][] graph, int[] color, int node){
        for(int i=0; i<graph[node].length; i++){
            if(color[graph[node][i]]==-1){
                if(color[node]==0) color[graph[node][i]]=1;
                else color[graph[node][i]]=0;
                if(dfs(graph, color, graph[node][i])) return true;
            }
            else{
                if(color[graph[node][i]]==color[node]) return true;
            }
        }
        return false;
    }
}