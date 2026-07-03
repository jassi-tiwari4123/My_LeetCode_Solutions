class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=0;
        for(int i=0;i<n;i++){
            high=Math.max(high,piles[i]);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isSafe(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isSafe(int[] piles,int h,int mid){
        int res=0;
        for(int i=0;i<piles.length;i++){
            res+=(piles[i]+mid-1)/mid;
            if(res>h) return false;
        }
        return true;
    }
}

