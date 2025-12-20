class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n=candies.length;
        int total=0;
        int maximum=0;
        for(int i=0;i<n;i++){
            total+=candies[i];
            maximum=Math.max(candies[i],maximum);
        }
        // if(total<k){
        //     return 0;
        // }
        long low=1;
        long high=maximum;
        long ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(canDistribute(mid,candies,k)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int) ans;
    }
    public boolean canDistribute(long candy,int[] candies,long k){
        long res=0;
        for(int i=0;i<candies.length;i++){
            res+=(long)candies[i]/candy;
        }
        if(res>=k) return true;
        return false;
    }
}