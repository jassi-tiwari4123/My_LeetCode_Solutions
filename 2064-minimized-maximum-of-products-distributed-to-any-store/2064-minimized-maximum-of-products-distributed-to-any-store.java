class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int low=1;
        int max=0;
        for(int i=0;i<quantities.length;i++){
            max=Math.max(max,quantities[i]);
        }
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid,quantities,n)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int mid,int[] arr,int n){
        int res=0;
        for(int i=0;i<arr.length;i++){
            
                res+=(arr[i]+mid-1)/mid;
                if(res>n) return false;
            
        }
        return true;
    }
}