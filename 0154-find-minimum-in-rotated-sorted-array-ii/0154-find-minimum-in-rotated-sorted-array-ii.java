class Solution {
    public int findMin(int[] nums) {
        //O(N)
        // int n=nums.length;
        // int ans=nums[0];
        // for(int i=1;i<n;i++){
        //     if(nums[i]<nums[i-1]){
        //         ans=Math.min(ans,nums[i]);
        //     }
        // }
        // return ans;

        // O(log n)
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[high]<nums[mid]){
                low=mid+1;
            }
            else if(nums[mid]<nums[high]){
                high=mid;
            }
            else{
                high--;
            }
        }
        return nums[low];
    }
}