class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] op=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(op[i],'.');
        }
        fxn(0,ans,op,n);
        return ans;
    }
    public void fxn(int col,List<List<String>> ans,char[][] op,int n){
        if(col==n){
            ans.add(tolist(op));
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(i,col,op,n)){
                op[i][col]='Q';
                fxn(col+1,ans,op,n);
                op[i][col]='.';
            }
        }
    }
    public List<String> tolist(char[][] op){
        List<String> arr=new ArrayList<>();
        for(int i=0;i<op.length;i++){
            arr.add(new String(op[i]));
        }
        return arr;
    }
    public boolean isSafe(int row,int col,char[][] op,int n){
        int x=row;
        int y=col;
        //up left diagonal
        while(x>=0 && y>=0){
            if(op[x][y]=='Q') return false;
            x--;
            y--;
        }
        // left
        x=row;
        y=col;
        while(y>=0){
            if(op[x][y]=='Q') return false;
            y--;
        }
        //down left diagonal
        x=row;
        y=col;
        while(x<n && y>=0){
            if(op[x][y]=='Q') return false;
            x++;
            y--;
        }
        return true;
    }
}