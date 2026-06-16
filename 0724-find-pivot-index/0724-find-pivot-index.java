class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int lSum=0;
        for(int i=0;i<n;i++){
            int rSum=sum-nums[i]-lSum;
            if(rSum==lSum){
                return i;
            }
            lSum+=nums[i];
        }
        return -1;
    }
}