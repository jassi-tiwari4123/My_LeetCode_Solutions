class Solution {
    public boolean increasingTriplet(int[] nums) {
        //MLE GIVING FOR PRACTICE PURPOSE USING LIS
    //     int[][] dp=new int[nums.length][nums.length+1];
    //     for(int i=0;i<nums.length;i++){
    //         Arrays.fill(dp[i],-1);
    //     }
    //     return fxn(0,-1,nums,dp)>=3;
    // }
    // public int fxn(int index,int prev,int[]nums,int[][]dp){
    //     if(index==nums.length) return 0;
    //     if(dp[index][prev+1]!=-1) return dp[index][prev+1];
    //     int inc=0;
    //     if((prev==-1 || nums[index]>nums[prev])){
    //         inc=1+fxn(index+1,index,nums,dp);;
    //     }
    //     int exc=fxn(index+1,prev,nums,dp);
    //     return dp[index][prev+1]=Math.max(inc,exc);


        int first=Integer.MAX_VALUE;
        int sec=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=first){
                first=nums[i];
            }
            else if(nums[i]<=sec){
                sec=nums[i];
            }
            else{
                return true;
            }
        }
        return false;
    }
}