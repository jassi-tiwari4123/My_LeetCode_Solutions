class Solution {
    public int minCapability(int[] nums, int k) {
        //minimise the maximum so can use binary serach on answer
        int n=nums.length;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>high){
                high=nums[i];
            }
            if(nums[i]<low){
                low=nums[i];
            }
        }
        int ans=high;
        //serach space is low to high
        while(low<=high){
            int mid=low+(high-low)/2;
            //can we rob alternate houses at least 2 with capacity <= mid
            if(canRob(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean canRob(int[] nums,int k,int limit){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=limit){
                count++;
                if(count>=k) return true;
                i++;
            }
        }
        return false;
    }
}