class Solution {
    public boolean canPartition(int[] nums) {
        //memoization
    //     int sum=0;
    //     for(int i=0;i<nums.length;i++){
    //         sum+=nums[i];
    //     }
    //     if(sum%2!=0) return false;
    //     int target=sum/2;
    //     Boolean[][] dp=new Boolean[nums.length][target+1];
    //     return fxn(nums,0,target,dp); 
    // }
    // public boolean fxn(int[]nums,int ind,int target,Boolean[][]dp){
    //     if(target==0) return true;
    //     if(target<0 || ind>=nums.length) return false;
    //     if(dp[ind][target]!=null) return dp[ind][target]; 
    //     boolean take=fxn(nums,ind+1,target-nums[ind],dp);
    //     boolean notTake=fxn(nums,ind+1,target,dp);
    //     return dp[ind][target]=take||notTake;


    //tabulation
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        int target=sum/2;
        boolean[][] dp=new boolean[n+1][target+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                boolean notTake=dp[i-1][j];
                boolean take=false;
                if(nums[i-1]<=j){
                    take=dp[i-1][j-nums[i-1]];
                }
                dp[i][j]=take||notTake;
            }
            
        }
        return dp[n][target];
    }
}


































// class Solution {

//     Boolean[][] dp;

//     public boolean canPartition(int[] nums) {

//         int sum = 0;
//         for(int x : nums) sum += x;

//         if(sum % 2 != 0) return false;

//         int target = sum / 2;

//         dp = new Boolean[nums.length][target + 1];

//         return solve(nums, 0, target);
//     }

//     public boolean solve(int[] nums, int i, int target){

//         if(target == 0) return true;

//         if(i >= nums.length || target < 0) return false;

//         if(dp[i][target] != null) return dp[i][target];

//         boolean take = solve(nums, i + 1, target - nums[i]);
//         boolean skip = solve(nums, i + 1, target);

//         return dp[i][target] = take || skip;
//     }
// }