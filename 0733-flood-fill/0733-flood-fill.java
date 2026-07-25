class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        int ic= image[sr][sc];
        image[sr][sc]=color;
        Queue<Integer> q= new LinkedList<>();
        int[] dRow= {-1, 1, 0, 0};
        int[] dCol= {0, 0, -1, 1};
        q.add(sr);
        q.add(sc);
        while(!q.isEmpty()){
            int row= q.poll();
            int col= q.poll();
            for(int i=0; i<4; i++){
                int nRow= row+dRow[i];
                int nCol= col+dCol[i];
                if(nRow>=0 && nRow<image.length && nCol>=0 && nCol<image[0].length && image[nRow][nCol]==ic){
                    q.add(nRow);
                    q.add(nCol);
                    image[nRow][nCol]=color;
                }
            }
        }
        return image;
    }
}