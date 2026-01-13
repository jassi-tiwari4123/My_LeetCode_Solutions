class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][]dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans= fxn(0,coins,amount,dp);
        return ans >= 1e9 ? -1 : ans;
    }
    public int fxn(int ind,int[]coins,int amount,int[][]dp){
        if(ind==coins.length ||amount<0) return (int)1e9;
        if(amount==0) return 0;
        if(dp[ind][amount]!=-1) return dp[ind][amount];
        int pick=0;
        pick=1+fxn(ind,coins,amount-coins[ind],dp);
        int notPick=fxn(ind+1,coins,amount,dp);
        int res=Math.min(pick,notPick);
        
        return dp[ind][amount]=res;
    }
}