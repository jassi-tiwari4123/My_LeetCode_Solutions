class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low=1;
        int high=10000000;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid,dist,hour)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int mid,int[] dist,double hour){
        double hr=0;
        int n=dist.length;
        for(int i=0;i<n-1;i++){
            hr+=Math.ceil((double)dist[i]/mid);
        }
        hr+=(double)dist[n-1]/mid;
        if(hr<=hour) return true;
        return false;
    }
}