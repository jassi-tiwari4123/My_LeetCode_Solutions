class Solution {
    long[] dp;
    public long rob(int[] nums, int[] colors) {
        int n=nums.length;
        dp=new long[n];
        Arrays.fill(dp,-1);
        return fxn(n-1,nums,colors);
    }
    public long fxn(int ind,int[] nums,int[] colors){
        if(ind<0) return 0;
        if(dp[ind]!=-1) return dp[ind];
        long take=nums[ind];
        //for adj
        if(ind>=1) {
            if(colors[ind]!=colors[ind-1]){
                take=nums[ind]+fxn(ind-1,nums,colors);
            }
            else{
                take=nums[ind]+fxn(ind-2,nums,colors);
            }
        }
        long not=fxn(ind-1,nums,colors);
        return dp[ind]=Math.max(take,not);
    }
}