// class Solution {
//     Integer[][] dp;
//     public boolean stoneGame(int[] piles) {
//         int n=piles.length;
//         dp=new Integer[501][501];
//         int x=fxn(0,n-1,piles);
//         if(x>=0) return true;
//         return false;
//     }
//     public int fxn(int i,int j,int[] piles){
//         if(i==j) return piles[i];
//         if(dp[i][j]!=null) return dp[i][j];
//         int left=piles[i]-fxn(i+1,j,piles);
//         int right=piles[j]-fxn(i,j-1,piles);
//         dp[i][j]=Math.max(left,right);
//         return dp[i][j];
//     }

// }


//tabulation
class Solution {
    int[][] dp;
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        dp=new int[n][n];
        //base case i==j
        for(int i=0;i<n;i++){
            dp[i][i]=piles[i];
        }
        //len 1 done
        //now len 2 to n
        for(int len=2;len<=n;len++){
            for(int i=1;i+len-1<n;i++){
                int j=i+len-1;
                int left=piles[i]-dp[i+1][j];
                int right=piles[j]-dp[i][j-1];
                dp[i][j]=Math.max(left,right);
            }
        }
        return dp[0][n-1]>=0;
    }
}