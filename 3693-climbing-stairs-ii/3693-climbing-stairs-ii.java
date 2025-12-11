class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return compute(0,n,costs,dp);
    }
    public int compute(int index,int n,int[] costs,int[] dp){
        if(index==n){
            return 0;
        }
        if(dp[index]!=-1) return dp[index];
        int ans=Integer.MAX_VALUE/2;
        if(index+1<=n){
            ans=Math.min(ans,compute(index+1,n,costs,dp)+costs[index]+1*1);
        }
        if(index+2<=n){
            ans=Math.min(ans,compute(index+2,n,costs,dp)+costs[index+1]+2*2);
        }
        if(index+3<=n){
            ans=Math.min(ans,compute(index+3,n,costs,dp)+costs[index+2]+3*3);
        }
        return dp[index]=ans; 
    }
}