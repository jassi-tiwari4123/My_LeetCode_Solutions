class Solution {
    int[] dirR={-1,1,0,0};
    int[] dirC={0,0,-1,1};
    int n;
    int m;
    public int numEnclaves(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            if(grid[i][0]==1 && !vis[i][0]){
                dfs(i,0,grid,vis);
            }
            if(grid[i][m-1]==1 && !vis[i][m-1]){
                dfs(i,m-1,grid,vis);
            }
        }
        for(int i=0;i<m;i++){
            if(grid[0][i]==1 &&!vis[0][i]){
                dfs(0,i,grid,vis);
            }
            if(grid[n-1][i]==1 && !vis[n-1][i]){
                dfs(n-1,i,grid,vis);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int r,int c,int[][] grid,boolean[][] vis){
        vis[r][c]=true;
        for(int i=0;i<4;i++){
            int nr=r+dirR[i];
            int nc=c+dirC[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1 && !vis[nr][nc]){
                dfs(nr,nc,grid,vis);
            }
        }
    }
}