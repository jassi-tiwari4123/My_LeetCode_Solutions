class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        //this is the problem based on binary search on answers as it is the monotonic condition
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<min){
                min=bloomDay[i];
            }
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
        }
        int low=min;
        int high=max;
        int res=-1;
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(canBloom(mid,bloomDay,m,k)){
                res=mid;
                high=mid-1; //kyunki minimum chahiye
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public boolean canBloom(int limit,int[]arr,int m,int flower){
        int cnt=0;
        int bouquet=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=limit){
                cnt++;
                if(cnt==flower){
                    bouquet++;
                    cnt=0;
                }
            }
            else{
                cnt=0;
            }
        }
        if(bouquet>=m) return true;
        return false;
    }
}