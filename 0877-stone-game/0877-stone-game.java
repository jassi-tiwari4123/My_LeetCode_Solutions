class Solution {
    int[][] dp;
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        dp=new int[501][501];
        for(int i=0;i<=500;i++){
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        int x=fxn(0,n-1,piles);
        if(x>=0) return true;
        return false;
    }
    public int fxn(int i,int j,int[] piles){
        if(i==j) return piles[i];
        if(dp[i][j]!=Integer.MIN_VALUE) return dp[i][j];
        int left=piles[i]-fxn(i+1,j,piles);
        int right=piles[j]-fxn(i,j-1,piles);
        dp[i][j]=Math.max(left,right);
        return dp[i][j];
    }

}