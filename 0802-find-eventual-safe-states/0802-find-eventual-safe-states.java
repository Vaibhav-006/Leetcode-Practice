class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res= new ArrayList<>();
        boolean[] safe= new boolean[graph.length];
        boolean[] visited= new boolean[graph.length];
        boolean[] path= new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                dfs(i, visited, path, graph, safe);
            }
        }
        for(int i=0; i<safe.length; i++){
            if(safe[i]){
                res.add(i);
            }
        }
        return res;
    }

    public boolean dfs(int node, boolean[] visited, boolean[] path, int[][] graph, boolean[] safe){
        visited[node]=true;
        path[node]=true;

        for(int val : graph[node]){
            if(!visited[val]){
                if(dfs(val, visited, path, graph, safe)) return true;
            }
            else if(path[val]){
                return true;
            }
        }
        safe[node]=true;
        path[node]=false;
        return false;
    }
}