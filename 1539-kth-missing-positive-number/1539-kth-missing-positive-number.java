class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int cnt=0;
        int ans=-1;
        for(int i=1; ;i++){
            boolean match=false;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    match=true;
                    break;
                }
            }
            if(!match){
                cnt++;
                if(cnt==k){
                    return i;
                }
            }
        }
    }
}