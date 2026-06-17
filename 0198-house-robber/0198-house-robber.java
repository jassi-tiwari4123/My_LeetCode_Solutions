class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fxn(n-1,nums,dp);
    }
    public int fxn(int i,int[] nums,int[] dp){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick=nums[i]+fxn(i-2,nums,dp);
        int npick=fxn(i-1,nums,dp);
        return dp[i]=Math.max(pick,npick);
    }
}