// class Solution {
//     public int minPathSum(int[][] grid) {
//         int m=grid.length;
//         int n=grid[0].length;
//         int[][] dp=new int[m][n];
//         for(int i=0;i<m;i++){
//             Arrays.fill(dp[i],-1);
//         }
//         return fxn(grid,m-1,n-1,dp);
//     }
//     public int fxn(int[][]grid,int i,int j,int[][]dp){
//         if(i==0 && j==0) return grid[0][0];
//         if(i<0 || j<0) return Integer.MAX_VALUE;
//         if(dp[i][j]!=-1) return dp[i][j];
//         int up=fxn(grid,i,j-1,dp);
//         int left=fxn(grid,i-1,j,dp);
//         dp[i][j]=grid[i][j]+Math.min(up,left);
//         return dp[i][j];
//     }
// }



//rec+memo
// class Solution {
//     int[][] dp;
//     public int minPathSum(int[][] grid) {
//         int n=grid.length;
//         int m=grid[0].length;
//         dp=new int[n][m];
//         for(int i=0;i<n;i++){
//             Arrays.fill(dp[i],Integer.MAX_VALUE);
//         }
//         return fxn(n-1,m-1,grid);
//     }
//     public int fxn(int i,int j,int[][] grid){
//         if(i==0 && j==0) return grid[0][0];
//         if(i<0 || j<0) return Integer.MAX_VALUE;
//         if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
//         int top=fxn(i-1,j,grid);
//         int left=fxn(i,j-1,grid);
//         return dp[i][j]=grid[i][j]+Math.min(top,left);
//     }
// }


//tab
class Solution {
    int[][] dp;
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        dp=new int[n][m];
        dp[0][0]=grid[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0) continue;
                int top=Integer.MAX_VALUE;
                int left=Integer.MAX_VALUE;
                if(i-1>=0){
                    top=dp[i-1][j];
                }
                if(j-1>=0){
                    left=dp[i][j-1];
                }
                dp[i][j]=grid[i][j]+Math.min(top,left);
            }
        }
        return dp[n-1][m-1];
    }
}