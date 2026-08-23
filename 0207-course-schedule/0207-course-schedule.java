class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] arr : prerequisites){
            adj.get(arr[0]).add(arr[1]);
        }
        int[] inDegree= new int[numCourses];
        for(int i=0; i<adj.size(); i++){
            for(int node : adj.get(i)){
                inDegree[node]++;
            }
        }

        Queue<Integer> q= new LinkedList<>();
        for(int i=0; i<inDegree.length; i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        int count=0;

        while(!q.isEmpty()){
            int node= q.poll();
            count++;
            for(int num : adj.get(node)){
                inDegree[num]--;
                if(inDegree[num]==0){
                    q.add(num);
                }
            }
        }
        return numCourses==count;
    }
}