class Solution {
    int[] dirR={-1,1,0,0};
    int[] dirC={0,0,-1,1};
    int n;
    int m;
    public void solve(char[][] board) {
        n=board.length;
        m=board[0].length;
        for(int i=0;i<n;i++){
            if(board[i][0]=='O'){
                dfs(i,0,board);
            }
            if(board[i][m-1]=='O'){
                dfs(i,m-1,board);
            }
        }
        for(int i=0;i<m;i++){
            if(board[0][i]=='O'){
                dfs(0,i,board);
            }
            if(board[n-1][i]=='O'){
                dfs(n-1,i,board);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='S'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void dfs(int i,int j,char[][] grid){
        grid[i][j]='S';
        for(int k=0;k<4;k++){
            int nr=i+dirR[k];
            int nc=j+dirC[k];
            if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]=='O'){
                dfs(nr,nc,grid);
            }
        }
    }
}