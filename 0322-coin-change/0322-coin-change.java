class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=fxn(n-1,coins,amount,dp);
        return ans>=(int)1e9?-1:ans;
    }
    public int fxn(int i,int[] coins,int amt,int[][] dp){
        if(i==0 ){
            if(amt%coins[0]==0){
                return amt/coins[0];
            }
            else{
                return (int)1e9;
            }
        }
        if(dp[i][amt]!=-1) return dp[i][amt];
        int take=(int)1e9;
        if(coins[i]<=amt){
            take=1+fxn(i,coins,amt-coins[i],dp);
        }
        int ntake=fxn(i-1,coins,amt,dp);
        return dp[i][amt]=Math.min(take,ntake);
    }
}