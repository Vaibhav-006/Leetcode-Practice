class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>> al= new ArrayList<>();
        for(int i=0; i<n; i++){
            al.add(new ArrayList<>());
        }
        for(int i=0; i<flights.length; i++){
            al.get(flights[i][0]).add(new int[]{flights[i][1], flights[i][2]});
        }
        int[] nodes= new int[n];
        for(int i=0; i<n; i++){
            nodes[i]=Integer.MAX_VALUE;
        }
        nodes[src]=0;
        Queue<Integer> q= new LinkedList<>();
        q.add(src);
        q.add(0);
        q.add(0);
        while(!q.isEmpty()){
            int flight=q.poll();
            int price=q.poll();
            int stops=q.poll();
            if(stops>k) continue;
            for(int[] arr : al.get(flight)){
                if(price+arr[1]<nodes[arr[0]] && stops<=k){
                    nodes[arr[0]]=price+arr[1];
                    q.add(arr[0]);
                    q.add(nodes[arr[0]]);
                    q.add(stops+1);
                }
            }
        }
        if(nodes[dst]==Integer.MAX_VALUE) return -1;
        return nodes[dst];

    }
}