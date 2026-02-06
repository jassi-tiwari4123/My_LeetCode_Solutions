class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int island=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j]=='1') {
                    dfs(i,j,grid,n,m);
                    island++;
                }
            }
        }
        return island;
    }
    public void dfs(int x,int y,char[][] grid,int n,int m) {
        if(x<0 || y<0 || x>=n || y>=m || grid[x][y]=='0'){
            return;
        }
        grid[x][y]='0';
        dfs(x-1,y,grid,n,m);
        dfs(x+1,y,grid,n,m);
        dfs(x,y-1,grid,n,m);    
        dfs(x,y+1,grid,n,m);
    }
}