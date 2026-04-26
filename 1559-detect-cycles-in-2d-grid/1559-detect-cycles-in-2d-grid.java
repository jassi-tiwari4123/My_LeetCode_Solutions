class Solution {
    public boolean containsCycle(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j]){
                    if(dfs(i,j,vis,-1,-1,grid,n,m)) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int r,int c,boolean[][] vis,int rPar,int cPar,char[][] grid,int n,int m){
        int[] dirR={1,-1,0,0};
        int[] dirC={0,0,1,-1};
        vis[r][c]=true;
        for(int i=0;i<4;i++){
            int nr=r+dirR[i];
            int nc=c+dirC[i];
            if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]==grid[r][c]){
                if(!vis[nr][nc]){
                    if(dfs(nr,nc,vis,r,c,grid,n,m)) return true;
                }
                else if(nr!=rPar || nc!=cPar) return true;
            }
        }
        return false;
    }
}