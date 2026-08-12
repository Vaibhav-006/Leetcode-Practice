class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color= new int[graph.length];
        Arrays.fill(color, -1);
        for(int i=0; i<graph.length; i++){
            if(color[i]!=-1) continue;
            Queue<Integer> q= new LinkedList<>();
            color[i]=0;
            q.add(i);
        while(!q.isEmpty()){
            int node= q.poll();
            for(int j=0; j<graph[node].length; j++){
                if(color[graph[node][j]]==-1){
                    if(color[node]==0){
                        color[graph[node][j]]=1;
                    }
                    else{
                        color[graph[node][j]]=0;
                    }
                    q.add(graph[node][j]);
                }
                else{
                    if(color[graph[node][j]]==color[node]){
                        return false;
                    }
                }
            }
        }
        }
        return true;

    }
}