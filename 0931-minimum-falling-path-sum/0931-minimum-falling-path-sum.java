//rec
// class Solution {
//     int n;
//     public int minFallingPathSum(int[][] matrix) {
//         n=matrix.length;
//         int ans=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++){
//             ans=Math.min(ans,fxn(0,i,matrix));
//         }
//         return ans;
//     }
//     public int fxn(int row,int col,int[][] mat){
//         if(row>=n || col>=n || row<0 || col<0) return Integer.MAX_VALUE;
//         if(row==n-1) return mat[row][col];
//         int ans=mat[row][col];
//         int down=fxn(row+1,col,mat);
//         int left=fxn(row+1,col-1,mat);
//         int right=fxn(row+1,col+1,mat);
//         return ans+=+Math.min(left,Math.min(down,right));
//     }
// }


//memo
// class Solution {
//     int n;
//     int[][] dp;
//     public int minFallingPathSum(int[][] matrix) {
//         n=matrix.length;
//         dp=new int[n][n];
//         for(int i=0;i<n;i++){
//             Arrays.fill(dp[i],Integer.MAX_VALUE);
//         }
//         int ans=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++){
//             ans=Math.min(ans,fxn(0,i,matrix));
//         }
//         return ans;
//     }
//     public int fxn(int row,int col,int[][] mat){
//         if(row>=n || col>=n || row<0 || col<0) return Integer.MAX_VALUE;
//         if(row==n-1) return mat[row][col];
//         if(dp[row][col]!=Integer.MAX_VALUE) return dp[row][col];
//         int ans=mat[row][col];
//         int down=fxn(row+1,col,mat);
//         int left=fxn(row+1,col-1,mat);
//         int right=fxn(row+1,col+1,mat);
//         return dp[row][col]=ans+Math.min(left,Math.min(down,right));
//     }
// }


//tab
class Solution {
    int n;
    int[][] dp;
    public int minFallingPathSum(int[][] matrix) {
        n=matrix.length;
        dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int down=Integer.MAX_VALUE;
                int left=Integer.MAX_VALUE;
                int right=Integer.MAX_VALUE;
                down=dp[i-1][j];
                if(i-1>=0 && j-1>=0) left=dp[i-1][j-1];
                if(i-1>=0 && j+1<n) right=dp[i-1][j+1];
                dp[i][j]=matrix[i][j]+Math.min(down,Math.min(left,right));
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.min(ans,dp[n-1][i]);
        }
        return ans;
    }
}