class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        boolean inc=true;
        boolean dec=true;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                dec=false;
            }
            if(nums[i]<nums[i-1]){
                inc=false;
            }
        }
        return inc || dec;
    }
}