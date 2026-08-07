//memo
// class Solution {
//     int[] dp;
//     public int rob(int[] nums) {
//         int n=nums.length;
//         if(n==1) return nums[0];
//         dp=new int[n];
//         Arrays.fill(dp,-1);
//         int case1=fxn(0,n-2,nums);
//         dp=new int[n];
//         Arrays.fill(dp,-1);
//         int case2=fxn(1,n-1,nums);
//         return Math.max(case1,case2);
//     }
//     public int fxn(int start,int last,int[] nums){
//         if(last<start) return 0;
//         if(dp[last]!=-1) return dp[last];
//         int take=nums[last]+fxn(start,last-2,nums);
//         int not=fxn(start,last-1,nums);
//         return dp[last]=Math.max(take,not);
//     }
// }


//tab
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int case1=fxn(0,n-2,nums);
        int case2=fxn(1,n-1,nums);
        return Math.max(case1,case2);
    }
    public int fxn(int start,int last,int[] nums){
        int dp[]=new int[nums.length];
        dp[start]=nums[start];
        int take=0;
        for(int i=start+1;i<=last;i++){
            take=nums[i];
            if(i>=start+2) take+=dp[i-2];
            int not=dp[i-1];
            dp[i]=Math.max(take,not);
        }
        return dp[last];
    }
}
