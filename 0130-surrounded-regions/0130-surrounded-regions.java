class Solution {
    public void solve(char[][] board) {
        int m= board.length;
        int n= board[0].length;
        boolean[][] flag= new boolean[m][n];
        for(int i=0; i<n; i++){
            if(board[0][i]=='O' && !flag[0][i]){
                dfs(0,i, board, flag);
            }
        }
        for(int i=0; i<m; i++){
            if(board[i][n-1]=='O' && !flag[i][n-1]){
                dfs(i,n-1, board, flag);
            }
        }
        for(int i=0; i<n; i++){
            if(board[m-1][i]=='O' && !flag[m-1][i]){
                dfs(m-1,i, board, flag);
            }
        }
        for(int i=0; i<m; i++){
            if(board[i][0]=='O' && !flag[i][0]){
                dfs(i,0, board, flag);
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]=='O' && !flag[i][j]){
                    board[i][j]='X';
                }
            }
        }

    }

    public void dfs(int row, int col, char[][] board, boolean[][] flag){
        flag[row][col]=true;
        int m= board.length;
        int n= board[0].length;
        int[] dRow= {-1, 1, 0, 0};
        int[] dCol= {0, 0, -1, 1};
        for(int i=0; i<4; i++){
            int nRow= row+dRow[i];
            int nCol= col+dCol[i];
            if(nRow>=0 && nRow<m && nCol>=0 && nCol<n && board[nRow][nCol]=='O' && !flag[nRow][nCol]){
                dfs(nRow, nCol, board, flag);
            }
        }
    }
}