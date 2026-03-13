class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int[][] dp=new int[n+1][2*sum+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        return fxn(0,0,target,dp,sum,nums);
    }
    public int fxn(int i,int cur,int target,int[][]dp,int sum,int[]nums){
        if(i==nums.length){
            if(cur==target){
                return 1;
            }
            return 0;
        }
        if(dp[i][cur+sum]!=Integer.MIN_VALUE){
            return dp[i][cur+sum];
        } 
        int plus=fxn(i+1,cur+nums[i],target,dp,sum,nums);
        int sub=fxn(i+1,cur-nums[i],target,dp,sum,nums);
        return dp[i][cur+sum]=plus+sub;
    }
}




































// class Solution {

//     int[][] dp;

//     public int findTargetSumWays(int[] nums, int target) {

//         int sum = 0;
//         for(int num : nums) sum += num;

//         dp = new int[nums.length][2*sum + 1];

//         for(int[] row : dp)
//             Arrays.fill(row, Integer.MIN_VALUE);

//         return solve(0, 0, nums, target, sum);
//     }

//     public int solve(int i, int currSum, int[] nums, int target, int sum){

//         if(i == nums.length){
//             if(currSum == target) return 1;
//             return 0;
//         }

//         if(dp[i][currSum + sum] != Integer.MIN_VALUE)
//             return dp[i][currSum + sum];

//         int plus = solve(i+1, currSum + nums[i], nums, target, sum);
//         int minus = solve(i+1, currSum - nums[i], nums, target, sum);

//         return dp[i][currSum + sum] = plus + minus;
//     }
// }