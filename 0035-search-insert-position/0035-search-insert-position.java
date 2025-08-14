class Solution {
    public int searchInsert(int[] nums, int target) {
        // int i=0;
        // while(i<nums.length){
        //     if(target==nums[i]){
        //         return i;
        //     }
        //     else if(target!=nums[i] && target<nums[i]){
        //         return i;
        //     }
        //     i++;
        // }
        // return (i);

        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}