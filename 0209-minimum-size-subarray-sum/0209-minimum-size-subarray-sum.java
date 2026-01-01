class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //O(N LOGN)
        // int n=nums.length;
        // for(int i=1;i<n;i++){ 
        //     nums[i]+=nums[i-1];
        // }
        // int ans=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){ 
        //     int req=target+(i>0?nums[i-1]:0);
        //     int low=i;
        //     int high=n-1;
        //     while(low<=high){
        //         int mid=low+(high-low)/2;
        //         if(nums[mid]>=req){
        //             ans=Math.min(mid-i+1,ans);
        //             high=mid-1;
        //         }
        //         else{
        //             low=mid+1;
        //         }
        //     }
        // }
        // return ans==Integer.MAX_VALUE?0:ans;

        //O(N)
        int n=nums.length;
        int start=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                res=Math.min(res,i-start+1);
                sum-=nums[start];
                start++;
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}