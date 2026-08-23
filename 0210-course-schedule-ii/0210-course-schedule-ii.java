class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] arr: prerequisites){
            adj.get(arr[1]).add(arr[0]);
        }
        int[] inDegree= new int[numCourses];
        for(int i=0; i<numCourses; i++){
            for(int num : adj.get(i)){
                inDegree[num]++;
            }
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0; i<inDegree.length; i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        int[] res= new int[numCourses];
        int idx=0;
        while(!q.isEmpty()){
            int node= q.poll();
            res[idx++]=node;
            for(int num : adj.get(node)){
                inDegree[num]--;
                if(inDegree[num]==0){
                    q.add(num);
                }
            }
        }
        if(idx==numCourses){
            return res;
        }
        return new int[0];

    }


}