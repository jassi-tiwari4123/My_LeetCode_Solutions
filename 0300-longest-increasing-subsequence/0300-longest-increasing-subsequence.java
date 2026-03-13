class Solution {
    public int lengthOfLIS(int[] nums) {
    //     int n=nums.length;
    //     int[][]dp=new int[n][n+1];
    //     for(int i=0;i<n;i++){
    //         Arrays.fill(dp[i],-1);
    //     }
    //     return fxn(0,-1,nums,n,dp);
    // }
    // public int fxn(int index,int prev,int[] nums,int n,int[][]dp){
    //     if(n==0) return 0;
    //     if(index==n) return 0;
    //     if(dp[index][prev+1]!=-1) return dp[index][prev+1];
    //     int inc=0;
    //     if(prev==-1||nums[index]>nums[prev]){
    //         inc=1+fxn(index+1,index,nums,n,dp);
    //     }
    //     int exc=fxn(index+1,prev,nums,n,dp);
    //     return dp[index][prev+1]=Math.max(inc,exc);


        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return fxn(0,-1,dp,nums);
    }
    public int fxn(int i,int prev,int[][] dp,int[] nums){
        if(i==nums.length){
            return 0;
        }
        if(nums.length==0) return 0;
        if(dp[i][prev+1]!=-1) return dp[i][prev+1];
        int take=0;
        if(prev==-1 || nums[i]>nums[prev]){
            take=1+fxn(i+1,i,dp,nums);
        }
        int notTake=fxn(i+1,prev,dp,nums);
        return dp[i][prev+1]=Math.max(take,notTake);
    }
}