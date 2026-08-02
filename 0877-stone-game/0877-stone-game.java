class Solution {
    Integer[][] dp;
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        dp=new Integer[501][501];
        int x=fxn(0,n-1,piles);
        if(x>=0) return true;
        return false;
    }
    public int fxn(int i,int j,int[] piles){
        if(i==j) return piles[i];
        if(dp[i][j]!=null) return dp[i][j];
        int left=piles[i]-fxn(i+1,j,piles);
        int right=piles[j]-fxn(i,j-1,piles);
        dp[i][j]=Math.max(left,right);
        return dp[i][j];
    }

}