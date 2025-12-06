class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int res=Math.min(compute(0,n,cost,dp),compute(1,n,cost,dp));
        return res;
    }
    public int compute(int index,int n,int[] cost,int [] dp){
        if(index>=n) return 0;
        if(dp[index]!=-1) return dp[index];
        int one=compute(index+1,n,cost,dp);
        int two=compute(index+2,n,cost,dp);
        return dp[index]=cost[index]+Math.min(one,two);
    }
}