// class Solution {
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         int m=obstacleGrid.length;
//         int n=obstacleGrid[0].length;
//         int[][] dp=new int[m][n];
//         if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;
//         for(int i=0;i<m;i++){
//             Arrays.fill(dp[i],-1);
//         }
//         return fxn(obstacleGrid,0,0,m,n,dp);
//     }
//     public int fxn(int[][] arr,int i,int j,int m,int n,int[][] dp){
//         if(i==m-1 && j==n-1){
//             return 1;
//         }
//         if(i>=m || j>=n){
//             return 0;
//         }
//         if(dp[i][j]!=-1){
//             return dp[i][j];
//         }
//         if(arr[i][j]==1)return 0;
        
//         int right=fxn(arr,i,j+1,m,n,dp);
//         int down=fxn(arr,i+1,j,m,n,dp);
//         return dp[i][j]=right+down;
//     }
// }



//memo
// class Solution {
//     int[][] dp;
//     public int uniquePathsWithObstacles(int[][] grid) {
//         int n=grid.length;
//         int m=grid[0].length;
//         dp=new int[n][m];
//         for(int i=0;i<n;i++){
//             Arrays.fill(dp[i],-1);
//         }
//         if(grid[0][0]==1 || grid[n-1][m-1]==1) return 0;
//         return fxn(n-1,m-1,grid);
//     }
//     public int fxn(int i,int j,int[][] grid){
//         if(i==0 && j==0) return 1;
//         if(i<0 || j<0) return 0;
//         if(grid[i][j]==1) return 0;
//         if(dp[i][j]!=-1) return dp[i][j];
//         int top=fxn(i-1,j,grid);
//         int left=fxn(i,j-1,grid);
//         return dp[i][j]=top+left;
//     }
// }


class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] grid) {
        // code here
        int n=grid.length;
        int m=grid[0].length;
        dp=new int[n][m];
        if(grid[0][0]==1 || grid[n-1][m-1]==1) return 0;
        dp[0][0]=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0) continue;
                if(i-1>=0){
                    if(grid[i][j]!=1) dp[i][j]=dp[i-1][j];
                }
                if(j-1>=0){
                    if(grid[i][j]!=1) dp[i][j]+=dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1];
    }
    
};