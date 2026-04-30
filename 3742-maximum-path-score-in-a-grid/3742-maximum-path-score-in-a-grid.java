// class Solution {
//     public int maxPathScore(int[][] grid, int k) {
//         //recursion
//         int n=grid.length;
//         int m=grid[0].length;
//         int ans=fxn(grid,n,m,0,0,0,k);
//         return (ans==Integer.MIN_VALUE?-1:ans);
//     }
//     public int fxn(int[][] grid,int n,int m,int i,int j,int cost,int k){
//         if(i>=n || j>=m) return Integer.MIN_VALUE;
//         int nc=cost+(grid[i][j]==0?0:1);
//         if(nc>k) return Integer.MIN_VALUE;
//         if(i==n-1 && j==m-1) return grid[i][j];
//         int right=fxn(grid,n,m,i,j+1,nc,k);
//         int down=fxn(grid,n,m,i+1,j,nc,k);
//         int res=Math.max(right,down);
//         if(res==Integer.MIN_VALUE) return Integer.MIN_VALUE;
//         return res+grid[i][j];
//     }
// }


//memoization
// class Solution{
//     public int maxPathScore(int[][] grid,int k){
//         int n=grid.length;
//         int m=grid[0].length;
//         int[][][] dp=new int[n+1][m+1][k+1];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){ 
//                 Arrays.fill(dp[i][j],-1);
//             }
//         }
//         int ans=fxn(grid,n,m,0,0,0,dp,k);
//         return ans==Integer.MIN_VALUE?-1:ans;
//     }
//     public int fxn(int[][] grid,int n,int m,int i,int j,int cost,int[][][]dp,int k){
//         if(i>=n || j>=m){
//             return  Integer.MIN_VALUE;
//         }
//         int nc=cost+(grid[i][j]==0?0:1);
//         if(nc>k) return Integer.MIN_VALUE;
//         if(i==n-1 && j==m-1) return grid[i][j];
//         if(dp[i][j][cost]!=-1) return dp[i][j][cost];
//         int right=fxn(grid,n,m,i,j+1,nc,dp,k);
//         int down=fxn(grid,n,m,i+1,j,nc,dp,k);
//         int res=Math.max(right,down);
//         if(res==Integer.MIN_VALUE) return Integer.MIN_VALUE;
//         return dp[i][j][cost]=res+grid[i][j];
//     }

// }


//tabulation

class Solution{
    public int maxPathScore(int[][] grid,int k){
        int n=grid.length;
        int m=grid[0].length;
        int[][][] dp=new int[n+1][m+1][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){ 
                for(int c=k;c>=0;c--){
                    int nc=c+(grid[i][j]==0?0:1);
                    if(nc>k) continue;
                    if(i==n-1 && j==m-1){
                        dp[i][j][c]=grid[i][j];
                        continue;
                    }
                    int right=-1;
                    int down=-1;
                    if(j+1<m) right=dp[i][j+1][nc];
                    if(i+1<n) down=dp[i+1][j][nc];
                    int res=Math.max(right,down);
                    if(res!=-1) dp[i][j][c]=grid[i][j]+res;
                }
            }
        }
        
        return dp[0][0][0];
    }
}