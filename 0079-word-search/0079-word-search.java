class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,String word,int r,int c,int idx){
        if(idx==word.length()) return true;
        if(r<0 || r>=board.length || c<0 || c>=board[0].length){
            return false;
        }
        if(board[r][c]!=word.charAt(idx)){
            return false;
        }
        char temp=board[r][c];
        board[r][c]='.';
        boolean found=false;
        int[] dirR={1,-1,0,0};
        int[] dirC={0,0,-1,1};
        for(int i=0;i<4;i++){
            found= found || dfs(board,word,r+dirR[i],c+dirC[i],idx+1);
        }
        board[r][c]=temp;
        return found;
    }
}