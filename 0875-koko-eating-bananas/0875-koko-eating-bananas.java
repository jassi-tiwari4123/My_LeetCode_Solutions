class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            high=Math.max(piles[i],high);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] arr,int h,int mid){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res+=(arr[i]+mid-1)/mid;
            if(res>h) return false;
        }
        return true;
    }
}