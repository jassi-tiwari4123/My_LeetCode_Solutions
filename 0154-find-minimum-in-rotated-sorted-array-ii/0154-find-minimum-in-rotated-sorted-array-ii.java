class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int ans=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                ans=Math.min(ans,nums[i]);
            }
        }
        return ans;
    }
}