class Solution {
    public int coinChange(int[] coins, int amount) {
        //memo
    //     int n=coins.length;
    //     int[][] dp=new int[n][amount+1];
    //     for(int i=0;i<n;i++){
    //         Arrays.fill(dp[i],-1);
    //     }
    //     int ans=fxn(n-1,coins,amount,dp);
    //     return ans>=(int)1e9?-1:ans;
    // }
    // public int fxn(int i,int[] coins,int amt,int[][] dp){
    //     if(i==0 ){
    //         if(amt%coins[0]==0){
    //             return amt/coins[0];
    //         }
    //         else{
    //             return (int)1e9;
    //         }
    //     }
    //     if(dp[i][amt]!=-1) return dp[i][amt];
    //     int take=(int)1e9;
    //     if(coins[i]<=amt){
    //         take=1+fxn(i,coins,amt-coins[i],dp);
    //     }
    //     int ntake=fxn(i-1,coins,amt,dp);
    //     return dp[i][amt]=Math.min(take,ntake);



        //tab
        int n=coins.length;
        int[][]dp=new int[n][amount+1];
        for(int tar=0;tar<=amount;tar++){
            if(tar%coins[0]==0){
                dp[0][tar]=tar/coins[0];
            }
            else{
                dp[0][tar]=(int)1e9;
            }
        } 
        
        for(int i=1;i<n;i++){
            for(int j=0;j<=amount;j++){
                int take=(int)1e9;
                if(coins[i]<=j){
                    take=1+dp[i][j-coins[i]];
                }
                int ntake=dp[i-1][j];
                dp[i][j]=Math.min(take,ntake);
            }
        }
        int ans=dp[n-1][amount];
        return ans==(int)1e9?-1:ans;
    }
}