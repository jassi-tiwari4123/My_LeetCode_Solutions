class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return fxn(0,amount,coins,dp);
    }
    public int fxn(int i,int target,int[]coins,int [][]dp){
        if(i==coins.length){
            if(target==0){
                return 1;
            }
            return 0;
        }
        if(dp[i][target]!=-1) return dp[i][target];
        int take=0;
        if(coins[i]<=target) take=fxn(i,target-coins[i],coins,dp);
        int notake=fxn(i+1,target,coins,dp);
        return dp[i][target]=take+notake;
    }
}