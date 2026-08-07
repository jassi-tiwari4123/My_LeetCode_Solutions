//memo
// class Solution {
//     long[] dp;
//     public long rob(int[] nums, int[] colors) {
//         int n=nums.length;
//         dp=new long[n];
//         Arrays.fill(dp,-1);
//         return fxn(n-1,nums,colors);
//     }
//     public long fxn(int ind,int[] nums,int[] colors){
//         if(ind<0) return 0;
//         if(dp[ind]!=-1) return dp[ind];
//         long take=nums[ind];
//         //for adj
//         if(ind>=1) {
//             if(colors[ind]!=colors[ind-1]){
//                 take=nums[ind]+fxn(ind-1,nums,colors);
//             }
//             else{
//                 take=nums[ind]+fxn(ind-2,nums,colors);
//             }
//         }
//         long not=fxn(ind-1,nums,colors);
//         return dp[ind]=Math.max(take,not);
//     }
// }



//tab
class Solution {
    long[] dp;
    public long rob(int[] nums, int[] colors) {
        int n=nums.length;
        dp=new long[n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            long take=nums[i];
            if(i>=1){
                if(colors[i]!=colors[i-1]){
                    take+=dp[i-1];
                }
                else{
                    if(i>=2) take+=dp[i-2];
                }
            }
            long not=dp[i-1];
            dp[i]=Math.max(take,not);
        }
        return dp[n-1];
    }
}