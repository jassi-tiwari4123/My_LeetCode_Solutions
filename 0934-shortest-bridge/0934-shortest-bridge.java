class Solution {
    int n,m;
    int[] dirR={0,0,-1,1};
    int[] dirC={-1,1,0,0};
    boolean[][] vis;
    Queue<int[]>q;
    public int shortestBridge(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        q=new LinkedList<>();
        vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    dfs(i,j,grid,vis);
                    return bfs(grid,vis);
                }
            }
        }
        return -1;
    }
    public void dfs(int r,int c,int[][] grid,boolean[][] vis){
        vis[r][c]=true;
        q.add(new int[]{r,c});
        for(int k=0;k<4;k++){
            int nr=r+dirR[k];
            int nc=c+dirC[k];
            if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1 && !vis[nr][nc]){
                dfs(nr,nc,grid,vis);
            }
        }
    }
    public int bfs(int[][] grid,boolean[][] vis){
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cur=q.poll();
                int r=cur[0];
                int c=cur[1];
                for(int k=0;k<4;k++){
                    int nr=r+dirR[k];
                    int nc=c+dirC[k];
                    if(nr>=0 && nr<n && nc>=0 && nc<m && !vis[nr][nc]){
                        if(grid[nr][nc]==1) return level;
                        vis[nr][nc]=true;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            level++;
        }
        return level;
    }
}
