class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(fxn(nums,0,n-2),fxn(nums,1,n-1));
    }
    public int fxn(int[] nums,int f,int l){
        int n=l-f+1;
        int[] dp=new int[n];
        dp[0]=nums[f];
        for(int i=1;i<n;i++){
            int take=nums[f+i];
            if(i>1) take+=dp[i-2];
            int notake=dp[i-1];
            dp[i]=Math.max(take,notake);
        }
        return dp[n-1];
    }
}