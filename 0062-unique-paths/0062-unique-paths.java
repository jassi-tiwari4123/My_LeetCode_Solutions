class Solution {
    public int uniquePaths(int m, int n) {
        //memo
    //     int[][] dp=new int[m][n];
    //     for(int i=0;i<m;i++){
    //         Arrays.fill(dp[i],-1);
    //     }
    //     return fxn(m-1,n-1,dp);
    // }
    // public int fxn(int i,int j,int[][]dp){
    //     if(i==0 && j==0) return 1;
    //     if(i<0 || j<0) return 0;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     int up=fxn(i-1,j,dp);
    //     int left=fxn(i,j-1,dp);
    //     return dp[i][j]=up+left;

        //tab
        int[][] dp=new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) continue;
                int up=0;
                int left=0;
                if(i>0){
                    up=dp[i-1][j];
                }
                if(j>0){
                    left=dp[i][j-1];
                }
                dp[i][j]=left+up;
            }
        }
        return dp[m-1][n-1];
    }
}