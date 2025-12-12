class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return fxn(obstacleGrid,0,0,m,n,dp);
    }
    public int fxn(int[][] arr,int i,int j,int m,int n,int[][] dp){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || j>=n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(arr[i][j]==1)return 0;
        
        int right=fxn(arr,i,j+1,m,n,dp);
        int down=fxn(arr,i+1,j,m,n,dp);
        return dp[i][j]=right+down;
    }
}