class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n=nums.length;
        long res=Long.MAX_VALUE;
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<left){
                left=nums[i];
            }
            if(nums[i]>right){
                right=nums[i];
            }
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            long cost1=fxn(nums,cost,mid);
            long cost2=fxn(nums,cost,mid+1);
            res=Math.min(cost1,cost2);
            if(cost2>cost1){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return res==Long.MAX_VALUE?0L:res;
    }
    public long fxn(int[] nums,int[] cost,int target){
        long res=0;
        for(int i=0;i<nums.length;i++){
            res+=(long)Math.abs(nums[i]-target)*cost[i];
        }
        return res;
    }
}