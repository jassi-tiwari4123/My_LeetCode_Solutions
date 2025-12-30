class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low=0;
        int high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canSplit(weights,mid,days)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean canSplit(int[] arr,int mid,int k){
        int sum=0;
        int split=1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                split++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        if(split<=k) return true;
        return false;
    } 
}