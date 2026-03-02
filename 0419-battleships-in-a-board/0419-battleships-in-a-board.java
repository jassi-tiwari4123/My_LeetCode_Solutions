class Solution {
    public int countBattleships(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int count=0;
        int[] dirRow={1,-1,0,0};
        int[] dirCol={0,0,-1,1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='X'){
                    count++;
                    dfs(board,i,j,dirRow,dirCol,n,m);
                }
            }
        }
        return count;
    }
    public void dfs(char[][] board,int row,int col,int[]dirRow,int[] dirCol,int n,int m){
        board[row][col]='.';
        for(int i=0;i<4;i++){
            int nr=dirRow[i]+row;
            int nc=dirCol[i]+col;
            if(nr>=0 && nr<n && nc>=0 && nc<m && board[nr][nc]=='X'){
                dfs(board,nr,nc,dirRow,dirCol,n,m);
            }
        }
    }
}