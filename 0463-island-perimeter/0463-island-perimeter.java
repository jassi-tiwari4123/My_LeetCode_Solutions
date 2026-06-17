class Solution {
    int n;
    int m;
    public int islandPerimeter(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return dfs(i,j,grid);
                }
            }
        }
        return 0;
    }
    public int dfs(int x,int y,int[][] grid){
        if(x<0 || y<0 || x>=n || y>=m ){
            return 1;
        }
        if(grid[x][y]==0) return 1;
        if(grid[x][y]==-1) return 0;
        grid[x][y]=-1;
        int per=0;
        per+=dfs(x+1,y,grid);
        per+=dfs(x-1,y,grid);
        per+=dfs(x,y+1,grid);
        per+=dfs(x,y-1,grid);
        return per;
    }
}