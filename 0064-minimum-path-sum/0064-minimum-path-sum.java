class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return fxn(grid,m-1,n-1,dp);
    }
    public int fxn(int[][]grid,int i,int j,int[][]dp){
        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=fxn(grid,i,j-1,dp);
        int left=fxn(grid,i-1,j,dp);
        dp[i][j]=grid[i][j]+Math.min(up,left);
        return dp[i][j];
    }
}