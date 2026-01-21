class Solution {
    public int jump(int[] nums) {
        //recursive code
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return fxn(nums,0,dp);
    }
    public int fxn(int[] nums,int ind,int[]dp){
        if(ind>=nums.length-1){
            return 0;
        }
        if(dp[ind]!=-1) return dp[ind];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=nums[ind];i++){
            int jumps=fxn(nums,ind+i,dp);
            if(jumps!=Integer.MAX_VALUE) min=Math.min(min,1+jumps);
        }
        return dp[ind]=min;
    }
}