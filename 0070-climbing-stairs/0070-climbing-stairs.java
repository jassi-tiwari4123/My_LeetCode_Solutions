class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}















































// class Solution {
//     public int climbStairs(int n) {
//     //     int [] dp=new int[n+1];
//     //     Arrays.fill(dp,-1);
//     //     int res=compute(n,dp);
//     //     return res;
//     // }
//     // public int compute(int n,int[] dp){
//     //     if(n<0) return 0;
//     //     if(n==0) return 1;
//     //     if(dp[n]!=-1) return dp[n];
//     //     int one=compute(n-1,dp);
//     //     int two=compute(n-2,dp);
//     //     return dp[n]=one + two;


//         int[] dp=new int[n+1];
//         Arrays.fill(dp,-1);
//         return fxn(n,dp);
//     }
//     public int fxn(int n,int[]dp){
//         if(n<0) return 0;
//         if(n==0) return 1;
//         if(dp[n]!=-1) return dp[n];
//         int one=fxn(n-1,dp);
//         int two=fxn(n-2,dp);
//         return dp[n]=one+two;
//     }
// }









