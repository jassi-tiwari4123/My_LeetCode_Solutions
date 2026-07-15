class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int n=price.length;
        int low=0;
        int high=price[n-1];
        int res=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(price,k,mid)){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
    public boolean isPossible(int[] price,int k,int mid){
        int candy=1;
        int prev=price[0];
        int idx=1;
        while(idx<price.length && candy<k){
            if(price[idx]-prev>=mid){
                candy++;
                prev=price[idx];
            }
            idx++;
        }
        return candy==k;
    }
}