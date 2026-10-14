class Solution {
    public boolean exist(char[][] board, String word) {
        int m= board.length;
        int n= board[0].length;
        boolean[][] visited= new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(dfs(board, word, visited, 0, i, j, m, n)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, boolean[][] visited, int idx, int r, int c, int m, int n){
        if(board[r][c]!=word.charAt(idx)){
            return false;
        }
        if(idx==word.length()-1){
            return true;
        }
        visited[r][c]=true;
        int[] dRow={-1, 1, 0, 0};
        int[] dCol={0, 0, -1, 1};
        for(int i=0; i<4; i++){
            int nRow= dRow[i]+r;
            int nCol= dCol[i]+c;
            if(nRow>=0 && nCol>=0 && nRow<m && nCol<n && !visited[nRow][nCol]){
                if(dfs(board,word, visited,  idx+1, nRow, nCol, m, n)){
                    return true;
                }
            }

        }
        visited[r][c]=false;
        return false;
    }
}