class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int n=time.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,time[i]);
        }
        long low=0;
        long high=(long)min*totalTrips;
        long ans=high;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(isPossible(mid,time,totalTrips)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(long mid,int[]time,int totaltrips){
        long trips=0;
        for(int i=0;i<time.length;i++){
            trips+=mid/time[i];
        }
        if(trips>=totaltrips) return true;
        return false;
    }
}