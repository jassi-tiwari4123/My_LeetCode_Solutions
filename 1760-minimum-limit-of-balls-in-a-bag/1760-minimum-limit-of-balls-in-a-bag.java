class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int n=nums.length;
        int low=1;
        int high=0;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
        }
        high=max;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid,nums,maxOperations)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int mid,int[] nums,int op){
        int ops=0;
        for(int i=0;i<nums.length;i++){
            if(mid<nums[i]){
                ops+=(nums[i]-1)/mid;
                if(ops>op) return false;
            }
        }
        
        return true;
    }
}