class Solution {
    public int countIslands(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    long val=dfs(grid,i,j);
                    if(val%k==0){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    public long dfs(int[][] grid,int r,int c){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]==0) return 0;
        long sum=0;
        sum+=grid[r][c];
        
        grid[r][c]=0;
        sum+=dfs(grid,r-1,c);
        sum+=dfs(grid,r+1,c);
        sum+=dfs(grid,r,c-1);
        sum+=dfs(grid,r,c+1);
        return sum;
    }
}